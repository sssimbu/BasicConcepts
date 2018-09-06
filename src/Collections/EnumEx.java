package Collections;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map.Entry;

enum days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}  
	public class EnumEx {  
	  public static void main(String[] args) {  
	    EnumSet<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  
	    // Traversing elements  
	    Iterator<days> iter = set.iterator();  
	    while (iter.hasNext())  
	      System.out.println(iter.next());  
	    //another method for printing
	    for(days d:set)
	    {
	    	System.out.println("using for each"+" "+d);
	    }
	  //allof 
	    EnumSet<days> set1 = EnumSet.allOf(days.class); 
	    for(days dd:set1)
	    {
	    	System.out.println("using allOf"+" "+dd);
	    }
	    //noneof
	    EnumSet<days> set2 = EnumSet.noneOf(days.class); 
	    for(days ddd:set2)
	    {
	    	System.out.println("using noneOf"+" "+ddd);
	    }
	 
	  //EnumMap
	    EnumMap<days, String> map = new EnumMap<days, String>(days.class);
	    map.put(days.MONDAY, "1");  
	    map.put(days.TUESDAY, "2");  
	    map.put(days.WEDNESDAY, "3");  
	    map.put(days.THURSDAY, "4");  
	    
	    // print the map  
	    for(Entry<days, String> m:map.entrySet()){    
	        System.out.println("enumMap"+m.getKey()+" "+m.getValue());    
	       } 
	  
	  
	  
	  
	  
	  
	  
	  
	  }  
	}  