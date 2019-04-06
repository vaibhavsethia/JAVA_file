import java.util.*; 
public class string 
{ 
    public static void main(String args[]) 
    { 
        System.out.println("TOKENIZER");
        System.out.println("Constructor 1 : "); 
        StringTokenizer st1 = 
             new StringTokenizer("This is constructor number 1 ", " "); 
        while (st1.hasMoreTokens()) 
            System.out.println(st1.nextToken()); 
  
        System.out.println("onstructor 2 : "); 
        StringTokenizer st2 =  
             new StringTokenizer("This : is : constructor : number : 2", " :"); 
        while (st2.hasMoreTokens()) 
            System.out.println(st2.nextToken()); 
  
        System.out.println("Constructor 3 : "); 
        StringTokenizer st3 =  
             new StringTokenizer("This : is : constructor : number : 3", " :",  true); 
        while (st3.hasMoreTokens()) 
            System.out.println(st3.nextToken()); 
        System.out.println("BUFFER");
        String str = "HELLOO WORLDDD"; 
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println(sbr); 
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("THIS IS A BUFFER"); 
        System.out.println(sbl); 
    } 
}
