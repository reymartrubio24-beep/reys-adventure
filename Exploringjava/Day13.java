//Day 13: Enchance Employee System

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter empployee name: ");
        String name = scanner.nextLine();

        System.out.println("Enter  hourly rate: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter hours worked: ");
        double hours = scanner.nextDouble();

        System.out.println("Enter tax rate (%): ");
        double tax = scanner.nextDouble();

        double grossSalary = rate * hours;
        double taxAmount = grossSalary * (tax / 100);
        double netSalary = grossSalary - taxAmount;

        System.out.println("\n---Pay Slip---");
        System.out.println("Employee: " + name);
        System.out.println("Gross Salary PHP: " + grossSalary);
        System.out.println("Tax Deducted PHP: " + taxAmount);
        System.out.println("Net Salary PHP: " + netSalary);
        
        
        scanner.close();

    }
}
