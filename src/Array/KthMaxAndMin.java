package Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
//using priority queue it can be done - 1st approach
//Using partition algorithm -2nd approach
public class KthMaxAndMin
{

    public static int partition(int[] arr, int s,int e)
    {
        int pivot = arr[s];
        int cnt= 0;


        for(int i=s+1;i<=e;i++)
        {
            if (arr[i]<=pivot)
            {
                cnt++;
            }
        }

        int pivotindex = s+cnt;
        int temp1 = arr[s];
        arr[s] = arr[pivotindex];
        arr[pivotindex] = temp1;

        int i=s;
        int j=e;

        while (i<pivotindex && j>pivotindex)
        {
            while (arr[i]<pivot)
            {
                i++;
            }

            while (arr[j]>pivot)
            {
                j--;
            }

            if (i<pivotindex && j>pivotindex)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }


        return pivotindex;

    }

    public static void quicksort(int a[],int s,int e,int K)
    {
        if (s>=e)
        {
            return;
        }

            int p = partition(a, s, e);
//            System.out.println(p);
            if (p== (K - 1)) {
                System.out.println(a[K-1]);
            } else if ((K - 1) < p) {
                quicksort(a,s, p - 1,K);
            } else if ((K - 1) >= p) {
                quicksort(a,p+1 , e,K);
            }
//        quicksort(a,s, p - 1);
//        quicksort(a,p + 1, e);


    }


    public static void main(String[] args) {
        int a[] = {7, 10, 4, 3, 20, 15};
        int K = 5;
//        Arrays.sort(a);
//        System.out.println(a[K-1]);

//        PriorityQueue <Integer> pq= new PriorityQueue<>();
//        for (int i=0;i<a.length;i++)
//        {
//            pq.add(a[i]);
//        }
//
//        for (int i=0;i<K-1;i++)
//        {
//            pq.poll();
//        }
//
//        System.out.println(pq.peek());
        quicksort(a,0,a.length-1,K);
//
//        for (int i=0;i<a.length;i++)
//        {
//            System.out.println(a[i]);
//        }


    }
}
