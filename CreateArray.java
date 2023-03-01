package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CreateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> obj = new ArrayList <String>();
		obj.add("Blue");
		obj.add("Red");
		obj.add("Orange");
		obj.add("Green");
		
/*--------------To print collection-------------------------------------------------
		System.out.println(obj);*/
	
/*--------------To retrieve/get an element-------------------------------------------------
		System.out.println(obj.get(3));*/
		
/*------------To search an element----------------------------------------
		 * if (obj.contains("Red")) {
		    System.out.println("Found the element");
		    } else {
		    System.out.println("There is no such element");
		    }
		*/
		
/*------------To remove an element------------------------
             System.out.println(obj);
             System.out.println(obj.remove(2));
             System.out.println(obj);
 */
		//----------To iterate an elemnt--------------------
		  Iterator itr=obj.iterator();  
		  while(itr.hasNext()){ 
		   System.out.println(itr.next());

	}

}}
