package Functions;

import static Functions.Prime.isPrime;

public class PrimeInRange {
    public static boolean primesInRange(int n){
       boolean isPrime = true;
        for(int i=2; i<=n; i++){
        if(isPrime(i)) {
            System.out.println(i+" ");

        }
        }
        return isPrime;
    }
    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow =0;
        int decNum=0;

        while(binNum>0){
            int lastDigit = binNum%10;
            decNum += lastDigit*(int)Math.pow(2,pow);

            pow++;
            binNum =binNum/10;
        }
        System.out.println("decimal of "+myNum+" = "+ decNum);
    }
    public static void main(String[] args) {
        int n =10;
        System.out.println(primesInRange(10));
        binToDec(101);

    }
}
