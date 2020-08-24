package e_oop;

public class Static {

	static int classVar;
	int instanceVar;

	static void classMethod() {

	}

	void instanceMethod() {

	}

	public static void main(String[] args) {
		/*
		 * <<static �������>> 
		 * ��ü ���� ���� ������ �޼��带 ����ϱ� ���� ���δ�. ��ü�鰡�� ������ ���� �����ϱ� ����
		 * ���δ�.
		 *  static �� ������: Ŭ�������(Ŭ���� ����, Ŭ���� �޼���) Ŭ�������: �޸𸮿� Ŭ������ ����� �� ����
		 * ����ȴ�. 
		 * static�� ���� ������: �ν��Ͻ� ���(�ν��Ͻ� ����,�ν��Ͻ� �޼���) �ν��Ͻ� ���: �޸𸮿� �̽��Ͻ���
		 * ����� �� ���� ����ȴ�.
		 */

		// static�̺��� �޼���
		Math.random();
		System.out.println();

		System.out.println(Static.classVar);
		ClassMember.classMethod();
		Static.classMethod();

		ClassMember cm1 = new ClassMember();
		System.out.println(cm1.instanceVar);
		cm1.instanceMethod();

		System.out.println(cm1.classVar);
		cm1.classMethod();
		// ��ü�� ���ؼ��� Ŭ���� ����� ������ �� ������ ���� ����� �ƴϴ�.

		ClassMember cm2 = new ClassMember();

		System.out.println("���� ��");
		System.out.println("cm1 :" + cm1.instanceVar);
		System.out.println("cm2 :" + cm2.instanceVar);

		cm2.instanceVar = "�ν��Ͻ� ���� ����";

		System.out.println("���� ��");
		System.out.println("cm1 :" + cm1.instanceVar);
		System.out.println("cm2 :" + cm2.instanceVar);

		ClassMember.classVar = "Ŭ���� ���� ����";

		System.out.println("���� ��");
		System.out.println("ClassMember :" + ClassMember.classVar);
		System.out.println("cm1 :" + cm1.instanceVar);
		System.out.println("cm2 :" + cm2.instanceVar);

		ClassMember.classVar = "Ŭ���� ���� ����";

		System.out.println("���� ��");
		System.out.println("ClassMember :" + ClassMember.classVar);
		System.out.println("cm1 :" + cm1.instanceVar);
		System.out.println("cm2 :" + cm2.instanceVar);

		// // ���ٺ��� : ctrl +alt+����Ű(��/�Ʒ�)
		// // �����̵�: alt+����Ű(��/�Ʒ�)
		// Static s1 = new Static();
		// Static s2 = new Static();
		//
		// System.out.println(s1.instanceVar);
		//
		// s1.instanceMethod();
		//
		// s1.instanceVar = 10;
		// s2.instanceVar = 20;
		//
		// System.out.println(s1.instanceVar);
		// System.out.println(s2.instanceVar);

	}

}
