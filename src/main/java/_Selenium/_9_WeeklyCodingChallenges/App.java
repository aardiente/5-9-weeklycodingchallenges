package _Selenium._9_WeeklyCodingChallenges;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Result of recursiveMultiply(6, 8): " + recursiveMultiply(6, 8) );
        
        System.out.println( "Result of magicIndex (mI = 2): " + magicIndex(new int[] {4,5,2,3,8}) );
        
        System.out.print( "Result of powerSet: " ); powerSet("abcd", 0, "");
    }
    
    public static int magicIndex(int[] A) // Returns only the first magic index. -1 if a result isnt found.
    {
    	for(int i = 0; i < A.length; i++)
    		if(A[i] == i)
    			return i;
    	
    	return -1;
    }
    
    public static void powerSet(String s, int index, String r)
    {
    	int len = s.length();
    	
    	if(len == index)
    	{
    		System.out.print("{" + r + "}" + ", "); 
    		return;
    	}
    	
    	powerSet(s, index + 1, r + s.charAt(index));
    	powerSet(s, index + 1, r);	
    }
    
    public static int recursiveMultiply(int num1, int num2)
    {
    	if(num2 <= 0)
    		return 0;
    	else
    		return num1 + recursiveMultiply(num1, num2 - 1);
    }
}
