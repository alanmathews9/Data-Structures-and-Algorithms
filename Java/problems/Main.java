class Solution {
    public int removeElement(int[] nums, int val) {
        int i,k,j;
        int n=nums.length;
        for(i=0;i<n;i++){
            if(nums[i]==val){
                for(k=i;k<n;k++){
                    nums[k]=nums[k+1];
                }
                n--;
            }
        }
        return n;
    }
}
class Main{
    public static void main(String args[]){
        int nums[] = {3,2,2,3};
        int val=3;
        Solution obj=new Solution();
        System.out.println(obj.removeElement(nums, val));
    }
}