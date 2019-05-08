class Solution {
     public static String countAndSay(int n) {
        /*plan
            - the q is vauge. Each sequence is made from the prev one
            - 6 should be 312211
            - create an arraylist of string. add 1
            - loop 2 - n
            - each string appended...
                - have a counter increment values
                - reset counter w new value 
                - continue till str len
        */
        
        List<String> seq = new ArrayList<String>();
        seq.add("1");
        
        for(int i = 1; i < n; ++i){
            String prev = seq.get(seq.size() -1);
            // System.out.printf("%d %s %s\n", i, prev, breakdown(prev));
            seq.add(breakdown(prev));
        }
        
        return seq.get(seq.size() -1);
    }
    
    private static String breakdown(String prev){
        String create = "";
        int count  = 1;
        String val = prev.substring(0,1);
        for(int i = 1; i < prev.length(); ++i){
            String curr = prev.substring(i, i + 1);
            if(curr.equals(val)){
                count++;
            }
            else{
                create += Integer.toString(count) + val;
                val = curr;
                count = 1;
            }
        }
        return create += Integer.toString(count) + val;
    }
}
