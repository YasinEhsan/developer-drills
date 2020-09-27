#9.26
def merge(intervals):
  merged = []
  # TODO: Write your code here

  intervals.sort(key = lambda x : x.start)


  curr = intervals[0]

  for i in range(len(intervals)-1):
    after = intervals[i+1]

    if curr.end < after.start:
      merged.append(curr)
      curr = after
    else:
      curr.end = max(curr.end, after.end)

  merged.append(curr)

  return merged
