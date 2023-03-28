package Lab1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RaggedArraysReverse
{
    public static void main(String[] args) {
        int a[][] = new int[4][];
        a[0] = new int[]{1, 2, 3};
        a[1] = new int[]{4,5,6,7};
        a[2]= new int[]{8,9};
        a[3] = new int[]{10};


        for (int i=0;i<a.length;i++)
        {
            int m = 0;
            int n = a[i].length-1;
            for (int j=0;j<a[i].length;j++)
            {
                if (m<n)
                {
                    int temp = a[i][n];
                    a[i][n] = a[i][m];
                    a[i][m] = temp;
                }
                m++;
                n--;
            }
        }


//        for (int j=0;j<a[0].length;j++)
//        {
//            int m = 0;
//            int n = a.length-1;
//            for (int i=0;i<a.length;i++)
//            {
//                if (m<n)
//                {
//                    int temp = a[m][j];
//                    a[m][j] = a[n][j];
//                    a[n][j] = temp;
//                }
//                System.out.println(a[m][j]);
//                System.out.println(a[n][j]);
//                m++;
//                n--;
//            }
//        }


        int m = 0;
        int n = a.length-1;
        for (int i=0;i<a.length;i++)
        {
            if(m<n)
            {
                int[] temp = a[n];
                a[n] = a[m];
                a[m] = temp;
            }
            m++;
            n--;
        }


        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }



    }
}
