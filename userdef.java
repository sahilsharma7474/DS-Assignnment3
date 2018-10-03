import java.util.*;
class max
{
	void mx(int a[],int b)
	{
		int temp=0,i,j;
       for(i=0;i<b;i++)
       {
         for(j=i+1;j<b;j++)
         {
         	if(a[i]>a[j])
         	{
           temp=a[i];
           a[i]=a[j];
           a[j]=temp;
            }
         }
       }
       System.out.println(a[b-1]);
	}
}
class userdef
{
	public static void main(String[] args)
	{
	Scanner x=new Scanner(System.in);
	int n;
	n=x.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	{
	arr[i]=x.nextInt();
	}
	max m=new max();
	m.mx(arr,n);
	}
}