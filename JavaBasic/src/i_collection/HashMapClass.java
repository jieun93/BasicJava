package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * 
		 * put() : ������ Ű�� ���� ���� get() : ������ Ű�� ���� ��ȯ(������ null) remove() : ������ Ű��
		 * ����� ���� ���� keySet() :����� ��� Ű�� Set���� ��ȯ
		 */

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("title", "�����Դϴ�.");
		map.put("content", "�����Դϴ�.");
		map.put("user", "ȫ�浿�Դϴ�.");
		map.put("date", "2020-01-13 10:33");

		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));

		map.put("user", "�̼���");
		System.out.println(map.get("user"));

		map.remove("user");
		System.out.println(map.get("user"));

		Set<String> keys = map.keySet();
		for (String key : keys) {
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		ArrayList<HashMap<String, String>> list = new ArrayList<>();

		HashMap<String, String> map1 = new HashMap<>();
		map1.put("LPROD_ID", "1");
		map1.put("LPROD_GU", "P101");
		map1.put("LPROD_NM", "��ǻ����ǰ");

		list.add(map1);

		HashMap<String, String> map2 = new HashMap<>();
		map2.put("LPROD_ID", "2");
		map2.put("LPROD_GU", "P102");
		map2.put("LPROD_NM", "������ǰ");

		list.add(map2);

		HashMap<String, String> map3 = new HashMap<>();
		map3.put("LPROD_ID", "3");
		map3.put("LPROD_GU", "P201");
		map3.put("LPROD_NM", "����ĳ�־�");

		list.add(map3);

		HashMap<String, String> map4 = new HashMap<>();
		map4.put("LPROD_ID", "4");
		map4.put("LPROD_GU", "P202");
		map4.put("LPROD_NM", "����ĳ�־�");

		list.add(map4);

		HashMap<String, String> map5 = new HashMap<>();
		map5.put("LPROD_ID", "5");
		map5.put("LPROD_GU", "P301");
		map5.put("LPROD_NM", "�Ƿ���ȭ");

		list.add(map5);

		System.out.println("-------------------");
		for (String key : list.get(0).keySet()) {
			System.out.print(key + "\t");
		}
		System.out.println();
		
		System.out.println("--------------------");
		//���� for���� �ƴ� ���
		for(int i = 0; i<list.size(); i++){
			HashMap<String,String> m =list.get(i);
			Set<String>keySet = m.keySet();
			Iterator<String>itr = keySet.iterator();
			while(itr.hasNext()){
				String key = itr.next();
				String value = m.get(key);
				System.out.println(value + "\t\t");
			}
					
		}
		//���� for�� ����� ���
		for (HashMap<String, String> m : list) {
			for (String key : m.keySet()) {
				System.out.print(m.get(key) + "\t\t");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");

		
		/*
		 * �츮�� ����� Java, Oracle, HTML,CSS,JQuery, JSP ������ 50 ~100 ����
		 * �������� ���� �����ֽð�, ���������� ����, �̸�, ���� ����, ����, ����� ������ּ���.
		 * ����	  �̸� 	 Java	 Oracle	 HTML	CSS	 JQuery	 JSP	 ����	 ���
		 * 	1      ȫ�浿		  80	  90	 100	90		70	 60		500	 80
		 *  2      ȫ�浿		  80	  90	 100	90		70	 60		500	 80
		 *  3      ȫ�浿		  80	  90	 100	90		70	 60		500	 80
		 *  4      ȫ�浿		  80	  90	 100	90		70	 60		500	 80
		 *  5      ȫ�浿		  80	  90	 100	90		70	 60		500	 80
		 */
		
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("ȫ�浿");
		name.add("�ڱ��");
		name.add("���ؿ�");
		name.add("������");
		name.add("���Ƹ�");
		
		ArrayList<String> sub = new ArrayList<String>();
		sub.add("Java");
		sub.add("Oracle");
		sub.add("HTML");
		sub.add("CSS");
		sub.add("JQuery");
		
		
		ArrayList<ArrayList<Double>> scores = new ArrayList<>();
			
		
		// ���� ����
		for (int i = 0; i < name.size(); i++) {
			ArrayList<Double> list1 = new ArrayList<>();
			list1.add(1.0);
			for (int j = 0; j < sub.size(); j++) {
				list1.add((int) (Math.random() * 51) + 50.0);
			}
			scores.add(list1);
		}

		System.out.println(scores);
		
			                         
		
		//���� ���
		double sum = 0;

		for (int i = 0; i < scores.size(); i++) {
			ArrayList<Double> list1 = new ArrayList<>();
			list1.add(1.0);
			for (int j = 0; j < scores.size(); j++) {
				sum += list1.get(j + 1);
			}

			list1.add(sum);
			list1.add(((int) sum / sub.size() * 10 + 0.5) / 10d);
			scores.add(list1);
		}
		
		//���
		
		for (int i = 0; i < scores.size(); i++) {
			double rank = 1;
			for (int j = 0; j < scores.size(); j++) {
				if (scores.get(i).get(sub.size() + 1) < scores.get(i).get(
						sub.size() + 1))
					rank++;
			}
			scores.get(i).set(0, rank);
		}

		// //��������(�������� �̿�)
		
		for (int i = 0; i < scores.size() - 1; i++) {
			for (int j = i + 1; j < scores.size(); j++) {
				ArrayList<Double> a;
				String b;

				if (scores.get(i).get(0) > scores.get(i).get(0)) {
					a = scores.get(i);
					scores.set(i, scores.get(j));
					scores.set(j, a);
					b = name.get(i);
					name.set(i, name.get(j));
					name.set(j, b);
				}
			}
		}
						
//				}
//			}	
//	}	//���
		System.out.println("���� \t�̸�\t");
		for (String a : sub) {
			System.out.print(a + "\t");
		}
		System.out.println("�հ�\t���");

		for (int i = 0; i < scores.size(); i++) {
			System.out.print(scores.get(i).get(0) + "\t" + name.get(i) + "\t");
		}
		for (int j = 1; j < scores.get(i).size(); j++) {
			System.out.println(scores.get(i).get(j) + "\t'");

		}
		System.out.println();
	
	
	
		
	}

}
