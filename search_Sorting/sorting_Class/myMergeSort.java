public class myMergeSort{
    public static void main(String[] args){
        int[] a = new int[100];
        for(int i = 0; i < a.length; ++i)
            a[i] = (i*(i+i*3))%50 + (i*3)%2;
        for(int e: a)
            System.out.println(e);
    }

    private int[] mergeSort (int[] a){
        
    }
}