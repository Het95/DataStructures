package Heaps;

public class HeapUsingArrays {


    int a[] = new int[100];
    int size;

    public HeapUsingArrays()
    {
        int size = 0;
        a[0] = -1;
    }


    public void insert(int data)
    {
        size++;
        int index = size;
        a[size] = data;

        while (index>1)
        {
            int parentIndex = index/2;
            if(a[parentIndex]<a[index])
            {
                int temp = a[parentIndex];
                a[parentIndex] = a[index];
                a[index] = temp;
            }
            else
            {
                return;
            }

            index = index/2;
        }

    }

    public void deletion()
    {
        if (size==0)
        {
            return;
        }

        a[1] = a[size];
        int index = 1;
        size--;

        while (index<size)
        {
            int leftChildIndex = 2*index;
            int rightChildIndex = (2*index)+1;

            if (leftChildIndex<size && a[leftChildIndex]>a[index])
            {
                int temp = a[leftChildIndex];
                a[leftChildIndex] = a[index];
                a[index] = temp;
                index = leftChildIndex;
            }
            else if (rightChildIndex<size && a[rightChildIndex]>a[index])
            {
                int temp = a[rightChildIndex];
                a[rightChildIndex] = a[index];
                a[index] = temp;
                index = rightChildIndex;
            }
            else
            {
                return;
            }

        }

    }

    public void heapify(int arr[],int n,int i)
    {
        int largest = i;
        int leftChildIndex = 2*i;
        int rightChildIndex = 2*i+1;

        if (leftChildIndex<=n && arr[leftChildIndex]>arr[largest])
        {
            largest = leftChildIndex;
        }

        if (rightChildIndex<=n && arr[rightChildIndex]>arr[largest])
        {
            largest = rightChildIndex;
        }

        if (largest!=i)
        {
            int temp = arr[i];
            arr[i]  = arr[largest];
            arr[largest] = temp;
            heapify(arr,n,largest);
        }

    }

    public void display()
    {
        for (int i=1;i<=size;i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.println();
    }

    public static void main(String[] args) {


        HeapUsingArrays h1 = new HeapUsingArrays();
        h1.insert(55);
        h1.insert(52);
        h1.insert(50);
        h1.insert(30);
        h1.insert(40);

        h1.display();

        h1.deletion();

        h1.display();

        int arr[] = new int[]{-1,55,56,45,60,67};
        int n = 5;

        for (int i=n/2;i>0;i--)
        {
            h1.heapify(arr,n,i);
        }

        System.out.println("Printing Heap");

        for(int i=1;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
