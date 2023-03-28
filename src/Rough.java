import java.io.*;
import java.util.*;
import java.io.*;
import java.security.spec.ECField;
import java.util.Scanner;
import java.util.StringTokenizer;


class Rough {
    // Java code for the above approach



        // Drivers code
        public static void main(String[] args)
        {
            int N = 8;
            int[] nums = { 5, 1, 2, 0, 0, 4, 3, 0 };
            System.out.println("Maximum value is : "
                    + calculateMaxVal(nums, N));
        }

        // Function to calculate maximum value
        public static int calculateMaxVal(int[] nums, int N)
        {
            PriorityQueue<Integer> decreasing
                    = new PriorityQueue<Integer>(
                    Collections.reverseOrder());
            int val = 0;
            for (int i = 0; i < N; i++) {
                if (nums[i] == 0) {
                    if (!decreasing.isEmpty())
                        val += decreasing.remove();
                }
                else {
                    decreasing.add(nums[i]);
                }
            }

            return val;
        }
    }




