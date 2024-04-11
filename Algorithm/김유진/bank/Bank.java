package bank;
// 최대 통장 개설시 에러 발생
class MaxAccount extends Exception{
    public MaxAccount(String message) {
        super(message);
    }
}
// 은행 객체
public class Bank {
    private String name; // 은행 이름
    private int[] accountList; //은행에 등록된 통장 목록
    private int index;
    //은행 객체는 통장 객체를 리스트로 관리하며, 통장 개설 및 통장 정보 조회 기능을 제공해야 합니다.
    // 통장개설
    public Bank(String name){
        this.name = name;
        accountList = new int[10000]; // 기본으로 총 10000개의 통장을 개설할 수 있다고 설정
        index = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex(){
        return this.index;
    }
    //통장 개설
    public void makeAccount(int account) throws MaxAccount{
        if(index>accountList.length){
            throw new MaxAccount("더이상 계좌를 생성할 수 없습니다.");
        }
        accountList[index] = account;
        index++;
        
    }
    // 특정 통장 정보 조회
    public void AccountInfo(int account){
        for(int i =0; i< index; i++){
         if(accountList[i] == account){
             System.out.println("은행 이름 : " + name + "\t계좌번호 : " + accountList[i]);
         }
        }
    }
}
