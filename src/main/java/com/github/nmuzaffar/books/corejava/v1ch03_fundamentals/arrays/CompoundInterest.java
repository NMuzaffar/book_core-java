package com.github.nmuzaffar.books.corejava.v1ch03_fundamentals.arrays;

import java.util.Arrays;

/** This program shows how to store tabular data in a 2D array. */
public class CompoundInterest {

  public static void main(String[] args) {
    final double START_RATE = 10;
    final int N_RATES = 6;
    final int N_YEARS = 10;

    // set interest rates to 10% . . . 15%
    double[] interestRate = new double[N_RATES];
    for (int j = 0; j < interestRate.length; j++) {
      interestRate[j] = (START_RATE + j) / 100.0;
    }

    double[][] balances = new double[N_YEARS][N_RATES];

    // set initial balances to 10000
    Arrays.fill(balances[0], 10000);

    // compute interest for future years
    for (int i = 1; i < balances.length; i++) {
      for (int j = 0; j < balances[i].length; j++) {
        // get last year's balances from previous row
        double oldBalance = balances[i - 1][j];

        // compute interest
        double interest = oldBalance * interestRate[j];

        // compute this year's balances
        balances[i][j] = oldBalance + interest;
      }
    }

    // print one row of interest rates
    for (double v : interestRate) {
      System.out.printf("%9.0f%%", 100 * v);
    }

    // print balances table
    for (double[] row : balances) {
      // print table row
      for (double b : row) {
        System.out.printf("%10.2f", b);
      }
      System.out.println();
    }
  }
}
