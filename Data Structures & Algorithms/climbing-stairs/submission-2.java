class Solution {
    public int climbStairs(int n) {
        if(n <= 1){
            return 1;
        }
        int i1 = 1;
        int i2 = 2;
        n-=2;

        while(n-- > 0){
            int temp = i1 + i2;
            i1 = i2;
            i2 = temp;
        }

        return i2;
    }
}
