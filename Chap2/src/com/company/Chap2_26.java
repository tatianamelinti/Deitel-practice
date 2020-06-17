package com.company;

import java.util.Scanner;

public class Chap2_26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter first integer: ");
        number1 = input.nextInt();
        System.out.println("Enter second integer: ");
        number2 = input.nextInt();

        if(number1 % number2 ==0){
            System.out.println("first number is a multiple of second number!");
        } else{
            System.out.println("first number is not a multiple of second number!");
        }

    }
}

