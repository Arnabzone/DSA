class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer,Integer> hm =  new HashMap<>();
    // make frequency hashmap
    for(int num: nums){
        hm.put(num,hm.getOrDefault(num,0)+1);
    }
    //built min heap for freq.
    PriorityQueue<Integer>pq= new PriorityQueue<>((a,b)-> hm.get(a)- hm.get(b));
    for(int key:hm.keySet()){
        pq.add(key);
        if(pq.size()>k){
            pq.poll();
        }
    }
    int ans[]=new int[k];
    int i=0;
    while(!pq.isEmpty()){
        ans[i++]=pq.poll();
    }
    return ans;

    
    }
}