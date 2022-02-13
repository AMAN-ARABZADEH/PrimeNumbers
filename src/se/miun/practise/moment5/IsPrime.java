package se.miun.practise.moment5;

public class IsPrime {
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
       //  for(int i = 2; i <= n/2; i++){
        for(int i = 2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(192));
        int count = 0;
        for(int i = 10; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is prime number.");
                if(count == 20){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
        System.out.println(count);


    }
}
