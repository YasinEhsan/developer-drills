public class five_findMostRepeatedNum_leetcode961{
    public static void main(String[] args){
        int[] a = new int[1000];
        for(int i = 0; i<a.length; ++i){
            a[i] = i*i%2500;
            if(a[i] == 0)
               a[i]+=i; 
            System.out.print("\t" + a[i] );
        }
        System.out.printf("\n\ndem Sol is: %d",sol(a));

    }
    
    private static int sol(int[] a){
        int[] store = new int[10000];
        for(int i = 0; i < a.length; ++i)
            store[a[i]]++;

        int greatest = 0, index = 0;
        for(int i =0; i<store.length; ++i)
            if(store[i]>greatest){
                greatest = store[i];
                index = i;
            }
        return index; 
    }
}