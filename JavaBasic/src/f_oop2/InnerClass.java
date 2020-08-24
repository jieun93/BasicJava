package f_oop2;

public class InnerClass {
	//�ν��Ͻ� ����
	int instanceVar = 1;
	int var = 10;
	
	//Ŭ���� ����
	static int classVar = 2;
	
	//�ν��Ͻ� Ŭ����
	class InstanceInner{
		//�ν��Ͻ� Ŭ���������� �ν��Ͻ� ����� Ŭ���� ��� ��� ��� ����
		int inner1 = instanceVar;
		int inner2 = classVar;
		int var =20;
		
		void method(){
			int var = 30;
			
			System.out.println(var);
			System.out.println(this.var);
			System.out.println(InnerClass.this.var);
		}
	}
	
	//����ƽ Ŭ����
	static class StaticInner{
		//����ƽ Ŭ���������� Ŭ���� ����� ��밡��
//		int inner1 = instanceVar;
		int inner2 = classVar;
		static int inner3 = classVar;
	}
	
	void method(){
		//��������
		int localVar1 = 3;
		final int localVar2 = 4;
		
		//���� Ŭ����
		class LocalInner{
			//���� Ŭ���������� �ν��Ͻ� ����� Ŭ���� ��� ��� ��� �����ρ�
			//final��  ���� ���� ������ ��� ����		
			int inner1 = instanceVar;
			int inner2 = classVar;
//			int inner3 = localVar1;//final�� ���� �ʴ� ���� ������ ��� �Ұ�
			int inner4 = localVar2;
		}
		
		//���� Ŭ������ �޼��� ���ο��� �ν��Ͻ�ȭ�� ���� ��밡��
		LocalInner li = new LocalInner();
		System.out.println(li.inner1);
		System.out.println(li.inner2);
		System.out.println(li.inner4);
		
		
		//�ν��Ͻ� Ŭ������ �ν��Ͻ� ����� �����ϱ� ���ؼ��� �ν��Ͻ�ȭ��  �ؾ��Ѵ�.
		InstanceInner ii = new InstanceInner();
		System.out.println(ii.inner1);
		System.out.println(ii.inner2);
		
		
		//Ŭ���� ����� Ŭ������ ���ؼ� �ٷ� ������ �� �ִ°Ͱ� ����
		//����ƽ Ŭ������ Ŭ������ ���ؼ� �ٷ� ������ �� �ִ�.
		System.out.println(StaticInner.inner3);
		//����ƽ Ŭ������ �ν��Ͻ� ����� �����ϱ� ���ؼ��� �ν��Ͻ�ȭ�� �ؾ��Ѵ�.
		StaticInner si = new StaticInner();
		System.out.println(si.inner2);
		
	}
}
