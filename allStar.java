class allStar{
    public static void main(String[] roar){

        String[] words = {"gin", "zen", "gig", "msg", 
        "gin", "zen", "gig", "msg","gin", "zen", "gig", "msg"};
        long startTime = System.nanoTime();
        System.out.println(distinguish(words));
        long duration = System.nanoTime() - startTime;
        // System.out.println(duration);

    }

    public static int distinguish(String[] words){
        int count = 0;
        for(int i = 0; i < words.length; ++i){
            for(int j = i; j < words[i].length(); j++){
                if(!words[i].equals(words[j]))
                    count++;
            }
        }
         return count;
    }
   
}