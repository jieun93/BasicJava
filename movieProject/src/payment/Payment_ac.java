package payment;

import java.util.Scanner;

public class Payment_ac {

	int price;
	String ac_number;
	String bk_name;
	String bank;
	Scanner s = new Scanner(System.in);

	public Payment_ac() {
		bk_name = "CGB";
		bank = "�ϳ�����";
		ac_number = "111-2222-3333-44";
	}

	public void payment_ac() {
		try{
			System.out.println("������ü�� �����ϼ̽��ϴ�.");
			System.out.println("������ü �Ͻ� ������ " + bank + " �Դϴ�");
			System.out.println("�����ִ� " + bk_name + " �Դϴ�");
			System.out.println("���¹�ȣ�� " + ac_number + "�Դϴ�.");
			System.out.println("1. ��ü");
			System.out.println("2. �ٸ� ���� �̿�");
			int select1 = Integer.parseInt(s.nextLine());
			if (select1 == 1) {
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				System.out.println("��ü �Ϸ� �Ǿ����ϴ�.");
				System.out.println("**������ �Ϸ�Ǿ����ϴ�.**");
				System.out.println();
	
			} else if (select1 == 2) {
				Payment p = new Payment();
				p.payment();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}

	}
}
