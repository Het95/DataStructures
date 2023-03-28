package Array;

public class MoveZeroes
{
    public static void main(String[] args) {
        int a[] = {0,1,0,3,12};
        int count = 0;


        if (a.length==1 && a[0]==0)
        {
        }
        else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 0) {
                    count++;
                }
            }

            int k = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != 0) {
                    a[k] = a[i];
                    k++;
                }
            }

            for (int i = a.length - count; i < a.length; i++) {
                a[i] = 0;
            }

            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i] + " ");
            }
        }
    }
}
