def twoSum(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """

    target_minus_nums = {}
    for i in range(len(nums)):
        difference = target - nums[i]
        target_minus_nums[difference] = i

    for i in range(len(nums)):
        if nums[i] in target_minus_nums and i != target_minus_nums[nums[i]]:
            return [i, target_minus_nums[nums[i]]]

    return []

print(twoSum([2,3,4,9],7))
