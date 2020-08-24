package service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import vo.MovieCartVO;
import vo.MovieVO;
import vo.ReviewVO;
import vo.TheaterScheduleVO;
import dao.MovieCartDAO;
import dao.MovieDAO;
import dao.ReviewDAO;
import dao.TheaterScheduleDAO;
import data.Session;

public class ReviewService {

	private static ReviewService instance;

	private ReviewService() {
	}

	public static ReviewService getInstance() {
		if (instance == null) {
			instance = new ReviewService();
		}
		return instance;
	}
	int temp;
	
	private ReviewDAO reviewDAO = ReviewDAO.getInstance();
	static String movieName;
	Scanner s = new Scanner(System.in);
	private static String mName;

	// static Scanner choice = new Scanner(System.in);
	// 리뷰작성하기

	public void review() {
		//list:결제된 영화들을 담을 빈 어레이 리스트 생성
		ArrayList<MovieCartVO> list = new ArrayList<MovieCartVO>();
		// MovieCartVO 예매 장바구니 : 영화카트번호(PK), 회원아이디(FK), 좌석선택한위치, 결제번호(FK),
		// 상영시간표(FK)
		MovieDAO movieDAO = MovieDAO.getInstance();

		ArrayList<MovieVO> moivecartList = movieDAO.selectMovieList();
		
		MovieCartDAO movieCartDAO = MovieCartDAO.getInstance();
		
		String id = Session.loginUser.getUserId().trim();
		
		for (int i = 0; i < movieCartDAO.selectMovieCartList().size(); i++){
			if (movieCartDAO.selectMovieCartList().get(i).getUserId().equals(id)) {
				if (movieCartDAO.selectMovieCartList().get(i).getPaymentNum() >= 0) {
					list.add(movieCartDAO.selectMovieCartList().get(i));//결제된 영화 담기
				}
			}
		}
		TheaterScheduleDAO theSchdDAO = TheaterScheduleDAO.getInstance();
		int titleNum = 1;
		ArrayList<TheaterScheduleVO> selecTDList = theSchdDAO.selectTheaterScheduleList();
		for (int i = 0; i < selecTDList.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (selecTDList.get(i).getScheduleNum() == list.get(j).getScheduleNum()) {
					for (int k = 0; k < moivecartList.size(); k++) {
						if (moivecartList.get(k).getMovieNum() == selecTDList.get(i).getMovieNum()) {
							System.out.println(titleNum + ". 영화제목 : "+moivecartList.get(k).getMovieName());
							titleNum++;
						}
					}
				}
			}
		}
		String name2 = "";
		int input = Integer.parseInt(s.nextLine());
		name2 = moivecartList.get(input - 1).getMovieName();
		
		for (int i = 0; i < input+1; i++) {
			for (int j = 0; j < list.size(); j++) {
				if (selecTDList.get(i).getScheduleNum() == list.get(j).getScheduleNum()) {
					for (int k = 0; k < moivecartList.size(); k++) {
						if (moivecartList.get(k).getMovieNum() == selecTDList.get(i).getMovieNum()) {
							name2 = moivecartList.get(k).getMovieName();
							temp = moivecartList.get(k).getMovieNum();
						}
					}
				}
			}
		}
		
		mName = name2;
		
