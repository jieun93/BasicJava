package vo;

public class MovieCartVO {
	//���� ��ٱ��� : ��ȭīƮ��ȣ(PK), ȸ�����̵�(FK), �¼���������ġ, ������ȣ(FK), �󿵽ð�ǥ(FK)
	
	private int movieCartNum;  //��ȭīƮ��ȣ
	private String userId;  //ȸ�����̵�(UserVO����)
	private int seatLocation;  //�¼� ��å�� ��ġ
	private int paymentNum;  //������ȣ(PaymentVO����)
	private int scheduleNum;  //�󿵽ð�ǥ(TheaterScheduleVO����
	private int movieCount;  //���� ����
	private int moviePrice;
	
	public int getMoviePrice() {
		return moviePrice;
	}
	public void setMoviePrice(int moviePrice) {
		this.moviePrice = moviePrice;
	}
	public int getMovieCount() {
		return movieCount;
	}
	public void setMovieCount(int movieCount) {
		this.movieCount = movieCount;
	}
	public int getMovieCartNum() {
		return movieCartNum;
	}
	public void setMovieCartNum(int movieCartNum) {
		this.movieCartNum = movieCartNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getSeatLocation() {
		return seatLocation;
	}
	public void setSeatLocation(int seatLocation) {
		this.seatLocation = seatLocation;
	}
	public int getPaymentNum() {
		return paymentNum;
	}
	public void setPaymentNum(int paymentNum) {
		this.paymentNum = paymentNum;
	}
	public int getScheduleNum() {
		return scheduleNum;
	}
	public void setScheduleNum(int scheduleNum) {
		this.scheduleNum = scheduleNum;
	}
	
}
