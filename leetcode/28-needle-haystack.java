class Solution {
    public int strStr(String haystack, String needle) {
        /*PLan
            - e case : empty str r 0
            - metohds 
                - indexof
                - tewo pointors 
                - break str into str[] len 2 each and compare 
        
            since theres no sol, I'll code this
        */
        
        
        if(needle.equals(""))
            return 0;
        
        int index = -1;
        index = haystack.indexOf(needle);
        
        return index;
        
        
    }
}
