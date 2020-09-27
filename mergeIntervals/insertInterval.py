#9.26 6:35pm
def insert(intervals, new_interval):
  merged = []

  start,end, i = 0,1,0

  while i < len(intervals) and intervals[i][end] < new_interval[start]:
    merged.append(intervals[i])
    i+=1

  while i < len(intervals) and intervals[i][start] <= new_interval[end]:
    new_interval[start] = min(new_interval[start], intervals[i][start])
    new_interval[end] = max(new_interval[end], intervals[i][end])
    i+=1

  merged.append(new_interval)
  if i != len(intervals):
    merged.append(intervals[i:len(intervals)])

  return merged
  # merged = []
  # # TODO: Write your code here
  # combinedRange = new_interval
  # start, end = 0,1

  # for i in range(len(intervals)):
  #   curr = intervals[i]
  #   if curr[end] < new_interval[start]:
  #     merged.append(curr)
  #   else:
  #     combinedRange[start] = min(curr[start], combinedRange[start])
  #     combinedRange[end] = max(curr[end], combinedRange[end])

  #   if combinedRange[start] < curr[end]:
  #     merged.append(combinedRange)
  #     merged.append(intervals[i:len(intervals)])
  #     break


  # return merged

# def insert(intervals, new_interval):
#   merged = []
#   # TODO: Write your code here
#   interval_start = new_interval[0]
#   interval_end = new_interval[1]
#   found = False


#   for i in range(len(intervals)):
#     curr_start = intervals[i][0]
#     curr_end = intervals[i][1]

#     if found and interval_end < curr_start:
#       merged.append([interval_start, interval_end])
#       merged.append(intervals[i:len(intervals[i])])
#       break

#     if interval_start <= curr_start:
#       interval_end = max(curr_end, interval_end)
#       found = True
#     else:
#       merged.append(intervals[i])

#   return merged
