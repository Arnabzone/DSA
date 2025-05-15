package DSA;

public class SecondLargest {

    public static int sec (int a[]){
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;

        for(int n:a){
            if(n>max){
                 secMax= max; 
                 max=n;
                 } 
                 else if (n> secMax && n<max){
                    secMax=n;
                 }

        }
        return (secMax==Integer.MIN_VALUE) ? -1 : secMax;
      }

      public static void main(String[] args) {
        int n1[]={1,2,3,4,5};
        System.out.println("Seconf largest element is:"+sec(n1));

      }
}
