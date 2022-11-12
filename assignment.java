import java.util.*;
import java.lang.*;
import java.io.*;

public class assignment
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char str4=sc.next().charAt(0);
        char []ch=str.toCharArray();
        String string="";
        
        int c=0;
        for(int i=0;i<ch.length;i++)
        {
          if(ch[i]==str4) 
          { c=i+1;
             break;
          }  
          
        }
        string=str.substring(c);
         if(c==0)
         {
            System.out.println("The letter does not exist in the sentence");
         }
        
      
      System.out.println(string);
	}
}