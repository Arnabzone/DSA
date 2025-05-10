// To add two array such that they are sorted and result is distinct
// a1[1,2,3,4,5]
// a2[1,2,7]
// op[1,2,3,4,5,7]


// Brute-force 

// import java.util.*;

// public class Union {
//     public static List<Integer> unionArray(int a1[], int a2[]) {
//         Set<Integer> set = new HashSet<>();
//         for (int n : a1) set.add(n);
//         for (int n : a2) set.add(n);

//         List<Integer> result = new ArrayList<>(set);
//         Collections.sort(result);  // Sort the list to maintain ascending order
//         return result;
//     }

package DSA;
 import java.util.*;

public class Union {
    public static List<Integer> unionArray(int[] a1, int[] a2) {
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();
        
        while (i < a1.length && j < a2.length) {
            // Skip duplicates in result
            int val;
            if (a1[i] < a2[j]) {
                val = a1[i++];
            } else if (a1[i] > a2[j]) {
                val = a2[j++];
            } else {
                val = a1[i];  // or a2[j], both are same
                i++;
                j++;
            }

            // Add only if not already added (to avoid duplicates)
            if (result.isEmpty() || result.get(result.size() - 1) != val) {
                result.add(val);
            }
        }

        // Remaining elements in a1
        while (i < a1.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != a1[i]) {
                result.add(a1[i]);
            }
            i++;
        }

        // Remaining elements in a2
        while (j < a2.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != a2[j]) {
                result.add(a2[j]);
            }
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2, 7};

        List<Integer> output = unionArray(a1, a2);  // result returned from method
        System.out.println("Output: " + output);   // Output: [1, 2, 3, 4, 5, 7]
    }
}


