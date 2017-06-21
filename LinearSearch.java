/*https://ideone.com/B7OXPO */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public.
THIS CODE IS LINEAR SEARCH


*/
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s= new Scanner(System.in);
		int j;
		int n=s.nextInt();
		int a[] =new int[n];
		for( int  i=0;i<n;i++)
		a[i]=s.nextInt();
		int e=s.nextInt();
		int flag=0;
		//Search part begins here 
		for( j=0;j<n;j++)
		{
			if(a[j]==e)
			{
			flag=1;
			break;
			}
			else 
			continue;
		}
		j++;
		if(flag==1)
		System.out.println("the element is"+e+"@ position " +j);
		else
		System.out.println("the element is not present");
	}
}