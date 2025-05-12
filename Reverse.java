package DSA;
import java.util.*;
// public class Reverse {
//     public static int[] array(int[] a){
//         int n=a.length;
//         int[] rev = new int[n];
//         for(int i=0;i<n;i++){
//             rev[i]= a[n-1-i];
//                 }
//                 return rev;
//     }

//     public static void main(String[] args) {
//         int[] a={1,2,3,4,5};
//         int[] rev= array(a);
//         System.out.println(Arrays.toString(rev));
//     }
// }

public class Reverse {
    public static void Reversearray(int[] a) {
        int l = 0, r = a.length - 1;  
        while (l < r) {
            
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Reversearray(a); 
        System.out.println(Arrays.toString(a));  
    }
}
