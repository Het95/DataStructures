package PriorityQueues;

import java.util.Comparator;

public class PriorityQueueUsingArrays {
    class item{
        int data;
        int priority;

        public item(int data,int priority)
        {
            this.data = data;
            this.priority = priority;
        }
    }

//
//    static class comparison implements Comparator<item>
//    {
//        @Override
//        public int compare(item o1, item o2) {
//            return 0;
//        }
//    }
    static item pr[] = new item[1000];

    static int size = 0;

    public  void enque(int data,int priority)
    {
        pr[size]= new item(data,priority);
        size++;
    }

    int highestPriority = Integer.MIN_VALUE;
    int idx = 0;
    int samePriorityHighNum = Integer.MIN_VALUE;


    public  int peek() // getting the highest priority element out
    {
        highestPriority = Integer.MIN_VALUE;
        idx = 0;
        samePriorityHighNum = Integer.MIN_VALUE;

        for (int i=0;i<size;i++)
        {
            if (highestPriority<=pr[i].priority && samePriorityHighNum<=pr[i].data)
            {
                highestPriority = pr[i].priority;
                samePriorityHighNum = pr[i].data;
                idx = i;
            }
        }

        return idx;
    }

    public void deque()
    {
            int index = peek();
            for (int i=index;(i+1)<size;i++)
            {
                    pr[i] = pr[i + 1];
            }

            size--;

    }

    public static void main(String[] args) {

        PriorityQueueUsingArrays pq = new PriorityQueueUsingArrays();
        pq.enque(10,2);
        pq.enque(14,4);
        pq.enque(16,4);
        pq.enque(12,3);
        pq.enque(13,4);
        pq.enque(20,1);


//        int index1 = pq.peek();
//        System.out.println(pr[index1].data+" "+pr[index1].priority);
//        pq.deque();
//        pq.deque();
//        int index2 = pq.peek();
//        System.out.println(pr[index2].data+" "+pr[index2].priority);
        pq.deque();
        pq.deque();
        pq.deque();
        pq.deque();
        pq.deque();
        int index3 = pq.peek();
        System.out.println(pr[index3].data+" "+pr[index3].priority);


    }

}
