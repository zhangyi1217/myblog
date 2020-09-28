package com.zhangyi.white.controller;

public class demo {
    public static void main(String[] args) {
        int first = 1,second = 1;
        for (int i = 1; i<=8;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("#");
            }
            if (i > 2){
                int sum = first + second;
                first = second;
                second = sum;
                System.out.println(sum);
            }else{
                System.out.println(1);
            }
        }

    }
}
