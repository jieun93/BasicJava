package f_oop2.ex_abstract.ex_interface;

public interface SampleInterface {

	
	//�������̽��� ��� ��������� public static final �����ڸ� ����ؾ��Ѵ�.
	public static final int NUM1 = 1;
	//��� ��������� �����ڰ� ���� ������ ������ �����ϴ�.
	int NUM2 = 2;
	
	//�������̽��� ��� �޼���� public abstract �����ڸ� ����ؾ��Ѵ�.
	public abstract void method1();
	//��� �޼ҵ��� �����ڰ� ���� ������ ������ �����ϴ�.
	void method2();
	
}


class SampleImplement 
 SampleInterface,SampleInterface2{

	
	@Override
	public void method2() {
		System.out.println(SampleInterface.NUM2);
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
}

interface SampleInterface2{
	void method1();
	void method3();
	
}
















