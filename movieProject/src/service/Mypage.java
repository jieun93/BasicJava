package service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import vo.PaymentVO;
import dao.MovieCartDAO;
import dao.MovieDAO;
import dao.PaymentDAO;
import data.Session;

public class Mypage {
	
	public static void mypage() {
		
		System.out.println("----------------- 내 정보 -------------------");
		
		System.out.println("아이디 : " + Session.loginUser.getUserId() + "\n"
//				+ "패스워드 : " + Session.loginUser.getUserPwd() + "\n" 
				+ "패스워드 : " + "****" + "\n" 
				+ "이름 : " + Session.loginUser.getUserName() + "\n" 
				+ "연락처 : " + Session.loginUser.getUserPhone() + "\n"
				+ "주민번호 앞자리 : " + Session.loginUser.getUserReg1());
		
		
		PaymentDAO paymentDAO = PaymentDAO.getInstance();
		System.out.println("---------------- 내 결제 목록 ------------------");
		
		MovieCartDAO movieCartDAO = MovieCartDAO.getInstance();
		MovieDAO movieDAO = MovieDAO.getInstance();
		String id = Session.loginUser.getUserId();
		
		ArrayList<PaymentVO> payList = paymentDAO.searchPaymentList(id);
		ArrayList<String> movieList = new ArrayList<String>();
		for(int i=0; i<paymentDAO.searchPaymentList(id).size(); i++){
			for(int j=1; j<movieDAO.selectMovieList().size(); j++){
				if(payList.get(i).getPaymentNum() == movieCartDAO.selectMovieCartList().get(j-1).getPaymentNum()){
					movieList.add(movieDAO.selectMovie(j).getMovieName());
				}
			}
		}
		
		int num = 1;
		for(int i=0; i<paymentDAO.searchPaymentList(id).size(); i++){
			System.out.println( num + ". 영화이름: " + movieList.get(i)
//					+ "\t스낵이름: " + snackList.get(i)
					+ "\n결제방식: "	+ payList.get(i).getPaymentForm()
//					+ "\t결제금액: " + Cart.totalList.get(i)
					+ "\t  결제일: " + payList.get(i).getPaymentDate().get(Calendar.YEAR) + "-"
								+ (payList.get(i).getPaymentDate().get(Calendar.MONTH)+1) + "-"
								+ payList.get(i).getPaymentDate().get(Calendar.DAY_OF_MONTH));
			num++;
		}
//		for(int i=0; i<Cart.totalList.size(); i++){
//			System.out.println(num + "\t결제금액: " + Cart.totalList.get(i));
//			num++;
//		}
		
		System.out.println("----------------------------------------");
		System.out.println("0. 초기화면으로");
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int input = Integer.parseInt(s.nextLine());
		if(input == 0){
			return;
		}
		
		
	}
	
}
