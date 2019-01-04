package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int i2 = scan.nextInt();

        System.out.println("Enter double: ");
        double d2 = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter string: ");
        String s2 = scan.nextLine();

        int finalInt = i + i2;
        double finalDouble = d + d2;
        String finalString = s + s2;

        System.out.println("Integer: " + finalInt);
        System.out.println("Double: " + finalDouble);
        System.out.println("String: " + finalString);

        scan.close();
    }
}