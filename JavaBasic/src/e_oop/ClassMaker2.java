package e_oop;

public class ClassMaker2 {
	
	//�������� �ϳ��� �����ϰ� ��������� �ʱ�ȭ ���ּ���.
	
	int a = 10;
	
	
	//������ ������ ���������� �ʱ�ȭ ���� ����� �ʱ�ȭ ���ּ���.
	
	{
			a = 0;
		
	}
	
	static int y =0;
	static void a(){
		
	}
	
	//������ ������ ���������� �������� �Ķ���͸� ����� �ʱ�ȭ ���ּ���.
	
	ClassMaker2 (int a){
		 this.a = a;
		 System.out.println(y);
	}
	//������ ������ ���� ������ �����ڸ� �ϳ� �� ���� �ʱ�ȭ���ּ���.
	
	ClassMaker2(){
		this(9);
	}
	
	public static void main(String[] args) {
		ClassMaker2 cm2 = new ClassMaker2();
		System.out.println(cm2.a);
		
		cm2 = new ClassMaker2();
		System.out.println(cm2.a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
