package Recursion;

public class LinearFib {

    static int i = 0;
    static int j = 1;

    static int temp = 0;

    public static void LinearFib(int k)
    {
        if(k==0)
        {
            System.out.print(i+" "+j+" ");
            return;
        }



        LinearFib(k-1);
        temp = i+j;
        i = j;
        j = temp;
        System.out.print(j+" ");


    }


    public static void main(String[] args) {
        int k = 7;

        LinearFib(k);

    }
}
