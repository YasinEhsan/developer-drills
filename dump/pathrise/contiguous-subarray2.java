import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static boolean subarraySum(int[] nums, int sum) {
        /*PLAN
            - init currSum counter, hashmap
            - increament currsum with index in loop
            - if currsum - sum is a key return true
            - else create key: currsum value: index
            - exit loop return false
            - BTW in out if statment if we print map(cursum-sum) + 1 and index we get range of the subarray
         */

        int currSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            if(map.containsKey(currSum - sum)){
                System.out.printf("range: %d - %d", map.get(currSum - sum) + 1, i );
                return true;
            }

            map.put(currSum, i);
        }
        return false;
    }




    public static void main(String[] args){
        int[] a = {3,2,7,1,6}; //2 + 7 + 1

        System.out.println(subarraySum(a, 10)); //prints 1-3 (range)
    }

}
