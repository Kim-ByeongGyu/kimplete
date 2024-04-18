package day13;
import java.io.*;
import java.util.Scanner;
// 지정된 파일에서 텍스트 데이터를 읽고 콘솔에 출력하는 스레드 -> char단위 입출력 스트림 사용
class FileReaderTask implements Runnable{
    //input.txt라는 파일에서 데이터를 읽어서 콘솔에 출력
    @Override
    public void run() {
        //자동 리소스 닫기 이용
        // 장식 : 한줄 단위로 읽기 -> BufferedReader
        // 주인공 :  char단위 입출력 스트림 -> FileReader
        try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))){
         String line;
         while((line = reader.readLine())!= null ){
             System.out.println(line);
         }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
// 사용자로부터 입력 받은 데이터를 파일에 쓰는 작업을 수행
class FileWriterTask implements Runnable{
    //콘솔에서 사용자의 입력을 받아  output.txt라는 파일에 계속 추가
    @Override
    public void run() {
        //자동 리소스 닫기 이용
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            Scanner sc = new Scanner(System.in);

            while(true){
                System.out.print("입력세요 ('exit'입력시 종료됩니다.) >>");
                String str = sc.nextLine();
                if(str.equals("exit")){
                    System.out.println("입력을 종료합니다.");
                    break;
                }
                writer.write(str);
                writer.newLine(); // 줄바꿈  -> writer.write(str + "\n");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
public class FileReadWriteApp {
    public static void main(String[] args) {
        Thread read = new Thread(new FileReaderTask());
        Thread write = new Thread(new FileWriterTask());
        read.start(); // 읽기
        write.start(); // 쓰기
    }
}
