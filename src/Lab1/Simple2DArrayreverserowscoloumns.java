package Lab1;

public class Simple2DArrayreverserowscoloumns {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //reversing the elements in each row
        for (int i=0;i<a.length;i++)
        {
            int m = 0;
            int n = a[i].length-1;
            for (int j=0;j<a[i].length;j++)
            {
                if (m<n)
                {
                    int temp = a[i][n];
                    a[i][n] = a[i][m];
                    a[i][m] = temp;
                }
                m++;
                n--;
            }
        }

        for (int j=0;j<a[0].length;j++)
        {
            int m = 0;
            int n = a.length-1;
            for (int i=0;i<a.length;i++)
            {
                if (m<n)
                {
                    int temp = a[m][j];
                    a[m][j] = a[n][j];
                    a[n][j] = temp;
                }
                m++;
                n--;
            }
        }

        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }


}
