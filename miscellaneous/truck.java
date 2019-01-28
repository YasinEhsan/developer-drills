import java.util.*; // i.e Arrays.sort
import java.io.*; 
public class test {
     /*QUESTION
      */
    public static void main( String[] args){
        ArrayList<Double> a = new ArrayList<>();

        a.add(19.0);
        a.add(17.25);
        a.add(1.50);
        a.add(3.5);


        sol(4, 20.75, a);
    }
    public static void sol(int numContainers, double maxCapacity, 
                            List<Double> containersWt){
         /* P L A N 
          -run time approx: 
        */

        //   Pair chosen = new Pair(3,3);
        Double sum = 0.0;

        for(int i = 0; i <  containersWt.size() -1 ; ++i){
            for(int j = i + 1; j <  containersWt.size(); ++j){
                Double localSum =  containersWt.get(i) +  containersWt.get(j);
                if( localSum >= sum || localSum < maxCapacity){
                    System.out.printf("\n%f\t%f\t%f\t%f", sum, localSum, containersWt.get(i),containersWt.get(j));
                    sum =  containersWt.get(i) +  containersWt.get(j);

                //     chosen.first =  
                //     chosen.second =  containersWt.get(j);
                }
                    
            }
        }

        HashSet<Double> seen = new HashSet<>();
        for(Double e: containersWt){
            for(Double f: seen){
                if(f + e == sum)
                    System.out.print(f + " " + e);
                else
                    seen.add(e);
            }
        }


        /* FUTURE ITERATION
        */
        
    }
    
}