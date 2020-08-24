package payment;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Payment_pn {

	String pn;
	int regno1;
	Scanner s = new Scanner(System.in);

	public Payment_pn() {
		regno1 = 940102; // �������� ����
		pn = "010-8338-4845"; // �������� ����
	}

	//��Ż� ����
	public void payment_pn(){
			System.out.println("��Ż縦 ������ �ּ���");
			System.out.println("1. SKT");
			System.out.println("2. KT");
			System.out.println("3. LG u+");
			int select = Integer.parseInt(s.nextLine());
	
			switch (select) {
			case 1: case 2: case 3:
				payment_telecom();
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �õ����ּ���.");
				payment_pn();
				break;
			}
	}
	
	//��Ż�
	void payment_telecom() {
		boolean stop = false;
		String input;
		do {
			System.out.println("��ȭ��ȣ�� �Է��� �ּ���>");
			input = s.nextLine();
			if (!input.equals(pn)) {
				System.out.println("��ȭ��ȣ�� �ٸ��� �ʽ��ϴ�.");
			} else {

				stop = true;
			}
		} while (!stop);

		stop = false;

		do {
			System.out.println("�ֹι�ȣ ���ڸ� 6�ڸ��� �Է��� �ּ���");
			int input11 = Integer.parseInt(s.nextLine());
			if (input11 != regno1) {
				System.out.println("�ֹι�ȣ�� ��ġ���� �ʽ��ϴ�.");
			} else {

				stop = true;

			}
		} while (stop == false);

		payment_certification();

	}
	
	//������ȣ
	void payment_certification(){
		try{
			
			boolean stop = false;
			String input = "";
			
			System.out.println("������ȣ�� �����ðڽ��ϱ�?");
			System.out.println("1. ������ȣ �ޱ�");
			System.out.println("2. �ٸ� ���� �̿�");
			int input3 = Integer.parseInt(s.nextLine());
			if (input3 == 1) {
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				Thread.sleep(1000);
				System.out.print(".");
				String str = "54321";
				try (FileOutputStream fos = new FileOutputStream("d:/file.txt")) { // ����
																					// ����
					byte[] bytes = str.getBytes();
					for (int i = 0; i < bytes.length; i++) {
						fos.write(bytes[i]);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("���� ��ȣ�� �߼۵Ǿ����ϴ�.");
				do {
					System.out.println("������ȣ�� �Է��� �ּ���");
					input = s.nextLine();
					if (!input.equals(str)) {
						System.out.println("������ȣ�� ��ġ���� �ʽ��ϴ�.");
					} else {
						stop = true;
					}
				} while (stop == false);
				stop = false;
	
				System.out.println("**������ �Ϸ�Ǿ����ϴ�.**");
				System.out.println();
	//			System.out.println("�ʱ�ȭ������");
			}		
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	
	
}
