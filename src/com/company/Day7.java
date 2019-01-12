package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Day7 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of strings followed by string + enter.");
        int number = scan.nextInt();

        for (int i = 0; i < number; i++) {
            list.add(scan.next());
        }

        for(String item : list) {
            char[] stringArray = item.toCharArray();
            String stringEven = "";
            String stringOdd = "";

            for(int i2 = 0; i2<item.length(); i2++) {
            stringEven += stringArray[i2];
            i2++;
            }

            for(int i3 = 1; i3<item.length(); i3++) {
            stringOdd += stringArray[i3];
            i3++;
            }

        System.out.println(stringEven + " " + stringOdd);

        }

    }

}
