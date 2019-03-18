import java.util.Scanner;

public class Pyramid{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("ENTER THE NUMBER TO BE PRINTED");
		num=sc.nextInt();
		int temp=0;
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+temp++);
			}
			System.out.println();
		}
	}
}
