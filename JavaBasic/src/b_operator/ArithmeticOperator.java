package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * <<1.��� ������>>
		 * +:���б�
		 * -:����
		 * *:���ϱ�
		 * /:������
		 * %:������(���������ѳ�����)
		 * -���� �����ڴ� ������ �ǿ������� Ÿ���� ��ġ�ؾ� ������ �����ϴ�.
		 * 
		 * ����:������ 8���� + ������Ÿ��:��Ʈ��  �� 9���� Ÿ��
		 */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2;
		
		//���а� ���� *,/,% �����ڰ� +,- ���� ������ �켱������ ����.
		//�켱�����������Ұ�� ���ʺ��� ������ ����ȴ�.
		
		
		System.out.println(a);
		
		a = (int)(10+ 20.3);
		//ǥ�������� �����ʿ��� ū������ ����(��������)
		//�ǿ������� Ÿ���� ���δٸ����ǥ��������ū����������ȯ�Ŀ����̼���ȴ�.
		//���󼭿����ǰ���� ǥ�������� ū����Ÿ���̵ȴ�.
		
		byte b = 10;
		short c = 20;
		
		short d = (short)( c- b);
		//�ּ� 4����Ʈ���Ǿ� ������ �����ϴ�(int)
		//int ������������Ÿ���� int�� ����ȯ �� ������ ����ȴ�.
		
		long e1 = 100000 * 100000;
		System.out.println(e1);
		
		//�ּ� �ϳ��� LONGŸ������ �ٲ�����Ѵ�.
		long e2 = 100000L * 100000;
		System.out.println(e2);
		
		float f1 = 10 /4;
		System.out.println(f1);
		//�Ҽ����� �������.
		float f2 = 10 /4f;
		System.out.println(f2);
		
		
		int f3 = 10 % 4; //10�� 4�� ���� ������
		System.out.println(f3);
		
		// ������ 0���� ����  �� ����.
		
		// int g1 = 10 / 0;// ��Ÿ�� ���� �߻�
		
		float g2 = 10.0f /0;
		System.out.println(g2);//��� : infinity : ���Ѵ�
		float g3 = 0 / 0f;
		System.out.println(g3);//��� : NAN --> NOT A NUMBER
		
		char h1 = 'A';
		char h2 = (char)(h1 + 1);
		
		int h3 = 'D' - 'A';
		System.out.println(h3);
		
		
		int h4 ='5' - '0';
		System.out.println(h4);
		
		
		//��������ڿ� ���Կ����ڸ� ���� ��������ٿ���ǥ���Ҽ��մ�.
		int i = 0;
		
		i = i +1;
		i += 1; //�ٿ���ǥ������
		i += 2;//���տ�����
		//���ϴ� ���� 1�� ��쿡�� �� ���ϼ��ִ�.
		++i; //������ : ������ �����Ǳ� �� ����
		i++; //������ : ������ ������ �� ����
		
		//�������� ������Ų ������ �����Ѵ�,������ ����i�ǰ��� �о�ͼ� ���� �� 1�� +
		
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++= " + i++);
		System.out.println(i);
		
		i = i - 1;
		i -= 1;
		--i;
		i--;
		
		i = i *2;
		i *= 2;
		
		i =i / 3;
		i /= 3;
		
		i = i % 4;
		i %= 4;
		
		double round = 50.6;
		System.out.println((int)(round + 0.5));
		//���ȣ�� ���ؾ��Ѵ�.
		//�ݿø��� �ϱ����� 0.5�����ϰ� �Ҽ����� ���ֱ� ���� int�� ����ȯ�Ѵ�.
		
		//��°�ڸ� �ݿø��ϴ°�
		System.out.println((int)(round * 10 + 0.5)/10.0); //�Ǽ��γ�������
		
		//������ ���پ� ����ؼ� ���� ������� ������ּ���.
		//1.123456+654321
		//2. 1���� ��� ��*123456
		//3. 2���ǰ����/123456
		//4. 3���ǰ���� -654321
		//5. 4���� ����� % 12346
		
		//int g1 = 123456+654321;
		//System.out.println(g1);
		
		double result = 123456+654321;
		result *= 123456;
		result /= 123456;
		result -= 654321;
		result %= 123456;
		System.out.println(result);
		
		//3���� int�� ������ ���� �� �ʱ�ȭ �� �հ�� ����� �����ּ���(�Ҽ��� ��°�ڸ��ݿø�)
		
		int ab = 1000;
		int cd = 20000;
		int ef = 350;
		
		int aa = ab+cd+ef;
		System.out.println(aa);
	
		double avg = (((int)(aa/3.0)*10+0.5)/10.0);
		
		System.out.println("�հ�:"+aa+"/���:"+avg);
		
		
		
		//int num1=345;
		//int num2=344;
		//int num3=432;
		//int sum = num1+num2+num3;
		//double avg =((int)(sum/3.0)*10+0.5)/10.0);
		//System.out.println("�հ�:"+sum+"/���:"+avg);
		
		
		
		
		

		
		
		
		
				
		
		
		
		
	
		
				
		

		
		
		
		
		
		
		
		
		
		 
		// TODO Auto-generated method stub

	}

}
