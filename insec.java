import java.util.*;
class Main
{
	ArrayList sec(int a[],int b[],int n)
	{
		int[] c=new int[10000];
        int[] freq1=new int[10000];
        int[] freq2=new int[10000];
        
        int k=0,common=0;
            for(int i=0;i<n;i++)
            {
              freq1[a[i]]++;
            }
            for(int i=0;i<n;i++)
            {  
             freq2[b[i]]++;
            }
            for(int i=0;i<10000;i++)
            {
                common=(freq1[i]+freq2[i])/2;
                while(common!=0)
                {
                c[k]=i;
                k++;
                common--;
                }
            }   
        ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<k;i++)
		{
			l1.add(c[i]);
		}
		return l1;
	}
}
class intsec
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n,i;
		System.out.println("size of array");
		n=s.nextInt();
		System.out.println("enter the element of 1st array");

		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int b[]=new int[n];
		System.out.println("enter the element of 2nd array");
		for(i=0;i<n;i++)
		{
			b[i]=s.nextInt();
		}
		Main x=new Main();
		System.out.println(x.sec(a,b,n));

	}
}