#9.27 10AM
def merge(intervals_a, intervals_b):
  result = []
  # TODO: Write your code here
  i, j, start, end = 0,0,0,1
  while i < len(intervals_a) and j < len(intervals_b):

    # chk is a overlabs with b, that is b start time in a
    a_overlaps_b = intervals_a[i][start] >= intervals_b[j][start] and \
    intervals_a[i][start] <=intervals_b[j][end]

    # chk if b overlaps with a, a start time within b
    b_overlaps_a = intervals_b[j][start] >= intervals_a[i][start] and \
    intervals_b[j][start] <= intervals_a[i][end]

    if a_overlaps_b or b_overlaps_a:
      combined_interval = [min(intervals_a[i][start], intervals_b[j][start]),
      max(intervals_a[i][end], intervals_b[j][end])]
      result.append(combined_interval)

    if intervals_a[i][end] < intervals_b[j][end]:
      i+=1
    else:
      j+=1


  return result
