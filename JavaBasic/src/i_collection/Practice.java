package i_collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Practice {
	public static void main(String[] args) {
		
		
	LinkedList<String> linkedList = new LinkedList<String>();
	
	linkedList.add("str1");
	linkedList.add("str2");
	linkedList.add("str3");
	linkedList.add("str4");
	System.out.println(linkedList.toString());
	
	linkedList.add("str5");
	System.out.println(linkedList.toString());
	
	linkedList.set(2,"STT2");
	System.out.println(linkedList.toString());
	
	int size = linkedList.size();
	System.out.println("사이즈는 "+linkedList.size());
	
	linkedList.remove(2);
	System.out.println(linkedList.toString());
	
	linkedList.clear();
	System.out.println(linkedList.toString());
	
	linkedList=null;
	System.out.println(linkedList);
	}

}
