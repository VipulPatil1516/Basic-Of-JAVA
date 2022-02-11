package basicConcepts;

import org.junit.Test;

  //Find Even And Odd Number in java used loop here
public class EvenOddUsingFor
{
    @Test
	public void even()
	{   System.out.println("All the even numbers below 500 are :");
		for(int i=1;i<=500;i++)
		{
		    if(i%2==0)
		    {
		    	System.out.print(" "+i);
		    }
		}
	}
    @Test
	public void odd()
	{    System.out.println("All the odd numbers below 500 are :");
		for(int i=1;i<=500;i++)
		{
		    if(!(i%2==0))
		    {
		    	System.out.print(" "+i);
		    }
		}
	}
	public void abcd(String[] args)
	{
		even();
		odd();
	}
}
