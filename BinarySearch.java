/* https://ideone.com/3mXpda! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	int a[]= new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		//System.out.println(a[i]);
	}
	int k=s.nextInt();
	int low=0;
	int high=n-1;
	int flag=-1;
	int mid;
	while(low<=high)
	{
		 mid=(low+high)/2;
		if(a[mid]>k)
		high=mid-1;
		else if(a[mid]<k)
		low=mid+1;
		else{ 
		flag=mid;
		break;
		}
	}
	if(flag!=-1){
	flag++;
	System.out.print(a[flag-1]+"  "+flag);
	}else 
	System.out.println("oijuhgfcx");

	}
}