 package service;

import java.util.Scanner;

import controller.Controller;



public class Review {
	
	static ReviewService reviewService =  ReviewService.getInstance();
	
	public static  void start() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int view;
		
		do{
			System.out.println("-----------------------------");
			System.out.println("1. �����ۼ��ϱ�");
			System.out.println("2. ��ü ���亸��");
			System.out.println("3. My Review");
			System.out.println("0. �ʱ�ȭ������");
			System.out.println("------------------------------");
			System.out.println("�����Ͻ�  ��ȣ �Է�>");
			view = Integer.parseInt(s.nextLine());
			
			switch (view){
			case 1: //�����ۼ��ϱ�
				reviewService.review();
				break;
			case 2: //���亸��
				reviewService.view();
				break;
			case 3 : //my review
				reviewService.MyReview();
				break;
			case 0 : //������
				System.out.println("����ȭ������ ���ư��ϴ�.");
				Controller.menu_start();
				break;
			}
		
		}while (view !=0);
	}
}
