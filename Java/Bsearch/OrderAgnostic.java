public class OrderAgnostic {
    public static void main(String[] args) {
        int a[]={1,2,4,5,7,8,9,12,13,14,16};
        int res=search(a,1);
        System.out.println(res);
    }
    static int search(int []a,int target){
        int start=0;
        int end=a.length-1;
        boolean isAsc=a[start]<a[end];
            
        int mid;
        while(start<=end){
            mid=start+(end-start)/2; ///for millions of data int crosses its limit;
            if(a[mid]==target){
                return mid;
            }
           if(isAsc){
            if(a[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
           }
           else{
                if(a[mid]<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
           }
        }
        // return a[start]; //minimum element greater than or equal to target(ceiling)
        // return a[end]; //floor finding 
        return -1;//if not found in bsearch
    }
    }

