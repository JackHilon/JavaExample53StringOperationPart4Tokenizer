
package javaexample53stringoperationpart4tokenizer;

import java.util.Scanner;


public class JavaExample53StringOperationPart4Tokenizer {

    
    public static void main(String[] args) {
        
        
        String str ="This is my word!";
        System.out.println("the words are: "+str);
        
        Scanner tokenizer = new Scanner(str);
        try{
            String s1=tokenizer.next();
            System.out.println("first token is: "+s1);
            String s2=tokenizer.next();
            System.out.println("second token is: "+s2);
            String s3=tokenizer.next();
            System.out.println("third token is: "+s3);
            String s4=tokenizer.next();
            System.out.println("fourth token is: "+s4);
            String s5=tokenizer.next();
            System.out.println("fifth token is: "+s5);
            String s6=tokenizer.next();
            System.out.println("sixth token is: "+s6);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
        System.out.println();
        System.out.println();
        
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your words: ");
        String strIn=input.nextLine();
        Scanner t=new Scanner(strIn);
        
        while (t.hasNext()) {            
            System.out.println("->"+t.next());
        }
        
        
        
        
    }// end main()
    
}
