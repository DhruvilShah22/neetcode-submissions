class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        while(n > count){
            nums1[m++] = nums2[count++];    
        }
        Arrays.sort(nums1, 0, m);
    }
}