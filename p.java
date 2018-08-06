/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,i,j,count=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=a+1;i<b;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
				   count=0;
				   break;
				}
				else
				count=1;
				
			}
		      if(count==1)
		      {
		      	System.out.println(i);
		      }
		}
	}
}	
