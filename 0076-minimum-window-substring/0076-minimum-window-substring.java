//string
//substring
//minimum 
//can be use sliding window
class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length())
            return "";

        int[] need = new int[128];
        int[] window = new int[128];

        // Frequency of characters in t
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        // Count unique required characters
        int required = 0;
        for (int i = 0; i < 128; i++) {
            if (need[i] > 0)
                required++;
        }

        int formed = 0;
        int left = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            window[ch]++;

            if (need[ch] > 0 && window[ch] == need[ch])
                formed++;

            while (formed == required) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window[leftChar]--;

                if (need[leftChar] > 0 && window[leftChar] < need[leftChar])
                    formed--;

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}