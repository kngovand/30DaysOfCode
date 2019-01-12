package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (2 <= number && number <= 12) {
            factorial(number);
        }
        else {
            System.out.println("Enter a number between 2 and 12.");
        }

    }

    private static void factorial(int number) {
        if (number > 0) {
            int total = number * (number - 1);
            factorial(number-1, total);
        }


    }

    private static void factorial(int number, int total) {

        int newTotal;
            newTotal = total * (number);
            number--;
            factorial(number, newTotal);


        if(number == 1) {
            System.out.println(newTotal);
        }


    }

}
