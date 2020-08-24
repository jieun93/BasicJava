package controller;

import java.util.Scanner;

import service.Cart;
import service.MovieTicket;
import service.Mypage;
import service.Review;
import service.SnackBar;
import service.UserService;

public class Controller {
	//�� & ����ȭ��
	public static void main(String[] args) {
		new Controller().login_start();
	}
	
	UserService userService = UserService.getInstance();
	
	void login_start(){
		int menu;		
		do{
			@SuppressWarnings("resource")
			Scanner s  = new Scanner(System.in);
			System.out.println("-------------- �޴� --------------");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("0. ���α׷� ����");
			System.out.println("--------------------------------");
			System.out.println("�޴��� �ش��ϴ� ��ȣ �Է�>");
			
			menu = Integer.parseInt(s.nextLine());
			
			switch(menu){
			case 1: //ȸ������
				userService.join();
				break;
			case 2: //�α���
				userService.login();
				break;
			case 0: //���α׷� ����
				System.out.println("���α׷� ����");
				break;
				
			}
		}while(menu != 0);
	}
	
	public static void menu_start() {
		int menu;
		do {
			@SuppressWarnings("resource")
			Scanner s  = new Scanner(System.in);
			System.out.println("----------------------------");
			System.out.println("**CGB�� ���Ű� ȯ���մϴ�!**");
			System.out.println("<<�ʱ�ȭ��>>");
			System.out.println("���Ͻô� �޴��� �������ּ���.");
			System.out.println("----------------------------");
			System.out.println("1. ��ȭ ����");
			System.out.println("2. ���� ����");
			System.out.println("3. ����Ȯ��(��ٱ���)");
			System.out.println("4. ����������");
			System.out.println("5. ����");
			
			System.out.println("9. �α׾ƿ�");
			System.out.println("0. ���α׷� ����");
			System.out.println("--------------------------------");
			System.out.println("�޴��� �ش��ϴ� ��ȣ �Է�>");
			
			menu = Integer.parseInt(s.nextLine());
			
			
			MovieTicket movieTicket = new MovieTicket();
			Cart cart = new Cart();
			Controller controller = new Controller();
			
			switch (menu) {
			case 1: // ��ȭ ����
				movieTicket.movieTicket();
				break;
			case 2: // ���� ����
				SnackBar.popcornMenu();
				break;
			case 3: // ����Ȯ��
				cart.cart();
				break;
			case 4: //����������
				Mypage.mypage();
				break;
			case 5: //����������
				Review.start();
				break;
			case 9:
				System.out.println("�α׾ƿ��Ǽ̽��ϴ�.");
				controller.login_start();
				break;
			case 0: // ���α׷� ����
				System.out.println("�α׾ƿ��Ǽ̽��ϴ�.");
				System.out.println("���α׷� ����");
				System.exit(0);
				break;
			}
			
		} while (menu != 0);		
	}
	
	
	
	
}
