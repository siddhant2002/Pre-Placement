import java.util.*;
public class Number_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,k,j=0;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a value limit");
		k=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(k==a[i])
			{
				j=i;
				break;
			}
		}
		System.out.println("The rearranged array is ");
		rearrange(a,0,k,j);
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	static void rearrange(int a[] , int i , int k , int j)
	{
		if(i==a.length||k==a[0])
		{
//			for(int z=0;z<a.length;z++)
//				System.out.println(a[z]);
		}
		else if(a[i]>k&&i<j)
		{
			a=swap(a,i,a[i]);
			j=j-1;
			rearrange(a,i+1-1,k,j);
		}
		else if(a[i]<k&&i>j)
		{
			a=swap1(a,i,a[i]);
			j=j+1;
			rearrange(a,i+1-1,k,j);
		}
		else
			rearrange(a,i+1,k,j);
	}
	static int[] swap(int a[] , int i , int k)
	{
		if(i==a.length-1)
		{
			a[i]=k;
			return a;
		}
		else
		{
			a[i]=a[i+1];
			return swap(a,i+1,k);
		}
	}
	static int[] swap1(int a[] , int i , int k)
	{
		if(i==0)
		{
			a[i]=k;
			return a;
		}
		else
		{
			a[i]=a[i-1];
			return swap1(a,i-1,k);
		}
	}
}