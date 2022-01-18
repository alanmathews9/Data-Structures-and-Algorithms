class Solution {
    public int findNumbers(int[] nums) {
        int i,ctr=0;
        for(i=0;i<nums.length;i++){
            if(iseven(nums[i])){
                ctr++;
            }
        }
        return ctr;
    }
    static bool iseven(int x){
        int state=0;
        while(x!=0){
            state++;
            x=x/10;
        }
        if(state%2==0&&state!=0){
            return true;
        }
        else{
            return false
        }
    }

}