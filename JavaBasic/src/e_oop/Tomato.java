package e_oop;

import java.util.Scanner;

public class Tomato {

	int water;// ��
	int sun;// �޺�
	int wind;// �ٶ�

	Tomato() {
		water = 0;
		sun = 0;
		wind = 0;
	}

	void waterUp() {
		if (water < 10) {
			water++;
		}else{
			System.out.println("���� �ִ�ġ�Դϴ�");
		}
	}

	void waterDown() {
		if (water > 0) {
			water--;
		}else{
			System.out.println("���� �����ϴ�");
		}
	}

	void sunUp() {
		if (sun < 10) {
			sun++;
		}else{
			System.out.println("�޺��� �ִ�ġ�Դϴ�");
		}
	}

	void sunDown() {
		if (sun > 0) {
			sun--;
		}else{
			System.out.println("��� �Դϴ�");
		}
	}

	void windUp() {
		if (wind < 10) {
			wind++;
		}else{
			System.out.println("�ٶ��� �ִ�ġ�Դϴ�");
		}
	}

	void windDown() {
		if (wind > 0) {
			wind--;
		}else{
			System.out.println("�ٶ��� �����ϴ�");
		}
	}

	public static void main(String[] args) {

		Tomato tomato = new Tomato();

		int comWater, comSun, comWind;
		comWater = (int) (Math.random() * 9) + 1;

		do {
			comSun = (int) (Math.random() * 9) + 1;

		} while (comWater == comSun);

		do {
			comWind = (int) (Math.random() * 9) + 1;
		} while (comWind == comWater || comWind == comSun);

		System.out.println("���ִ� �丶�䰡 ������  ���� ���� : " + comWater);
		System.out.println("���ִ� �丶�䰡 ������  �޺��� ���� :" + comSun);
		System.out.println("���ִ� �丶�䰡 ������ �ٶ��� ���� : " + comWind);
		System.out.println("---------------------------------");


		
		System.out.println("1.�� +\n2.��-\n3.�޺�+\n4.�޺�-\n5.�ٶ�+\n6.�ٶ�-\n7.����а����� ��Ĩ�ϴ�.");
		System.out.println("������� �������ּ���");

		Scanner sc = new Scanner(System.in);

		do {
			int input = sc.nextInt();

			switch (input) {

			case 1:
				tomato.waterUp();
				System.out.println("���� ����: " + tomato.water);
				break;
			case 2:
				tomato.waterDown();
				System.out.println("���� ����" + tomato.water);
				break;
			case 3:
				tomato.sunUp();
				System.out.println("�޺��� ������" + tomato.sun);
				break;
			case 4:
				tomato.sunDown();
				System.out.println("�޺��� ������" + tomato.sun);
				break;
			case 5:
				tomato.windUp();
				System.out.println("�ٶ��� ����" + tomato.wind);
				break;
			case 6:
				tomato.windDown();
				System.out.println("�ٶ��� ����" + tomato.wind);
				break;
			case 7:
				System.out.println("����� "
						+ "���� ��Ĩ�ϴ�.");
				if (comWater == tomato.water && comSun == tomato.sun && comWind == tomato.wind) {
					System.out.println("���ִ� �丶�䰡 �ڶ����ϴ�.");
				} else {
					System.out.println("������� ������ �丶�䰡 �׾����ϴ� �Ф�");
				}
			
				break;
			}
		} while (true);

		
	}
}
