package com.dsa.exercise7;

import java.util.HashMap;

public class FinancialForecast {

    // Recursive - O(n)
    public static double futureValue(double presentValue, double growthRate, int years) {
        if (years == 0)
            return presentValue;
        return futureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    // Memoized - O(n), avoids redundant calls in branching scenarios
    private static HashMap<Integer, Double> memo = new HashMap<>();

    public static double futureValueMemo(double presentValue, double growthRate, int years) {
        if (years == 0)
            return presentValue;
        if (memo.containsKey(years))
            return memo.get(years);
        double result = futureValueMemo(presentValue, growthRate, years - 1) * (1 + growthRate);
        memo.put(years, result);
        return result;
    }
}
