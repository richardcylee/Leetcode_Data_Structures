import java.util.Map;
import java.util.HashMap;

public class EasyTwoSum 
{
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> hashMap = new HashMap<>(); //key = value in nums[], value = index position in nums[]
        
        int[] result = new int[2]; //stores the answer

        for(int i=0;i<nums.length;i++) //iterate through the entire nums array
        {
            if(hashMap.containsKey(target - nums[i])) //if at any point the hashMap contains target minus current value in nums array, we have found the one and only answer
            {
                result[0] = hashMap.get(target - nums[i]); //stores the index position that is retrieved from the hashMap
                result[1] = i; //stores the current index position being traversed in nums
                return result; //result is found, exit method
            }
            hashMap.put(nums[i], i); //the answer is not yet found, store key and value in hashMap 
        }
        return result; //if none are found, returns empty array
    }
}
