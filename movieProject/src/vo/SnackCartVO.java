package vo;

public class SnackCartVO {
   //���� ��ٱ��� : ��ȣ(PK), ȸ�����̵�(FK), ����, ������ȣ(FK), ������ȣ(FK �ʱⰪ�� -1)
   
   private int snackCartNum;  //����īƮ��ȣ
   private String userId;  //ȸ�����̵�
   private int snackCount;  //������ ����
   private int snackNum;  //������ȣ(SnackVO����)
   private int paymentNum = -1;  //������ȣ(PaymentVO����)
   
   public int getSnackCartNum() {
      return snackCartNum;
   }
   public void setSnackCartNum(int snackCartNum) {
      this.snackCartNum = snackCartNum;
   }
   public String getUserId() {
      return userId;
   }
   public void setUserId(String userId) {
      this.userId = userId;
   }
   public int getSnackCount() {
      return snackCount;
   }
   public void setSnackCount(int snackCount) {
      this.snackCount = snackCount;
   }
   public int getSnackNum() {
      return snackNum;
   }
   public void setSnackNum(int snackNum) {
      this.snackNum = snackNum;
   }
   public int getPaymentNum() {
      return paymentNum;
   }
   public void setPaymentNum(int paymentNum) {
      this.paymentNum = paymentNum;
   }
   
}