import java.util.*;
import java.io.*; 
class allStar{
    public static void main(String[] roar){

        String[] words = {"gin", "zen", "gig", "msg", 
        "gin", "zen", "gig", "msg","gin", "zen", "gig", "msg"};
        long startTime = System.nanoTime();
        System.out.println(distinctFor(words));
        System.out.println(distinctWhile(words));
        System.out.println(distinctHash(words));
        long duration = System.nanoTime() - startTime;
        // System.out.println(duration);

    }
    //find Distinct Elements using for loop O(n^2)
    public static int distinctFor(String[] words){
        int count = 0;
        for(int i = 0; i < words.length; ++i){
            int j;
            for(j = 0; j < i; j++)
                if(words[i].equals(words[j]))
                    break;
            if(j == i)
                count++;
        }
         return count;
    }

    //find distinct element after sorting. O(nlogn)
    public static int distinctWhile(String[] words){
        int count = 0;
        Arrays.sort(words);
        for(int i =0; i < words.length; ++i){

            // Move the index ahead while there are duplicates 
            while (i < words.length - 1 && words[i] == words[i + 1]) 
                i++;
            count++;
        }
        return count;
    }

    //find distinct element using hashing. O(n)
    public static int distinctHash(String[] words){
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for(int i =0; i < words.length; ++i)
            if(!set.contains(words[i])){
                set.add(words[i]);
                count++;
            }
        return count;
    }
    public static void readStr(String s){
        Scanner read = new Scanner(System.in);
        String current = read.
    }
}