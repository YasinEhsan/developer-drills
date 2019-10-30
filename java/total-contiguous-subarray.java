public static int subarraySum(int[] nums, int sum) {
        /*PLAN
            - init currSum counter, subarrays counter, hashmap
            - increament currsum with index in loop
            - if hash contains currsum - sum then increment subarrys
            - create or imcrement map ( currsum value: occurrences)
            - exit loop return subarrays
         */

        int currSum = 0, subarrays = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            currSum += nums[i];
            if(map.containsKey(currSum - sum)){
                subarrays += map.get(currSum - sum);
            }
            map.put(currSum, map.getOrDefault(currSum, 0) + 1); // +1 for increment
        }
        return subarrays;
    }
