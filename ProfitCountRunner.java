package ProfitCount.java;

import ProfitCount.ProfitCount;

public class ProfitCountRunner {
    public static void main(String[] args) {
        ProfitCount profitCount = new ProfitCount();
        int profit = profitCount.profitCount(3);
        System.out.println(profit);
    }
}
