class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int longest = 0;
        HashSet<Character> myset = new HashSet<>();
        while(right < s.length()){
            if(!myset.contains(s.charAt(right))){
                myset.add(s.charAt(right));
                longest = Math.max(longest, myset.size());
                right++;
            }
            else{
                myset.remove(s.charAt(left));
                left++;
            }
        }
        return longest;
    }
}