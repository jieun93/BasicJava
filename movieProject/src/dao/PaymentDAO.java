package dao;

import java.util.ArrayList;

import vo.PaymentVO;
import data.Database;

public class PaymentDAO {
	private static PaymentDAO instance;

	private PaymentDAO() {}

	public static PaymentDAO getInstance() {
		if (instance == null) {
			instance = new PaymentDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();
	public void insertPayment(PaymentVO payment) {
		database.tb_payment.add(payment);
	}

	public ArrayList<PaymentVO> selectPaymentList() {
		return database.tb_payment;
	}
	
	public void deletePayment(int payment) {
		database.tb_payment.remove(payment);
	}
	
	public ArrayList<PaymentVO> searchPaymentList(String userId) {  //���������� ����
		ArrayList<PaymentVO> list = new ArrayList<PaymentVO>();
		for(int i=0; i<database.tb_payment.size(); i++){
			if (userId == database.tb_payment.get(i).getUserId()) { // ���� ������ �͸� �����鼭
				if (database.tb_payment.get(i).getPaymentNum() >= 0) { // ������ �Ϸ�Ȱ�(����PK�� ���)������
					list.add(database.tb_payment.get(i));
				}
			}
		}
		return list;
	}
	
}






