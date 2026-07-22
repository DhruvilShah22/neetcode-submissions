class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        int ans = 0;
        
        while(left <= right){
            int middle = left + (right - left) / 2;
            boolean flag = checkIfCanBeDone(weights, days, middle);
            if(flag){
                right = middle - 1;
                ans = middle;
            }
            else{
                left = middle + 1;
            }
        }
        return ans;
    }

    public boolean checkIfCanBeDone(int[] weights, int days, int limit){
        int totalDays = 1;
        int totalWeight = 0;
        for(int i : weights){
            if(totalWeight + i > limit){
                totalDays ++;
                totalWeight = i;
                if(totalDays > days){
                    return false;
                }
            }
            else{
                totalWeight += i;
            }
        }
        return true;
    }
}