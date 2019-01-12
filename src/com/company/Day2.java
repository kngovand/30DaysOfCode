package com.company;

import java.util.Scanner;

public class Day2 {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip = ((double)tip_percent / 100) * meal_cost;
        double tax = ((double)tax_percent / 100) * meal_cost;
        double totalCost = meal_cost + tip + tax;

        System.out.println("Tax is: " + tax);
        System.out.println("Tip is: " + tip);
        System.out.println("Total cost is: $" + Math.round(totalCost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter meal cost: ");
        double meal_cost = scanner.nextDouble();
        System.out.println("Enter tip percent: ");
        int tip_percent = scanner.nextInt();
        System.out.println("Enter tax percent: ");
        int tax_percent = scanner.nextInt();

        System.out.println("Now calculating total cost...");
        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
