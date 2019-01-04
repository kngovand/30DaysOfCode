package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Hello();
    }

    private static void Hello() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello - Select from Day 1-30: ");
        int selection = scan.nextInt();

        switch(selection) {
            case 1: Day1.main(null);
                    break;
            case 2:Day2.main(null);
                    break;
            case 3:
                break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
        } // End switch
    }
}
