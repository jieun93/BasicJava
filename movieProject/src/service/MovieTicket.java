package service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import vo.MovieCartVO;
import vo.TheaterScheduleVO;
import controller.Controller;
import dao.MovieCartDAO;
import dao.MovieDAO;
import dao.TheaterDAO;
import dao.TheaterScheduleDAO;
import dao.UserDAO;
import data.Database;
import data.Session;

public class MovieTicket {

	Scanner s = new Scanner(System.in);
	private int input;
	UserDAO userDAO = UserDAO.getInstance();
	private MovieDAO movieDAO = MovieDAO.getInstance();
	private TheaterDAO theaterDAO = TheaterDAO.getInstance();
	private TheaterScheduleDAO theaterSchdDAO = TheaterScheduleDAO.getInstance();
	private MovieCartDAO movieCartDAO = MovieCartDAO.getInstance();
	static int moviePK;
	static int inputtheater;
	static int hangYul;
	static int theaterPK;
	static int theaterShdPK;
	static int price;

	public void movieTicket() {

		movieChoice(); // 영화명 선택
		theater(); // 상영관 선택
		dateChoice(); // 상영날짜 선택
		seat(); // 좌석 선택
		System.out.println("좌석: " + (hangYul + 1) + "번");

		// MovieCart에 데이터 추가
		MovieCartVO movieCartVO = new MovieCartVO();
		Database db = Database.getInstance();
		movieCartVO.setMovieCartNum(db.tb_movieCart.size());
		movieCartVO.setUserId(Session.loginUser.getUserId());
		movieCartVO.setSeatLocation(hangYul);
		movieCartVO.setPaymentNum(-1); // 결제 전의 결제번호는 -1로 초기
		movieCartVO.setScheduleNum(theaterShdPK);
		movieCartVO.setMoviePrice(price);
		movieCartDAO.insertMovieCart(movieCartVO);

		System.out.println("-----------------------------------------");
		System.out.println("8. 장바구니로 이동");
		System.out.println("9. 초기화면으로");
		input = Integer.parseInt(s.nextLine());
		switch (input) {
		case 8:
			Cart cart = new Cart();
			cart.cart();
			break;
		case 9:
			Controller.menu_start();
			break; // 메서드 닫기 = 초기화면이
		}

		System.out.println(":");
		System.out.println("**영화가 성공적으로 예매되었습니다**");
	}

