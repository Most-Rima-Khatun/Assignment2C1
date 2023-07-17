package PositiveMultiplication.java;

public class PositiveMultiplication {
   private int result;
   public PositiveMultiplication()
   {
       result = 1;
   }
   public int  positiveMultiplication(int lastNumber)
   {
       for(int count = 1; count <= lastNumber;count =count + 1 )
       {
           result = result * count ;
       }
       return result;
   }
}
