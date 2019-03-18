import java.util.Scanner;

public class GCD{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("ENTER THE NUMBER 1 TO BE PRINTED");
		num1=sc.nextInt();
		System.out.println("ENTER THE NUMBER 2 TO BE PRINTED");
		num2=sc.nextInt();
		int temp = 1;
		for(int i = 2;i<=num1&&i<=num2;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				temp  = i;
			}
		}
		System.out.println("The GCD is "+temp);
	}
}
