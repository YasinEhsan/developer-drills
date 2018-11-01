class Solution {
    public int numJewelsInStones(String J, String S) {
        /*CHKING WHAT EAQUALS DOES
        Scanner read = new Scanner(System.in);

        System.out.println("enter letter");

        String f = read.next();

        System.out.println("\nenter another");

        String s = read.next();

        System.out.println("\n" + f.equals(s));
        */

        int index = -1, count = 0;
        while(++index < J.length())
            for(int i = 0; i < S.length(); i++)
                if(J.substring(index, index + 1).equals(S.substring(i, i+1)))
                    count++;
        return count;
    }
}
