class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: if needle is empty, return 0 as per Leetcode's definition
        if (needle.isEmpty()) {
            return 0;
        }

        // Traverse haystack and compare substrings
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring of haystack matches needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        // If not found
        return -1;
    }
}
