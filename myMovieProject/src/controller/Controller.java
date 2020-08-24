  package controller;

import java.util.Scanner;


import service.UserService;

public class Controller {
	
	public static void main(String[] args) {
		
		new Controller().start();
		
	}
	UserService userService =  UserService.getInstance();

	public void start() {
		Scanner s = new Scanner(System.in);
		
		int view;
		
		do{
			System.out.println("-----------------------------");
			System.out.println("1. �����ۼ��ϱ�");
			System.out.println("2. ��ü ���亸��");
			System.out.println("3. My Review");
			System.out.println("0. ������");
			System.out.println("------------------------------");
			System.out.println("�����Ͻ�  ��ȣ �Է�>");
			view = Integer.parseInt(s.nextLine());
			
			switch (view){
			case 1: //�����ۼ��ϱ�
				userService.wright();
				break;
			case 2: //���亸��
				userService.view();
				break;
			case 3 : //my review
				userService.MyReview();
				break;
			case 0 : //������
				System.out.println("����ȭ������ ���ư��ϴ�.");
				break;
			}
			
						
		}while (view !=0);
	}
}
