package SeriesSummation.java;

public class SeriesSummation {
    private int result;
    public SeriesSummation()
    {
        result =0;
    }
    public int summation(int lastNumberOfSeries){
        for(int count = 1; count<=lastNumberOfSeries ; count = count + 1)
        {
            result =result + count;
        }
        return result;
    }
}
