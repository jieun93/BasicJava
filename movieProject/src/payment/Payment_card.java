package payment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Payment_card {

	Scanner s = new Scanner(System.in);
	boolean stop = false;

	public void payment_card() {
		System.out.println("카드사를 선택해주세요");
		System.out.println("1. 삼성");
		System.out.println("2. 비씨");
		System.out.println("3. 신한");
		
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
				System.out.println("카드 번호 16자리를 입력해 주세요. ex)1234-1234-1234-1234");
				String input = s.nextLine();
				Matcher m = p.matcher(input);
				if (m.find() && input.length() == 19) {
					stop = true;
				} else {
					System.out.println("카드번호가 틀렸습니다. 다시 입력해주세요.");
				}
			} while (!stop);
			do {
				stop = false;
				System.out.println("카드 CVC 3자리 번호를 입력해 주세요");
				String input1 = s.nextLine();
				Matcher m1 = p1.matcher(input1);
				if (m1.find() && input1.length() == 3) {
					stop = true;
				} else {
					System.out.println("CVC번호가 틀렸습니다. 다시 입력해주세요");
				}
			} while (!stop);
			do {
				stop = false;
				System.out.println("카드 비밀번호 앞 2 자리를 입력해 주세요");
				String input2 = s.nextLine();
				Matcher m2 = p2.matcher(input2);
				if (m2.find() && input2.length() == 2) {
					stop = true;
				} else {
					System.out.println("비밀번호가 틀립니다. 다시 입력해주세요");
				}
			} while (!stop);

			System.out.println("**결제가 완료 되었습니다.**");
			System.out.println();
			break;
		}
	}
}
