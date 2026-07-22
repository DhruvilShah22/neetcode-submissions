class Solution {
    public boolean lemonadeChange(int[] bills) {
        int i5 = 0;
        int i10 = 0;

        for(int i : bills){
            if(i == 5){
                i5++;
            }
            else if(i == 10){
                i5 --;
                i10++;
            }
            else{
                if(i10 > 0){
                    i10--;
                    i5--;
                }
                else{
                    i5-=3;
                }
            }
            if(i5 < 0 || i10 < 0){
                return false;
            }
        }

        return true;
    }
}