import java.util.*;
class array
{
	void reva(int a[],int n)
	{
		int i,j=0;
		int[] b=new int[n];
		for(i=n-1;i>=0;i--)
		{
        b[j]=a[i];
        j++;
		}
		for(i=0;i<n;i++)
		{
			System.out.print(b[i]);
		}
	}
}
class rev
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n,i;
		n=s.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		array x=new array();
		x.reva(a,n);
	}
}