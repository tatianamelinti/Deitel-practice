package com.company;

import java.util.Scanner;

public class Chap2_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        System.out.println("Enter first integer: ");
        number1 = input.nextInt();
        System.out.println("Enter second integer: ");
        number2 = input.nextInt();
        System.out.println("Enter third integer: ");
        number3 = input.nextInt();
        System.out.println("Enter forth integer: ");
        number4 = input.nextInt();
        System.out.println("Enter fifth integer: ");
        number5 = input.nextInt();

        int negative=0;
        int positive=0;
        int zero=0;

        if(number1<0){ negative++; }
        if(number1>0){ positive++; }
        if(number1==0){ zero++; }

        if(number2<0){ negative++; }
        if(number2>0){ positive++; }
        if(number2==0){ zero++; }

        if(number3<0){ negative++; }
        if(number3>0){ positive++; }
        if(number3==0){ zero++; }

        if(number4<0){ negative++; }
        if(number4>0){ positive++; }
        if(number4==0){ zero++; }

        if(number5<0){ negative++; }
        if(number5>0){ positive++; }
        if(number5==0){ zero++; }

        System.out.println("Negative numbers: "+ negative);
        System.out.println("Positive numbers: "+positive);
        System.out.println("Zero value numbers: "+zero);
    }
}
