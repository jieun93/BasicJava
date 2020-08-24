package i_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * add() : ������ ��ġ�� ��ü�� �߰�                   get() : ������ ��ġ�� ��ü�� ��ȯ        set() : ������ ��ġ�� �־��� ��ü�� ����(����)
		 * remove() : ������ ��ġ�� ��ü�� ����            size() :����� ��ü�� �� ��ȯ
		 */

		ArrayList<Object> list = new ArrayList<>();

		list.add(10);
		list.add("abc");
		list.add(true);
		list.add(new ArrayListClass());

		ArrayList<String> list2 = new ArrayList<>();

		list2.add("abc");
		list2.add("123");
		list2.add("������");
		list2.set(1, "456");

		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}

		list2.remove(0);
		// ����Ʈ�� ����� ���� �����ϸ� �׵��� ��� ���� �ε����� �������.

		System.out.println(list2.get(0));
		System.out.println(list2.get(1));

		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();// 2���� �迭

		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(10);
		list4.add(20);
		list4.add(30);

		list3.add(list4);

		list4 = new ArrayList<>();
		list4.add(40);
		list4.add(50);
		list4.add(60);

		list3.add(list4);
		System.out.println(list4);

//		list4.add(4, 80);
//		System.out.println(list4);

		// ������ ������ �� �ִ� ArrayList�� ������ ���� 5�� �������ּ���.

		ArrayList<Integer> list5 = new ArrayList<>();
		list5.add(1);
		list5.add(2);
		list5.add(3);
		list5.add(4);
		list5.add(5);

		// ������ ���� ArrayList�� ����� ������ �հ�� ����� ������ּ���.
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < list5.size(); i++) {
			sum += list5.get(i);
		}
		avg = (double) sum / list5.size();
		System.out.println(list5);
		System.out.println("�հ�:" + sum);
		System.out.println("���:" + avg);

		// ������ ���� AarryList�� ����� ���� �� �ּҰ��� �ִ밪�� ������ּ���.

		int min = list5.get(0);

		int max = list5.get(0);

		for (int i = 0; i < list5.size(); i++) {
			if (list5.get(i) > max) {
				max = list5.get(i);
			}
			if (list5.get(i) < min) {
				min = list5.get(i);
			}

		}
		System.out.println("�ּڰ�:"+min+"/ �ִ밪 :"+max);
	}

}
