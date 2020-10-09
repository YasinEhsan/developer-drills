   def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        d = {}

        for i in range(len(s)):
            if s[i] not in d:
                d[s[i]] = 0
            d[s[i]] +=1

        for char in t:
            if char not in d:
                d[char] = 0
            d[char] -=1

            if d[char] < 0:
                return False

        return True
                
