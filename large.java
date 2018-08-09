/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i;
		int a[]=new int[20];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int large=a[0];
		for(i=1;i<a.length;i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
			
		}
		System.out.println(large);
		}
	}
