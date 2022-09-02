package Functions;

public class Prime {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        //corner cases
        if(n==2){
            return true;
        }
//        for(int i=2; i<=n-1; i++){
//            if(n%i ==0){
//                isPrime = false;
//            }
//        }
        //optimised
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i ==0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String[]args){
        System.out.println(isPrime(6));
    }
}
