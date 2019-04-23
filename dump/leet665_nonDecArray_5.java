public class leet665_nonDecArray_5{
    public static void main(String[] args){
        int[] a = {2,3,7,4,28,8};
        int[] b = {4,2,1};
        System.out.println(sol(a));

    }
    private static boolean sol(int[] a){
        /*PLAN
        - the next element has to be greater than or equal to current.
        - all but except one. that one element could be anything.

        */
        int count = 0;
        for(int i = 0; i < a.length -1; ++i){
            if(a[i] <= a[i+1])
                continue;
            else{
                count++;
            }
        }
        return count <= 1;
    }
}