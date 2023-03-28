package Array;

import java.util.Arrays;

public class MostFrequentNumber {

    public static void main(String[] args) {


        int a[] = {1,2,3,4,3};

        Arrays.sort(a);

        int b[] = new int[a.length];

        int c[] = new int[a.length];

        int k=0;
        b[k] = a[0];
        c[0] = 1;

        for (int i=0;i<a.length-1;i++)
        {
            if (a[i]==a[i+1])
            {
                c[k] = c[k]+1;
            }
            else
            {
                k++;
                b[k] = a[i+1];
                c[k] = 1;
            }
        }

        for (int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }

        System.out.println();

        for (int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }





    }
}
