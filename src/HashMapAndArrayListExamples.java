import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class HashMapAndArrayListExamples {

	public static void main(String[] args) {

		HashMap<String, String> map=new HashMap<String,String> ();
		map.put("employeeId", "name");
		map.put("11037785","Mehak");
		map.put("SBI-PO","Ankit");
		map.put("Boutique","Manisha");
        map.put("Business","Ashwani");
        
       Set <String> keys=map.keySet();
      Iterator <String> iterator=keys.iterator();
      while(iterator.hasNext())
      {
    	  String value=iterator.next();
    	  System.out.println("The name of" +value+ "is" +map.get(value));
      }
      
      ArrayList<String> items=new ArrayList<String> ();
      items.add("Chandigarh");
      items.add("Mumbai");
      items.add("Karnal");
      items.add("bangalore");
      
      ListIterator<String> iterators=items.listIterator();
      while(iterators.hasNext())
      {
    	  String arrays=iterators.next();
    	  System.out.println(arrays);
    	  
      }
      
      
      
	}

}
