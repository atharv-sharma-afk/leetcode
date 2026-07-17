class Solution {
    public int trap(int[] height) {
        int n= height.length;
        if(n==0) return 0;

        int[] max_left= new int[n];
        int[] max_right= new int[n];
        max_left[0]=height[0];
        max_right[n-1]=height[n-1];

        for(int i=1;i<n;i++){
            max_left[i]=Math.max(max_left[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            max_right[i]=Math.max(max_right[i+1],height[i]);
        }
        int total_water=0;
        for(int i=0;i<n;i++){
            total_water+=Math.min(max_left[i],max_right[i])-height[i];

        }return total_water;
    }
}