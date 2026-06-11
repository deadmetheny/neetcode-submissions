class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] target = new int[26];
        for (char c : s1.toCharArray()) target[c - 'a']++;

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] window = new int[26];
            for (int j = 0; j < s1.length(); j++) {
                window[s2.charAt(i + j) - 'a']++;
            }
            if (Arrays.equals(target, window)) return true;
        }
        return false;
    }
}