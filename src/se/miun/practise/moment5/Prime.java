package se.miun.practise.moment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print all n amount of primes: ");
        int limit = scanner.nextInt();
        List<Integer> primeNumbers = new ArrayList<>();
       int numToCheck = 2;
       int count = 0;
       while (true){
           boolean isPrime = true;
           for (int factor = 2; factor <=(long) Math.sqrt(numToCheck); factor++) {
                if (numToCheck % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(numToCheck);
                primeNumbers.add(numToCheck);
                count++;
                if(count >= limit){
                    break;
                }
            }
            numToCheck++;
        }
      //  System.out.println("The first " + limit + " prime numbers are: ");
       // for (int numbers : primeNumbers) {
         //   System.out.println(numbers);
        //}
        scanner.close();
    }
}
