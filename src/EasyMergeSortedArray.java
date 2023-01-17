public class EasyMergeSortedArray 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        //3 pointers
        //i = end of nums1 array
        //m-1 = end of nums1 values
        //n-1 = end of nums2 values (end of nums2 array)
        //each iteration in the for-loop changes the value of nums1 array from the back to the front, depending on whether nums1[m-1] or nums2[n-1] is larger
        //if n == 0, the values of nums2 are all placed and the remaining nums1 values do not need to be changed
        //if m == 0, the values of nums1 are all placed and the remaining nums2 values are placed in the nums1 array
        for(int i=1;i<=nums1.length;i++)
        {
            if(n == 0)
            {
                return;
            }
            if(m == 0 || nums1[m-1] <= nums2[n-1])
            {
                nums1[nums1.length-i] = nums2[n-1];
                n--;
            }
            else //nums1[m-1] > nums2[n-1]
            {
                nums1[nums1.length-i] = nums1[m-1];
                m--;
            }
        }
    }
}
