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

//����
public class Payment {
	Scanner s = new Scanner(System.in);
	private PaymentDAO paymentDAO = PaymentDAO.getInstance();
	private PaymentVO paymentVO = new PaymentVO();
	private MovieCartDAO movieCartDAO = MovieCartDAO.getInstance();
	private SnackCartDAO snackCartDAO = SnackCartDAO.getInstance();
	static String paymentForm;
	
	public void payment() {
		
		if(Cart.total==0){
			System.out.println("**��ٱ��Ͽ� ��� ��ǰ�� �����ϴ�. �ֹ��� ���� ���ּ���.**");
			System.out.println(":");
			return;
		}
		
		boolean flag = false;
		do{
			System.out.println("�� ���� �ݾ� : "+Cart.total);
			
			System.out.println("���� ����� ������ �ּ���");
			System.out.println("1. ī�����");
			System.out.println("2. ������ü");
			System.out.println("3. �ڵ��� ����");
			System.out.println("4. ����Ȯ��");
			System.out.println("0. �ʱ�ȭ��");
			int select = Integer.parseInt(s.nextLine());
			if(select>4 || select<0){
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
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
			payChoice(select); //�Է°��� ���� �޼��� ����
			paymentview();				
		}while(flag);
		
	}
	
	void payChoice(int choice) {
		
		paymentVO.setUserId(Session.loginUser.getUserId()); // �������� �߰�
		paymentVO.setPaymentNum(paymentDAO.selectPaymentList().size()); // ������ȣPK �߰�
		int paymentSize = paymentDAO.selectPaymentList().size(); // ���� tableũ��

		// �����ϸ�, ��ٱ��Ͽ��ִ� ���� PK���� ����� ����
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
		System.out.println("���̵� : " + Session.loginUser.getUserId());
		System.out.println("���� �ݾ� : " + Cart.total);

		Calendar cal = Calendar.getInstance();
		Date today = new Date(); // ���� ��¥
		cal.setTime(today);
		paymentVO.setPaymentDate(cal); // ������¥ �߰�
		
		if(choice == 1){ //ī�����
			// 1.ī�� 2.������ü 3.�޴�������
			System.out.println("���� ��� : ī��");
			paymentForm = "ī��";
			paymentVO.setPaymentForm(paymentForm); // �������� �߰�
			paymentDAO.insertPayment(paymentVO);
			
			Payment_card payment_card = new Payment_card();
			payment_card.payment_card(); // ī����� �޼���� �̵�
		}else if(choice == 2){  //������ü
			System.out.println("���� ��� : ������ü");
			paymentForm = "����";
			paymentVO.setPaymentForm(paymentForm);
			paymentDAO.insertPayment(paymentVO);
			
			Payment_ac payment_ac = new Payment_ac();
			payment_ac.payment_ac();			
		}else if(choice == 3){  //�޴�������
			System.out.println("���� ��� : �ڵ��� ����");
			paymentForm = "�ڵ��� ����";
			paymentVO.setPaymentForm(paymentForm);  //������� �߰�
			paymentDAO.insertPayment(paymentVO);
			
			Payment_pn payment_pn = new Payment_pn();
			payment_pn.payment_pn();
		}
	}
	
	//������� �����ֱ�
	public void paymentview(){
		Calendar cal = Calendar.getInstance();		
		Date today = new Date(); //���� ��¥
		cal.setTime(today);
		System.out.println("----------����Ȯ��-----------");
		//���Ź�ǰ, �������̵�, �����ݾ�, ������¥, �������
		System.out.println("���� ���̵�: "+Session.loginUser.getUserId());
		System.out.println("���� �ݾ�: "+Cart.total);
		System.out.println("������¥: " + cal.get(Calendar.YEAR) + "-"
									+ (cal.get(Calendar.MONTH)+1) + "-"
									+ cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("�������: " + paymentForm);
		
		
		System.out.println("0.�ʱ�ȭ������");
		System.out.println("---------------------------");
		int select = Integer.parseInt(s.nextLine());
		
		if(select == 0){
			return;
		}
		
	}
	
}







