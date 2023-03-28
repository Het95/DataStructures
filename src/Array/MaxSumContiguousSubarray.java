package Array;

public class MaxSumContiguousSubarray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, -10};
        int sum = 0;
        int maxSum = 0;

        for (int i=0;i<a.length;i++)
        {
            sum = sum+a[i];

            if (sum<0)
            {
                sum=0;
            }

            maxSum = Math.max(maxSum,sum);

        }

        System.out.println(maxSum);


    }
}
