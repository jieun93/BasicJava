package controller;

import java.util.Scanner;

import service.UserService;

public class Controller {

	public static void main(String[] args) {
		/*
		 * �� �Ұ� > ���� �Ұ� > ���� ���� ��� > ���α׷����� > �ÿ� ��ǥ�� 1��,�����1��(ppt�� ��ǥ) 02/03 ��ǥ��
		 * 
		 * Controller : �޴����� 
		 * Service : �޴� ��� ����
		 *  Dao : �����ͺ��̽� ���� 
		 *  VO : �����͸� ��� Ŭ����
		 */
		new Controller().start();// main �޼ҵ忡�� ���� controller�� start�� �ҷ��´�.

	}
	//userservice �ν��Ͻ� ����
	UserService userService = UserService.getInstance();
	
	void start() {
		Scanner s = new Scanner(System.in);

		int menu;

		do {
			System.out.println("--------------�޴�-------------");
			System.out.println("1.ȸ������");
			System.out.println("2.�α���");
			System.out.println("3.ȸ�����");
			System.out.println("0. ���α׷� ����");
			System.out.println("------------------------------");
			System.out.println("�޴��� �ش��ϴ� ��ȣ �Է�>");

			menu = Integer.parseInt(s.nextLine());
			
			switch (menu) {
				case 1:// ȸ������
					userService.join();//userService�� join���� ����.
				break;
			case 2:// �α���
				userService.login();
				break;

			case 3:// ȸ�����
				userService.userList();
				break;
			case 0:// ���α׷� ����
				System.out.println("���α׷�����");
				break;

			}
		} while (menu != 0);

	}

}