	// 영화명 선택
	void movieChoice() {
		System.out.println("-------------------------------------");
		System.out.println("영화를 선택해주세요:");

		for (int i = 0; i < movieDAO.selectMovieList(true).size(); i++) {
			System.out.println((i + 1) + ". " + movieDAO.selectMovieList(true).get(i).getMovieName() + "    (관람연령) "
					+ movieDAO.selectMovieList(true).get(i).getMovieRating());
		}
		System.out.println("0. 초기화면으로");
		System.out.println("----------------------------");
		System.out.println("**영화의 가격은 성인:12000원, 청소년:9000원, 아동(4세이하):무료");

		String input22 = s.nextLine();
		int input = Integer.parseInt(input22);

		String reg = Session.loginUser.getUserReg1(); // 로그인한 유저의 주민번호를 들고옴
		String rating = movieDAO.selectMovieList(true).get(input - 1).getMovieRating();

		if (input22.equals("0")) {
			Controller.menu_start();
		} else {
			int iage = Integer.parseInt(reg.substring(0, 2)); // 95 00~99
			if (iage >= 0 && iage < 30) {
				iage += 2000; // 08일경우 2008년생
			} else {
				iage += 1900; // 1995
			}

			Calendar calendar = Calendar.getInstance();
			int age = calendar.get(Calendar.YEAR) - iage; // 25
			System.out.println("내 나이: 만" + age + "세");

			if (age >= 19) { // user가 성인일 때
				moviePK = movieDAO.selectMovieList(true).get(input - 1).getMovieNum(); // 선택한 영화의 PK값을 들고옴(상영시간표에
																						// 넣어주기위함)
				price = 12000;
			} else if (age >= 15 && age < 19) {
				if (rating.contains("19") || rating.contains("청소년")) {
					System.out.println("※선택하신 영화는 청소년 관람 불가입니다. 다시 선택해주세요.※");
					movieChoice();
				} else {
					moviePK = movieDAO.selectMovieList(true).get(input - 1).getMovieNum();
					price = 9000;
				}
			} else if (age >= 12 && age < 15) {
				if (rating.contains("19") || rating.contains("청소년")) {
					System.out.println("※선택하신 영화는 청소년 관람 불가입니다. 다시 선택해주세요.※");
					movieChoice();
				} else if (rating.contains("15")) {
					System.out.println("※선택하신 영화는 15세 이상 관람가능입니다. 다시 선택해주세요.※");
					movieChoice();
				} else { // 전체관람가
					moviePK = movieDAO.selectMovieList(true).get(input - 1).getMovieNum(); // 선택한 영화의 PK값을 들고옴(상영시간표에
																							// 넣어주기위함)
					price = 9000;
				}
			} else if (age >= 4 && age < 12) { // 12세 이하
				if (rating.contains("19") || rating.contains("청소년")) {
					System.out.println("※선택하신 영화는 청소년 관람 불가입니다. 다시 선택해주세요.※");
					movieChoice();
				} else if (rating.contains("15")) {
					System.out.println("※선택하신 영화는 15세 이상 관람가능입니다. 다시 선택해주세요.※");
					movieChoice();
				} else if (rating.contains("12")) {
					System.out.println("※선택하신 영화는 12세 이상 관람가능입니다. 다시 선택해주세요.※");
					movieChoice();
				} else { // 전체관람가
					moviePK = movieDAO.selectMovieList(true).get(input - 1).getMovieNum(); // 선택한 영화의 PK값을 들고옴(상영시간표에
																							// 넣어주기위함)
					price = 9000;
				}
			} else {
				moviePK = movieDAO.selectMovieList(true).get(input - 1).getMovieNum(); // 선택한 영화의 PK값을 들고옴(상영시간표에
																						// 넣어주기위함)
				price = 0;
			}
		}

		System.out.println("선택영화: " + movieDAO.selectMovieList(true).get(input - 1).getMovieName());
		System.out.print("(출연진): " + movieDAO.selectMovieList(true).get(input - 1).getMovieCast());
		System.out.println(" (감독): " + movieDAO.selectMovieList(true).get(input - 1).getMovieDirector());
		System.out.println("(줄거리)" + movieDAO.selectMovieList(true).get(input - 1).getMovieStory());

	}

	// 상영관 선택
	void theater() {
		System.out.println("----------------------------");
		System.out.println("상영관을 선택해주세요");
		for (int i = 0; i < theaterDAO.selectTheaterList().size(); i++) {
			System.out.println((i + 1) + ". " + theaterDAO.selectTheaterList().get(i).getTheaterName());
		}
		System.out.println("0. 초기화면으로");
		System.out.println("----------------------------");
		inputtheater = Integer.parseInt(s.nextLine());
		if (inputtheater == 0) {
			Controller.menu_start();
		}
		theaterPK = theaterDAO.selectTheaterList().get(inputtheater - 1).getTheaterNum();
	}

