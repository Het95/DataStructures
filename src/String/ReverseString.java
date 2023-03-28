package String;

public class ReverseString {
    public static void main(String[] args) {
        String a = "abc";
        char c[] = a.toCharArray();
        int j=c.length-1;
        for (int i=0;i<c.length;i++)
        {
            if (i<j) {
                char temp = c[j];
                c[j] = c[i];
                c[i] = temp;
            }
            j--;
        }

        for (int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
    }

}
