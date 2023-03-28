package LinkedList;

public class DoublyLL
{
    class Node{
        int x;
        Node prev;

        Node next;

        public Node()
        {
             x = 5;
            Node prev = null;
            Node next = null;
        }

        public Node(int x)
        {

            this.x = x;
            Node prev = null;
            Node next = null;
        }

    } // end of inner class

    Node head;
    Node tail;

    public DoublyLL()
    {
        head = null;
        tail = null;
    }

    public void addFirst(int data)
    {
        Node n = new Node(data);
        if (head==null)
        {
            head = n;
            tail = n;
            return;
        }

        n.next = head;
        head.prev = n;
        head = n;

    }

    public void addLast(int data)
    {
        Node n = new Node(data);
        if (head==null)
        {
            head = n;
            tail = n;
            return;
        }

        Node temp = head;

        while (temp.next!=null)
        {
            temp = temp.next;
        }

        temp.next = n;
        tail = n;
        n.prev = temp;

    }


    public void addNthNode()
    {
        
    }

    public void displayUsingHead()
    {
        Node temp = head;

        while (temp!=null)
        {
            System.out.print(temp.x+" ");
            temp = temp.next;
        }

        System.out.println();

    }

    public void displayUsingTail()
    {
        Node temp = tail;

        while (temp!=null)
        {
            System.out.print(temp.x+" ");
            temp = temp.prev;
        }

        System.out.println();

    }



    public static void main(String[] args) {

        DoublyLL dll = new DoublyLL();

        dll.addFirst(5);
        dll.addFirst(4);
        dll.addLast(6);
        dll.addLast(7);


        dll.displayUsingHead();
        dll.displayUsingTail();



    }
}
