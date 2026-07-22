class Solution {
    public void sortColors(int[] arr) {
        int size = arr.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int index = 0;

        for(int i : arr){
            if(i == 0){
                count0++;
            }
            else if(i == 1){
                count1++;
            }
            else{
                count2++;
            }
        }
        
        while(count0-- > 0){
            arr[index++] = 0;
        }
        while(count1-- > 0){
            arr[index++] = 1;
        }
        while(count2-- > 0){
            arr[index++] = 2;
        }
    }
}