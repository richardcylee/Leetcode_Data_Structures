import java.util.HashSet; 
import java.util.Set;

class EasyContainsDuplicate {
    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> set = new HashSet<>(); //HashSet does not allow for duplicate values

        for(int i=0;i<nums.length;i++)
        {
            if(!set.add(nums[i])) //add method returns false as element already exists and hashset is not changed
            {
                return true; //returns true (contains duplicate) and exits method 
            }
        }
        return false; //all values are added to the HashSet, return false as there are no duplicates
    }
}