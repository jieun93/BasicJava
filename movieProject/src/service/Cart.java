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

//��ٱ��� 
public class Cart {

	private MovieDAO movieDAO = MovieDAO.getInstance();
	private SnackDAO snackDAO = SnackDAO.getInstance();
	private SnackCartDAO snackCartDAO = SnackCartDAO.getInstance();
	private MovieCartDAO movieCartDAO = MovieCartDAO.getInstance();
	private TheaterScheduleDAO theaterScheduleDAO = TheaterScheduleDAO.getInstance();


	// ���� ��Ÿ����
	private Scanner s = new Scanner(System.in);
	public static int total;  //��ȭ+���� ����
//	public static ArrayList<Integer> totalList = new ArrayList<Integer>();
	Payment payment = new Payment();

	public void cart() {
		TheaterScheduleDAO theaterScheduleDAO = TheaterScheduleDAO.getInstance();
		MovieDAO movieDAO = MovieDAO.getInstance();

		System.out.println("<�ֹ����>");
		// ���� ��ٱ��� ��� ���
		System.out.println("---------------��ȭ----------------");
		int num = 1;
		ArrayList<Integer> moviePriceList = new ArrayList<Integer>();
		String id = Session.loginUser.getUserId();
		for (int i = 0; i < movieCartDAO.selectMovieCartList().size(); i++) {
			if (movieCartDAO.selectMovieCartList().get(i).getPaymentNum() < 0) {
				if (id == movieCartDAO.selectMovieCartList().get(i).getUserId()) {
					int scheduleNum = movieCartDAO.selectMovieCartList().get(i).getScheduleNum();
					int movieNum = theaterScheduleDAO.selectTheaterSchedule(scheduleNum).getMovieNum();
					String movieName = movieDAO.selectMovie(movieNum).getMovieName();

					System.out.print(num + ". ��ȭ����: " + movieName);
					System.out.print("    �¼���ȣ: " + (movieCartDAO.selectMovieCartList().get(i).getSeatLocation() + 1));
					System.out.println("    �ݾ�: " + movieCartDAO.selectMovieCartList().get(i).getMoviePrice());

//					moviePrice = movieCartDAO.selectMovieCartList().get(i).getMoviePrice();
					moviePriceList.add(movieCartDAO.selectMovieCartList().get(i).getMoviePrice());
					num++;
				}
			}
		}

		// ���� ��ٱ��� ��� ���
		int snackPrice = 0;
		int snackSum = 0;
		int snackTotal = 0;
		System.out.println("---------------����----------------");

		for (int i = 0; i < snackCartDAO.selectSnackCartList().size(); i++) {
			if(snackCartDAO.selectSnackCartList().get(i).getPaymentNum() < 0) {
				if(id == snackCartDAO.selectSnackCartList().get(i).getUserId()) {
					System.out.print(
							snackDAO.searchSnackNoInfo(snackCartDAO.selectSnackCartList().get(i).getSnackNum()).getSnackName()
							+ " / " + snackCartDAO.selectSnackCartList().get(i).getSnackCount() + "��");
					snackPrice = 0;
					snackPrice += snackDAO.selectSnackList().get(snackCartDAO.selectSnackCartList().get(i).getSnackNum()).getSnackPrice();
					snackSum = snackPrice * snackCartDAO.selectSnackCartList().get(i).getSnackCount();
					snackTotal += snackSum;
					System.out.println("\t�ݾ�: " + snackSum);
				}
			}
		}
		
		int moviePrice = 0;
		System.out.println("------------------------------------");
		// �� �հ� ���
		for (int i = 0; i < moviePriceList.size(); i++) {
			moviePrice += moviePriceList.get(i);
		}

		total = moviePrice + snackTotal;
//		totalList.add(total);
		System.out.println(">>�� �հ�ݾ� : " + total);// ��ȭ+���� ����

		System.out.println("------------------------------------");
		System.out.println("1.�ֹ����� �߰�   2.�ֹ����� ����  3.���� 0.�ʱ�ȭ������");
		int input = Integer.parseInt(s.nextLine());

		switch (input) {
		case 1:
			cartAdd(); // �ֹ����׼���
			break;
		case 2:
			cartDelete();
			break;
		case 3: // ���� �ʱ� �������� �̵�
			Payment payment = new Payment();
			payment.payment();
			break;
		case 0:
			Controller.menu_start();
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			cart();
			break;
		}

	}

	
	//��ٱ��� ����
	private void cartDelete() {

		System.out.println("�����Ͻ� ��Ͽ� �����ϼ���");
		System.out.println("1. ��ȭ");
		System.out.println("2. ����");
		System.out.println("3. ����");
		int num = Integer.parseInt(s.nextLine());
		int seat = 0;
		
		switch (num) {
		case 1:
			System.out.println("---------------��ȭ----------------");
			for (int i = 0; i < movieCartDAO.selectMovieCartList().size(); i++) {
				if (movieCartDAO.selectMovieCartList().get(i).getPaymentNum() < 0) {
					System.out.println(movieDAO.selectMovie(theaterScheduleDAO.selectTheaterSchedule(
									movieCartDAO.selectMovieCartList().get(i).getScheduleNum()).getMovieNum()).getMovieName() // ��ȭ�̸�
									+ " / �¼���ȣ " + movieCartDAO.selectMovieCartList().get(i).getSeatLocation() // ��ȭ�¼�
							);
					seat = i;
				}
			}
			System.out.println(" �����Ͻ� '" + movieDAO.selectMovie(theaterScheduleDAO
					.selectTheaterSchedule(movieCartDAO.selectMovieCartList().get(seat).getScheduleNum()).getMovieNum())
					.getMovieName() + "'�� �����Ͻðڽ��ϱ�? Y/N ");
			String answer = s.nextLine();
			if (answer.equals("y")) {
				movieCartDAO.deleteMovieCart(seat);
				System.out.println("�����߽��ϴ�. ùȭ������ �ǵ��ư��ϴ�.");
			}
			if (answer.equals("n")) {
				System.out.println("ù ȭ������ ���ư��ϴ�.");
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

			System.out.println("---------------����----------------");
			for (int i = 0; i < snackcartList.size(); i++) {
				System.out.print(i + 1 + ". ");
				System.out.print(snackDAO.searchSnackNoInfo(snackcartList.get(i).getSnackNum()).getSnackName());
				System.out.println("\t" + snackcartList.get(i).getSnackCount() + "��");
			}
			System.out.println("---------------------------------");
			System.out.println(" ���� ������ �����ϽÁٽ��ϱ�? �����Ͻ� �޴���ȣ�� �����ּ���.");
			String temp = s.nextLine().trim();

			snackCartDAO.deleteSnackCart(snackcartList.get(Integer.parseInt(temp) - 1));
			break;
		case 3:  default:
			break;
		}

	}
	
	//��ٱ��� �߰�
	void cartAdd() {
		System.out.println("�ֹ����� �߰�");
		System.out.println("1.��ȭ���Ÿ� �߰��Ͻðڽ��ϱ�?");
		System.out.println("2.�����޴��� �߰��Ͻðڽ��ϱ�?");
		System.out.println("3.������������ �̵�");

		int num11 = Integer.parseInt(s.nextLine());
		switch (num11) {
		case 1:
			MovieTicket movieTicket = new MovieTicket();
			movieTicket.movieTicket();
			break;
		case 2:
			// ������������
			SnackBar.popcornMenu();
			break;
		case 3:
			// ��ٱ��� �ʱ�ȭ������
			cart();
			break;
		}
	}

}


