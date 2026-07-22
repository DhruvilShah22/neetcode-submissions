class Solution {
    public int maxArea(int[] heights) {
        int maxi = 0;
        int size = heights.length;
        int left = 0;
        int right = size - 1;

        while(right > left){
            int area = Math.min(heights[left], heights[right]) * (right - left);
            maxi = Math.max(maxi, area);
            if(heights[left] > heights[right]){
                right --;
            }
            else{
                left ++;
            }
        }

        return maxi;
    }
}
