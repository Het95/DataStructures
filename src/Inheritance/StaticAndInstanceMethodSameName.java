package Inheritance;

class Parent{
    public static void disp()
    {
        System.out.println("Hello I am Parent");
    }

}

class Child extends Parent{
    public static void disp()
    {
        System.out.println("Hello I am Child");
    }
}

public class StaticAndInstanceMethodSameName {
    public static void main(String[] args) {
        Child.disp();
        Parent.disp();
    }
}
