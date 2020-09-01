package com.codewithshisna;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
     final byte MONTHS_IN_YEAR = 12;
     final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principle");
        int principle = scanner.nextInt();
        System.out.println("Annual Interest Rate ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.println("Period (Years) : ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principle
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow( 1 + monthlyInterest, numberOfPayments) - 1);

                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(2);
                  System.out.println("Mortgage:" + mortgageFormatted);





        }

    }

