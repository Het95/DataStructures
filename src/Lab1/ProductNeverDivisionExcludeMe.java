package Lab1;

public class ProductNeverDivisionExcludeMe
{
    public static void main(String[] args) {
        Long a[] = {5L,2L,3L,4L};
        Long left[] = new Long[a.length];
        Long right[] = new Long[a.length];

        for (int i=0;i<a.length;i++)
        {
            left[i] = 1L;
            right[i] = 1L;
        }

        for (int i=1;i<a.length;i++)
        {
            left[i] = left[i-1]*a[i-1];
        }

        for (int i=a.length-2;i>=0;i--)
        {
            right[i] = right[i+1]*a[i+1];
        }

        for (int i=0;i<a.length;i++)
        {
            right[i] = left[i]*right[i];
        }

        if (a.length==1)
        {
            System.out.println(a[0]);
        }
        else {
            for (int i = 0; i < a.length; i++) {
                System.out.print(right[i] + " ");
            }
        }
    }
}
