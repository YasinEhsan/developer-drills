import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
  public static String sol(String[] initialStates) {
    
     String[] loc = new String[initialStates.length];
     ArrayList<String> con = new ArrayList<>();
     con.add("");
     con.add("");


    //Initialize
    for(int i = 0; i < initialStates.length; ++i){
      String[] temp = initialStates[i].split(" ");

      for(int j = 0; j < temp.length; j++){
        if(j == 0)
          con.set(0, con.get(0) + temp[0] + " ");
        else if(j == 1){
          con.set(1, con.get(1) + temp[1] + " ");
          loc[i] = "";
        }
          
        else
          loc[i] += temp[j] + " ";
      }
    }
    





    for(String e: con)
      System.out.println(e);


    for(String e: loc)
      System.out.println(e);


    return "";
      
 }
  
    public static void main(String[] args) {
      String[] in = {
        "Wilson SICK PaloAlto DC London PaloAlto",
        "Yun HEALTHY PaloAlto",
        "Ali RECOVERING DC DC DC London",
        "Jasmine HEALTHY London" };

        System.out.println(sol(in));
    }

}
