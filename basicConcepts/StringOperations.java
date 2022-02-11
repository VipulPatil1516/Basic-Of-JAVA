package basicConcepts;

import org.junit.Test;

public class StringOperations
{   
	//String is a non primitive type
	//String is a inbuilt class in JRE system library and it contains many functions 
	//Find length of the string
	//Remove leading and trailing white spaces if any
	//COnvert the string to upper case and lower case
	String a="  Selenium With Java  ";
	String b= "JAVE";
	String c="Selenium With JAVA    ";
	String m="JAVA";
@Test
public void basicStringFunctions()
 {
	int len=a.length();
	System.out.println("Length of the string:" +len);
	String at=a.trim();
	System.out.println("String after trimming: " +at);
	System.out.println("Length of the string after trimming " +at.length());
 }
@Test
public void StringContains()
{
	if(a.trim().toLowerCase().contains(b.trim().toLowerCase()))
	{
		System.out.println("Sub string is there in main string");
	}
	else
	{
		System.out.println("Sub string is not there in main string");
	}
}
@Test
public void substring()
 {
	String a8=a.trim().substring(8);
	System.out.println("Substring is:" +a8);
	String a08=a.trim().substring(0,8);
	System.out.println("Substring from 0-8th place:" +a08);
 }
@Test
public void stringComparison()
 {
	if(a.trim().equalsIgnoreCase(c.trim()))
	{
		System.out.println("Both the strings are equal");
	}
	else
	{
		System.out.println("Both the strings are not equal");
	}
 }
@Test
public void characterAt()
{
	char myChar0=a.trim().charAt(0);
	System.out.println("Character at index 0:" +myChar0);
}
@Test
public void charcount()
{
	int count=0,i;
	int len=a.trim().length();
	for(i=0;i<len;i++)
	{
		if(a.trim().charAt(i)=='e')
		{
			count ++;
		}
	}
	System.out.println("Character count=" +count);
}
@Test
public void stringConcatenation()
{
	String d = a.concat(b);
	System.out.println("String d :" + d);
	String e = a.concat(b).concat(c); // a+b+c
	System.out.println("String e :" + e);
}
@Test
public void stringReplace()
{
	System.out.println("Original String :" + a);
	String aa = a.trim().replace("Java", "C#");
	System.out.println("Originl after replace :" + aa);
}
//Write a program to find if a particular character is there in the string or not
@Test
public void Find()
{
	int c=0,i;
	int len=a.trim().length();
	for(i=0;i<len;i++)
	{
		if(a.trim().charAt(i)=='z')
		{
			c++;
		}
	}
	if(c==0)
	{
		System.out.println("Thius character is not present in the string");
    }
	else
	{
		System.out.println("Character found in the string");
	}
 }
//Write a program to replace a character with new character in the given string
@Test
public void charReplace()
 {
	System.out.println("Original String :" + a);
	String aa = a.trim().replace("a", "z");
	System.out.println("Originl after replace :" + aa);
 }
@Test
public void checkequal()
{   
    System.out.println("First String: "+b);
    System.out.println("Second String "+m);
	if(b.length()==m.length())
	{
		if(b==m)
		{
			System.out.println("Both the strings are equal");
		}
		else
		{
			System.out.println("Both the strings are not equal");
		}
	}
	else
		System.out.println("Both the strings are not equal");
}
}


