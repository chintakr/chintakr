/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int h1,h2,m1,m2;
		Scanner sc=new Scanner(System.in);
		h1=sc.nextInt();
		m1=sc.nextInt();
		h2=sc.nextInt();
		m2=sc.nextInt();
		
		int t1=Math.abs(h1-h2);
		int t2=Math.abs(m1-m2);
		System.out.println(t1+" "+t2);
	}
}
