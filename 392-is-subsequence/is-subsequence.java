class Solution {
    public boolean isSubsequence(String s, String t) {
        char [] s1 = s.toCharArray();
        char[] t1= t.toCharArray();
        int i = 0;
        int j = 0;

        while(j < t1.length){
            if(s1.length > i && s1[i] == t1[j]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }

    //     while (j < t1.length) {
    //     if (s1.length > i && s1[i] == t1[j]) {
    //         i++;
    //     }
    //     j++;
    // }
        return i == s1.length;
    }
}