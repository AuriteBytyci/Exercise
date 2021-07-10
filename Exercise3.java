
import javax.swing.*;
public class Exercise3
{ 
  public static void main(String[] args)
  {String input=JOptionPane.showInputDialog("Enter string");
   System.out.println(method(input));
  }

  public static boolean method(String a)
  { boolean answer=false;
   a=a.toLowerCase().trim();
   String first;
   String second;
   if(a.length()%2==0)
   { first=a.substring(0,a.length()/2);
   second=a.substring(a.length()/2,a.length());}
   else 
   {first=a.substring(0,a.length()/2);
   second=a.substring(a.length()/2+1,a.length());}
   
   
   char [] letters={',','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
   
   int sum1=0;
   char b; 
   for(int i=0; i<first.length(); i++)
       { b=first.charAt(i);
        for(int j=0; j<letters.length; j++)
           {if (b==letters[j])
            { sum1=sum1+j;}}}
            
   int sum2=0;
   char c; 
   for(int i=0; i<second.length(); i++)
       { c=second.charAt(i);
        for(int j=0; j<letters.length; j++)
           {if (c==letters[j])
            { sum2=sum2+j;}}}
    if(sum1==sum2)
    {answer=true;}
        return answer;
  }
 }