public static List<List<Integer>> findTriplets(int[] nums) {
       /*PLAN
           - brute force solution is n^3
           - we want to reduce it to n^2/o(1) time/space so no hashing
           - using the find if two numbers equal sum logic.
               - sort array
               - have point min and max
               - if min + max = sum //do something
               - elif min max > sum max--
               - "" < sum min++
            - we have the same concept except our sum = 0 - outerloop
            - init arraylist, sort array
            - outer loop currSum = 0 - index, min = i + 1, max = len - 1
               - min is i = 1 bc currsum holds index already
            - inner loop while min < max
            - use "two numbers equal sum" logic
            - exit loops return result
        */
       List<List<Integer>> list = new ArrayList<>();
       Arrays.sort(nums);
       for(int i = 0; i < nums.length; i ++){
           int currSum = 0 - nums[i], min = i + 1, max = nums.length - 1;
           while (min < max){
               if(nums[min] + nums[max] == currSum){
                   list.add(Arrays.asList(nums[min], nums[max], nums[i]));
                   min++;
                   max--;
               }

               else if (nums[min] + nums[max] < currSum)
                   min++;
               else
                   max--;
           }
       }
       return list;
   }
