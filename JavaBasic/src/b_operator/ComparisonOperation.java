package b_operator;

public class ComparisonOperation {

	public static void main(String[] args) {
		/*
		 * <<�񱳿�����>>
		 * <:�۴�
		 * >:ũ��
		 * <=:�۰ų� ����
		 * >=:ũ�ų� ����
		 * ==:����
		 * !=:���� �ʴ�
		 * �ΰ��� ������
		 */
		
		boolean b = 10 < 20;//�񱳿������� �������� boolean�̴�.
		System.out.println(b);
		b = 10 < 20 - 15;
		//������� ���� ����
		System.out.println(b);
		
		b = 10<=10.0;
		//�񱳿����ڵ� Ÿ������ġ�ؾ� ������ �����ϴ�.
		//���� �����ڴ� Ÿ���� ��ġ��Ų �� �����Ѵ�.
		System.out.println(b);
		b = 65 >=  'B';
		System.out.println(b);
		
		b = 10.0f == 10.0;
		System.out.println(b);
		
		b=10.1f==10.1;
		System.out.println(b);
		System.out.printf("%22.20f%n", 10.1f);
		System.out.printf("%22.20f%n", 10.1);
		b=10.1f==(float)10.1;
		System.out.println(b);
		
		
		//��Һ񱳴� boolean�� ������ �⺻�� Ÿ�Ը� ���� �� ������ ��񱳴� ��� Ÿ���� ���� �� �ִ�.
		
		b = 'A' ==65;
		System.out.println(b);
		
		b = 'A' ==63;
		System.out.println(b);
		
		
		
		b = true != false;
		System.out.println(b);
		
		b ="abc" =="abc";
		System.out.println(b);
		
		//��Ʈ��->������ Ÿ��  ����� �ּҸ� �񱳤��ϴ°�
		
		b = "abc" == new String ("abc"); //new--> ���ο� �ּ� �����ϴ°� __����� �ּҰ� �ٸ��⶧���� false�� ����
		System.out.println(b);
		//������ Ÿ���� ����� �޸� �ּҸ� ���ϱ� ������String�� ��� �����ڷ� ������ �� �� �� ����.
		
		
		b = "abc".equals(new String("abc")); //equals�� ����ϸ� String�� ������ ���� �� �մ�.
		System.out.println(b);
		
		b = !"abc".equals("ABC"); //���� �ʴ��� �����  ��� ���ؼ��� !(NOT)�� �տ� �ٿ��ش�.
		System.out.println(b);
		
		
		
		//������ ������� �ڵ�� �ۼ����ּ���.
		//1���� 2�� ū��?
		
	   System.out.println(1<2);
	   
	   //0�� 100���� �۰ų� ������?
	   
	   System.out.println(0<=100);
	   
		
	   //3.14f�� 3.14�� �ٸ���?
	   
	   System.out.println(3.14f != 3.14);
	   
	  // "����"��"����"�� �ٸ���?
	   b = !"����".equals("����");
	   System.out.println(b);
	   
	   
	   
	   
	   
		
		
		
		
		
		
		
		

		
		
		// TODO Auto-generated method stub

	}

}
