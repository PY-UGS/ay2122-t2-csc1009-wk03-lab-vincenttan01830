package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmt;
    private java.util.Date loanDate;

    public Loan(){
        this.annualInterestRate = 2.5 / 100;
        this.numberOfYears = 1;
        this.loanAmt = 1000;
        Date now = new Date();
        this.loanDate = now;
    }

    public Loan(double interestRate, int years, double loanAmt){
        this.annualInterestRate = interestRate / 100;
        this.numberOfYears = years;
        this.loanAmt = loanAmt;
        Date now = new Date();
        this.loanDate = now;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmt() {
        return loanAmt;
    }

    public void setLoanAmt(double loanAmt) {
        this.loanAmt = loanAmt;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = this.getAnnualInterestRate() / 12;
        double power = this.getNumberOfYears()*12;
        double top = this.getLoanAmt()*monthlyInterestRate;
        double bottom = 1 - 1 / Math.pow(1 + monthlyInterestRate, this.getNumberOfYears()*12);
        return top/bottom;

    }

    public double getTotalPayment(){
        double monthlyPayment = this.getMonthlyPayment();
        return monthlyPayment*this.getNumberOfYears()*12;
    }
}
