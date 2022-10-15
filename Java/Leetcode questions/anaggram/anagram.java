import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character>list=new ArrayList()<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));

        }
        
        return true;
    }
}
class anagram{
    public static void main(String[] args) {
        Solution s=new Solution();
        boolean v=s.isAnagram("anagram", "nagaram");
        System.out.println(v);
    }
}