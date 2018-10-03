import java.util.*;
class max
{
	void mx(char a[],int b)
	{
		char temp=0;
		int i,j;
       for(i=0;i<b;i++)
       {
       for(j=i;j<b;j++)
       {
       	if(a[i]>a[j])
       	{
       	temp=a[i];
       	a[i]=a[j];
       	a[j]=temp;
       }
       }
       }
       for(i=0;i<b;i++)
       {
       System.out.print(a[i]);
       }
	}
}
class bubblesort
{
	public static void main(String[] args)
	{
	Scanner x=new Scanner(System.in);
	int n;
	n=x.nextInt();
	char[] arr=new char[n];
	for(int i=0;i<n;i++)
	{
	arr[i]=x.next().charAt(0);
	}
	max m=new max();
	m.mx(arr,n);
	}
}