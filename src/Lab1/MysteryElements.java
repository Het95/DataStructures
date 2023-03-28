package Lab1;

import java.util.Scanner;

public class MysteryElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String b[] = s.split(" ");

        int a [] = new int[b.length];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int maxSum = 0;

        for (int i=0;i<a.length;i++)
        {
            a[i] = Integer.parseInt(b[i]);
        }

        for (int i=0;i<a.length;i++)
        {
            sum = sum+a[i];
            if (max<a[i])
            {
                max = a[i];
            }
        }

//        System.out.println(max);
//        System.out.println(sum);

        int c[] = new int[max];
        String d = "";

        for (int i=0;i<c.length;i++)
        {
            c[i] = i+1;
            d = d+String.valueOf(c[i])+" ";

        }


        maxSum = (max*(max+1))/2;
//        System.out.println(maxSum);


        if (max-a.length==0)
        {
            System.out.println("Nothing Mysterious");
        }
        else if (max-a.length==1)
        {
            System.out.println("1 number missing: "+(maxSum-sum));
        }
        else if (max-a.length==2)
        {
            int i=0;
            int j= c.length-1;
            int targetSum = maxSum-sum;
            int first = 0;
            int second = 0;

            while (i<j)
            {
                if (c[i]+c[j]==targetSum)
                {
                    first = c[i];
                    second = c[j];


                    if (s.contains(String.valueOf(first)) && s.contains(String.valueOf(second)))
                    {
                        i++;
                        j--;
                        continue;
                    }
                    else {
                        System.out.println(first);
                        System.out.println(second);
                        break;
                    }

                }
                else if (c[i]+c[j] < targetSum) {
                    i++;
                }
                else if(c[i]+c[j] > targetSum)
                {
                    j--;
                }
            }


        }


    }
}
