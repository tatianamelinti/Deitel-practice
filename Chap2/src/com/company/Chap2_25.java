package com.company;

import java.util.Scanner;

public class Chap2_25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter an integer: ");
        number = input.nextInt();

        if(number % 2 ==0){
            System.out.println("This number is even!");
        } else{
            System.out.println("This number is odd");
        }

    }
}
