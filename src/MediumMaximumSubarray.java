public class MediumMaximumSubarray 
{
    //solution is Kadane's algorithm, this is a particularly difficult medium question
    //MaxSum(index) = Max(MaxSum(index-1)+arra[index],0) 
    // ^ MaxSum at a particular index is the greater of MaxSum of previous index plus current index, or 0
    public int maxSubArray(int[] nums) 
    {
        int maxSum = nums[0]; //initializes maxSum to the first element
        int sum = 0; //initializes sum to 0

        for(int i=0;i<nums.length;i++) //iterate once throughout the entire array
        {
            sum += nums[i]; //add new element to sum

            if(sum > maxSum) //if new sum is > previous maxSum
            {
                maxSum = sum; //replace maxSum with sum
            }
            
            if(sum < 0)//if sum is ever < 0
            {
                sum = 0; //reset the sum counter, whatever was summed so far is not useful to this operation
            }
        }
        return maxSum;
    }
}
