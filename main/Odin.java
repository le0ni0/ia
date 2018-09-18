package main;

import java.util.Scanner;

public class Odin {
    public static void main(String [] arr){
        binaryShiftRight();
    }

    private static void logickBinaryOps(){
        boolean boolVar = true;
        if(2+2==5){
            System.out.println("do something");
        }else{
            System.out.println("do something else...");
        }
        String b = 5+5==10?"is corect":"is not correct";
    }

    private static void mainm(){
        System.out.println("BINARY AND GENO&");
        System.out.println(Integer.toBinaryString(5&4));
        System.out.println("negative binary demo");
        System.out.println(~5);
        System.out.println("binary on demo");
        System.out.println(Integer.toBinaryString(5|4));

    }
    private static void binaryShiftRight(){
        int a=1000;
        System.out.println("a="+a);
        for(int i=0;i<10;i++){
            System.out.println("Деление на 2");
            int b = a>>1;
            System.out.println("binary a:"+Integer.toBinaryString(a));
            System.out.println("binary b:"+Integer.toBinaryString(b));
            System.out.println("resultat"+b);
            a=b;

        }
    }
}
