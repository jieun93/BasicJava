package service;

import java.util.ArrayList;
import java.util.Scanner;

import payment.Payment;
import service.MovieTicket;
import vo.SnackCartVO;
import controller.Controller;
import dao.MovieCartDAO;
import dao.MovieDAO;
import dao.SnackCartDAO;
import dao.SnackDAO;
import dao.TheaterScheduleDAO;
import data.Session;

//장바구니 
public class Cart {

	private MovieDAO movieDAO = MovieDAO.getInstance();
	private SnackDAO snackDAO = SnackDAO.getInstance();
	private SnackCartDAO snackCartDAO = SnackCartDAO.getInstance();
	private MovieCartDAO movieCartDAO = MovieCartDAO.getInstance();
	private TheaterScheduleDAO theaterScheduleDAO = TheaterScheduleDAO.getInstance();


	// 수량 나타내기
	private Scanner s = new Scanner(System.in);
	public static int total;  //영화+스낵 가격
//	public static ArrayList<Integer> totalList = new ArrayList<Integer>();
	Payment payment = new Payment();

	public void cart() {
		TheaterScheduleDAO theaterScheduleDAO = TheaterScheduleDAO.getInstance();
		MovieDAO movieDAO = MovieDAO.getInstance();

		System.out.println("<주문목록>");
		// 예매 장바구니 목록 출력
		System.out.println("---------------영화----------------");
		int num = 1;
		ArrayList<Integer> moviePriceList = new ArrayList<Integer>();
		String id = Session.loginUser.getUserId();
		for (int i = 0; i < movieCartDAO.selectMovieCartList().size(); i++) {
			if (movieCartDAO.selectMovieCartList().get(i).getPaymentNum() < 0) {
				if (id == movieCartDAO.selectMovieCartList().get(i).getUserId()) {
					int scheduleNum = movieCartDAO.selectMovieCartList().get(i).getScheduleNum();
					int movieNum = theaterScheduleDAO.selectTheaterSchedule(scheduleNum).getMovieNum();
					String movieName = movieDAO.selectMovie(movieNum).getMovieName();

					System.out.print(num + ". 영화제목: " + movieName);
					System.out.print("    좌석번호: " + (movieCartDAO.selectMovieCartList().get(i).getSeatLocation() + 1));
					System.out.println("    금액: " + movieCartDAO.selectMovieCartList().get(i).getMoviePrice());

//					moviePrice = movieCartDAO.selectMovieCartList().get(i).getMoviePrice();
					moviePriceList.add(movieCartDAO.selectMovieCartList().get(i).getMoviePrice());
					num++;
				}
			}
		}

		// 스낵 장바구니 목록 출력
		int snackPrice = 0;
		int snackSum = 0;
		int snackTotal = 0;
		System.out.println("---------------스낵----------------");

		for (int i = 0; i < snackCartDAO.selectSnackCartList().size(); i++) {
			if(snackCartDAO.selectSnackCartList().get(i).getPaymentNum() < 0) {
				if(id == snackCartDAO.selectSnackCartList().get(i).getUserId()) {
					System.out.print(
							snackDAO.searchSnackNoInfo(snackCartDAO.selectSnackCartList().get(i).getSnackNum()).getSnackName()
							+ " / " + snackCartDAO.selectSnackCartList().get(i).getSnackCount() + "개");
					snackPrice = 0;
					snackPrice += snackDAO.selectSnackList().get(snackCartDAO.selectSnackCartList().get(i).getSnackNum()).getSnackPrice();
					snackSum = snackPrice * snackCartDAO.selectSnackCartList().get(i).getSnackCount();
					snackTotal += snackSum;
					System.out.println("\t금액: " + snackSum);
				}
			}
		}
		
		int moviePrice = 0;
		System.out.println("------------------------------------");
		// 총 합계 출력
		for (int i = 0; i < moviePriceList.size(); i++) {
			moviePrice += moviePriceList.get(i);
		}

		total = moviePrice + snackTotal;
//		totalList.add(total);
		System.out.println(">>총 합계금액 : " + total);// 영화+스낵 가격

		System.out.println("------------------------------------");
		System.out.println("1.주문사항 추가   2.주문사항 삭제  3.결제 0.초기화면으로");
		int input = Integer.parseInt(s.nextLine());

		switch (input) {
		case 1:
			cartAdd(); // 주문사항수정
			break;
		case 2:
			cartDelete();
			break;
		case 3: // 결제 초기 페이지로 이동
			Payment payment = new Payment();
			payment.payment();
			break;
		case 0:
			Controller.menu_start();
			break;
		default:
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			cart();
			break;
		}

	}

	
	//장바구니 삭제
	private void cartDelete() {

		System.out.println("삭제하실 목록울 선택하세요");
		System.out.println("1. 영화");
		System.out.println("2. 스낵");
		System.out.println("3. 없음");
		int num = Integer.parseInt(s.nextLine());
		int seat = 0;
		
		switch (num) {
		case 1:
			System.out.println("---------------영화----------------");
			for (int i = 0; i < movieCartDAO.selectMovieCartList().size(); i++) {
				if (movieCartDAO.selectMovieCartList().get(i).getPaymentNum() < 0) {
					System.out.println(movieDAO.selectMovie(theaterScheduleDAO.selectTheaterSchedule(
									movieCartDAO.selectMovieCartList().get(i).getScheduleNum()).getMovieNum()).getMovieName() // 영화이름
									+ " / 좌석번호 " + movieCartDAO.selectMovieCartList().get(i).getSeatLocation() // 영화좌석
							);
					seat = i;
				}
			}
			System.out.println(" 예매하신 '" + movieDAO.selectMovie(theaterScheduleDAO
					.selectTheaterSchedule(movieCartDAO.selectMovieCartList().get(seat).getScheduleNum()).getMovieNum())
					.getMovieName() + "'를 삭제하시겠습니까? Y/N ");
			String answer = s.nextLine();
			if (answer.equals("y")) {
				movieCartDAO.deleteMovieCart(seat);
				System.out.println("삭제했습니다. 첫화면으로 되돌아갑니다.");
			}
			if (answer.equals("n")) {
				System.out.println("첫 화면으로 돌아갑니다.");
			}
			break;
		case 2:
			SnackDAO snackDAO = SnackDAO.getInstance();

			ArrayList<SnackCartVO> snackcartList = new ArrayList<SnackCartVO>();
			for (int i = 0; i < snackCartDAO.selectSnackCartList().size(); i++) {
				if (snackCartDAO.selectSnackCartList().get(i).getPaymentNum() < 0) {
					snackcartList.add(snackCartDAO.selectSnackCartList().get(i));
				}
			}
			for (int i = 0; i < snackcartList.size(); i++) {
				System.out.println(snackcartList.get(i).getSnackNum());
			}

			System.out.println("---------------스낵----------------");
			for (int i = 0; i < snackcartList.size(); i++) {
				System.out.print(i + 1 + ". ");
				System.out.print(snackDAO.searchSnackNoInfo(snackcartList.get(i).getSnackNum()).getSnackName());
				System.out.println("\t" + snackcartList.get(i).getSnackCount() + "개");
			}
			System.out.println("---------------------------------");
			System.out.println(" 스낵 내용을 삭제하시곘습니까? 삭제하실 메뉴번호를 눌러주세요.");
			String temp = s.nextLine().trim();

			snackCartDAO.deleteSnackCart(snackcartList.get(Integer.parseInt(temp) - 1));
			break;
		case 3:  default:
			break;
		}

	}
	
	//장바구니 추가
	void cartAdd() {
		System.out.println("주문사항 추가");
		System.out.println("1.영화예매를 추가하시겠습니까?");
		System.out.println("2.스낵메뉴를 추가하시겠습니까?");
		System.out.println("3.이전페이지로 이동");

		int num11 = Integer.parseInt(s.nextLine());
		switch (num11) {
		case 1:
			MovieTicket movieTicket = new MovieTicket();
			movieTicket.movieTicket();
			break;
		case 2:
			// 스낵페이지로
			SnackBar.popcornMenu();
			break;
		case 3:
			// 장바구니 초기화면으로
			cart();
			break;
		}
	}

}


