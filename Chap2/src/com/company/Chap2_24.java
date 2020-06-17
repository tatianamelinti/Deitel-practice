package com.company;

import java.util.Scanner;

public class Chap2_24 {

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

        int minNum = number1;
        if (number2 < number1) {
            if (number2 < number3) {
                if (number2 < number4) {
                    if (number2 < number5) {
                        minNum = number2;
                    }
                }
            }
        }
        if (number3 < minNum) {
            minNum=number3;
        }

        if (number4 < minNum) {
            minNum=number4;
        }
        if (number5 < minNum) {
            minNum=number5;
        }

        System.out.println("Smallest number is: "+ minNum);


        int maxNum = number1;
        if (number2 > number1) {
            if (number2 > number3) {
                if (number2 > number4) {
                    if (number2 > number5) {
                        maxNum= number2;
                    }
                }
            }
        }
        if (number3 > maxNum) {
            maxNum=number3;
        }

        if (number4 > maxNum) {
            maxNum=number4;
        }
        if (number5 > maxNum) {
            maxNum=number5;
        }


        System.out.println("Largest number is: "+ maxNum);
    }
}
