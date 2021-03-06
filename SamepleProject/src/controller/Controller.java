package controller;

import java.util.Scanner;

import service.UserService;

public class Controller {

	public static void main(String[] args) {
		/*
		 * 조 소개 > 주제 소개 > 주제 선정 배경 > 프로그램구조 > 시연 발표자 1명,도우미1명(ppt로 발표) 02/03 발표일
		 * 
		 * Controller : 메뉴선택 
		 * Service : 메뉴 기능 수행
		 *  Dao : 데이터베이스 접속 
		 *  VO : 데이터를 담는 클래스
		 */
		new Controller().start();// main 메소드에서 시작 controller의 start를 불러온다.

	}
	//userservice 인스턴스 참조
	UserService userService = UserService.getInstance();
	
	void start() {
		Scanner s = new Scanner(System.in);

		int menu;

		do {
			System.out.println("--------------메뉴-------------");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원목록");
			System.out.println("0. 프로그램 종료");
			System.out.println("------------------------------");
			System.out.println("메뉴에 해당하는 번호 입력>");

			menu = Integer.parseInt(s.nextLine());
			
			switch (menu) {
				case 1:// 회원가입
					userService.join();//userService의 join으로 들어간다.
				break;
			case 2:// 로그인
				userService.login();
				break;

			case 3:// 회원목록
				userService.userList();
				break;
			case 0:// 프로그램 종료
				System.out.println("프로그램종료");
				break;

			}
		} while (menu != 0);

	}

}
