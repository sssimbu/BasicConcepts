package PropertiesEx;

import java.util.*;  
import java.io.*;  
public class PropertyEx {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("C:/Users/User/workspace/Ex1/src/PropertiesEx/db.properties");  
    Properties p=new Properties();  
    p.load(reader);  
     System.out.println(p.getProperty("user"));  
    System.out.println(p.getProperty("password"));  
}  
}