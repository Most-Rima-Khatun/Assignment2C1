package ProfitCount;

public class ProfitCount {
    private double initialAmount,year,percentage,profit;
    public ProfitCount()
    {
        initialAmount = 1000;
        year = 0;
        percentage = 0.5;
        profit = 0;
    }
    public int profitCount(int finalYear){
        for(year = 1; year <=finalYear;year = year + 1)
        {
            profit = initialAmount * percentage * year ;
        }
        return (int)profit;
    }

}
