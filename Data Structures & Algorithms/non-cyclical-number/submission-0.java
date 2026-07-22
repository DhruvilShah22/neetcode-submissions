class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(n != 1){
            int temp = n;
            n = 0;
            while(temp > 0){
                int rem = temp % 10;
                n += rem * rem;
                temp /= 10;
            }
            if(!set.add(n)){
                return false;
            }
        }
        
        return true;
    }
}
