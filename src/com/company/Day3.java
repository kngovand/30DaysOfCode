/*
Objective
In this challenge, we're getting started with conditional statements. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given an integer, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird

Input Format
A single line containing a positive integer

Print Weird if the number is weird; otherwise, print Not Weird.

 */

package com.company;

import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int number = scan.nextInt();

        if(number > 20 && number % 2 == 0) {
            System.out.println("Not weird");
        }

        else if(number >= 6 && number <= 20 && number % 2 == 0) {
            System.out.println("Weird");
        }

        else if(number >= 2 && number <= 5 && number % 2 == 0) {
            System.out.println("Not weird");
        }

        else if(!(number % 2 == 0)) {
            System.out.println("Weird");
        }

        scan.close();

    }
}