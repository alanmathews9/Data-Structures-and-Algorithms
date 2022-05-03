class Solution {
    public static void main(String[] args) {
        char letters[] = {'c','f','j'};
        
        System.out.println(letters);
        char res=nextGreatestLetter(letters,'c');
        
        System.out.println(res);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length;
        
        while(start<=end){
            int mid=start +(end-start)/2;
            if(letters[mid]==target){
                return letters[mid];
            }
            if(letters[mid]>target){
                start=mid+1;
                
            }
            else{
                end=mid-1;
            }

        }
        if(start==letters.length){
            return letters[0];
        }
      else { return letters[start];}
    }
}