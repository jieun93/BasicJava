package e_oop;

import java.util.Scanner;

public class TV {
	/*
	 * ��ɿ� �ش��ϴ� ��ȣ�� �Է����ּ���> 1. ���� 2. ä��+ 3. ä��- 4. ����+ 5. ����- 0. ���� 1 ->
	 */

	boolean power;// ����
	int channel; // ä��
	int volume;// ����

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
		System.out.println("���� ������ :"+tv1.power);
		System.out.println("���� ä���� :"+tv1.channel);
		System.out.println("���� ������ :"+tv1.volume);
		
		
		
				
		
		do{
			System.out.println("1.����\n2.ä��+\n3.ä��-\n4.����+\n5.����-\n0.����");
			System.out.println("�Է����ּ���");
			
			Scanner sc = new Scanner(System.in);
			int num  = sc.nextInt();
			
			if(num==1){
				tv1.power();
				System.out.println("����������"+tv1.power);
				continue;
			}
			
			if(num==2){
				tv1.channelUp();
				System.out.println("����ä����"+tv1.channel);
				continue;
			}
			
			if(num==3){
				tv1.channelDown();
				System.out.println("����ä����"+tv1.channel);
				continue;
			}
			if(num==4){
				tv1.volumeUp();
				System.out.println("����������"+tv1.volume);
				continue;
			}
			if(num==5){
				tv1.volumeDown();
				System.out.println("����������"+tv1.volume);
				continue;
			}
			if(num==0){
				System.out.println("���α׷��� �����մϴ�");
				break;	
			}
			
		}while(true);
		
		

	}
}
