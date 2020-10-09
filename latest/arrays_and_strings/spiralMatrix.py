# 10.8

def spiralOrder(matrix):

    '''
    PLAN
        - lets say there are c cols and r rows


         ___
        |___|


        - one cycle is [r][c]

            - [0][0] - [0][c-1] r is constant c++
            r++
            - [0][c-1] - [r-1][c-1] c is contant r++
            c--
            - [r-1][c-1] - [r-1][0] r is constant c--
            r--
            - [r-1][0] - [1][0] c is constant r--
            c++

            here col start is one

    '''

    rowStart = 0 #0 1
    rowEnd = len(matrix) -1 #3
    colStart = 0 # 0 1
    colEnd = len(matrix[0]) -1#3 1
    result = []

    if rowEnd == 0:
        return result

    while colStart < colEnd and rowStart < rowEnd:

        for col in range(colStart, colEnd+1,1):
            result.append(matrix[rowStart][col])
        rowStart+=1

        for row in range(rowStart, rowEnd+1,1):
            result.append(matrix[row][colEnd])
        colEnd-=1

        if rowStart < rowEnd:
            for col in range(colEnd, colStart-1, -1):
                result.append(matrix[rowEnd][col])
            rowEnd -=1

        if colStart < colEnd:
            for row in range(rowEnd, rowStart-1, -1):
                result.append(matrix[row][colStart])
            colStart+=1

    return result

print(spiralOrder(

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
))
