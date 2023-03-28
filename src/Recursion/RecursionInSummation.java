package Recursion;

public class RecursionInSummation {
    public static int  sum(int n)
    {
        if (n<=1)
            return 1;


        int a = n + sum(n-1);
        return a;




    }

    public static void main(String[] args) {
        int N = 5;

        int result = sum(N);
        System.out.println(result);

    }
}
