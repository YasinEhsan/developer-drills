# 10.7
def threeSum(nums):
    """
    :type nums: List[int]
    :rtype: List[List[int]]
    """

    if len(nums) < 2:
        return []

    nums.sort()
    triplets = []

    for i in range(len(nums) -2):
        if i > 0 and nums[i] == nums[i-1]:
            continue
        target = -nums[i]
        small = i +1
        big = len(nums) - 1


        while small < big:
            tsum = nums[small] + nums[big]
            if tsum == target:
                triplets.append([nums[i], nums[small], nums[big]])
                # -4,-1,-1,0,1,2
                while small < big and nums[small] == nums[small+1]:
                    small +=1
                while small < big and nums[big] == nums[big-1]:
                    big -=1
                small +=1
                big -=1
            elif tsum < target:
                small +=1
            else:
                big -=1

    return triplets

print(threeSum([-1,0,1,2,-1,-4]))
