
public class ParamConstruct {




 
    int id;  
    String name;  
    int value;
      
    ParamConstruct(int i,String n , int x) //constructor with parameters
    {  
    id = i;  
    name = n; 
    value=x;
    
    }  
    void display()
    {
    	System.out.println(id+" "+name+" "+value);
    	}  
   
    public static void main(String args[])
    {  
    	ParamConstruct s1 = new ParamConstruct(5,"sss",6);  
    	ParamConstruct s2 = new ParamConstruct(6,"rrr",7);  
    s1.display();  
    s2.display();  
   
} 
}