package com.dsa.exercise7;

public class ForecastTest {

    public static void main(String[] args) {

        double presentValue = 10000.00;
        double growthRate = 0.08; // 8% annual growth
        int years = 5;

        System.out.println("=== Financial Forecasting ===");
        System.out.printf("Present Value   : %.2f%n", presentValue);
        System.out.printf("Growth Rate     : %.0f%%%n", growthRate * 100);
        System.out.printf("Years           : %d%n%n", years);

        double result1 = FinancialForecast.futureValue(presentValue, growthRate, years);
        System.out.printf("Future Value (Recursive)   : %.2f%n", result1);

        double result2 = FinancialForecast.futureValueMemo(presentValue, growthRate, years);
        System.out.printf("Future Value (Memoized)    : %.2f%n", result2);

        // Show year-by-year projection
        System.out.println("\n=== Year-by-Year Projection ===");
        for (int y = 1; y <= years; y++) {
            double fv = FinancialForecast.futureValue(presentValue, growthRate, y);
            System.out.printf("Year %d : %.2f%n", y, fv);
        }
    }
}
