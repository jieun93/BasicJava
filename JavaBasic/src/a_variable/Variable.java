package a_variable;

import java.util.Scanner;

//

public class Variable {

//	int a; //��������
//	
//	public static void main(String[] args) {
//		/*
//		 * << ���� >>
//		 * - �ϳ��� �����͸� ������ �� �ִ� �޸𸮻��� ����
//		 * 
//		 * << ��� ������ �⺻�� �������� ���� >>
//		 * - ���� : byte, short, int, long
//		 * - �Ǽ� : float, double
//		 * - ���� : char
//		 * - �� : boolean
//		 * 
//		 * - Ÿ���� ũ��� ǥ�������� �ڹ������� 29�� ����
//		 * - �����͸� ����ϱ� ���ؼ��� � ������ �����͸� ����� ������, �װ��� �̸��� �������� �˷���� �Ѵ�.
//		 * - ����Ģ�� �ڹ��� ���� 25~26�� ����
//		 * 
//		 */
//		
//		//���� ���� ��� : ������ Ÿ�� + �����̸�
//		byte abc;
//		char moonja;
//		
//		//��� �⺻�� Ÿ���� ����ؼ� 8���� ������ �������ּ���.
//		byte abo;
//		short def;
//		int  ghi;
//		long jkl;
//		float mnk;
//		double ab;
//		char cd;
//		boolean ef;
//		
//		//������ ���� ������ ����� ���� ������ �̸����� ����Ѵ�.
//		//������ ���� �������� ������ ������ ���� ������ �� ����.
////	 	System.out.println(_int);//������ ���� �߻�(������ Ʋ�ȴ�.)
//		
//		//=(���Կ�����) : ���� ������ �������� ���� ����(����)�� �����Ѵ�.
//		abo =127; //Ÿ�Կ� �´� ���� �����ؾ� �Ѵ�.
//		def = 30000;
//		ghi = 20;
//		jkl = 900L; //long : ���̻� : L
//		mnk = 3.14f; //float ���̻� : f
//		ab = 3.14; //double ���̻� : d(��������)
//		cd = '��';
//		ef = true;
//		//�ʱ�ȭ : ������ ó������ ���� �����ϴ� ��
//		
//		System.out.println(ghi);
//		//ctrl+f11 : ���α׷� ����
//		//f11 : ����� ����
//		
//		ghi= 30;
//		System.out.println(ghi);
//		ghi = 30 + 40;
//		System.out.println(ghi);
//		ghi = def;
//		System.out.println(ghi);
//		
//		
//		//������ �ʱ�ȭ�� ������ ���ο� ���� �����а� ������ּ���.
//		
//		byte a;
//		short b;
//		int c;
//		long d;
//		float e;
//		double f;
//		char g;
//		boolean h;
//		
//		a = 20;
//		b = 30;
//		c = 30000;
//		d = 900L;
//		
//		System.out.println(a);
//		System.out.println(c);
//		
//		
//		//String : �������� ���ڸ� ���ϰ� ����ϱ� ���� Ŭ����
//		//���ڿ� : ""(ū����ǥ)�� ������ ����
//		String _String = new String("abcd");
//		System.out.println(_String);
//		_String = "1234";
//		System.out.println(_String);
//		
//		/*
//		 *<< ���ͷ�(��)�� ���� >>
//		 *-����:0,10,-5,3.14
//		 *-����:'��','a','0',''
//		 *-���ڿ�:"������","abc","123"," ",""
//		 *-�� ��: ture,false,null
//		 *
//		 *<<������Ÿ��>>
	//   *�⺻�� null
//		 *-�⺻�� Ÿ���� ������ ��� ������ Ÿ��(�迭,Ŭ����)
//		 *-ex) String,ABC,Variable
//		 *���� ������ ������� �ʰ� ���� ����Ǹ�,�� �ּҰ� ������ ����ȴ�.
//		 *������ ũ��� 4byte�̴�.
//		 */
//		
//		//�⺻��: ���������� �ƹ��͵� �������� �ʾ����� ����Ǿ� �ִ� ��
//	= 0;
//		_short = 0;
//		_int = 0;
//		_long = 0L;
//		_float = 0.0f;
//		_double = 0.0;
//		
//		_boolean = false;
//	_String = null;
//	
//		
//		//��쿡���� ������Ÿ���̴ٸ����������ϱ⵵�Ѵ�.
//		_byte = 127;
//		_int = 128;
//		_byte =(byte)_int;//����ȯ:������Ÿ���� ��ȯ�ϴ°�
//		System.out.println(_byte);//128->-128(�����÷ο�)
//		
//		_byte = -128;
//		_int = -129;
//		_byte = (byte)_int;
//		System.out.println(_byte);//-129->127(����÷ο�)
//		//ǥ���ѹ�����ūŸ�Կ�������Ÿ����������ȯ�Ұ�쵥���Ͱ��սǵɼ��ִ�.
//		
//		//ǥ������������Ÿ�Կ���ūŸ������ ����ȯ�Ұ�쵥���Ͱ��սǵɿ���������.
//		//�׷��Ƿ�����ȯ�� �����Ҽ��ִ�.
//		_int = _byte;
//		_long =_int;
//		_double = _float;
//		
//		//���������纯������ ǥ�������� ����Ÿ����������ȯ���ּ���.
//		_byte = 127;
//		_int = 128;
//		_byte = (byte)_int;
//		System.out.println(_byte);
//		
//		
//				
//		_byte = (byte)_int;
//		_int = (int)_long;
//		_long = (long)_float; 
//		
//		
//		/*
//		 * <<���>>
//		 * �����ѹ������ϸ麯���Ҽ������������
//		 * final int MAX_NUMBER;
//		 * ���ͷ����ǹ̸��ο��ϱ����ػ���Ѵ�.
//		 */
//		final int MAX_NUMBER;
//			MAX_NUMBER = 10; //�ʱ�ȭ
//			MAX_NUMBER = 100;
//		
//				
//		//�ܼ�â���� �Է¹޴� ���
//		Scanner s = new Scanner(System.in);
	//  System.out.println("���ڿ��� �Է����ּ���>");
//		String input1 = s.nextline();
//		System.out.println("�Է¹��� ���ڿ� : " + input1);
//		
	
	///Scanner s = new Scanner(System.in);
//		System.out.println("���ڸ� �Է����ּ���>");
//		int input2 = Integer.parseInt(s.nextInt());
//		System.out.println("�Է¹������� : " + input2);
//	//
//		Scanner s = new Scanner(System.in);
//		System.out.println("���ڿ��� �Է����ּ���>");
//		String input1 = s.nextline();
//		System.out.println("�Է¹������ڿ� :"+input1);
		
//		System.out.println(��A' + 'B')
//		
//				$ystem
//				channel#5
//				7eleven
//				If
//				$ystem
//				new
//				$MAX_NUM
//				hello@com
//				 True
//				 NULL
//				 Class
//				 System
				 

	    
		// TODO Auto-generated method stub

	}


