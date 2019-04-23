import java.util.*; // i.e Arrays.sort
import java.io.*; 
public class helpingOut_disunionItersectonArr_5{
     /*QUESTION
        find whats in common and whats not in common
      */
    public static void main( String[] args){
        System.out.println("kjhwguefjgh");
        int[] a =  {1,2,2,3};
        int[] b = {2,2,2,3,4};

        int[] disUnion = sol(a,b,1);

        for(int e: disUnion)
            System.out.printf("%d\t", e);
    }
    public static int[] sol(int[] a, int[] b, int x){
         /* P L A N 
          -run time approx: 
        */

        Set<Integer> store = new HashSet<Integer>();
        Set<Integer> store2 = new HashSet<Integer>();
        List<Integer> list = new ArrayList();

        for(int e: a){
            store.add(e);
            list.add(e);
        }
            

        for(int e: b){
            store2.add(e);
            list.add(e);

        }
            
    
        List<Integer> disUnion = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();
        
        
        

        for(Integer e: list){
            if(store.contains(e) && store.contains(e))
                intersection.add(e);
            else
                disUnion.add(e);
        }

        if(x < 0)
            return intersection(intersection);
        else 
            return disUnion(disUnion);


        /* FUTURE ITERATION
        */
        
   }
   private static int[] intersection(List<Integer> a){
       int [] store = new int[a.size()];
       for(int i = 0; i < store.length; ++i){
           store[i] = a.get(i);
       }
       return store;
   }
   private static int[] disUnion(List<Integer> a){
       int [] store = new int[a.size()];
       for(int i = 0; i < store.length; ++i){
           store[i] = a.get(i);
       }
       return store;
   }
    
}