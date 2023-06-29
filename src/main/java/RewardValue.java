public class RewardValue {

    private double cash;
    private int miles;
    private static final double CONVERSION_RATE =0.0035;

    public RewardValue() {}

    public RewardValue(double totalCash) {
        this.cash = totalCash;
        this.miles = convertToMiles(cash);
    }

    public RewardValue(int totalMiles) {
        this.miles = totalMiles;
        this.cash = convertToCash(miles);
    }


    private int convertToMiles(double cash) {
        if(cash>=0)
            return (int)(cash / CONVERSION_RATE);
        else
            System.out.println("Cash cannot be in negative");

        return 0;
    }

    private double convertToCash(int miles){
        if(miles>=0)
            return (miles * CONVERSION_RATE);
        else
            System.out.println("Miles cannot be in negative");

        return 0;
    }

    public int getMilesValue() {
        return this.miles;
    }

    public double getCashValue() {
        return this.cash;
    }
}