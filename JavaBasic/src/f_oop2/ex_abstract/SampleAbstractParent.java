package f_oop2.ex_abstract;

public abstract class SampleAbstractParent {
	void method(){
		
	}
	//�߻� �޼��� : ����θ� �ְ� �����δ� ���� �޼���
	abstract void abstractMethod();
	
}

class SampleAbstractChild extends SampleAbstractParent{
	//�߻�޼��带 ��ӹ����� �ݵ�� �����ؾ��Ѵ�.
	//��ӹ��� �߻�޼��带 �߻�޼���� ���ܵη��� Ŭ������ �߻�Ŭ������ �����ؾ� �Ѵ�.
	@Override
	void abstractMethod(){
		
	}
}
