class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        
        int needleLen = needle.length();
        for(int i = 0; i < haystack.length()-needleLen+1; i++){
            String subString = haystack.substring(i, i+needleLen);
            if(subString.equals(needle)){
                return i;
            }
        }
        if(haystack.equals(needle))
            return 0;
        return -1;
    }
}
