package ComparableEx;

import java.util.*;  
import java.io.*;  
public class Execute{  
public static void main(String args[]){  
ArrayList<Person> al=new ArrayList<Person>();  
al.add(new Person(1031,"Ajith",203));  
al.add(new Person(1056,"Vijay",247));  
al.add(new Person(1075,"Vikram",231));  
  
Collections.sort(al);  
for(Person st:al){  
System.out.println(st.mobile+" "+st.name+" "+st.age);  
}  
}  
}  