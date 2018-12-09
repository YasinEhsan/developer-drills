import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    System.out.println("enter list");
    Scanner read = new Scanner(System.in);
    String[] input = read.nextLine().split(" ");
    int[] numList = new int[input.length];
    for(int i = 0; i <input.length; i++)
      numList[i] = Integer.parseInt(input[i]);

    System.out.printf("%n%n YOUR SOLUTION: %d", solution(numList));
  }

  private static int solution(int[] list){
    int[] sorted = sort(list, list.length);
    ArrayList<Integer> b1 = new ArrayList<>(), b2 = new ArrayList<>();
    int diff = 0, pos = 0;

    for(int e: sorted)
      b1.add(e);
    diff = Math.abs(findSum(b1) - findSum(b2));

    while(pos < sorted.length){
      int currentDiff = Math.abs(findSum(b1) - findSum(b2));
      if(diff > currentDiff)
        diff = currentDiff;
      b2.add(b1.remove(b1.size()-1));
      pos++;
    }

    return diff;
  }

  private static int[] sort(int[] given, int len){
    //srts least to greatest
    int[] list = given;
    for(int i = 0; i < len; i++){
      for(int j = i +1; j < len; j++){
        if(list[i] > list[j])
          swap(list,i,j);
      }
    }
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
