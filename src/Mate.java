
public class Mate {
	public Mate()
	{
		
	}
	public int producto(int a,int b){
		return a*b; 
	}
	public int suma(int a, int b)
	{
		return a+b;
	}
	public int producto()
	{
		return 1;
	}
	public int euler()
	{
		int j=1;
		return j;
	}
	public int vectores()
	{
		return 1;
	}
	public int[][] multiplicacionmatricial(int a[][],int b[][])
	{
		int[][] r=new int[a.length][a[0].length];
		int suma;
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				suma=0;
				for(int k=0;k<a.length;k++)
				{
					suma+=a[i][k]*b[k][j];
				}
				r[i][j]=suma;
			}
		}
		return r;
	}
}