		moviewinter();
		
	}

	void moviewinter() {
		ReviewVO review = new ReviewVO(); // ReviewVO에 담을 review를 만들어줌

		System.out.println("영화 " + "'" + mName + "'" + " 평점을 선택해주세요.");
		System.out.println("------------------------------------------------------------------");

		System.out.println("1. ★☆☆☆☆  2. ★★☆☆☆  3. ★★★☆☆  4. ★★★★☆   5.★★★★★ ");
		System.out.println("------------------------------------------------------------------");

		System.out.println("선택하실  번호 입력>");
		int sc1 = Integer.parseInt(s.nextLine());
		switch (sc1) {
		case 1:
			String str = "★☆☆☆☆ ";
			System.out.println("★☆☆☆☆ ");
			review.setReviewGrade(str);// ReviewVO의 setReview에 담을거
			break;
		case 2:
			String str2 = "★★☆☆☆ ";
			System.out.println("★★☆☆☆");
			review.setReviewGrade(str2);// ReviewVO의 setReview에 담을거
			break;
		case 3:
			String str3 = "★★★☆☆";
			System.out.println("★★★☆☆");
			review.setReviewGrade(str3);// ReviewVO의 setReview에 담을거
			break;
		case 4:
			String str4 = "★★★★☆ ";
			System.out.println("★★★★☆");
			review.setReviewGrade(str4);// ReviewVO의 setReview에 담을거
			break;
		case 5:
			String str5 = "★★★★★ ";
			System.out.println("★★★★★");
			review.setReviewGrade(str5);// ReviewVO의 setReview에 담을거
			break;
		}

		System.out.println("리뷰 내용을 작성해주세요.>");
		String userWright = s.nextLine();
		System.out.println("내용:" + userWright);
		review.setReviewContent(userWright);
		
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		review.setReviewDate(cal);
		review.setUserId(Session.loginUser.getUserId());
		review.setMovieNum(temp);

		reviewDAO.insertReview(review);
	}

	// 전체 리뷰보기--데이터베이스에 넣어놓은 리뷰리스트 불러오는거
	public void view() {
		MovieDAO movieDAO = MovieDAO.getInstance();
		
		System.out.println("------------------------------------------------------------------");
		
		for (int i = 0; i < reviewDAO.selectReviewList().size(); i++) {
			System.out.printf((i+ 1) + 
					". 영화제목 : %-30s\t평점 : %s\t내용 : %-50s\t작성자 : %s\t작성날짜 :",				
					 movieDAO.selectMovie(reviewDAO.selectReviewList().get(i).getMovieNum()).getMovieName(),
					 reviewDAO.selectReviewList().get(i).getReviewGrade(),
					 reviewDAO.selectReviewList().get(i).getReviewContent(),
					 reviewDAO.selectReviewList().get(i).getUserId());
			
			System.out.println(reviewDAO.selectReviewList().get(i).getReviewDate().get(Calendar.YEAR) +"-"
								+ (reviewDAO.selectReviewList().get(i).getReviewDate().get(Calendar.MONTH)+1) + "-"
								+ reviewDAO.selectReviewList().get(i).getReviewDate().get(Calendar.DATE));
		
		}
		
		System.out.println("------------------------------------------------------------------");

		// 리뷰리스트가 보여지고 다음 선택

		System.out.println("------------------------------------------------------------------");
		System.out.println("1.리뷰 메인 화면 ");
		System.out.println("------------------------------------------------------------------");

		int userChoice = Integer.parseInt(s.nextLine());
		if (userChoice == 1) {

		} else {
			System.out.println("다시입력해주세요.");
			view();
		}

	}

	// my review 선택 후 내가 본 영화리스트 보여지고 -> 삭제 할건지 리뷰메인화면으로 갈건지 선택
	public void MyReview() {
		
		
		ArrayList<ReviewVO> userList = reviewDAO.selectReviewList();
		 ArrayList<ReviewVO>  reviewVOList = new ArrayList<>();
		// 출력
		System.out.println("------------------------------------------------------------------");
		System.out.println(" 번호\t   작성자\t  영화제목\t   평점\t    내용\t    작성날짜");
		System.out.println("------------------------------------------------------------------");
	
		for (int i = 0; i < userList.size(); i++) {
			ReviewVO reviewVO = userList.get(i);
			try {
				if (reviewVO.getUserId().equals(Session.loginUser.getUserId())) {
					reviewVOList.add(reviewVO);
				}
			} catch (NullPointerException e) {

			}
		}
		MovieDAO movieDAO = MovieDAO.getInstance();
		
		for(int i = 0; i<reviewVOList.size(); i++){
			System.out.println(i+1+"\t"+reviewVOList.get(i).getUserId()+"\t"+
					movieDAO.selectMovie(reviewVOList.get(i).getMovieNum()).getMovieName()+"\t"+
					reviewVOList.get(i).getReviewGrade()+"\t"+reviewVOList.get(i).getReviewContent()+"\t"+
					reviewVOList.get(i).getReviewDate().get(Calendar.YEAR)+"-"+
					(reviewVOList.get(i).getReviewDate().get(Calendar.MONTH)+1)+"-"+
					reviewVOList.get(i).getReviewDate().get(Calendar.DATE) );
		}
		 
		System.out.println("------------------------------------------------------------------");

		System.out.println("------------------------------------------------------------------");
		System.out.println("           1.리뷰삭제                                    2.리뷰선택화면                                              ");
		System.out.println("------------------------------------------------------------------");

		int userChoice = Integer.parseInt(s.nextLine());

		switch (userChoice) {
		case 1:// 리뷰삭제
			if (userChoice == 1) {
				reviewDelet();
				System.out.println("리뷰가 삭제되었습니다.");
				Review.start();
			} else if (userChoice == 2) {

				System.out.println("리뷰 메인화면으로 돌아갑니다.");
				Review.start();
			}
			break;
		case 2:// 리뷰선택화면
			// 리뷰작성하기로 넘어가기
			break;
		}
		while (userChoice != 2)
			;

	}

	// 마이 리뷰에서 내 리뷰 삭제하는거

	Scanner sc = new Scanner(System.in);

	public void reviewDelet() {
		ArrayList<ReviewVO> userList = reviewDAO.selectReviewList();
		 ArrayList<ReviewVO>  a = new ArrayList<>();
		// 출력
		System.out.println("------------------------------------------------------------------");
		System.out.println(" 번호\t   작성자\t  영화제목\t   평점\t    내용\t       작성날짜");
		System.out.println("------------------------------------------------------------------");
	
		for(int i = 0; i< userList.size(); i++){
			ReviewVO b = userList.get(i);
			if(b.getUserId().equals(Session.loginUser.getUserId())){
			a.add(b);	
			}
		}
		for(int i = 0; i<a.size(); i++){
			System.out.println(i+1+"\t"+ a.get(i).getUserId()
					+"\t"+MovieDAO.getInstance().selectMovie((a.get(i).getMovieNum())).getMovieName()+"\t"
					+a.get(i).getReviewGrade()+"\t"+a.get(i).getReviewContent()+"\t"
					+a.get(i).getReviewDate().get(Calendar.YEAR)+"-"
					+ (a.get(i).getReviewDate().get(Calendar.MONTH)+1)+"-"
					+ a.get(i).getReviewDate().get(Calendar.DATE) );
			
		}
		System.out.println("삭제할 리뷰번호를 선택해주세요");
		int input = Integer.parseInt(sc.nextLine());

		System.out.println("삭제하시겠습니까? 1.예  2.아니오");
		int input2 = Integer.parseInt(sc.nextLine());
		switch (input2) {
		case 1:
			reviewDAO.deleteReview(a.get(input-1));
			Review.start();
			break;
		case 2:
			break;

		}
	}

}
