package LinkedList;

public class Node {

    int data;



    static Node head = null;
    Node next;


    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }


    public static void addFirst(int data)
    {
        if (head==null)
        {
            head = new Node(data);
            return;
        }

        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public static void addLast(int data)
    {
        if (head==null)
        {
            head = new Node(data);
            return;
        }

        Node node = new Node(data);
        Node temp = head;


        while (temp.next!=null)
        {
            temp = temp.next;
        }

        temp.next = node;

    }


    public static void display()
    {
        Node n = head;

        while (n.next!=null)
        {
            System.out.print(n.data+"->");
            n = n.next;
        }
        System.out.print(n.data);

    }

    
    public static void removeNthNode()
    {

        if (head==null)
        {
            return;
        }

        int size = 0;
        int n=2;
        Node temp = head;

        while(temp!=null)
        {
            temp = temp.next;
            size++;
        }

        temp = head;

        int indexToSearch = size - n;
        int i = 1;

        if(indexToSearch==0)
        {
            head = head.next;
            return;
        }

        while (i<=indexToSearch)
        {
            if (i==indexToSearch)
            {
                temp.next = temp.next.next;
            }

            temp = temp.next;
            i++;
        }

//
//        while(temp.next!=null)
//        {
//            if((size-count+1)==(n+1))
//            {
//                temp.next = temp.next.next;
////                System.out.println(temp.data);
//            }
////            else if(((size-count+1)==n))
////            {
////                temp = null;
////            }
//            temp = temp.next;
////            System.out.println(temp.data);
//            count++;
////            System.out.println(count);
//        }

    }

    public static void reverse() //using curr and prev pointers.
    {

        Node prev  = head;
        Node curr = head.next;

        while (curr!=null)
        {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;

        }

        head.next = null;
        head = prev;


    }



    public static void deleteBefore(int val)
    {
         if (head==null || head.next==null)
        {
            return;
        }

        Node curr = head.next;
        Node prev = head;


        while (curr!=null && curr.next.data!=val)
        {
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;

    }


    public static void checkPalindrome()
    {
//        Node temp = head;
//        String original = "";
//        String palindrome = "";
//
//
//        while (temp!=null)
//        {
//            original = original+String.valueOf(temp.data);
//            temp = temp.next;
////            System.out.println(original);
//        }
//
//        for(int i=original.length()-1;i>=0;i--)
//        {
//            palindrome = palindrome + original.charAt(i);
//        }
//
//
//        System.out.println(original.equals(palindrome));

        Node temp = head;
        int LLsize  = 1;
        while (temp!=null)
        {
            temp = temp.next;
            LLsize++;
        }

        int middle = (LLsize/2)+1;
//        System.out.println(middle);
        int count = 1;
        Node mid = null;
         temp = head;

        while (temp!=null)
        {
            if (count==middle)
            {
                mid = temp;
            }

            temp = temp.next;
            count++;
        }


        Node curr = mid.next;
        Node prev = mid;
        while (curr!=null)
        {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        Node endHead = prev;
        mid.next = null;

        Node temp2 = endHead;
        temp = head;
        Boolean flag = false;

        while (temp2!=null)
        {
            if (temp2.data == temp.data)
            {
                flag = true;
                temp2 = temp2.next;
                temp = temp.next;
                continue;
            }
            else
            {
                flag = false;
                break;
            }
        }

        System.out.println(flag);



    }

    


    public static void main(String[] args) {
//        addFirst(5);
//        addFirst(6);
//        addFirst(7);
//        display();
//        addLast(2);
        addLast(2);
        addLast(3);
        addLast(1);
        addLast(4);
        addLast(5);
        addLast(10);
//        display();
//        reverse();
//        removeNthNode();
//        checkPalindrome();
        deleteBefore(4);
        display();
    }

}
