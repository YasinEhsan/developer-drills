# 5.20
def length_of_longest_substring(arr, k):
  startWindow, onesCount, maxLen = 0,0,0

  for endWindow in range(len(arr)):
    if arr[endWindow] == 1:
      onesCount+=1

    if endWindow - startWindow + 1 - onesCount > k:
      # arr
      onesCount -= arr[startWindow]
      startWindow += 1

    maxLen = max(maxLen, endWindow - startWindow + 1)
  return maxLen
