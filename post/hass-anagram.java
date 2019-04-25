import java.util.*; // i.e Arrays.sort
import java.io.*; 

class Main {
  public static void main(String[] args) {

    String[] aG = {"a", "jk", "abb","mn","abc"};
    String[] bG = {"bb", "kj", "bbc","op","def"};


    List<String> a = new ArrayList<>();
    List<String> b = new ArrayList<>();

    for(String e: aG){
      a.add(e);
      
    }
    for(String e: bG){
      b.add(e);
    }

    List<Integer> c = getMinimumDifference(a, b);
    

    for(Integer e: c){
      System.out.println(e);
    }

    System.out.println("DONE");

  }

  public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {

      List<Integer> store = new ArrayList<>(); 
      int[] aCount = new int[26];
      int[] bCount = new int[26];

      for(int i = 0; i < a.size(); ++i){
        char[] aWord = a.get(i).toCharArray();
        char[] bWord = b.get(i).toCharArray();

        // System.out.printf("i %d | aW  %s | bW %s\n",i, a.get(i), b.get(i));

        if(aWord.length != bWord.length){
          store.add(-1);
           System.out.print("eturn neg one");
          // break;
         
        }
          
        else{

          for(int j = 0; j < aWord.length; ++j){
            aCount[aWord[j] - 'a']++;
            bCount[bWord[j] - 'a']++;
            System.out.printf("i %d | aW  %c | bW %c\n",i, aWord[0], bWord[0]);

          }
        
          int diff = 0;
          for(int k = 0; k < aWord.length; ++k){
            if(aWord[k] == bWord[k])
              break;
            else{
              diff += Math.abs(aCount[k] - bCount[k]);
            }
              
          }
          store.add(diff);

          
        }

      }
      return store;
    }




}
