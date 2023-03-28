// *******************************************************************
// LinkedList4.java By: Aiman Hanna (C) 1993 - 2023
// This program fixes the problem introduced in LinkedList3.java.
// In particular, the program corrects the problem of shallow copy
// of the list.
//
// Key Points:
// 1) Linked Lists - Copy Constructor and clone() methods.
// 2) Nodes of objects
// 3) Shallow copy vs. deep copy
// *******************************************************************

class Car{

    // Attributes
    private int numOfDoors;
    private double price;
    private long serialNum;
    private static long serialNumCtr = 3000;

    // Constructors
    public Car()	// default constructor
    {
        numOfDoors = 4;
        price = 10000;
        serialNum = serialNumCtr++;
    }

    public Car(int nd, double pr)
    {
        numOfDoors = nd;
        price = pr;

        serialNum = serialNumCtr++;
    }

    public Car(Car c)
    {
        setNumOfDoors(c.numOfDoors);
        setPrice(c.price);

        serialNum = serialNumCtr++;
    }

    public int getNumOfDoors()
    {
        return numOfDoors;
    }

    public void setNumOfDoors(int nd)
    {
        numOfDoors = nd;
    }

    public double getPrice()
    {
        return price;
    }

    public long getserialNumber()
    {
        return serialNum;
    }

    public void setPrice(double pr)
    {
        price = pr;
    }


    public String toString()
    {
        return ("Car with serial number: " + serialNum + " has " + numOfDoors + " doors and its price is: " + price + "$.");
    }


    public Car clone()
    {
        return new Car(this);
    }
}  // end of Car class


class CarList
{
    private class Node
    {
        private Car cr;
        private Node next;	// A link to the next node, which is of type Node1

        // Default constructors
        public Node()
        {
            cr = null;
            next = null;
        }


        // Parameterized constructor
        public Node(Car c, Node xt)
        {
            cr = c;	// Notice the "=" here. Is there any privacy leak?
// Why not use cr = c.clone();
//            System.out.println(cr);
            next = xt;	// Will that insert the right object in the node?
// Will more Cars be created in such case?
        }

        // A copy constructor
        public Node(Node cn)
        {
            cr = cn.cr.clone();	// Deep copy the Car contents of the node
            next = cn.next;		// Is that okay? Would next = null;
// conform to a copy constructor operation?

        }



    } // end of inner class Node

    private Node head;

    public CarList()
    {
        head = null;
    }


    // copy constructor
    public CarList(CarList lst)
    {

        if(lst.head == null)
            head = null;
        else
        {
            head = null;
            Node t1, t2, t3;	// create 3 temporary pointers

            t1 = lst.head;
            t2 = t3 = null;

            while(t1 != null)
            {

                if (head == null)	// this happens only once
                {
                    t2 = new Node(t1.cr.clone(), null);

                    head = t2;
// Can we use t2 = new Node(t1);  for Instance as an alternative?
                }
                else
                {
                    t3 = new Node(t1.cr.clone(), null);									t2.next = t3;
                    t2 = t3;												}
                t1 = t1.next;
            }

            t2 = t3 = null; 	// t1 is already null by now

        }

    }


    public CarList clone()
    {
        System.out.println("Called");
        return new CarList(this);
    }


    // A method that adds an node to the start of the list
    public void addToStart(Car c)
    {
        Node n = new Node(c, head);
        head = n;
        n = null;
    }



    public Node find(long sn)
    {
        Node t = head;
        while(t != null)
        {
            if (t.cr.getserialNumber() == sn)
                return t;		// Is that dangerous ??????
            t = t.next;
        }
        return null;			// value was not found in the list
    }


    // A method to return the size of the list
    public int size()
    {
        int ctr = 0;
        Node temp = head;	// Point to the start of the list
        while( temp!= null)
        {
            ctr++;
            temp = temp.next;
        }
        return ctr;
    }

    // A method that indicates whether or not a value is in the list
    public boolean contains(long sn)
    {
        if(find(sn) != null)
            return true;
        else
            return false;
    }



    public void showListContents()
    {
        Node temp = head;
        if (temp == null)
            System.out.println("\nThere is nothing to display; list is empty." );
        else
            System.out.println("\nHere are the contents of the list." );
        while(temp != null)
        {
            System.out.println(temp.cr + " ---> ");
            temp = temp.next;
        }
        System.out.println("X");			}

}


public class IntList {
    public static void main(String[] args) {

        Car c1 = new Car(4, 12000), c2 = new Car(5, 43000), c3 = new Car(),
                c4 = new Car(2, 19000), c5 = new Car(3, 37000), c6 = new Car(2, 52000);

        long sn;
        // Create two lists
        CarList crlst1 = new CarList(), crlst2 = null;


        System.out.println("A list has been created. Its current size is: " +
                crlst1.size());

        System.out.println("Will add few cars to the list.");
        crlst1.addToStart(c2);
        crlst1.addToStart(c5);
        crlst1.addToStart(c3);
        crlst1.addToStart(c1);
        crlst1.addToStart(c4);
        crlst1.addToStart(c6);

        System.out.println("\nThe list current size is: " + crlst1.size());
        crlst1.showListContents();

        // Now clone crlst1 to crlst2
        crlst2 = crlst1.clone();
        System.out.println("\nList has been cloned to another. Here are the contents of the cloned list: ");
        crlst2.showListContents();

    }

}

/* The output of the program

A list has been created. Its current size is: 0
Will add few cars to the list.

The list current size is: 6

Here are the contents of the list.
Car with serial number: 3005 has 2 doors and its price is: 52000.0$. --->
Car with serial number: 3003 has 2 doors and its price is: 19000.0$. --->
Car with serial number: 3000 has 4 doors and its price is: 12000.0$. --->
Car with serial number: 3002 has 4 doors and its price is: 10000.0$. --->
Car with serial number: 3004 has 3 doors and its price is: 37000.0$. --->
Car with serial number: 3001 has 5 doors and its price is: 43000.0$. --->
X

List has been cloned to another. Here are the contents of the cloned list:

Here are the contents of the list.
Car with serial number: 3006 has 2 doors and its price is: 52000.0$. --->
Car with serial number: 3007 has 2 doors and its price is: 19000.0$. --->
Car with serial number: 3008 has 4 doors and its price is: 12000.0$. --->
Car with serial number: 3009 has 4 doors and its price is: 10000.0$. --->
Car with serial number: 3010 has 3 doors and its price is: 37000.0$. --->
Car with serial number: 3011 has 5 doors and its price is: 43000.0$. --->
X


*/

