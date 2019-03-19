import java.util.Scanner;

class ObjectVol{
	double Dim1,Dim2,Dim3;
	void ObjectVol(double Dim01)
	{
		Dim1 = Dim01;
	}
	void ObjectVol(double Dim01, double Dim02)
	{
		Dim1 = Dim01;
		Dim2 = Dim02;
	}
	void ObjectVol(double Dim01, double Dim02, double Dim03)
	{
		Dim1 = Dim01;
		Dim2 = Dim02;	
		Dim3 = Dim03;
	}
	double Vol(double Dim1)
	{
		return (Dim1*Dim1*Dim1);
	}
	double Vol(double Dim1, double Dim2)
	{
		return (3.14*Dim1*Dim1*Dim2);
	}
	double Vol(double Dim1, double Dim2, double Dim3)
	{
		return (Dim1*Dim2*Dim3);
	}
}
public class Volume {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("PRESS 1 : FOR CUBE");
		System.out.println("PRESS 2 : FOR CYLINDER");
		System.out.println("PRESS 3 : FOR SPHERE");
		int choice =sc.nextInt();
		ObjectVol OBJ = new ObjectVol();
		if(choice==1)
		{
			System.out.println("ENTER THE LENGTH OF THE SIDE : ");
			double side=sc.nextInt();
			System.out.println("Volume is : "+OBJ.Vol(side));
		}
		else if(choice==2)
		{
			System.out.println("ENTER THE LENGTH OF THE RADIUS : ");
			double Radius=sc.nextInt();
			System.out.println("ENTER THE LENGTH OF THE HEIGHT : ");
			double Height=sc.nextInt();			
			System.out.println("Volume is : "+OBJ.Vol(Radius,Height));
		}
		else
		{
			System.out.println("ENTER THE LENGTH1 : ");
			double L1=sc.nextInt();
			System.out.println("ENTER THE LENGTH2 : ");
			double L2=sc.nextInt();	
			System.out.println("ENTER THE LENGTH3 : ");
			double L3=sc.nextInt();		
			System.out.println("Volume is : "+OBJ.Vol(L1,L2,L3));
		}
	}
}
