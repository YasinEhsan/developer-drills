class Main {
  public static void main(String[] args) {

    String[] test = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"];

    System.out.println(numUniqueEmails(test));
  }
  public int numUniqueEmails(String[] emails) {

        /* Thought Dump
        - the @ symbol in seperated
        - one way is to store all eamils with removed . and + in string
        - then compare if two treings are eql
        - increment counter if they are not

        - so how to remove the . and plus
        - while loop given string array
        - inside for loop given string length;
        - cretate a new string
        - if there esxits a dot remove it and if there exits a

        - I dk the technical jargon for remove :(
        - without googling what if .substring(0,0) did it
        - it wont cuz substring returns a string val only
        - how to append in a string?

        - what is the diff bwtween == , compareto and .eqauls


        */

        int index = -1, count = 0;
        String[] refined = new String[emails.length];
        while(++index < emails.length){

            String checking = emails[index], valid = "";

            int i = 0;

            for(; !checking.substring(i, i+1).equals("@"); i++){

                //looking for .
                if(!checking.substring(i, i+1).equals("."))
                    valid += checking.substring(i, i+1);

                else if(checking.substring(i, i+1).equals("+"))
                    break;
            }

            valid += checking.substring(i+1);
            refined[index] = valid;
        }

        for(int i = 0; i < refined.length-1; i++)
            if(!refined[i].equals(refined[i+1]))
                count++;

        return count;

    }
}
