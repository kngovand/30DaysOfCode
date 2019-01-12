package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        Map<String, Integer> dictionary = new HashMap<>();
        String[] names = new String[number];

        for (int i = 0; i < number; i++) {
            dictionary.put(scan.next(), scan.nextInt());
        }

        for (int i = 0; i < number; i++) {
            names[i] = scan.next();
        }

        for (int i = 0; i < number; i++) {
            if(dictionary.containsKey(names[i])) {
                System.out.println(dictionary.get(names[i]));
            }
            else {
                System.out.println("not found");
            }
        }


    }

}
