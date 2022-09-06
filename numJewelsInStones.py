class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        num = 0
        for s in stones:
            for x in jewels:
                if(s == x):
                    num += 1
        return num;
