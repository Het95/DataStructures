package Array;

import java.util.HashSet;
import java.util.Set;

public class Task1
{
    public static void main(String[] args) {

        int a[] = {2,1,3,5,4};
        Set<Integer> missing = new HashSet<>();
        Set<Integer> store = new HashSet<>();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (!store.contains(i + 1) && i + 1 != a[i]) {
                missing.add(i + 1);
            }
            if (i + 1 < a[i])
                store.add(a[i]);
            else
                missing.remove(a[i]);
            if (missing.isEmpty())
                count++;
        }

        System.out.println(count);
    }

}
