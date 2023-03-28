package Array;


//one approach is sorting and printing the first and last element as min and max respectively
// one approach is take min and max variable and compare it with each element in array which will ultimatly give min and max
public class MaximumAndMinimum {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max = a[i];
            }

            if(min>a[i])
            {
                min = a[i];
            }
        }

        System.out.println(min);
        System.out.println(max);


    }
}
