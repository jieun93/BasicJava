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

		movieChoice(); // ��ȭ�� ����
		theater(); // �󿵰� ����
		dateChoice(); // �󿵳�¥ ����
		seat(); // �¼� ����
		System.out.println("�¼�: " + (hangYul + 1) + "��");

		// MovieCart�� ������ �߰�
		MovieCartVO movieCartVO = new MovieCartVO();
		Database db = Database.getInstance();
		movieCartVO.setMovieCartNum(db.tb_movieCart.size());
		movieCartVO.setUserId(Session.loginUser.getUserId());
		movieCartVO.setSeatLocation(hangYul);
		movieCartVO.setPaymentNum(-1); // ���� ���� ������ȣ�� -1�� �ʱ�
		movieCartVO.setScheduleNum(theaterShdPK);
		movieCartVO.setMoviePrice(price);
		movieCartDAO.insertMovieCart(movieCartVO);

		System.out.println("-----------------------------------------");
		System.out.println("8. ��ٱ��Ϸ� �̵�");
		System.out.println("9. �ʱ�ȭ������");
		input = Integer.parseInt(s.nextLine());
		switch (input) {
		case 8:
			Cart cart = new Cart();
			cart.cart();
			break;
		case 9:
			Controller.menu_start();
			break; // �޼��� �ݱ� = �ʱ�ȭ����
		}

		System.out.println(":");
		System.out.println("**��ȭ�� ���������� ���ŵǾ����ϴ�**");
	}

	// ��ȭ�� ����
	void movieChoice() {
		System.out.println("-------------------------------------");
		System.out.println("��ȭ�� �������ּ���:");

		for (int i = 0; i < movieDAO.selectMovieList(true).size(); i++) {
			System.out.println((i + 1) + ". " + movieDAO.selectMovieList(true).get(i).getMovieName() + "    (��������) "
					+ movieDAO.selectMovieList(true).get(i).getMovieRating());
		}
		System.out.println("0. �ʱ�ȭ������");
		System.out.println("----------------------------");
		System.out.println("**��ȭ�� ������ ����:12000��, û�ҳ�:9000��, �Ƶ�(4������):����");

		String input22 = s.nextLine();
		int input = Integer.parseInt(input22);

		String reg = Session.loginUser.getUserReg1(); // �α����� ������ �ֹι�ȣ�� ����
		String rating = movieDAO.selectMovieList(true).get(input - 1).getMovieRating();

		if (input22.equals("0")) {
			Controller.menu_start();
		} else {
			int iage = Integer.parseInt(reg.substring(0, 2)); // 95 00~99
			if (iage >= 0 && iage < 30) {
				iage += 2000; // 08�ϰ�� 2008���
			} else {
				iage += 1900; // 1995
			}

			Calendar calendar = Calendar.getInstance();
			int age = calendar.get(Calendar.YEAR) - iage; // 25
			System.out.println("�� ����: ��" + age + "��");

			if (age >= 19) { // user�� ������ ��
				moviePK = movieDAO.selectMovieList(true).get(input - 1).getMovieNum(); // ������ ��ȭ�� PK���� ����(�󿵽ð�ǥ��
																						// �־��ֱ�����)
				price = 12000;
			} else if (age >= 15 && age < 19) {
				if (rating.contains("19") || rating.contains("û�ҳ�")) {
					System.out.println("�ؼ����Ͻ� ��ȭ�� û�ҳ� ���� �Ұ��Դϴ�. �ٽ� �������ּ���.��");
					movieChoice();
				} else {
					moviePK = movieDAO.selectMovieList(true).get(input - 1).getMovieNum();
					price = 9000;
				}
			} else if (age >= 12 && age < 15) {
				if (rating.contains("19") || rating.contains("û�ҳ�")) {
					System.out.println("�ؼ����Ͻ� ��ȭ�� û�ҳ� ���� �Ұ��Դϴ�. �ٽ� �������ּ���.��");
					movieChoice();
				} else if (rating.contains("15")) {
					System.out.println("�ؼ����Ͻ� ��ȭ�� 15�� �̻� ���������Դϴ�. �ٽ� �������ּ���.��");
					movieChoice();
				} else { // ��ü������
					moviePK = movieDAO.selectMovieList(true).get(input - 1).getMovieNum(); // ������ ��ȭ�� PK���� ����(�󿵽ð�ǥ��
																							// �־��ֱ�����)
					price = 9000;
				}
			} else if (age >= 4 && age < 12) { // 12�� ����
				if (rating.contains("19") || rating.contains("û�ҳ�")) {
					System.out.println("�ؼ����Ͻ� ��ȭ�� û�ҳ� ���� �Ұ��Դϴ�. �ٽ� �������ּ���.��");
					movieChoice();
				} else if (rating.contains("15")) {
					System.out.println("�ؼ����Ͻ� ��ȭ�� 15�� �̻� ���������Դϴ�. �ٽ� �������ּ���.��");
					movieChoice();
				} else if (rating.contains("12")) {
					System.out.println("�ؼ����Ͻ� ��ȭ�� 12�� �̻� ���������Դϴ�. �ٽ� �������ּ���.��");
					movieChoice();
				} else { // ��ü������
					moviePK = movieDAO.selectMovieList(true).get(input - 1).getMovieNum(); // ������ ��ȭ�� PK���� ����(�󿵽ð�ǥ��
																							// �־��ֱ�����)
					price = 9000;
				}
			} else {
				moviePK = movieDAO.selectMovieList(true).get(input - 1).getMovieNum(); // ������ ��ȭ�� PK���� ����(�󿵽ð�ǥ��
																						// �־��ֱ�����)
				price = 0;
			}
		}

		System.out.println("���ÿ�ȭ: " + movieDAO.selectMovieList(true).get(input - 1).getMovieName());
		System.out.print("(�⿬��): " + movieDAO.selectMovieList(true).get(input - 1).getMovieCast());
		System.out.println(" (����): " + movieDAO.selectMovieList(true).get(input - 1).getMovieDirector());
		System.out.println("(�ٰŸ�)" + movieDAO.selectMovieList(true).get(input - 1).getMovieStory());

	}

	// �󿵰� ����
	void theater() {
		System.out.println("----------------------------");
		System.out.println("�󿵰��� �������ּ���");
		for (int i = 0; i < theaterDAO.selectTheaterList().size(); i++) {
			System.out.println((i + 1) + ". " + theaterDAO.selectTheaterList().get(i).getTheaterName());
		}
		System.out.println("0. �ʱ�ȭ������");
		System.out.println("----------------------------");
		inputtheater = Integer.parseInt(s.nextLine());
		if (inputtheater == 0) {
			Controller.menu_start();
		}
		theaterPK = theaterDAO.selectTheaterList().get(inputtheater - 1).getTheaterNum();
	}

	// �󿵳�¥ ����
	void dateChoice() {
		System.out.println("----------------------------");
		System.out.println("�󿵳�¥�� �������ּ���");

		ArrayList<TheaterScheduleVO> ts = theaterSchdDAO.selectTheaterScheduleList();
		ArrayList<TheaterScheduleVO> schdList = new ArrayList<TheaterScheduleVO>();
		ArrayList<TheaterScheduleVO> tsdVoList = new ArrayList<TheaterScheduleVO>();

		int num = 1;
		for (int i = 0; i < theaterSchdDAO.selectTheaterScheduleList().size(); i++) {
			if (moviePK == theaterSchdDAO.selectTheaterScheduleList().get(i).getMovieNum()) {
				// TheaterSchedul�� moviePK���� user�� ������ ��ȭ�� PK���� ��ġ�� �͸� ����
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
		System.out.println("9. �ʱ�ȭ������");
		System.out.println("----------------------------");
		input = Integer.parseInt(s.nextLine());
		if (input == 9) {
			Controller.menu_start();
		}
		
		theaterShdPK = tsdVoList.get(input-1).getScheduleNum();

		System.out.println("������ ��¥: " + tsdVoList.get(input - 1).getMovieStartTime().get(Calendar.YEAR) + "-"
				+ (tsdVoList.get(input - 1).getMovieStartTime().get(Calendar.MONTH) + 1) + "-"
				+ tsdVoList.get(input - 1).getMovieStartTime().get(Calendar.DAY_OF_MONTH) + " : "
				+ tsdVoList.get(input - 1).getMovieStartTime().get(Calendar.HOUR_OF_DAY) + "��"
				+ tsdVoList.get(input - 1).getMovieStartTime().get(Calendar.MINUTE) + "��");
	}

	// �¼� ����
	void seat() {

		System.out.println("----------------------------");
		ArrayList<Integer> in = new ArrayList<Integer>(); // �̹� ������� ������ �¼� ��ȣ���� ��� �ҷ���(������ �� ���� �¼�)
		for (int i = 0; i < movieCartDAO.selectMovieCartList().size(); i++) {
			in.add(movieCartDAO.selectMovieCartList().get(i).getSeatLocation());
		}

		int seat = theaterDAO.selectTheaterList().get(inputtheater - 1).getSeatCount(); //
		ArrayList<String> nemo = new ArrayList<String>();
		for (int i = 0; i < seat; i++) {
			nemo.add(" �� ");
		}
		for (int i = 0; i < in.size(); i++) {
			nemo.set(in.get(i), " �� ");
		}

		/////////////////// �¼� ��
		boolean flag = true;
		do {
			int j = 1;
			for (int i = 0; i < nemo.size(); i++) {
				if (i == 0) {
					System.out.print(j + ". " + (char) (65 + i % 5) + "�� :  ");
				} else if (i % 5 == 0) {
					System.out.print("\n" + (j + 1) + ". " + (char) (65 + i / 5) + "�� :  ");
					j++;
				}
				System.out.print(nemo.get(i));
			}
			System.out.println("\n----------------------------");
			System.out.println("**�¼��� ���� �������ּ���>**");
			int hang = Integer.parseInt(s.nextLine());

			if (hang > nemo.size() / 5 || hang < 1) {
				System.out.println("**���� �߸��Է��ϼ̽��ϴ�. ���� �ٽ� �������ּ���");
				flag = true;
				continue;
			} else {
				flag = false;
			}

			/////////////////// �¼� ��
			System.out.println("----------------------------");
			System.out.println("       1  2  3  4  5");
			for (int i = 0; i < nemo.size(); i++) {
				if (i == 0) {
					System.out.print((char) (65 + i % 5) + "�� :  ");
				} else if (i % 5 == 0) {
					System.out.print("\n" + (char) (65 + i / 5) + "�� :  ");
					j++;
				}
				System.out.print(nemo.get(i));
			}
			System.out.println("\n----------------------------");
			System.out.println("**�¼��� ���� �������ּ���>**");
			int yul = Integer.parseInt(s.nextLine());
			hangYul = (hang * 5 - 4) + yul - 2; // �¼���ȣ

			for (int i = 0; i < in.size(); i++) {
				if (hangYul == in.get(i)) {
					System.out.println("�̹� ���õ� �¼��Դϴ�. �ٽ� �������ּ���.");
					seat();
				}
			}

			if (yul > 5 || yul < 1) {
				System.out.println("**���� �߸��Է��ϼ̽��ϴ�. ����� �ٽ� �������ּ���");
				flag = true;
				continue;
			} else {
				flag = false;
			}
		} while (flag);

	}

}
