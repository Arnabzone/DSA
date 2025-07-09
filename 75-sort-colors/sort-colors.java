class Solution {
    public void sortColors(int[] a) {
        int c0=0,c1=0,c2=0;
        for(int num: a){
            if(num==0) c0++;
            else if(num==1) c1++;
            else c2++;
        }
        for(int i=0;i<c0;i++) a[i]=0;
        for(int i=c0;i<c0+c1;i++) a[i]=1;
        for(int i=c0+c1;i<a.length;i++) a[i]=2;
    }
}