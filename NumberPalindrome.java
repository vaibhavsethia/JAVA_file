import java.util.Scanner;

public class NumberPalindrome{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("ENTER THE NUMBER TO BE CHECKED : ");
		num=sc.nextInt();
		int rev=0;
		int temp=num;
		int digit=0;
		while(num>0){
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(temp==rev)
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
		
	}
}
