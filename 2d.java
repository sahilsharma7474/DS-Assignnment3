import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n,m,i,j,k;
		n=s.nextInt();
		m=s.nextInt();
		int[][] a=new int[n][m];
	    for(i=0;i<n;i++)
	    {
	    	for(j=0;j<m;j++)
	    	{
              a[i][j]=s.nextInt();
	    	}
	    }
	     for(i=0;i<n;i++)
	    {
	    	for(j=0;j<m;j++)
	    	{
              System.out.print(a[i][j]+" ");
	    	}
	    	i++;
	    	if(i<n)
	    	{
	    	 for(k=n-1;k>=0;k--)
              {
              	System.out.print(a[i][k]+" ");
              }
            }
	    }
	}
}