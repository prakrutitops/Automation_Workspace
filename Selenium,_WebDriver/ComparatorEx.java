package com.a1610;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student1
{  
	int rollno;  
	String name;  
	int age;  

	Student1(int rollno,String name,int age)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  

}
class NameComparator implements Comparator
{  
public int compare(Object o1,Object o2)
{  
	Student1 s1=(Student1)o1;  
	Student1 s2=(Student1)o2;  
  
	return s1.name.compareTo(s2.name);  
}  
}  

public class ComparatorEx 
{
	public static void main(String[] args)
	{
		
		ArrayList al=new ArrayList();  
		al.add(new Student1(101,"Vijay",23));  
		al.add(new Student1(106,"Ajay",27));  
		al.add(new Student1(105,"Jai",21));  
		
		Collections.sort(al,new NameComparator());  
		
		Iterator itr=al.iterator();  
		while(itr.hasNext())
		{  
			Student1 st=(Student1)itr.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		
	}
}
