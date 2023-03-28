package Array;

public class RemoveConsecutiveCharacters
{
    public static void main(String[] args) {



        String a = "aabcd";
        char c[] = a.toCharArray();
        int n = c.length;

        int count = 1;

        int counter[] = new int[a.length()];
        int idx = 0;


        for (int i=0;i<a.length()-1;i++)
        {
            if (c[i] == c[i+1])
            {
                if(count==1)
                {
                    idx = i;
                }
                count++;
                counter[idx] = count;

            }
            else
            {
                idx = i+1;
                count=1;
                counter[idx] = count;

            }

        }

        for (int i=0;i<counter.length;i++)
        {
            System.out.print(counter[i]+" ");
        }


        int B = 2;
        String res = "";



        if (counter[0]!=B)
        {
            res = res+a.charAt(0);
        }

        for (int i=0;i<counter.length;i++)
        {
            if (counter[i]!=B && counter[i]!=0)
            {
                for (int j=0;j<counter[i];j++) {
                    res = res + a.charAt(i);
                }
            }
        }

        System.out.println(res);


    }
}
