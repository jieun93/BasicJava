package sub4;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;



public class ListTest {
  public static void main(String[] args){
	List list1 = new ArrayList();
	   
	   list1.add(1);
	   list1.add(2);
	   list1.add(3.0);
	   list1.add(4f);
	   list1.add('a');
	   list1.add("b");
	   list1.add(true);
	   list1.add(6l);
	   
//	   System.out.println((Integer)list1.get(0)+(Integer)list1.get(1));
	   
	   List <Integer> list2 = new ArrayList<Integer>();
	   
	   list2.add(1);
	   list2.add(2);
	   
	 System.out.println(list2.get(0)+list2.get(1));   
  }
}
