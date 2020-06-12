class Solution:
    def canPlaceFlowers(self, bed: List[int], n: int) -> bool:
        capLeft = n

        if n == 0:
            return True

        if len(bed) == 1:
            if bed[0] == 0:
                return True
            return False



        if bed[0] == 0 and bed[1] == 0:
            capLeft -=1
            bed[0] = 1

        if bed[-1] == 0 and bed[-2] == 0:
            capLeft -=1
            bed[-1] = 1

        for i in range(len(bed) -1):
            if capLeft <= 0:
                return True

            if bed[i-1] == 0 and bed[i] == 0 and bed[i+1] == 0:
                capLeft-= 1
                bed[i] = 1
                i+=1


        if capLeft <= 0:
            return True
        return False
                
