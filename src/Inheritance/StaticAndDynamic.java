package Inheritance;

class Parent1{
    public  void display()
    {
        System.out.println("Hello I am Parent");
    }
}

class Children extends Parent1{
    public void display()
    {
        System.out.println("Hello I am Child");
    }
}

public class StaticAndDynamic {
    public static void main(String[] args) {
        Parent1 p = new Children();
        p.display();
    }

}
