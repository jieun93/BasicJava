package h_useful;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		 * Wrapper  Ŭ���� ��: �⺻�� Ÿ���� ��ü�� ����ؾ� �ҋ� ��� ����ϴ� Ŭ����
		 * 
		 * boolean : Boolean
		 * char : Character
		 * byte : Byte
		 * short : Short
		 * int : Integer
		 * long : Long
		 * float : Float
		 * double : Double
		 */

		
		int i = 10;
		Integer iw = new Integer(20);
		
		System.out.println(i+iw);
		
		System.out.println(Integer.MIN_VALUE + "~"+Integer.MAX_VALUE);
		
		System.out.println(i + Integer.parseInt("20"));
		
		System.out.println(i+String.valueOf(20));
		
		System.out.println(i+Integer.valueOf("20"));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(10));
		list.add(10); //����ڽ�: �⺻��Ÿ���� wrapper Ŭ������ �ڵ���ȯ
		
		Integer integer = list.get(0);
		int i2 = list.get(0);//��ڽ�:wrapper Ŭ������ �⺻��Ÿ������ �ڵ���ȯ
		

	}

}
