package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate =input.nextDouble();

        System.out.println("Enter number of years as an integer: ");
        int years =input.nextInt();

        System.out.println("Enter loan amount, for example, 120000.95: ");
        double loanAmount =input.nextDouble();

        Loan newLoan = new Loan(annualInterestRate, years, loanAmount);
        System.out.printf("The monthly payment is %.2f\n", newLoan.getMonthlyPayment());
        System.out.printf("The total payment is %.2f\n", newLoan.getTotalPayment());
    }
}
