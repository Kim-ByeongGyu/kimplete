import java.util.Arrays;
import java.util.Random;

public class LottoMachine {
    int[] result = new int[6];
    void pickNum(){
        Random rand = new Random();
        int i = 0;
        while(i < 6){
            int num = rand.nextInt(45) + 1;
            if(isExit(num, i))
                continue;
            result[i] = num;
            i++;
        }
    }
    boolean isExit(int num, int i){
        for(int j = 0; j < i; j++){
            if(result[j] == num)
                return true;
        }
        return false;
    }
    void resultNumShow(){
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        LottoMachine lottoMachine = new LottoMachine();
        lottoMachine.pickNum();
        lottoMachine.resultNumShow();
    }
}
