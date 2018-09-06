package ComparatorEx;

import java.util.*;  
import java.io.*;  
class Example{  
public static void main(String args[]){  
  
ArrayList<Person> al=new ArrayList<Person>();  
al.add(new Person(101,"simbu",23));  
al.add(new Person(106,"Danush",27));  
al.add(new Person(105,"VijaySethupathi",21));  
  
System.out.println("Sorting by Name...");  
  
Collections.sort(al,new NameComparator());  
for(Person st: al){  
System.out.println(st.mobile+" "+st.name+" "+st.age);  
}  
  
System.out.println("sorting by age...");  
  
Collections.sort(al,new AgeComparator());  
for(Person st: al){  
System.out.println(st.mobile+" "+st.name+" "+st.age);  
}  
  
}  
}