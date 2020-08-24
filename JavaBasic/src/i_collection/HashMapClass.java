package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * 
		 * put() : 지정된 키와 값을 저장 get() : 지정된 키의 값을 반환(없으면 null) remove() : 지정된 키로
		 * 저장된 값을 제거 keySet() :저장된 모든 키를 Set으로 반환
		 */

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("title", "제목입니다.");
		map.put("content", "내용입니다.");
		map.put("user", "홍길동입니다.");
		map.put("date", "2020-01-13 10:33");

		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));

		map.put("user", "이순신");
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
		map1.put("LPROD_NM", "컴퓨터제품");

		list.add(map1);

		HashMap<String, String> map2 = new HashMap<>();
		map2.put("LPROD_ID", "2");
		map2.put("LPROD_GU", "P102");
		map2.put("LPROD_NM", "전자제품");

		list.add(map2);

		HashMap<String, String> map3 = new HashMap<>();
		map3.put("LPROD_ID", "3");
		map3.put("LPROD_GU", "P201");
		map3.put("LPROD_NM", "여성캐주얼");

		list.add(map3);

		HashMap<String, String> map4 = new HashMap<>();
		map4.put("LPROD_ID", "4");
		map4.put("LPROD_GU", "P202");
		map4.put("LPROD_NM", "남성캐주얼");

		list.add(map4);

		HashMap<String, String> map5 = new HashMap<>();
		map5.put("LPROD_ID", "5");
		map5.put("LPROD_GU", "P301");
		map5.put("LPROD_NM", "피력잡화");

		list.add(map5);

		System.out.println("-------------------");
		for (String key : list.get(0).keySet()) {
			System.out.print(key + "\t");
		}
		System.out.println();
		
		System.out.println("--------------------");
		//향상된 for문이 아닌 방법
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
		//향상된 for문 사용한 방법
		for (HashMap<String, String> m : list) {
			for (String key : m.keySet()) {
				System.out.print(m.get(key) + "\t\t");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");

		
		/*
		 * 우리반 모두의 Java, Oracle, HTML,CSS,JQuery, JSP 점수를 50 ~100 까지
		 * 램던으로 생성 시켜주시고, 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 석차	  이름 	 Java	 Oracle	 HTML	CSS	 JQuery	 JSP	 총점	 평균
		 * 	1      홍길동		  80	  90	 100	90		70	 60		500	 80
		 *  2      홍길동		  80	  90	 100	90		70	 60		500	 80
		 *  3      홍길동		  80	  90	 100	90		70	 60		500	 80
		 *  4      홍길동		  80	  90	 100	90		70	 60		500	 80
		 *  5      홍길동		  80	  90	 100	90		70	 60		500	 80
		 */
		
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("홍길동");
		name.add("박기완");
		name.add("김준우");
		name.add("이혁진");
		name.add("남아름");
		
		ArrayList<String> sub = new ArrayList<String>();
		sub.add("Java");
		sub.add("Oracle");
		sub.add("HTML");
		sub.add("CSS");
		sub.add("JQuery");
		
		
		ArrayList<ArrayList<Double>> scores = new ArrayList<>();
			
		
		// 과목별 점수
		for (int i = 0; i < name.size(); i++) {
			ArrayList<Double> list1 = new ArrayList<>();
			list1.add(1.0);
			for (int j = 0; j < sub.size(); j++) {
				list1.add((int) (Math.random() * 51) + 50.0);
			}
			scores.add(list1);
		}

		System.out.println(scores);
		
			                         
		
		//총점 평균
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
		
		//등수
		
		for (int i = 0; i < scores.size(); i++) {
			double rank = 1;
			for (int j = 0; j < scores.size(); j++) {
				if (scores.get(i).get(sub.size() + 1) < scores.get(i).get(
						sub.size() + 1))
					rank++;
			}
			scores.get(i).set(0, rank);
		}

		// //순서정렬(선택정렬 이용)
		
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
//	}	//출력
		System.out.println("석차 \t이름\t");
		for (String a : sub) {
			System.out.print(a + "\t");
		}
		System.out.println("합계\t평균");

		for (int i = 0; i < scores.size(); i++) {
			System.out.print(scores.get(i).get(0) + "\t" + name.get(i) + "\t");
		}
		for (int j = 1; j < scores.get(i).size(); j++) {
			System.out.println(scores.get(i).get(j) + "\t'");

		}
		System.out.println();
	
	
	
		
	}

}
