package Inheritance;

public class PassByValue {
    public void swap(int c, int d)
    {
        int a,b;
        a  = c+10;
        b = d+1;

        System.out.println("Inside function"+" "+a+" "+b);
    }

    public static void main(String[] args) {

        PassByValue pbv = new PassByValue();
        int a = 10;
        int b  = 15;
        System.out.println("Before calling function"+" "+a+" "+b);
        pbv.swap(a,b);
        System.out.println("After calling function"+" "+a+" "+b);

    }
}
