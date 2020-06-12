class Solution {

    public boolean isAnagram(String s, String t) {
        /* PLAN
        - count the number of letters in s
        - see if the num of letters are also in t
        - create a counter array
            - each pos of arrray represengts th number of times the char is there
        - loop thru string s
            - increment counter for each letter occurence of s
            - decrement counter for each "" of t
        - loop thru counter array
            - check that all pos is zero
            - if not return false
        - return true

        */

        //  LINE in the SAND
        if(s.length() != t.length())
            return false;

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            char letter_in_s = s.charAt(i); //'t'
            char letter_in_t = t.charAt(i); //'r'

//             count[98-97] = count[1]
            count[letter_in_s - 97]++;  //num of 'r' ++
            count[letter_in_t - 97]--; // num of 'c' --
//             count['a'] = 0
// count[] = {a,b,c,d...}

            count[s.charAt(i) - 97]++;
            count[t.charAt(i) - 97]--;

        }


        for(int i: count){
            if(i != 0)
                return false;
        }

        return true;
    }
}
