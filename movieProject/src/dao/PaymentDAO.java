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
	
	public ArrayList<PaymentVO> searchPaymentList(String userId) {  //세션정보를 받음
		ArrayList<PaymentVO> list = new ArrayList<PaymentVO>();
		for(int i=0; i<database.tb_payment.size(); i++){
			if (userId == database.tb_payment.get(i).getUserId()) { // 내가 결제한 것만 들고오면서
				if (database.tb_payment.get(i).getPaymentNum() >= 0) { // 결제가 완료된것(결제PK가 양수)들고오기
					list.add(database.tb_payment.get(i));
				}
			}
		}
		return list;
	}
	
}






