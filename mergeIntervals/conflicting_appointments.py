# 9.27 10:07AM
def can_attend_all_appointments(intervals):
  # TODO: Write your code here
  start, end = 0, 1
  intervals.sort(key = lambda x: x[start])
  prev = intervals[0]

  for i in range(1, len(intervals)):
    curr = intervals[i]
    # should be > NOT >= because you can have back to back meetings on google cal
    if prev[end] > curr[start]:
      return False
    prev = curr

  return True
