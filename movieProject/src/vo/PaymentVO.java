package vo;

import java.util.Calendar;

public class PaymentVO {
   //���� :  ������ȣ(PK), ȸ�����̵�(FK), �������(�ſ�ī��, ����, �������), ������
   
   private int paymentNum;  //������ȣ
   private String userId;  //ȸ�����̵�(UserVO����)
   private String paymentForm;  //�������(1.�ſ�ī�� 2.������ü  3.�޴�������)
   private Calendar paymentDate;  //������
   
   public int getPaymentNum() {
      return paymentNum;
   }
   public void setPaymentNum(int paymentNum) {
      this.paymentNum = paymentNum;
   }
   public String getUserId() {
      return userId;
   }
   public void setUserId(String userId) {
      this.userId = userId;
   }
   public String getPaymentForm() {
      return paymentForm;
   }
   public void setPaymentForm(String paymentForm) {
      this.paymentForm = paymentForm;
   }
   public Calendar getPaymentDate() {
      return paymentDate;
   }
   public void setPaymentDate(Calendar paymentDate) {
      this.paymentDate = paymentDate;
   }
   
   
}