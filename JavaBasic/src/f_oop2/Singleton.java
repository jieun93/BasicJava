package f_oop2;

//�̱��� ����: ��ü�� ������ �����Ͽ� �ϳ��� ��ü�� ����ϰ� �ϴ� ������ ����
//��ü�鰣�� ��ü�� �����ϱ� ���� ����Ѵ�.

public final class Singleton {
	
	private static Singleton instance;
	
	private Singleton(){
		
	}

	public static Singleton getInstance(){
		if(instance ==null){
			instance = new Singleton();
		}
		return instance;
	}
}
