import java.util.Scanner;

public class words { 
   
    static final int OUT = 0; 
    static final int IN = 1; 
    static int wordCount(String str) 
    { 
        int state = OUT; 
        int wc = 0; 
        int i = 0; 
        while (i < str.length()) 
        { 
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n' 
                    || str.charAt(i) == '\t') 
                state = OUT; 
            else if (state == OUT) 
            { 
                state = IN; 
                ++wc; 
            } 
            ++i; 
        } 
        return wc; 
    } 
    public static void main(String args[]) 
    { 
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE STRING : ");
        String str=sc.nextLine();
        System.out.println("No of words : " + wordCount(str)); 
    } 
} 