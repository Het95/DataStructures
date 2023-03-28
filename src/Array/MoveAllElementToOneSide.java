package Array;

public class MoveAllElementToOneSide {
    public static void main(String[] args) {
        int a[] = {7,-1,-2,-3,8,9};
        int b[] = new int[a.length];

        int pcnt = 0;
        int ncnt = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                ncnt++;
            } else {
                pcnt++;
            }
        }



        // 1st Approach - Time O(N) Space O(N)
//        System.out.println(ncnt);
//        System.out.println(pcnt);
//        int k=0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < 0 && k<ncnt) {
//                b[k] = a[i];
//                k++;
////                System.out.println("neg"+" "+b[i]);
//            }
//        }
//
//        for (int i=0;i<a.length;i++) {
//            if (a[i] >= 0 && b[ncnt]==0) {
////                System.out.println(a[i]);
//                b[ncnt] = a[i];
//                ncnt++;
////                System.out.println("pos" + " " + b[i]+" "+ncnt);
//            }
//        }

        // 2nd Approach - Two Pointer Algorithm Time O(N) Space O(1)
        int i=0;
        int j=a.length-1;

        while (i<=j)
        {
            if(a[i]<0 && a[j]<0)
            {
                i++;
            }
            else if (a[i]>=0 && a[j]>=0)
            {
                j--;
            }
            else if (a[j]<0 && a[i]>0)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }

        }




        for (int k = 0; k < a.length; k++)
        {
            System.out.println(a[k]);
        }


    }
}
