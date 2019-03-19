abstract class Vehicle{
   public abstract void Type();

}

public class Car extends Vehicle{

   public void Type(){
	System.out.println("4-wheeler");
   }
   public static void main(String args[]){
	Vehicle obj = new Car();
	obj.Type();
   }
}
