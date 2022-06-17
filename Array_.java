
public class Array_ {
	
	public static void main(String args[])
	{
		
		//int[][][] arr=new int[10][2][4];
		
		int[][][] arr1= {
				{
					{10,20,30},
					{10,20,40},
					{10,10,10}
				},
				{
					{10,20,30},
					{10,20,40},
					{10,10,10}
				},
				{
					{10,20,30},
					{10,20,40},
					{10,10,10}
				}
				
		};
		
		int i,j,m;
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(m=0;m<3;m++)
				{
					System.out.print(arr1[i][j][m]+"\t");
				}
				System.out.println();
				
			}
			
		}
		
		
	}

}
