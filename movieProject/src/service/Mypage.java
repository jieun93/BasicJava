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
		
		System.out.println("----------------- �� ���� -------------------");
		
		System.out.println("���̵� : " + Session.loginUser.getUserId() + "\n"
//				+ "�н����� : " + Session.loginUser.getUserPwd() + "\n" 
				+ "�н����� : " + "****" + "\n" 
				+ "�̸� : " + Session.loginUser.getUserName() + "\n" 
				+ "����ó : " + Session.loginUser.getUserPhone() + "\n"
				+ "�ֹι�ȣ ���ڸ� : " + Session.loginUser.getUserReg1());
		
		
		PaymentDAO paymentDAO = PaymentDAO.getInstance();
		System.out.println("---------------- �� ���� ��� ------------------");
		
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
			System.out.println( num + ". ��ȭ�̸�: " + movieList.get(i)
//					+ "\t�����̸�: " + snackList.get(i)
					+ "\n�������: "	+ payList.get(i).getPaymentForm()
//					+ "\t�����ݾ�: " + Cart.totalList.get(i)
					+ "\t  ������: " + payList.get(i).getPaymentDate().get(Calendar.YEAR) + "-"
								+ (payList.get(i).getPaymentDate().get(Calendar.MONTH)+1) + "-"
								+ payList.get(i).getPaymentDate().get(Calendar.DAY_OF_MONTH));
			num++;
		}
//		for(int i=0; i<Cart.totalList.size(); i++){
//			System.out.println(num + "\t�����ݾ�: " + Cart.totalList.get(i));
//			num++;
//		}
		
		System.out.println("----------------------------------------");
		System.out.println("0. �ʱ�ȭ������");
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int input = Integer.parseInt(s.nextLine());
		if(input == 0){
			return;
		}
		
		
	}
	
}
