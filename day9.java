class Solution {
    public int subarraySum(int[] nums, int k) {
          int n=nums.length;
        int[] prefix= new int[n+1];
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }
           HashMap<Integer,Integer> hm= new HashMap<>();
           hm.put(0,1);
         
           int count=0;
         
           for(int i=1;i<=n;i++){
            int current=prefix[i];
            int needed=current-k;
            if(hm.containsKey(needed)){
                count=count+hm.get(needed);
            }
            hm.put(current,hm.getOrDefault(current,0)+1);
           }
           return count;
    }
}
// class Solution {
//     public int subarraySum(int[] nums, int k) {

//         int n = nums.length;
//         int[] prefix = new int[n+1];

//         for(int i=0;i<n;i++){
//             prefix[i+1] = prefix[i] + nums[i];
//         }

//         int count = 0;
        
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 if(prefix[j+1] - prefix[i] == k){
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }
// }