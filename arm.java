/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
        
        int a,b,r,sum=0,t;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a+1;i<b;i++)
        {
        	t=i;
        	sum = 0;
        	while(i>0)
        	{
        		r=i%10;
        		sum=sum+r*r*r;
        		i=i/10;
        	}
        	i=t;
        	if(i==sum)
        	{
        		System.out.println(sum);
        	}
        	
        	
        }
  
	}
}
