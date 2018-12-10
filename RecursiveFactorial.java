
/**
 * Two implementations of the factorial function.
 * This is just a place holder class for the two functions
 * 
 * @author Charles Hoot 
 * @version 4.0
 */
public class RecursiveFactorial
{
 
    public long basic(long n)
    {
        long result = 1;
        if (n > 1) 
            result = n*basic(n-1);
        
        return result;
    } 

    public long tailRecursive(long n)
    {
    	if(n<0)
    		return 1;
        long result=helper(n,1);
        return result;
    }

  
    private long helper(long n, long partial)
    {
        long result = 0;
        // IMPLEMENT THIS TAIL RECURSIVE METHOD
        if(n==0)
        	return 1;
  
        result=n*partial;
      
        if(n==1)
        	return result;
        return helper(n-1,result);
     }



}
