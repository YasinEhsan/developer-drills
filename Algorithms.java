class Main {
  public static void main(String[] args) {
    
    int[] sorted = {1,2,3,4,50};
    int[] u1 = {23,45,54,45,45,45,6,7,8};
    
    System.out.print("unsorted: ");
    for(int i: u1)
      System.out.print(i + " ");
      
    System.out.print("\n\ninsertionSort: ");
    insertionSort(u1);
    for(int i: u1)
      System.out.print(i + " ");

    System.out.print("\n\nbubbleSort: ");
    bubbleSort(u1);
    for(int i: u1)
      System.out.print(i + " ");
      
    int search = 8;
    System.out.print("\n\nbinary search(" + search + "): ");
    System.out.println(binarySearch(u1, search));
    
  }
  //algorithm 3
  public static int binarySearch(int[] ar, int given){
    int i= 0;
    int j = ar.length - 1;
    while(i < j){
      int m = (i + j) /2;
      if(ar[m] < given)
        i = m + 1;
      else
        j = m;
    }
    if(ar[i] == given)
      return i;
    else 
      return -1;
  }
  
  //algorithim 4
  public static void bubbleSort(int[] ar){
    for(int i = 0; i < ar.length - 1; i++){
      for(int j = 0; j < ar.length - i -1; j++){
        if(ar[j] > ar[j + 1]){
          int temp = ar[j];
          ar[j] = ar[j+1];
          ar[j + 1] = temp;
        }
      }
    }
  }
  
  //algortithm 5
  public static void insertionSort(int[] ar){
    int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
  }
}
