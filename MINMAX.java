import java.util.Scanner;

public class MINMAX{
	public static void main(String Args[]){
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("ENTER THE NUMBER OF ELEMENTS IN THE ARRAY : ");
		size=sc.nextInt();
		if(size==0)
		{
			System.out.println("NO ELEMENTS IN THE ARRAY ");
		}
		else
		{
			int array[]=new int[size];
			System.out.println("Enter elements of Array :");
			for(int i=0;i<size;i++)
					array[i]=sc.nextInt();
			int MIN=array[0],MAX=array[0];
			for(int i=1;i<size;i++)
			{
				if(array[i]<MIN)
					MIN=array[i];
				else if(array[i]>MAX)
					MAX=array[i];
				else 
					continue;
			}
			System.out.println("MAX IS : "+MAX);
			System.out.println("MIN IS : "+MIN);	
		}
		
	}
}