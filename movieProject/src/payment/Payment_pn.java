package payment;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Payment_pn {

	String pn;
	int regno1;
	Scanner s = new Scanner(System.in);

	public Payment_pn() {
		regno1 = 940102; // 세션정보 들고옴
		pn = "010-8338-4845"; // 세션정보 들고옴
	}

	//통신사 선택
	public void payment_pn(){
			System.out.println("통신사를 선택해 주세요");
			System.out.println("1. SKT");
			System.out.println("2. KT");
			System.out.println("3. LG u+");
			int select = Integer.parseInt(s.nextLine());
	
			switch (select) {
			case 1: case 2: case 3:
				payment_telecom();
				break;
			default:
				System.out.println("잘못입력하셨습니다. 다시 시도해주세요.");
				payment_pn();
				break;
			}
	}
	
	//통신사
	void payment_telecom() {
		boolean stop = false;
		String input;
		do {
			System.out.println("전화번호를 입력해 주세요>");
			input = s.nextLine();
			if (!input.equals(pn)) {
				System.out.println("전화번호가 바르지 않습니다.");
			} else {

				stop = true;
			}
		} while (!stop);

		stop = false;

		do {
			System.out.println("주민번호 앞자리 6자리를 입력해 주세요");
			int input11 = Integer.parseInt(s.nextLine());
			if (input11 != regno1) {
				System.out.println("주민번호가 일치하지 않습니다.");
			} else {

				stop = true;

			}
		} while (stop == false);

		payment_certification();

	}
	
	//인증번호
	void payment_certification(){
		try{
			
			boolean stop = false;
			String input = "";
			
			System.out.println("인증번호를 받으시겠습니까?");
			System.out.println("1. 인증번호 받기");
			System.out.println("2. 다른 결제 이용");
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
				try (FileOutputStream fos = new FileOutputStream("d:/file.txt")) { // 파일
																					// 쓰기
					byte[] bytes = str.getBytes();
					for (int i = 0; i < bytes.length; i++) {
						fos.write(bytes[i]);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("인증 번호가 발송되었습니다.");
				do {
					System.out.println("인증번호를 입력해 주세요");
					input = s.nextLine();
					if (!input.equals(str)) {
						System.out.println("인증번호가 일치하지 않습니다.");
					} else {
						stop = true;
					}
				} while (stop == false);
				stop = false;
	
				System.out.println("**결제가 완료되었습니다.**");
				System.out.println();
	//			System.out.println("초기화면으로");
			}		
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	
	
}
