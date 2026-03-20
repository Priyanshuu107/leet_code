class Solution {
    public int maxArea(int[] height) {
       int low = 0;
       int hi = height.length-1;
       int area = 0;
       while(low<hi){
        int min = Math.min(height[low],height[hi]) ;
        area = Math.max(area , min*(hi-low));
        while(hi>low && height[low]<=min ) low++;
        while(hi>low && height[hi]<=min )  hi--;
       }
       return area; 
    }
}
