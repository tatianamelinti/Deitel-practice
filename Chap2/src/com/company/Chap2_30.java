package com.company;

import java.util.Scanner;

public class Chap2_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int digit1,digit2,digit3,digit4,digit5;
        System.out.println("Enter an integer: ");//42339
        number = input.nextInt();
        digit1 = number / 10000;
        digit2 = (number % 10000) / 1000;
        digit3 = ((number % 10000) % 1000) / 100;
        digit4 = (((number % 10000) % 1000) % 100) / 10;
        digit5 = (((number % 10000) % 1000) % 100) % 10;
        System.out.printf("%n%d   %d   %d   %d   %d",
                digit1, digit2, digit3, digit4, digit5);
    }
}
