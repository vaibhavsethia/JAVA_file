import java.util.Scanner;

public class MultiplyMatrix
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		int row[] = new int[1];
		int col[] = new int[1];
		System.out.println("Enter Number of Rows");
		row[0]=sc.nextInt();
		System.out.println("Enter Number of Coloumns");
		col[0]=sc.nextInt();
		int a[][] = new int[row[0]][col[0]];
		int b[][] = new int[row[0]][col[0]];
		int res[][] = new int[row[0]][col[0]];
		int temp;
		System.out.println("Enter elements of Matrix A");
		for(int i = 0;i<row[0];i++)
		{	
			for(int j = 0;j<col[0];j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter elements of Matrix B");
		for(int i = 0;i<row[0];i++)
		{	
			for(int j = 0;j<col[0];j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		//Multiplying matrix now
		System.out.println();
		for (int i = 0; i < 3; i++)
        		{
            			for (int j = 0; j < 3; j++)
           			 {
    			            for (int k = 0; k < 3; k++)
                	                 		            {
                  		  	res[i][j] = res[i][j] + a[i][k] * b[k][j];
                			            }
            			}
   		}
	
		System.out.println("The product is:");
        		for (int i = 0; i < 3; i++)
       		 {
       		     for (int j = 0; j < 3; j++)
           		    {
                			System.out.print(res[i][j] + " ");
            	                     }
           	                     System.out.println();
		}
	}
}