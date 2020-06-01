# may 31 20
def length_of_longest_substring(arr, k):
  # init vars
  startWindow = 0
  # currVal isnt needed...window size is enough
  # currLen = 0
  maxLen = 0

  # allowance
  extraOnes = 0

  for endWindow in range(len(arr)):
    # DEBUGGGGGG
    # our window or currlen should append if arr[i] == 0 too bc we have slinki
    # here we are only using one once
    # if arr[endWindow] == 1:
    #   currLen +=1

    if arr[endWindow] == 0:
      extraOnes +=1

    while extraOnes > k:
      if arr[startWindow] == 0:
        extraOnes -=1
      # currLen-=1
      startWindow +=1



    maxLen = max(maxLen, endWindow - startWindow + 1)

  return maxLen


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
