package Array;

public class CyclicallyRotateArrayByOne
{
    public static void main(String[] args) {

        int arr[] = {1,2,3};
        int n = arr.length;;

        int last = arr[n-1];
        int first = arr[0];


        for(int i=n-2;i>=0;i--)
        {
            arr[i+1] = arr[i];
//            System.out.println("i"+" "+i+"      "+"i+1"+" "+(i+1));
        }

        arr[0] = last;

        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
