package Array;

public class MooreAlgorithm {
    public static void main(String[] args) {


        int a[] = {1,2,3,2,1};
        int count = 0;
        int maj_idx = 0;
        //finding candidate

        for (int i=0;i<a.length;i++)
        {
            if (a[maj_idx]==a[i])
            {
                count++;
            }
            else
            {
                count--;
            }

            if (count==0)
            {
                maj_idx = i;
                count=1;
            }
        }

//        System.out.println(a[maj_idx]);

        count = 1;

        for (int i=0;i<a.length;i++)
        {
            if (a[maj_idx]==a[i] && maj_idx!=i)
            {
                count++;
            }
        }

//        System.out.println(count);

        if (count > (a.length/2))
        {
            System.out.println(a[maj_idx]);
        }
        else
        {
            System.out.println("No majority element");
        }


    }
}
