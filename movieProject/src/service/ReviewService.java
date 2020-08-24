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
	// �����ۼ��ϱ�

	public void review() {
		//list:������ ��ȭ���� ���� �� ��� ����Ʈ ����
		ArrayList<MovieCartVO> list = new ArrayList<MovieCartVO>();
		// MovieCartVO ���� ��ٱ��� : ��ȭīƮ��ȣ(PK), ȸ�����̵�(FK), �¼���������ġ, ������ȣ(FK),
		// �󿵽ð�ǥ(FK)
		MovieDAO movieDAO = MovieDAO.getInstance();

		ArrayList<MovieVO> moivecartList = movieDAO.selectMovieList();
		
		MovieCartDAO movieCartDAO = MovieCartDAO.getInstance();
		
		String id = Session.loginUser.getUserId().trim();
		
		for (int i = 0; i < movieCartDAO.selectMovieCartList().size(); i++){
			if (movieCartDAO.selectMovieCartList().get(i).getUserId().equals(id)) {
				if (movieCartDAO.selectMovieCartList().get(i).getPaymentNum() >= 0) {
					list.add(movieCartDAO.selectMovieCartList().get(i));//������ ��ȭ ���
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
							System.out.println(titleNum + ". ��ȭ���� : "+moivecartList.get(k).getMovieName());
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
		ReviewVO review = new ReviewVO(); // ReviewVO�� ���� review�� �������

		System.out.println("��ȭ " + "'" + mName + "'" + " ������ �������ּ���.");
		System.out.println("------------------------------------------------------------------");

		System.out.println("1. �ڡ١١١�  2. �ڡڡ١١�  3. �ڡڡڡ١�  4. �ڡڡڡڡ�   5.�ڡڡڡڡ� ");
		System.out.println("------------------------------------------------------------------");

		System.out.println("�����Ͻ�  ��ȣ �Է�>");
		int sc1 = Integer.parseInt(s.nextLine());
		switch (sc1) {
		case 1:
			String str = "�ڡ١١١� ";
			System.out.println("�ڡ١١١� ");
			review.setReviewGrade(str);// ReviewVO�� setReview�� ������
			break;
		case 2:
			String str2 = "�ڡڡ١١� ";
			System.out.println("�ڡڡ١١�");
			review.setReviewGrade(str2);// ReviewVO�� setReview�� ������
			break;
		case 3:
			String str3 = "�ڡڡڡ١�";
			System.out.println("�ڡڡڡ١�");
			review.setReviewGrade(str3);// ReviewVO�� setReview�� ������
			break;
		case 4:
			String str4 = "�ڡڡڡڡ� ";
			System.out.println("�ڡڡڡڡ�");
			review.setReviewGrade(str4);// ReviewVO�� setReview�� ������
			break;
		case 5:
			String str5 = "�ڡڡڡڡ� ";
			System.out.println("�ڡڡڡڡ�");
			review.setReviewGrade(str5);// ReviewVO�� setReview�� ������
			break;
		}

		System.out.println("���� ������ �ۼ����ּ���.>");
		String userWright = s.nextLine();
		System.out.println("����:" + userWright);
		review.setReviewContent(userWright);
		
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		review.setReviewDate(cal);
		review.setUserId(Session.loginUser.getUserId());
		review.setMovieNum(temp);

		reviewDAO.insertReview(review);
	}

	// ��ü ���亸��--�����ͺ��̽��� �־���� ���丮��Ʈ �ҷ����°�
	public void view() {
		MovieDAO movieDAO = MovieDAO.getInstance();
		
		System.out.println("------------------------------------------------------------------");
		
		for (int i = 0; i < reviewDAO.selectReviewList().size(); i++) {
			System.out.printf((i+ 1) + 
					". ��ȭ���� : %-30s\t���� : %s\t���� : %-50s\t�ۼ��� : %s\t�ۼ���¥ :",				
					 movieDAO.selectMovie(reviewDAO.selectReviewList().get(i).getMovieNum()).getMovieName(),
					 reviewDAO.selectReviewList().get(i).getReviewGrade(),
					 reviewDAO.selectReviewList().get(i).getReviewContent(),
					 reviewDAO.selectReviewList().get(i).getUserId());
			
			System.out.println(reviewDAO.selectReviewList().get(i).getReviewDate().get(Calendar.YEAR) +"-"
								+ (reviewDAO.selectReviewList().get(i).getReviewDate().get(Calendar.MONTH)+1) + "-"
								+ reviewDAO.selectReviewList().get(i).getReviewDate().get(Calendar.DATE));
		
		}
		
		System.out.println("------------------------------------------------------------------");

		// ���丮��Ʈ�� �������� ���� ����

		System.out.println("------------------------------------------------------------------");
		System.out.println("1.���� ���� ȭ�� ");
		System.out.println("------------------------------------------------------------------");

		int userChoice = Integer.parseInt(s.nextLine());
		if (userChoice == 1) {

		} else {
			System.out.println("�ٽ��Է����ּ���.");
			view();
		}

	}

	// my review ���� �� ���� �� ��ȭ����Ʈ �������� -> ���� �Ұ��� �������ȭ������ ������ ����
	public void MyReview() {
		
		
		ArrayList<ReviewVO> userList = reviewDAO.selectReviewList();
		 ArrayList<ReviewVO>  reviewVOList = new ArrayList<>();
		// ���
		System.out.println("------------------------------------------------------------------");
		System.out.println(" ��ȣ\t   �ۼ���\t  ��ȭ����\t   ����\t    ����\t    �ۼ���¥");
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
		System.out.println("           1.�������                                    2.���伱��ȭ��                                              ");
		System.out.println("------------------------------------------------------------------");

		int userChoice = Integer.parseInt(s.nextLine());

		switch (userChoice) {
		case 1:// �������
			if (userChoice == 1) {
				reviewDelet();
				System.out.println("���䰡 �����Ǿ����ϴ�.");
				Review.start();
			} else if (userChoice == 2) {

				System.out.println("���� ����ȭ������ ���ư��ϴ�.");
				Review.start();
			}
			break;
		case 2:// ���伱��ȭ��
			// �����ۼ��ϱ�� �Ѿ��
			break;
		}
		while (userChoice != 2)
			;

	}

	// ���� ���信�� �� ���� �����ϴ°�

	Scanner sc = new Scanner(System.in);

	public void reviewDelet() {
		ArrayList<ReviewVO> userList = reviewDAO.selectReviewList();
		 ArrayList<ReviewVO>  a = new ArrayList<>();
		// ���
		System.out.println("------------------------------------------------------------------");
		System.out.println(" ��ȣ\t   �ۼ���\t  ��ȭ����\t   ����\t    ����\t       �ۼ���¥");
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
		System.out.println("������ �����ȣ�� �������ּ���");
		int input = Integer.parseInt(sc.nextLine());

		System.out.println("�����Ͻðڽ��ϱ�? 1.��  2.�ƴϿ�");
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
