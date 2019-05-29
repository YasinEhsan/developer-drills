class main{
  public static void main(String[] args){
  
    String[] a = {"eat", "tea", "tan", "ate", "nat", "bat"};
    
    
    ArrayList<String> store = Arrays.asList(a); //convert array to arraylist
    Arrays.sort(a); //sort by ascii
    Arrays.toString(a); // prints all elements in array 
    
    Arrays.fill(a,0); //fill a with 0s
    Arrays.stream(a).max().getAsInt(); //find max
  }

}
