package String;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        a= a.toLowerCase();

        String b = "";
        String brev = "";

        char c[] = a.toCharArray();



        for(int i=0;i<a.length();i++)
        {
//            int d = (int) a.charAt(i);
//            System.out.println(d);
//            if( (d>=65 && d<=90) || (d>=97 && d<=122) || (d>=48 && d<=57))
            if(Character.isLetterOrDigit(c[i]))
            {
                // b = b+a.charAt(i);
                b = b+c[i];
                System.out.println(b);

//                b = b+a.charAt(i);
//                System.out.println(b);
            }

        }


        System.out.println(b);

        for (int i=b.length()-1;i>=0;i--)
        {
            brev = brev + b.charAt(i);
        }

        System.out.println(brev);


        if (b.equals(brev))
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }


    }

}
