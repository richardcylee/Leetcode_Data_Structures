import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class EasyIntersectionOfTwoArraysII 
{
    //another way to solve this problem is to first sort the arrays
    //then iterate through both with two separate pointers, adding to ArrayList if there are common elements
    //finally copy to int array

    public int[] intersect(int[] nums1, int[] nums2) 
    {
       Map<Integer,Integer> hashMap = new HashMap<>();
       ArrayList<Integer> arrayList = new ArrayList<>();
       
       for(int i=0;i<nums1.length;i++) //store all nums1[] elements in HashMap as keys, frequency of elements as values
       {
            //nums1[i] value is stored as the key, getOrDefault returns the frequency of nums1[i] stored in the HashMap and adds one 
            //e.g. if key of nums1[i] does not exist in HashMap, returns 0 as it is provided as the default value
            //add 1 = value being stored in the HashMap (0 + 1 = 1)
            //e.g. if key of nums1[i] exists in HashMap with a value (frequency) of 1, returns 1 
            //add 1 = value being stored in the HashMap (1 + 1 = 2)
            hashMap.put(nums1[i],hashMap.getOrDefault(nums1[i],0)+1); 
       }

       for(int i=0;i<nums2.length;i++) //attempt to retrieve key values that already exist in HashMap (representing intersection of elements between the two arrays)
       {
            if(hashMap.containsKey(nums2[i]) && hashMap.get(nums2[i]) > 0) //if there is an intersection and the frequency is > 0
            {
                arrayList.add(nums2[i]); //add intersecting element to ArrayList
                hashMap.put(nums2[i],hashMap.get(nums2[i])-1); //decrements the value (frequency) of the key by 1
            }
       }

       int ans[] = new int[arrayList.size()]; //declare int array to store ans since we have to return an integer array

       for(int i=0;i<arrayList.size();i++) 
       {
            ans[i] = arrayList.get(i); //copy every value from ArrayList into int array
       }

       return ans;
    }
}
