package payment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Payment_card {

	Scanner s = new Scanner(System.in);
	boolean stop = false;

	public void payment_card() {
		System.out.println("ī��縦 �������ּ���");
		System.out.println("1. �Ｚ");
		System.out.println("2. ��");
		System.out.println("3. ����");
		
		int select1 = Integer.parseInt(s.nextLine());
		cardSelect(select1);
		
	}
	
	public void cardSelect(int select){
		String regex = "[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}";
		String regex1 = "[0-9]{3}";
		String regex2 = "[0-9]{2}";
		Pattern p = Pattern.compile(regex);
		Pattern p1 = Pattern.compile(regex1);
		Pattern p2 = Pattern.compile(regex2);

		switch (select) {
		case 1:	case 2: case 3:
			do {
				stop = false;
				System.out.println("ī�� ��ȣ 16�ڸ��� �Է��� �ּ���. ex)1234-1234-1234-1234");
				String input = s.nextLine();
				Matcher m = p.matcher(input);
				if (m.find() && input.length() == 19) {
					stop = true;
				} else {
					System.out.println("ī���ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���.");
				}
			} while (!stop);
			do {
				stop = false;
				System.out.println("ī�� CVC 3�ڸ� ��ȣ�� �Է��� �ּ���");
				String input1 = s.nextLine();
				Matcher m1 = p1.matcher(input1);
				if (m1.find() && input1.length() == 3) {
					stop = true;
				} else {
					System.out.println("CVC��ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���");
				}
			} while (!stop);
			do {
				stop = false;
				System.out.println("ī�� ��й�ȣ �� 2 �ڸ��� �Է��� �ּ���");
				String input2 = s.nextLine();
				Matcher m2 = p2.matcher(input2);
				if (m2.find() && input2.length() == 2) {
					stop = true;
				} else {
					System.out.println("��й�ȣ�� Ʋ���ϴ�. �ٽ� �Է����ּ���");
				}
			} while (!stop);

			System.out.println("**������ �Ϸ� �Ǿ����ϴ�.**");
			System.out.println();
			break;
		}
	}
}
