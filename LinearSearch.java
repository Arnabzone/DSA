package DSA;

public class LinearSearch {
    
    public static int search(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            } 
        }
            return -1;
        }

        public static void main(String[] args) {
            int n1[]={1,3,2,3,5};
            int target=3;
            System.out.println("Output is:"+search(n1,target));
        }
        
    }
