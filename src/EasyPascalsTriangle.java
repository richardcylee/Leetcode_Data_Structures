import java.util.List;
import java.util.ArrayList;

public class EasyPascalsTriangle 
{
    public List<List<Integer>> generate(int numRows) 
    {
        if(numRows == 0) return new ArrayList(); //if numRows == 0, just reutrn an empty ArrayList

        List<List<Integer>> ans = new ArrayList(); //create an ArrayList that stores ArrayList objects

        for(int i = 1; i <= numRows; i++) //iterate numRow times
        { 
            List<Integer> row = new ArrayList(); //create ArrayList object for each row that is being added to ans

            for(int j = 0 ; j < i ; j++) //iterate through the number of columns in each row
            {
                if(j == 0  || j == i-1) //if first or last index
                {
                    row.add(1); //set value as 1
                }
                else //add two values on top of j
                {
                    row.add(ans.get(i-2).get(j) + ans.get(i-2).get(j-1));
                }       
            }
            ans.add(row); //add row to ans
        }
        return ans;
    }    
}
