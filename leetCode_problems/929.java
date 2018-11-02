import java.util.ArrayList;
class Main {
  public static void main(String[] args) {

    String[] test = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

    String[] test2 = {"fg.r.u.uzj+o.pw@kziczvh.com","r.cyo.g+d.h+b.ja@tgsg.z.com","fg.r.u.uzj+o.f.d@kziczvh.com","r.cyo.g+ng.r.iq@tgsg.z.com","fg.r.u.uzj+lp.k@kziczvh.com","r.cyo.g+n.h.e+n.g@tgsg.z.com","fg.r.u.uzj+k+p.j@kziczvh.com","fg.r.u.uzj+w.y+b@kziczvh.com","r.cyo.g+x+d.c+f.t@tgsg.z.com","r.cyo.g+x+t.y.l.i@tgsg.z.com","r.cyo.g+brxxi@tgsg.z.com","r.cyo.g+z+dr.k.u@tgsg.z.com","r.cyo.g+d+l.c.n+g@tgsg.z.com","fg.r.u.uzj+vq.o@kziczvh.com","fg.r.u.uzj+uzq@kziczvh.com","fg.r.u.uzj+mvz@kziczvh.com","fg.r.u.uzj+taj@kziczvh.com","fg.r.u.uzj+fek@kziczvh.com"};//2
    System.out.println("\n" + numUniqueEmails(test));
    System.out.println(numUniqueEmails(test2));
  }
  public static int numUniqueEmails(String[] emails) {
        int index = -1;
        ArrayList<String> record = new ArrayList<>();

        while(++index < emails.length){
            String checking = emails[index], valid = "";
            int i = 0;

            for(; !checking.substring(i, i+1).equals("@"); i++){
                //looking for .
                if(checking.substring(i, i+1).equals("."))
                   continue;
                else if(checking.substring(i, i+1).equals("+"))
                  break;
                 valid += checking.substring(i, i+1);
            }
            valid += checking.substring(checking.indexOf('@'));
            if(!record.contains(valid))
              record.add(valid);
        }
        return record.size();

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

        POST CODE
        - spent about 3 hours
        - reducing the string was simple
        - comparing the string was tough
        - at first I did a double loop with array of strings called refined. but that didn't work
        - I did substring but that only accounted for adjacent strings

        */

    }
}
