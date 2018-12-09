import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Object;

class Main {
  public static void main(String[] args) {
    // System.out.println("enter list");
    // Scanner read = new Scanner(System.in);
    // String[] input = read.nextLine().split(" ");
    // int[] numList = new int[input.length];
    // System.out.printf("%n%s%d%n%s%d%n","input len: ", input.length, "list len: ", numList.length);
    // for(int i = 0; i <input.length; i++)
    //   numList[i] = Integer.parseInt(input[i]);

    // ArrayList<Integer> b1 = new ArrayList<>(), b2 = new ArrayList<>();
    // //   for(int e: numList)
    // //   b1.add(e);

    // // System.out.println(sum(b1));
    // // b2.add(b1.remove(b1.size()-1));
    // // System.out.println(sum(b1));
    // // System.out.println(sum(b2));

    // System.out.printf("%n%n YOUR SOLUTION: %d", solution(numList));


  System.out.print(factorial(10));
  }

  private static int[] permitaition(int n){
    int[] list = new int[factorial(n)];

    ArrayList<Integer[]> store = new ArrayList<>();

     for(int i = 0; i < len; i++)
      for(int j = i +1; j < len; j++)


    return list;
  }

  private static int factorial(int n){
    int num = 1;
    for(int i = n; i>1; i--)
         num = num*i;
    return num;
  }

  private static int solution(int[] list){
    int[] sorted = sort(list, list.length);
    ArrayList<Integer> b1 = new ArrayList<>(), b2 = new ArrayList<>();
    int diff = 0, pos = 0;

    for(int e: sorted)
      b1.add(e);
    diff = Math.abs(findSum(b1) - findSum(b2));
    while(pos < sorted.length){
      System.out.println("b1 : "+findSum(b1));
      System.out.println("b2: "+findSum(b2));
      int currentDiff = Math.abs(findSum(b1) - findSum(b2));
      System.out.println("current: "+currentDiff);
      System.out.println("d: "+diff);
      if(diff > currentDiff)
        diff = currentDiff;
      b2.add(b1.remove(b1.size()-1));
      pos++;
    }

    // for(int i = 0; i <b1.size; i++){
    //   for(int j = i+1; j<b1.size; j++){

    //   }
    // }


    return diff;
  }

  private static int[] sort(int[] given, int len){
    //srts least to greatest
    int[] list = given;
    for(int i = 0; i < len; i++)
      for(int j = i +1; j < len; j++)
        if(list[i] > list[j])
          swap(list,i,j);
    return list;
  }

  private static int findSum(ArrayList<Integer> given){
    int sum = 0;
    for(int e: given)
      sum+=e;
    return sum;
  }

  private static void print(int[] given, String message){
    System.out.printf("%n%n%s%n",message);
    for(int e: given)
      System.out.println(e);
  }

  private static void swap(int[] given, int x, int y){
    int temp = given[x];
    given[x] = given[y];
    given[y] = temp;//MAJJOR DEBUG: had set it to given[temp]

  }
}
