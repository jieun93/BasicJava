package vo;

public class TheaterVO {
	//�󿵰� : �󿵰���ȣ(PK), �󿵰��̸�, �¼� ��, �¼�����(BooleanŸ�� Array)
	
	private int theaterNum;  //�󿵰���ȣ
	private String theaterName;  //�󿵰� �̸�
	private int seatCount;  //�¼� ��
	private boolean seatCheck;  //�¼�����
	
	public int getTheaterNum() {
		return theaterNum;
	}
	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public boolean isSeatCheck() {
		return seatCheck;
	}
	public void setSeatCheck(boolean seatCheck) {
		this.seatCheck = seatCheck;
	}
	
}
