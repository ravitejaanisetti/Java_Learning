import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2){
            System.out.println(n+"is a prime number");
        } else{
            boolean isPrime =true;
            for (int i=2; i<=Math.sqrt(n); i++){
                if (n%i==0);{
                    isPrime=false;
                }
            }
            if(n==1){
                System.out.println(n+" is neither a prime nor composite");
            } else if (isPrime==true) {
                System.out.println(n+" is a prime number");

            } else {
                System.out.println(n+" is a composite number");
            }

        }
    }
}
