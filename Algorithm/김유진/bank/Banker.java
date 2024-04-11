package bank;
 //은행원 객체
public class Banker {
    private String name; // 이름
    private String id; // 은행원 ID
//은행원 객체는 통장 개설 및 출금 승인 프로세스를 관리합니다.
     //통장 개설 승인
     public void accountAcept(){
         if((id !=null){
             System.out.println("통장 개설 승인 완료되었습니다.");
         }
     }
     // 출금 승인
     public void withdrawAcept() throws InsufficientFundsException{
         if(id !=null){
             System.out.println("출금 승인 완료되었습니다.");
         }
     }
}
