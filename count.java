/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1;
		int i,count=0;
		char c;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		for(i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			if(c != ' ')
			{
				count =count+1;
			}
		}
     	 System.out.println(count);
	}	 
}
