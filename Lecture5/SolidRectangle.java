package Lecture5;
//print the pattern
//*****
//*****
//*****
//*****

public class SolidRectangle {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        //nested loops
        //outerloop
        for(int i=1;i<=n;i++){
            //innerloop
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
