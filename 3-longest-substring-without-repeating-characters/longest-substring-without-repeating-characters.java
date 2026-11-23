class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        char [] c = s.toCharArray();
        HashSet<Character> set = new HashSet<>();

        for(int right = 0; right < c.length; right++){
            
            while(set.contains(c[right])){
                set.remove(c[left]);
                left++;
            }
            set.add(c[right]);
            int length = right - left +1;
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}