package Lab1;

public class Lab3 {
    public static void main(String[] args) {
        int a[] = {9,8,1,2,3};
        int start = 0;
        int len = 0;
        int maxlen = 0;

        for (int i=0;i<a.length;i++)
        {

            for (int j=i+1;j<a.length;j++)
            {
                if (a[i] < a[j])
                {
                    start = i;
                    len++;
                }
                else
                {
                    break;
                }
            }

            if (len>maxlen)
            {
                maxlen = len;
            }
        }


        System.out.println(maxlen);
        System.out.println(start);
    }
}
