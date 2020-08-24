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
		bank = "하나은행";
		ac_number = "111-2222-3333-44";
	}

	public void payment_ac() {
		try{
			System.out.println("계좌이체를 선택하셨습니다.");
			System.out.println("계좌이체 하실 은행은 " + bank + " 입니다");
			System.out.println("예금주는 " + bk_name + " 입니다");
			System.out.println("계좌번호는 " + ac_number + "입니다.");
			System.out.println("1. 이체");
			System.out.println("2. 다른 결제 이용");
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
				System.out.println("이체 완료 되었습니다.");
				System.out.println("**결제가 완료되었습니다.**");
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
