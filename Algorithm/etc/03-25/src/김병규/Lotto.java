package com.example.day0325;

import java.util.Random;

public class Lotto {
    int[] ball = new int[45];
    int[] result;

    public void setResult(int[] result) {
        this.result = result;
    }

    // 빈 배열에 랜덤한 공들 넣고 배열 요소 출력
    public void mix(int n) {
        int[] result = new int[n];
        setResult(result);
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            int randomNum;
            boolean flag;
            do {
                flag = false;
                randomNum = random.nextInt(45) + 1;
                // 중복 체크
                for (int j = 0; j < i; j++) {
                    if (result[j] == randomNum) {
                        flag = true;
                        break;
                    }
                }
            } while (flag);
            result[i] = randomNum;
            System.out.println(result[i]);
        }
    }
    // 각 공에 번호 지정
    public void set () {
        for (int i = 0; i < 45; i++) {
            ball[i] = i + 1;
        }
    }


}
