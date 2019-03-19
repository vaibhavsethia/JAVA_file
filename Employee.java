import java.util.Scanner;

class Person  
{ 
    public String Fname; 
    public String Sname; 
    public int Age;
    public Person(String FFname, String SSname, int AAge) 
    { 
        Fname = FFname; 
        Sname = SSname; 
        Age = AAge;
    } 
} 
  
class Employee extends Person  
{ 
    public int Salary; 
    public int Bonus;
    public Employee(String Fname,String Sname, int Age,  
                        int Sallary) 
    { 
        super(Fname, Sname,Age); 
        Salary = Sallary; 
    }  
    public int BonusCalc()
    {
        Bonus=Salary/10;
        return Bonus;
    }
      
} 
  
// driver class 
public class EmployeeBonus  
{ 
    public static void main(String args[])  
    { 
        Scanner sc = new Scanner(System.in);
        String Name1,Name2;
        int age,sal;
        System.out.println("ENTER THE FIRST NAME OF THE EMPLOYEE : ");
        Name1=sc.nextLine();
        System.out.println("ENTER THE SECOND NAME OF THE EMPLOYEE : ");
        Name2=sc.nextLine();
        System.out.println("ENTER THE AGE OF THE EMPLOYEE : ");
        age=sc.nextInt();
        System.out.println("ENTER THE SALARY OF THE EMPLOYEE : ");
        sal=sc.nextInt();
        Employee EMP1 = new Employee(Name1, Name2, age, sal); 
        System.out.println("BONUS EARNED IS" + EMP1.BonusCalc() );
    } 
} 
