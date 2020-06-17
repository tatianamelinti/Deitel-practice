package com.company;

import java.util.Scanner;

public class Chap2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter an integer: ");
        number1 = input.nextInt();
        System.out.println("Enter the second integer: ");
        number2 = input.nextInt();


        if (number1 < number2){
            System.out.printf(number2 + " is larger");}
        if (number1 > number2){
            System.out.println(number1 + " is larger"); }
            else{
            System.out.println("These numbers are equal"); }


        }
    }

