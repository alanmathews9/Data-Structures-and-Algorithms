// AMAZON INTERVIEW QUESTION

public class InfiniteArray {
    public static void main(String[] args) {
        int []nums={3,5,7,9,10,10,90,100,100,130,140,160,170};
        int target=10;
        System.out.println(findingRange(nums, target));
    }
    static int findingRange(int []nums, int target){
        int start=0;
        int end =1;
        while(target>nums[end]){
            int nextStart=end+1;
            end=end+(end-start+1)*2;
            start=nextStart;
        }
        int ans= Bsearch(nums,target,start,end);
        return ans;

    }
    public static  int Bsearch(int nums[],int target,int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
