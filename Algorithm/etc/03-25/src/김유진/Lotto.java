package com.example.util;

public class Lotto {
    private int[] number = new int[45];

    //생성자 -> 객체 생성시 배열 초기화
    public Lotto(){
        for(int i =0; i<45; i++){
            number[i] = i+1;
        }
    }
    //번호 섞기
    public void mix(int a){ // 사용자에게 몇번 섞을건지
        int index1 = 0;
        int index2 = 0;
        for(int i = 0; i<a; i++){
            index1 = (int)(Math.random()*45);
            index2 = (int)(Math.random()*45);
            swap(index1,index2);
        }
    }
    //배열 요소 교체
    public void swap(int index1, int index2){
        int temp;
        temp = number[index1];
        number[index1] = number[index2];
        number[index2] = temp;
    }
    // 번호 뽑기
    public void ballPick(){
        for(int i=0; i<6; i++){
            System.out.println(number[i]);
        }
    }

}
