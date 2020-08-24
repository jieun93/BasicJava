package f_oop2;

public class SampleChild extends SampleParent{

	void childMethod(){
		//��ӹ��� ������ �޼��带 ����� �� �ִ�.
		System.out.println(var);//��ӹ��� ����
		int result = method(7, 13);//��ӹ��� �޼���
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		
		sc.childMethod();
		
		System.out.println(sc.var);
		int result = sc.method(7, 13);
		System.out.println(result);
		
		
		sc.test(5);
		
		new SampleChild();
		SampleParent sp = new SampleChild();
		//�θ�Ÿ���� ������ �ִ� ����� ����� �� �ִ�.
		System.out.println("sp.var:"+sp.var);
		System.out.println("sc.var:"+sc.var);
		System.out.println("sp.method() : "+ sp.method(5, 10));
		System.out.println("sc.method() : "+ sc.method(5, 10));
		//�������̵� �ϰ� �Ǹ� �θ� Ŭ������ �޼���� ���õȴ�.
	}
	
	//�������̵� : ��ӹ��� �޼����� ������ ������ �ϴ� ��.
	@Override //������̼�
	int method(int a, int b){//����Ÿ�� �޼���� �Ķ���� ��� ���ƾ� �Ѵ�.
		return a * b;
	}
	
	int var;
	
	void test(double var){
		System.out.println(var);//��������(�Ķ����)
		System.out.println(this.var);//�ν��Ͻ� ����
		System.out.println(super.var);//�θ� Ŭ������ �ν��Ͻ� ����
		//super : �θ� Ŭ������ ����� �ڽ� Ŭ������ ����� �̸��� �ߺ��ɶ� ���� �����ϱ� ���� ����Ѵ�.
		
		System.out.println(method(10,20));//�ڽ�Ŭ������ �޼���
		System.out.println(super.method(10,20));//�θ�Ŭ������ �޼���
	}
	SampleChild(){
		super();
		//super()�� ����� �θ� Ŭ������ ��ü�� �����Ѵ�.
		//super()�� ������ �����Ϸ��� �ڵ����� super()�� �־��ش�.
	}
	
	
}
