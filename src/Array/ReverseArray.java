package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int j=a.length-1;
        for (int i=0;i<a.length;i++)
        {
            if (i<j) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
            j--;
        }

        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