	// 상영날짜 선택
	void dateChoice() {
		System.out.println("----------------------------");
		System.out.println("상영날짜를 선택해주세요");

		ArrayList<TheaterScheduleVO> ts = theaterSchdDAO.selectTheaterScheduleList();
		ArrayList<TheaterScheduleVO> schdList = new ArrayList<TheaterScheduleVO>();
		ArrayList<TheaterScheduleVO> tsdVoList = new ArrayList<TheaterScheduleVO>();

		int num = 1;
		for (int i = 0; i < theaterSchdDAO.selectTheaterScheduleList().size(); i++) {
			if (moviePK == theaterSchdDAO.selectTheaterScheduleList().get(i).getMovieNum()) {
				// TheaterSchedul의 moviePK값이 user가 선택한 영화의 PK값과 일치한 것만 들고옴
				System.out.println(num + ". " + ts.get(i).getMovieStartTime().get(Calendar.YEAR) + "-"
						+ (ts.get(i).getMovieStartTime().get(Calendar.MONTH)+1) + "-"
						+ ts.get(i).getMovieStartTime().get(Calendar.DATE) + "  "
						+ ts.get(i).getMovieStartTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ ts.get(i).getMovieStartTime().get(Calendar.MINUTE));
				schdList.add(theaterSchdDAO.selectTheaterScheduleList().get(i));
				tsdVoList.add(theaterSchdDAO.selectTheaterScheduleList().get(i));
				num++;
			}
		}
		System.out.println("9. 초기화면으로");
		System.out.println("----------------------------");
		input = Integer.parseInt(s.nextLine());
		if (input == 9) {
			Controller.menu_start();
		}
		
		theaterShdPK = tsdVoList.get(input-1).getScheduleNum();

		System.out.println("선택한 날짜: " + tsdVoList.get(input - 1).getMovieStartTime().get(Calendar.YEAR) + "-"
				+ (tsdVoList.get(input - 1).getMovieStartTime().get(Calendar.MONTH) + 1) + "-"
				+ tsdVoList.get(input - 1).getMovieStartTime().get(Calendar.DAY_OF_MONTH) + " : "
				+ tsdVoList.get(input - 1).getMovieStartTime().get(Calendar.HOUR_OF_DAY) + "시"
				+ tsdVoList.get(input - 1).getMovieStartTime().get(Calendar.MINUTE) + "분");
	}

	// 좌석 선택
	void seat() {

		System.out.println("----------------------------");
		ArrayList<Integer> in = new ArrayList<Integer>(); // 이미 딴사람이 결제한 좌석 번호들을 모두 불러옴(예매할 수 없는 좌석)
		for (int i = 0; i < movieCartDAO.selectMovieCartList().size(); i++) {
			in.add(movieCartDAO.selectMovieCartList().get(i).getSeatLocation());
		}

		int seat = theaterDAO.selectTheaterList().get(inputtheater - 1).getSeatCount(); //
		ArrayList<String> nemo = new ArrayList<String>();
		for (int i = 0; i < seat; i++) {
			nemo.add(" □ ");
		}
		for (int i = 0; i < in.size(); i++) {
			nemo.set(in.get(i), " ■ ");
		}

		/////////////////// 좌석 행
		boolean flag = true;
		do {
			int j = 1;
			for (int i = 0; i < nemo.size(); i++) {
				if (i == 0) {
					System.out.print(j + ". " + (char) (65 + i % 5) + "열 :  ");
				} else if (i % 5 == 0) {
					System.out.print("\n" + (j + 1) + ". " + (char) (65 + i / 5) + "열 :  ");
					j++;
				}
				System.out.print(nemo.get(i));
			}
			System.out.println("\n----------------------------");
			System.out.println("**좌석의 행을 선택해주세요>**");
			int hang = Integer.parseInt(s.nextLine());

			if (hang > nemo.size() / 5 || hang < 1) {
				System.out.println("**행을 잘못입력하셨습니다. 행을 다시 선택해주세요");
				flag = true;
				continue;
			} else {
				flag = false;
			}

			/////////////////// 좌석 열
			System.out.println("----------------------------");
			System.out.println("       1  2  3  4  5");
			for (int i = 0; i < nemo.size(); i++) {
				if (i == 0) {
					System.out.print((char) (65 + i % 5) + "열 :  ");
				} else if (i % 5 == 0) {
					System.out.print("\n" + (char) (65 + i / 5) + "열 :  ");
					j++;
				}
				System.out.print(nemo.get(i));
			}
			System.out.println("\n----------------------------");
			System.out.println("**좌석의 열을 선택해주세요>**");
			int yul = Integer.parseInt(s.nextLine());
			hangYul = (hang * 5 - 4) + yul - 2; // 좌석번호

			for (int i = 0; i < in.size(); i++) {
				if (hangYul == in.get(i)) {
					System.out.println("이미 선택된 좌석입니다. 다시 선택해주세요.");
					seat();
				}
			}

			if (yul > 5 || yul < 1) {
				System.out.println("**열을 잘못입력하셨습니다. 행부터 다시 선택해주세요");
				flag = true;
				continue;
			} else {
				flag = false;
			}
		} while (flag);

	}

}
