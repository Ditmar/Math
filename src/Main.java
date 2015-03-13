
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HOLA MUNDO");
		Mate p=new Mate();
		int r=p.producto(12, 14);
		int[][] a={{1,2,3},{4,5,6},{7,8,9}};
		int [][] b={{1,2,3},{4,5,6},{7,8,9}};
		int [][] resultado=p.multiplicacionmatricial(a,b);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++){
				System.out.print(""+resultado[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
