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
			System.out.println("1. 리뷰작성하기");
			System.out.println("2. 전체 리뷰보기");
			System.out.println("3. My Review");
			System.out.println("0. 초기화면으로");
			System.out.println("------------------------------");
			System.out.println("선택하실  번호 입력>");
			view = Integer.parseInt(s.nextLine());
			
			switch (view){
			case 1: //리뷰작성하기
				reviewService.review();
				break;
			case 2: //리뷰보기
				reviewService.view();
				break;
			case 3 : //my review
				reviewService.MyReview();
				break;
			case 0 : //나가기
				System.out.println("메인화면으로 돌아갑니다.");
				Controller.menu_start();
				break;
			}
		
		}while (view !=0);
	}
}
