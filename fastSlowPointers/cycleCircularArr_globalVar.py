#9.26
hitEnd = False #stored with main functions

def circular_array_loop_exists(arr):
  # TODO: Write your code here
  global hitEnd
  hitEnd = False
  turns = 0
  fastStep = 0
  slowStep = 0

  while turns < len(arr) or hitEnd:
    fastStep = moveStep(arr, moveStep(arr, fastStep))
    slowStep = moveStep(arr, slowStep)
    # print(slowStep, fastStep, hitEnd)
    turns +=1

    if fastStep == slowStep and hitEnd:
      return True

    if turns > len(arr) and not hitEnd:
      break


  return False

def moveStep(arr, currPos):
  global hitEnd
  val = arr[currPos]
  sums = val + currPos

  if sums >= len(arr):
    if not hitEnd:
      hitEnd = True
    diff = sums%len(arr)
    return diff

  return sums
