package h_useful;

public class ObjectClass {

	public static void main(String[] args) {
	//toString() : ��ü�� ���� ������ ���ڿ��� �����Ѵ�.
		ObjectClass oc = new ObjectClass();
		System.out.println(oc);
		System.out.println(oc.toString());
	}

	@Override
	public String toString() {
		return "toString() �޼��� ȣ��";
	}
	
	

}
