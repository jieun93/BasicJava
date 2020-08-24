package payment;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import service.Cart;
import vo.PaymentVO;
import controller.Controller;
import dao.MovieCartDAO;
import dao.PaymentDAO;
import dao.SnackCartDAO;
import data.Session;

//결제
public class Payment {
	Scanner s = new Scanner(System.in);
	private PaymentDAO paymentDAO = PaymentDAO.getInstance();
	private PaymentVO paymentVO = new PaymentVO();
	private MovieCartDAO movieCartDAO = MovieCartDAO.getInstance();
	private SnackCartDAO snackCartDAO = SnackCartDAO.getInstance();
	static String paymentForm;
	
	public void payment() {
		
		if(Cart.total==0){
			System.out.println("**장바구니에 담긴 상품이 없습니다. 주문을 먼저 해주세요.**");
			System.out.println(":");
			return;
		}
		
		boolean flag = false;
		do{
			System.out.println("총 결제 금액 : "+Cart.total);
			
			System.out.println("결제 방식을 선택해 주세요");
			System.out.println("1. 카드결제");
			System.out.println("2. 계좌이체");
			System.out.println("3. 핸드폰 결제");
			System.out.println("4. 결제확인");
			System.out.println("0. 초기화면");
			int select = Integer.parseInt(s.nextLine());
			if(select>4 || select<0){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
				flag = true;
				continue;
			}else if(select == 4){
				paymentview();
				break;
			}
			if(select == 0){
				Controller.menu_start();
				break;
			}
			payChoice(select); //입력값에 따라 메서스 실행
			paymentview();				
		}while(flag);
		
	}
	
	void payChoice(int choice) {
		
		paymentVO.setUserId(Session.loginUser.getUserId()); // 유저정보 추가
		paymentVO.setPaymentNum(paymentDAO.selectPaymentList().size()); // 결제번호PK 추가
		int paymentSize = paymentDAO.selectPaymentList().size(); // 결제 table크기

		// 결제하면, 장바구니에있는 결제 PK값을 양수로 수정
		for (int i = 0; i < movieCartDAO.selectMovieCartList().size(); i++) {
			if (Session.loginUser.getUserId().equals(
					movieCartDAO.selectMovieCartList().get(i).getUserId())) {
				movieCartDAO.selectMovieCartList().get(i).setPaymentNum(paymentSize);
			}
		}
		for (int i = 0; i < snackCartDAO.selectSnackCartList().size(); i++) {
			if (Session.loginUser.getUserId().equals(
					snackCartDAO.selectSnackCartList().get(i).getUserId())) {
				snackCartDAO.selectSnackCartList().get(i).setPaymentNum(paymentSize);
			}
		}
		System.out.println("아이디 : " + Session.loginUser.getUserId());
		System.out.println("결제 금액 : " + Cart.total);

		Calendar cal = Calendar.getInstance();
		Date today = new Date(); // 현재 날짜
		cal.setTime(today);
		paymentVO.setPaymentDate(cal); // 결제날짜 추가
		
		if(choice == 1){ //카드결제
			// 1.카드 2.계좌이체 3.휴대폰결제
			System.out.println("결제 방식 : 카드");
			paymentForm = "카드";
			paymentVO.setPaymentForm(paymentForm); // 결제정보 추가
			paymentDAO.insertPayment(paymentVO);
			
			Payment_card payment_card = new Payment_card();
			payment_card.payment_card(); // 카드결제 메서드로 이동
		}else if(choice == 2){  //계좌이체
			System.out.println("결제 방식 : 계좌이체");
			paymentForm = "계좌";
			paymentVO.setPaymentForm(paymentForm);
			paymentDAO.insertPayment(paymentVO);
			
			Payment_ac payment_ac = new Payment_ac();
			payment_ac.payment_ac();			
		}else if(choice == 3){  //휴대폰결제
			System.out.println("결제 방식 : 핸드폰 결제");
			paymentForm = "핸드폰 결제";
			paymentVO.setPaymentForm(paymentForm);  //결제방식 추가
			paymentDAO.insertPayment(paymentVO);
			
			Payment_pn payment_pn = new Payment_pn();
			payment_pn.payment_pn();
		}
	}
	
	//결제목록 보여주기
	public void paymentview(){
		Calendar cal = Calendar.getInstance();		
		Date today = new Date(); //현재 날짜
		cal.setTime(today);
		System.out.println("----------결제확인-----------");
		//구매물품, 결제아이디, 결제금액, 결제날짜, 결제방식
		System.out.println("결제 아이디: "+Session.loginUser.getUserId());
		System.out.println("결제 금액: "+Cart.total);
		System.out.println("결제날짜: " + cal.get(Calendar.YEAR) + "-"
									+ (cal.get(Calendar.MONTH)+1) + "-"
									+ cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("결제방식: " + paymentForm);
		
		
		System.out.println("0.초기화면으로");
		System.out.println("---------------------------");
		int select = Integer.parseInt(s.nextLine());
		
		if(select == 0){
			return;
		}
		
	}
	
}







