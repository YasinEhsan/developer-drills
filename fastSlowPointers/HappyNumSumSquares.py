# 9.23
def find_happy_number(num):
  # TODO: Write your code here

  fastSum, slowSum = num, num
  while True:
    # currSum = sumOfSqaures(fastSum)
    # nextSum = sumOfSqaures(fastSum)
    # if currSum == 1 or nextSum == 1:
    #   return True
    fastSum = sumOfSqaures(sumOfSqaures(fastSum))
    slowSum = sumOfSqaures(slowSum)

    if fastSum == slowSum:
      break

  return slowSum == 1

# def find_happy_number(num):
#   # TODO: Write your code here

#   fastSum, slowSum = num, num
#   while True:
#     nextSum = sumOfSqaures(fastSum)
#     if fastSum == 1 or nextSum == 1:
#       return True
#     fastSum = sumOfSqaures(nextSum)
#     slowSum = sumOfSqaures(slowSum)

#     if fastSum == slowSum:
#       return False

#   return False


def sumOfSqaures(number):
  store_sum = 0
  while number > 0:
    last_digit = number % 10
    store_sum += last_digit ** 2
    # SINGLE DOESNT CUT IT
    number //= 10
  return store_sum
