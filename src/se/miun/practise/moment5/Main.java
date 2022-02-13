package se.miun.practise.moment5;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(calcInterest(1000.0, 10));
        System.out.println();
        for (int i = 2; i <= 8; i++){
            System.out.println("10,000 at " + i+ "% interest = "+ String.format("%.2f", calcInterest(10000.0, i)));

        }
        System.out.println();
        for (int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i+ "% interest = "+ String.format("%.2f", calcInterest(10000.0, i)));

        }
    }
    public static double calcInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }
}
