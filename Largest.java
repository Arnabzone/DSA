package DSA;
import java.util.*;
public class Largest {
    public static int largestElement(int a[])
    {
        //Brute Force
        // Arrays.sort(a);
        // return a[a.length-1];

        //optimal
        int n=a.length;
        int max=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int[] a1={1,3,2,7};
        System.out.println(largestElement(a1));
    }
}
