package Inheritance;

public class PassByReference
{
    int num;
    PassByReference(int num)
    {
        this.num = num;
    }
    public void swap(PassByReference b)
    {
        PassByReference temp = new PassByReference(0);
        temp.num  = this.num;
        this.num  = b.num;
        b.num = temp.num;
        System.out.println("Inside function");
        System.out.println(this.num);
        System.out.println(b.num);
    }

    public static void main(String[] args) {
        PassByReference a = new PassByReference(10);
        PassByReference b = new PassByReference(15);
        System.out.println("Before");
        System.out.println(a.num);
        System.out.println(b.num);
        a.swap(b);
        System.out.println("After");
        System.out.println(a.num);
        System.out.println(b.num);


    }
}

