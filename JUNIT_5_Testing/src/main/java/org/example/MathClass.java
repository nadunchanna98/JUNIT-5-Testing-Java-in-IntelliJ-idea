package org.example;

public class MathClass{

    public static int add(int num1, int num2){
        return num1 + num2 ;
    }

    public static int sub(int num1, int num2){
        return num1 - num2 ;
    }

    public static int mul(int num1, int num2){
        return num1 * num2 ;
    }

    public static boolean isEven(int num1){
        return num1%2 == 0;
    }

    public static int devide(int num1 , int num2){
        return num1 / num2 ;
    }

    public static boolean isPrime(int num1){
        for(int i=2;2*i<num1;i++){
            if(num1%i==0)
            {
                return false;
            }
        }
        return true;
    }

}
