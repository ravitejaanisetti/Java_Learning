package Recursion;
//print sum of first n natural numbers
public class Recc1 {
    public static void getSum(int n,int i, int sum){
        if(i==n){
            sum++;
            System.out.println(sum);
            return;
        }
        sum += i;
        getSum(i+1,n,sum);
    }
    public static void main(String[] args) {
        getSum(1,5,0);

    }
}
