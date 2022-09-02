package Lecture7.Assignments;

import java.util.*;

public class PrimeNumber {
    public static void prime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            if (n == 1) {
                System.out.println(n + " is neither prime nor composite");
            } else {
                System.out.println(n + " is a prime number");
            }
        } else {
            System.out.println(n + " is a composite number");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = sc.nextInt();

        prime(n);

    }
}

