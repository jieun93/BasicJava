package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * <<OOP(Object Oriented Programming): ��ü���� ���α׷���>>
		 *  ���α׷����� �ܼ��� �ڵ��� �������� �������� �ƴ϶� ��ü���ǻ�ȣ�ۿ����� ���°�.
		 *  �ڵ��� ���뼺�� ���� ���������� �����ϴ�.
		 *  
		 *  
		 * <<��ü����(�ν��Ͻ�ȭ)>>
		 *   Ŭ������ ����ϱ����� �޸�(Heap����)�� �÷� ���� ��
		 *   new Ŭ���� ��();-> ��ü�� ����� �޸� �ּҹ�ȯ
		 *   ��ü �ڿ� ����������(.)�� �ٿ� ��ü�� ������ �޼��忡 ������ �� �ִ�.
		 *   ��ü�� ���� �ɶ����� ���ο� ��ü�� �����ǰ�, �������� ��ü�� ���ÿ� ������ �� �ִ�.
		 */
		
		SampleClass sc = new SampleClass();
		
		sc.method1();
		
		sc.method2(5);
		
		
		//System.out.println(sc.method3);
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(6, 8);
		System.out.println(returnInt);
		
		sc.flowTest1();
		
		//��� ���� Ŭ������ ��ü�� �����ϰ� ������ �������ּ���.
		//������ ����� ���������� �޼������ ȣ�����ּ���.
		//�Ķ���Ͱ� �ִ� �޼���� Ÿ�Կ� �´� ���� �Ѱ��ֽð�,
		//����Ÿ���� �ִ¸޼���� ���� ���� ���� ������ּ���.��
		
		ClassMaker cm = new ClassMaker();
		
		cm.method1();
		
		cm.method2(3);
		
		int return1 = cm.method3(2, 3);
		System.out.println(return1);
		
		
		
		Calculator ca = new Calculator();
		
		double addre = ca.add(123456,654321);
		System.out.println(addre);
		
		double mulre = ca.mul(addre, 123456);
		System.out.println(mulre);
		
		double divre = ca.div(mulre,123456);
		System.out.println(divre);
		
		double minre = ca.min(divre,654321);
		System.out.println(minre);
		
		double remre = ca.rem(minre, 123456);
		System.out.println(remre);
		
		
		//�ɸ��׽�Ʈ
		new SimLiTest().q1();
		
		
		
		
		
		
		

	}

}
