package Lab1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Task3 {
    public static void main(String[] args) {
        int[] nums = {100, 250, 1000};
        System.out.println(solve(nums));
    }

    private static int solve(int[] nums) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        for(int n : nums)
            minHeap.offer(n);
        int res = 0;
        while(minHeap.size() > 1) {
            int f1 = minHeap.poll();
            System.out.println("f1"+" "+f1);
            int f2 = minHeap.poll();
            System.out.println("f2"+" "+f2);
            int tmp = f1 + f2;
            System.out.println("tmp"+" "+tmp);
            res += tmp;
            System.out.println("res"+" "+res);
            minHeap.offer(tmp);
        }
        return res;
    }
    }

