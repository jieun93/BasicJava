package a_variable;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
		/*
		 * <<�� ������>>
		 * -&&(AND)  : �ǿ����� �Ѵ� true�̸� true�� ����� ��´�.
		 * -||(OR): �ǿ����� �� �ϳ��� true �̸� true�� ����� ��´�.
		 * - !(NOT) : �ǿ����ڰ� true�̸� false�� false �̸� true�� ����� ��´�.
		 * �ǿ����ڷ� boolean�� ����Ѵ�.
		 */
		
		
		
		boolean b;
		
		int a = 6;
		
		//a�� 0�ʰ��̰� 10�����ΰ�?
		
		b = 0 < a && a <= 10;
		//true && true
		//true // ������
		System.out.println(b);
		
		//a�� 2�� ����̰ų� 3�� ����ΰ�?
		
		b = a % 2 == 0 || a % 3 == 0;
		System.out.println(b);
		
		//a�� 2�� ����̰ų� 3�� ����̰� 10�����ΰ�?
		b = (a % 2 == 0 || a % 3 == 0) && a <= 10;
		//&&(and)�� �켱������ ����.
		//��ȣ�� �ؼ� ������ ������ �°� �����Ҽ��ִ�.
		System.out.println(b);
		
		char c = 'l';//�� �ҹ���
		//c�� �����ΰ�?
		
		b = '0' <= c && c <= '9';
		System.out.println(b);
		
		//c�� �����ҹ����ΰ�?
		b = 'a' <= c && c <= 'z';
		System.out.println(b);
		
		
		//c�� �������ΰ�?
		b =('a' <= c && c <='z') ||( 'A' <= c && c <= 'Z');
		System.out.println(b);
		//���������������ϱ����ؼ� �켱������ ������� ��ȣ�� �����Ѵ�.
		
		//�������ڴ� ȿ������ ������ �Ѵ�.
		//������ �ǿ����ڿ��� ����� �������� �������� �������� �ʴ´�.
		
		b = true && true;
		b = true && false;
		b = false && true;
		b = false && false;
		
		
		b = true || true;
		b = true || false;
		b = false ||true;
		b = false || false;
		
		int d = 10;
		b = d < 10 && 0 < d++;
		System.out.println(d);
		
		
		b = !b; //b�� true �̸� false ��, false �̸� true �� �����Ѵ�.
		b = !(10<20);
		System.out.println(b);
		
		int x = 1, y =2;
		b = x + 3 * y > y - 2 || x < 3 && y >= 5;
		// ������� > �񱳿��� > ������ ������ �켱������ ����.
		
		
		//������ ������� �ڵ�� �ۼ����ּ���.
		//x�� 2�� ����̰� 10���� ������?
		
			b = x % 2 == 0 && x < 10;
		
		// x�� 2�� ����̰ų� 3�� ����̰ų� 5�� ����ΰ�?
		 b= x % 2 ==0 || x % 3 == 0 || x % 5 == 0;
		 
		
		 
		
			
				
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
