
import java.util.*;
import javax.swing.*;
public class Exercise4
{ 
  public static void main(String[] args)
  {String input=JOptionPane.showInputDialog("Enter string");
  input=input+" ";
  input=input.toLowerCase();
   System.out.println(method(input));
  }

  public static int method(String a)
  {int answer=0;
 
  ArrayList<String> words=new ArrayList<String>();
   char b=' ';
  int c=0;
    for(int i=0; i<a.length(); i++)
        {
        if (a.charAt(i)==b)
            {words.add(a.substring(c,i));
            c=i+1;}}
     for ( int j=0; j<words.size(); j++)     
         { if(words.get(j).charAt(0)== words.get(j).charAt(words.get(j).length()-1)) 
             {answer++;}}
    
        return answer;
  
 }
 }