package Functions;

public class Factorial {
    public static int getFactorial(int n){
        int f=1;

        for (int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        getFactorial(5464);
        System.out.println(getFactorial(5464));

    }
}
