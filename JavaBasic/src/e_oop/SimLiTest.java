package e_oop;

import java.util.Scanner;

public class SimLiTest {

	Scanner s= new Scanner(System.in);
	
	//9���� �޼��� �����
	
	void q1(){
		System.out.println("���� �ݻ����(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q2();
		}else if(answer.equals("n")){
			q3();
		}
	}
	void q2(){
		System.out.println("�����Ҷ� �����ٴϴ� Ÿ���̴�(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q5();
		}else if(answer.equals("n")){
			q3();
		}
	}
	void q3(){
		System.out.println("����Ʈ �ڽ��� �̸�¥�°� ���ϴ�(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q6();
		}else if(answer.equals("n")){
			q5();
		}
	}
	void q4(){
		System.out.println("�����⺹��ũ�� �ʴ�(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q7();
		}else if(answer.equals("n")){
			q5();
		}
	}
	void q5(){
		System.out.println("����ǥ���� ���������̴�(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q8();
		}else if(answer.equals("n")){
			q6();
		}
	}
	void q6(){
		System.out.println("Ȱ������ ����Ʈ�� ����(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q8();
		}else if(answer.equals("n")){
			q9();
		}
	}void q7(){
		System.out.println("������ ��� �ϰ� ��ٸ��� ���̴�(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			System.out.println("A");
		}else if(answer.equals("n")){
			q8();
		}
	}void q8(){
		System.out.println("�̼�ģ���� ������ �� ����(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q9();
		}else if(answer.equals("n")){
			System.out.println("B");
		}
	}void q9(){
		System.out.println("�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			System.out.println("D");
		}else if(answer.equals("n")){
			System.out.println("C");
		}
	}
}
