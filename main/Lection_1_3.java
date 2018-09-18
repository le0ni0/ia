package main;

import java.util.Scanner;

public class Lection_1_3 {
    public static void main(String [] arr){

    }
    public static void odin(){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(x>=a && x<=b){
            System.out.println("Входит");
        }else{
            System.out.println("Не входит");
        }
    }
    public static void dva(){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if((x>=a && x<=b)|(x>=c && x<=d)){
            System.out.println("Входит");
        }else{
            System.out.println("Не входит");
        }
    }
    public static void tri(){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(!(x>=a && x<=b)&&!(x>=c && x<=d)){
            System.out.println("Входит");
        }else{
            System.out.println("Не входит");
        }
    }
    public static void chetiri(){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if (a % 2 == 0){
           System.out.println("Чётное");
        }else{
            System.out.println("Нечётное");
        }
    }
    public static void pit(){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if((a>=100&&a<=999)&&(a%5==0)){
            System.out.println("Правда");
        }else{
            System.out.println("Неправда");
        }
    }
    public static void schest(){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if ((c<a&&c<b)&&(a>b)){
            System.out.println("Правда");
        }else{
           System.out.println("Неправда");
        }
    }
    public static void sem(){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(){

        }
    }


}
