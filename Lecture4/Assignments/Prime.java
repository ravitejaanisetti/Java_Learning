package Lecture4.Assignments;

import java.util.Scanner;

// Print if a number is prime or not (Input n from the user).
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value:");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            if(n==1){
                System.out.println(n+" is neither a prime nor a composite number");
            } else{
                System.out.println(n+" is a prime number");
            }

        }else {
            System.out.println(n+" is a composite number");

        }
    }
}
