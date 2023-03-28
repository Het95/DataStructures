package Stacks;

import java.util.Scanner;

public class BasicStackImplementation
{
    
    public static int top = -1;
    public static int size = 0;

    public static int a[];

    public static Scanner scanner = new Scanner(System.in);



    public static void pushEle(int data)
    {
        if (top>=size-1) {
            System.out.println("Stack overflow");
            return;
        }

        if (top!=size) {
                top++;
                a[top] = data;
            }


        peek();

    }

    public static int popEle()
    {
        if (top==-1) {
            System.out.println("Stack underflow");
            return 0;
        }

        int data = a[top];
        System.out.println("Element removed is "+a[top]);
        top--;
        return data;
    }

    private static void peek() {
        System.out.println("The element at top position is "+a[top]);
    }


    public static void main(String[] args) {
        System.out.println("Enter size of stack which you want to create");
        size = scanner.nextInt();

        a = new int[size];

        System.out.println("Enter data which you want to push in to  stack");
        int data = scanner.nextInt();


        pushEle(data);
        popEle();

    }
}
