class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:

        count, res = [0]*101, [0]*len(nums)

        for i in nums:
            count[i]+=1

        for i in range(1,len(count)):
            count[i] += count[i-1]

        for i in range(0, len(nums)):
            if nums[i] == 0:
                res[i] = 0
            else:
                res[i] = count[nums[i] -1]

        return res


        # arr = [0]*len(nums)
        # for i in range(len(nums)):
        #     for j in range (len(nums)):
        #         if nums[i] > nums[j]:
        #             arr[i]+=1
        # return arr



#         does tuple array have best of hasmap insert and array acess
# radix sort and regex are back burner gimmicks
        
