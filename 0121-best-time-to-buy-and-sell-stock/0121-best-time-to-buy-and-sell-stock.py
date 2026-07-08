class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        max_profit=0
        minp=max(prices)
        for p in prices:
            if(p<minp):
                minp=p
            elif(p-minp>max_profit):
                max_profit=p-minp
        return max_profit
            
        

        