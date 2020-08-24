package e_oop;

import java.util.Scanner;

public class TV {
	/*
	 * 기능에 해당하는 번호를 입력해주세요> 1. 전원 2. 채널+ 3. 채널- 4. 음량+ 5. 음량- 0. 종료 1 ->
	 */

	boolean power;// 전원
	int channel; // 채널
	int volume;// 음량

	TV() {
		power = false;
		channel = 0;
		volume = 0;
	}

	void power() {
		power = !power;

	}

	void channelUp() {
		if (power==true && channel < 20) {
			channel++;
		}
	}

	void channelDown() {
		if (power==true && channel > 0) {
			channel--;
		}
	}

	void volumeUp() {
		if (power==true && volume < 10) {
			volume++;
		}
		

	}

	void volumeDown() {
		if (power==true && volume > 0) {
			volume--;
		}
	}

	public static void main(String[] args) {
		
	
		TV tv1 = new TV();
		System.out.println("현재 전원은 :"+tv1.power);
		System.out.println("현재 채널은 :"+tv1.channel);
		System.out.println("현재 음량은 :"+tv1.volume);
		
		
		
				
		
		do{
			System.out.println("1.전원\n2.채녈+\n3.채널-\n4.음량+\n5.음량-\n0.종료");
			System.out.println("입력해주세요");
			
			Scanner sc = new Scanner(System.in);
			int num  = sc.nextInt();
			
			if(num==1){
				tv1.power();
				System.out.println("현재전원은"+tv1.power);
				continue;
			}
			
			if(num==2){
				tv1.channelUp();
				System.out.println("현재채널은"+tv1.channel);
				continue;
			}
			
			if(num==3){
				tv1.channelDown();
				System.out.println("현재채널은"+tv1.channel);
				continue;
			}
			if(num==4){
				tv1.volumeUp();
				System.out.println("현재음량은"+tv1.volume);
				continue;
			}
			if(num==5){
				tv1.volumeDown();
				System.out.println("현재음량은"+tv1.volume);
				continue;
			}
			if(num==0){
				System.out.println("프로그램을 종료합니다");
				break;	
			}
			
		}while(true);
		
		

	}
}
