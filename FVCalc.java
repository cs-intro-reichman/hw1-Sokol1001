// Computes the future value of a saving investment.
public class FVCalc {
    public static void main(String[] args){
        int currentValue = Integer.parseInt(args[0]);
        double ratePercent = Double.parseDouble(args[1]);
        int nYears = Integer.parseInt(args[2]);
        
        double rateDecimal = ratePercent / 100.0;
        
        double futureValue = currentValue * Math.pow(1.0 + rateDecimal, nYears);
        
        System.out.println("After " + nYears + " years, $" + currentValue + 
                           " saved at " + ratePercent + "% will yield $" + (int) futureValue);
    }
}
