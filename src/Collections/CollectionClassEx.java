package Collections;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionClassEx {

	void AddAll()
	{
		   ArrayList<String> list = new ArrayList<String>();  
	        list.add("C");  
	        list.add("Core Java");  
	        list.add("Advance Java");  
	        System.out.println("Initial collection value:"+list);  
	        Collections.addAll(list, "Servlet","JSP");  
	        System.out.println("After adding elements collection value:"+list);  
	        String[] strArr = {"spring", "mvc"};  
	        Collections.addAll(list, strArr);  
	        Collections.sort(list); 
	        System.out.println("after sorting"+list);
	        System.out.println("After adding array collection value:"+list);  
	
	
		  // maximum value of collections
	        ArrayList<Integer> list1 = new ArrayList<Integer>();  
	        
	        list1.add(456);  
	        list1.add(235);  
	        list1.add(555);
	        list1.add(680);
	        list1.add(345);
	        Collections.sort(list1); 
	        System.out.println("after sorting"+list1);
		    System.out.println("Value of maximum element from the collection: "+Collections.max(list1));  
	        System.out.println("Value of minimum element from the collection: "+Collections.min(list1));  

	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionClassEx obj=new CollectionClassEx();
		obj.AddAll();
		
	}
	

}
