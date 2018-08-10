/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,j,median,temp;
		int a[]=new int[20];
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		  	if(n%2==0)
		  	{
		  		median=a[((n/2)+(n-1)/2)/2];
		  	
		  	}
		  	else
		  	{
		  		median=a[n/2];
		  	}
			
		System.out.println(median);
		}
	}
