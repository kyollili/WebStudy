package com.sist.temp;
import java.util.*;
public class GroupSelectModel {
   public static void main(String[] args) {
	   GroupSelectModel m=new GroupSelectModel();
	   m.group_choice();
   }
   public List<Integer> group_choice()
   {
	   List<Integer> list=new ArrayList<Integer>();
	   int[] com=new int[12];
	   int count1=0,count2=0,count3=0;
	   for(int i=0;i<com.length;i++)
	   {
		   com[i]=(int)(Math.random()*3)+1;
		   if(com[i]==1)
		   {
			   if(count1>4)
				   continue;
			   count1++;
			   
		   }
		   else if(com[i]==2)
		   {
			   if(count2>4)
				   continue;
			   count2++;
			  
		   }
		   else if(com[i]==3)
		   {
			   if(count3>4)
				   continue;
			   count3++;
			   
		   }
		   
		   
	   }
	   for(int i:com)
	   {
		   System.out.print(i+" ");
	   }
	   return list;
   }
}