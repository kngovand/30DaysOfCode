package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] array = new int[number];

        for(int i = 0; i < number; i++) {
            array[i] = scan.nextInt();
        }

        for(int i = array.length-1; i >= 0 ; i-- ) {
            System.out.print(array[i]);
        }

    }

}
