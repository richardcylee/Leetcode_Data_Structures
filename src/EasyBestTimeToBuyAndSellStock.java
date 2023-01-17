public class EasyBestTimeToBuyAndSellStock 
{
    public int maxProfit(int[] prices) 
    {
        int minVal = Integer.MAX_VALUE; //initialize minVal to the largest integer value
        int maxProfit = 0; //initialize maxProfit to 0

        //
        for(int i=0; i<prices.length; i++) //iterate through the lenght of the array
        {
            if(prices[i] < minVal) //if element being traversed is lower than previous minVal, replace as minVal
            {
                minVal = prices[i];
            }
            
            if(prices[i] - minVal > maxProfit) //if element being traversed (which always comes after minVal) has a profit > current maxProfit, replace maxProfit
            {
                maxProfit = prices[i]-minVal;    
            }
        }

        return maxProfit;
    }    
}
