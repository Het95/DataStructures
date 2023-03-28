package Stacks;

import java.util.Scanner;

public class BalancedParenthesis {


    static BalancedParenthesis stack = new BalancedParenthesis();
    static char c[];
    static int top = -1;

    static  int count = 0;

    static Boolean flag = false;

    static String a;

    public static void push(char data)
    {
        if (top==a.length()) {
//            System.out.println("Stack Overflow");
            return;
        }


        top++;
        c[top] = data;


    }


    public static char pop()
    {
        if (top==-1)
        {
//            System.out.println("Stack UnderFlow");
            return ' ';
        }

        char data = c[top];
        c[top] = 'n';
        count++;
        top--;

        return data;
    }

    public static void checkParenthesis(String a)
    {
        char data = ' ';
        char temp = ' ';

        c = new char[a.length()];
        for (int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='(' || a.charAt(i)=='[' || a.charAt(i)=='{')
            {
                stack.push(a.charAt(i));
            }
            else if (a.charAt(i)==')' || a.charAt(i)=='}' || a.charAt(i)==']')
            {
                data = c[top];
                if (data=='(' && a.charAt(i)==')' || data=='{' && a.charAt(i)=='}' || data=='[' && a.charAt(i)==']')
                {
                    flag = true;
                    temp = stack.pop();
                }
                else
                {
                    flag = false;
                }

            }
            else
            {
                flag = false;
            }
        }

//        if (count==(c.length/2))
//        {
//            flag=true;
//        }
//        else
//        {
//            flag=false;
//        }

        if (c[0]=='n')
        {
            flag = true;
        }
        else
        {
            flag = false;
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression which you want to check whether it is balanced or not: ");
        a = scanner.nextLine();

        checkParenthesis(a);


        if (flag)
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }


//        for (int i=0;i<=top;i++)
//        {
//            if (top!=c.length) {
//                System.out.println(c[i]);
//            }
//        }






    }
}
