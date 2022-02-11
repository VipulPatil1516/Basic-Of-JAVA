package basicConcepts;

import org.junit.Test;

   // Using J Unit
   // Fixed Array n Dynamic Array
   // fixed array n dynamic array in Int , char, string etc.
   //Write a program to read the marks of the student in a fixed array and calculate percentage of marks for each student then move the percentage in to a dynamic array.
   //Write a program to read the array as input and find each element is even or not . 
   //Move all even and odd numbers in to one array
   //Write a program to demonstrate index out of bounds exception with a fixed array
   //Write a program to read the student numbers as an array and find a particular number . Read the number to find as input
public class BasicArray 
{
	public int rollNum=22;
	@Test
	public void fixedIntegerArray()
	{
	    int[] numbers= {22,24,26,28,29,32,34,35,38,39,43,45,47,48,54,56,58,52};
	    int len=numbers.length;   // length of array
	    System.out.println("Length of the array:" +len);
	    numbers[1]=55;
	    for(int i=0;i<len;i++)    //loop
	    {
	    	System.out.println("Elements before: " +numbers[i]);
	    }
	}
	@Test
	public void dynamicIntegerArray()
	{
	    int[] numbers= new int[20];
	    int len=numbers.length;
	    System.out.println("Length of the array:" +len);
	    for(int i=0;i<len;i++)
	    {
	    	System.out.println("Elements before: " +numbers[i]);
	    }
	    for(int i=0;i<len;i++)
	    {
	    	numbers[i]=22+i;
	    	System.out.println("Elements after: " +numbers[i]);
	    }
	}
	
	@Test
	public void fixedCharArray()
	{
	    char[] c= {'A','S','D','E'};
	    int len=c.length;
	    System.out.println("Length of the array:" +len);
	    for(int i=0;i<len;i++)
	    {
	    	System.out.println("Elements before: " +c[i]);
	    }
	}
	@Test
	public void dynamicCharArray()
	{
	    char[] c= new char[20];
	    int len=c.length;
	    System.out.println("Length of the array:" +len);
	    for(int i=0;i<len;i++)
	    {
	    	System.out.println("Elements before: " +c[i]);
	    }
	    for(int i=0;i<len;i++)
	    {
	    	c[i]='K';
	    	System.out.println("Elements after: " +c[i]);
	    }
	}
	@Test
	public void fixedStringArray()
	{
	    String[] c= {"Allign","Anish","Anuradha","Maahi"};
	    int len=c.length;
	    System.out.println("Length of the array:" +len);
	    for(int i=0;i<len;i++)
	    {
	    	System.out.println("Elements before: " +c[i]);
	    }
	}
	@Test
	public void dynamicStringArray()
	{
	    String[] c= new String[5];
	    int len=c.length;
	    System.out.println("Length of the array:" +len);
	    for(int i=0;i<len;i++)
	    {
	    	System.out.println("Elements before: " +c[i]);
	    }
	    for(int i=0;i<len;i++)
	    {
	    	c[i]="Anna";
	    	System.out.println("Elements after: " +c[i]);
	    }
	}
	
	//Write a program to read the array as input and find each element is even or not .
	@Test
	public void eachElementEvenornot()
	{
	    int[] numbers= {22,24,26,28,29,32,34,35,38,39,43,45,47,48,54,56,58,52};
	    int len=numbers.length;
	    System.out.println("All the even numbers in array are:");
	    for(int i=0;i<len;i++)
	    {
	    	if(numbers[i]%2==0)
	    	{
	    		System.out.print(" " +numbers[i]);
	    	}
	    }
	}
	//Move all even and odd numbers in to one array
	@Test
	public void evenOdd()
	{
		int[] numbers= {22,21,26,28,29,37,34,35,38,39,43,45,47,48,54,56,58,52};
	    int len=numbers.length;
	    int[] a= new int[len];
	    int[] b= new int[len];
	    int countEven=0;
	    int countOdd=0;
	    for(int i=0;i<len;i++)
	    {
	    		for(int j=countEven;j<len;j++)
	    		{  
	    			if(numbers[i]%2==0)
	    			{	
	    			  a[j]=numbers[i];
	    			  countEven++;
	    			  break;
	    			} 
	    		}
	    	
	    		for(int l=countOdd;l<len;l++)
	    		{
	    			if(!(numbers[i]%2==0))
	    			{  
	    				b[l]=numbers[i];
	    				countOdd++;
	    				break;
	    			}
	    		}
	    }
	    System.out.println("All the even numbers in array are:");
	    for(int k=0;k<a.length;k++)
		{
			System.out.print(" " +a[k]);
		}
	    System.out.println("");
	    System.out.println("All the odd numbers in array are:");
	    for(int m=0;m<b.length;m++)
		{
			System.out.print(" " +b[m]);
		}
	}
	//Write a program to demonstrate index out of bounds exception with a fixed array
	@Test
    public void arrayIndexOutOfBounds()
    {
    	int[] numbers= {22,24,26,28,29,32,34,35,38,39,43,45,47,48,54,56,58,52};
	    int len=numbers.length;
	    for(int i=0;i<=len;i++)
	    {
	    	System.out.println("Elements before: " +numbers[i]);
	    }
    }
	//Write a program to read the student numbers as an array and find a particular number . Read the number to find as input
   @Test
	public void findAPerticularNumber()
   {
	   int[] rno= {41,15,48,96,78,4,32,46,75,10,46,78,70,98,88,80,40,56};
	   int len=rno.length;
	   int find=46;
	   int flag=0;
	   int index=0;
	   for(int i=0;i<len;i++)
	   {
		  if(rno[i]==find)
		  {
			  index=i+1;
			  flag=1;
			  break;
		  }
	   }
	   if(flag==0)
	   {
		   System.out.println("The student roll no. is not found");
	   }
	   else
	   {
		   System.out.println("Found at location " +index);
	   }
   }
 //Write a program to read the marks of the student in a fixed array and calculate percentage of marks for each student then move the percentage in to a dynamic array.
	
   @Test
   public void percentage() 
   {
   int marks[] = {55,66,77,88,44};
   int total =0; 
   int percentage=1;
   for(int i=0;i<5;i++)
   {
	   total = total +marks[i];
   }
   percentage = (total)/5;
   System.out.println(percentage);
   }
   
}












