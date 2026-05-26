class Solution {
    public boolean isPalindrome(String s) {
        String lowercase = s.replaceAll("[^A-Za-z0-9]","")
                           .strip()
                           .toLowerCase();
        int j = 0;
        for(int i = lowercase.length() - 1; i >= lowercase.length()/2; i--){
            if(lowercase.charAt(i) != lowercase.charAt(j)){
                return false;
            }
            j++;
        }
    return true;
    }
}