import java.util.HashMap;
import java.util.Map;

public class EasyRomanToInt 
{
    public int romanToInt(String s) 
    {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0;
        int curr;
        int prev = map.get(s.charAt(0));

        for(int i=1;i<s.length();i++)
        {
            curr = map.get(s.charAt(i));
            if(prev >= curr)
            {
                sum += prev;
            }
            else //prev < curr
            {
                sum -= prev;
            }

            prev = curr;
        }
        sum += prev;
        
        return sum;
    }
}
