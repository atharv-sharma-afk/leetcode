class Solution { 
    public int eraseOverlapIntervals(int[][] intervals) { 
        if (intervals.length <= 1) { 
            return 0; 
        } 
        
        // Sort intervals by their start times
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[1])); 
        
        int count = 1; 
        int prev_interval=0;

        for (int i =1;i<intervals.length;i++){
            if(intervals[i][0]>=intervals[prev_interval][1]){
                prev_interval=i;
                count++;
            }
        }return intervals.length-count;
    } 
}