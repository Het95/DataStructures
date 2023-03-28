package Trees;

public class BuildTree {

    public static int size = 0;
    static Node arr[];

    static int depthCount = 0;
    class Node {
        int data;
        Node left;

        Node right;


        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    } // end of inner class


    class Queue
    {
         int rear;

         public Queue()
         {
             this.rear = -1;
         }

         public void add(Node node)
         {
             if (rear==size-1)
             {
                 return;
             }

             rear++;
             arr[rear] = node;
         }

         public Node remove()
         {
             if (isEmpty())
             {
                 return null;
             }

             Node front = arr[0];
             for (int i=0;i<rear;i++)
             {
                 arr[i] = arr[i+1];
             }

             rear--;
             return front;

         }


         public Boolean isEmpty()
         {
             return rear==-1;
         }


    } // end of Queue Implementation inner class


    public void levelOrder(Node root)
    {
        Queue q = new Queue();
        q.add(root);
        q.add(null);

        int printArr[] = new int[size];
        int idx = 0;



        while (!q.isEmpty())
        {
            Node currNode = q.remove();
            if (currNode==null)
            {
//                System.out.println();
                depthCount++;
                for (int i=0;i<idx;i++)
                {
                    System.out.println("Data of Node: "+printArr[i]+" Depth of Node:"+ depthCount);
                    printArr[i] = 0;
                }

                idx = 0;

                if (q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(currNode);
                }
            }
            else
            {
                printArr[idx++] = currNode.data;
                if (currNode.left!=null)
                {
                    q.add(currNode.left);
                }

                if (currNode.right!=null)
                {
                    q.add(currNode.right);
                }
            }
        }



    }


    static int idx = -1;
    static int count = 0;
    public Node buildTree(int arr[])
    {
        idx++;
        if (arr[idx]==-1 && idx<arr.length)
        {
            return null;
        }

        Node newNode = new Node(arr[idx]);
        newNode.left = buildTree(arr);
        newNode.right = buildTree(arr);


        return newNode;
    }

    public static void main(String[] args) {
        int a[] = new int[]{1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        size = a.length;
        arr = new Node[size];
        BuildTree b1 = new BuildTree();
        Node root = b1.buildTree(a);
//        System.out.println(root.data);
        b1.levelOrder(root);




    }


}
