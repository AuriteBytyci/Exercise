import java.util.*;
import javax.swing.*;
public class Exercise2
{ private static String input;
public static void main(String[] args)
  { boolean processing=true;
   ArrayList<Integer> list=new ArrayList<Integer>();
   while (processing)
   {input=JOptionPane.showInputDialog("Type an integer:");
   int i=new Integer(input).intValue();
   if (i>0 && i<21)
   {  list.add(i);}
   else { processing=false;}}
   System.out.println(avg(list));
   System.out.println(mostOften(list));
   System.out.println(leastOften(list));
   }
   
   
   
   public static double avg(ArrayList a)
   { int sum=0;
     
   for (int i=0; i<a.size(); i++)
      {
      sum=sum+(int)(a.get(i));}
      double average=(sum*1.0)/a.size();
       return average;
   }
 // nese dy nr perseriten njejte here merret e para 
   public static int mostOften(ArrayList a)
   { ArrayList<Integer> numberofrepetition=new ArrayList<Integer>();

   for(int i=0; i<a.size(); i++)
      {int l=0;
       for(int j=i+1; j<a.size(); j++)
       { if(a.get(i)==a.get(j))
           {l=l+1;}}
           numberofrepetition.add(l);}
     int max=0;
    for(int m=0; m<numberofrepetition.size(); m++)
      {if((int)(numberofrepetition.get(m))>max)
         {max=(int)(numberofrepetition.get(m));
              }}
         int index=numberofrepetition.indexOf(max);
         int ret=(int)(a.get(index));   
              return ret;
}
 // Copy e mostOften me pak ndryshim 
     public static int leastOften(ArrayList a)
   { ArrayList<Integer> numberofrepetition=new ArrayList<Integer>();

   for(int i=0; i<a.size(); i++)
      {int l=0;
       for(int j=i+1; j<a.size(); j++)
       { if(a.get(i)==a.get(j))
           {l=l+1;}}
           numberofrepetition.add(l);}
     int min=0;
    for(int m=0; m<numberofrepetition.size(); m++)
      {if((int)(numberofrepetition.get(m))<min)
         {min=(int)(numberofrepetition.get(m));
              }}
         int index=numberofrepetition.indexOf(min);
         int ret=(int)(a.get(index));   
              return ret;
}
}
