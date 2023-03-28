package Array;

import java.util.HashSet;

public class UnionAndIntersectionOfArraysCount
{
    public static void main(String[] args) {
        HashSet <Integer> hashSet = new HashSet<>();
        int a[] = {1,2,3,4,5};
        int b[]= {1,2,3};
        int count =0;
        for (int i=0;i<a.length;i++)
        {
            if(hashSet.contains(Integer.valueOf(a[i])))
            {
                count++;
            }
            else
            {
                hashSet.add(Integer.valueOf(a[i]));
            }

        }

        for (int i=0;i<b.length;i++)
        {

            if (hashSet.contains(Integer.valueOf(b[i])))
            {
                count++;
            }
            else
            {
                hashSet.add(Integer.valueOf(b[i]));
            }
        }

        System.out.println(hashSet.size());
        System.out.println(count);
    }
}
