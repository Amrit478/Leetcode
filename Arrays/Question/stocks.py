/*Given an array prices[] of length N, representing the prices of the stocks on different days, the task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = {7, 10, 1, 3, 6, 9, 2}
Output: 8
Explanation: Buy for price 1 and sell for price 9. 


Input: prices[] = {7, 6, 4, 3, 1} 
Output: 0
Explanation: Since the array is sorted in decreasing order, 0 profit can be made without making any transaction.

Input: prices[] = {1, 3, 6, 9, 11} 
Output: 10
Explanation: Since the array is sorted in increasing order, we can make maximum profit by buying at price[0] and selling at price[n-1]*/

/*I will do it using python and it will might help me in the future even though i cannot understand right now and in this i am solving using I will minimize the cost price and maximize the selling price, Also
when I sell the share at max price and I will get profit of it than i will add in the current profit or result and I will update the result*/

def maxProfit(prices):
minSofFar = prices[0]
  res = 0

  #Update the minimum value seen so far or if we see smaller value

for i in range(1, len(prices)):
  minSofFar = min(minSoFar, prices[i])

#Updating the result if i get more profit
res = max(res, prices[i] - minSoFar)

return res
