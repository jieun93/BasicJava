package vo;

public class SnackVO {
	//���� : ������ȣ(PK), ������, �ݾ�, ����������ȣ(FK)
	
	private int snackNum;  //������ȣ
	private String snackName;  //������
	private int snackPrice;  //�ݾ�
	private int snackCategoryNum;  //����������ȣ(SnackCategoryVO����)
	
	public int getSnackNum() {
		return snackNum;
	}
	public void setSnackNum(int snackNum) {
		this.snackNum = snackNum;
	}
	public String getSnackName() {
		return snackName;
	}
	public void setSnackName(String snackName) {
		this.snackName = snackName;
	}
	public int getSnackPrice() {
		return snackPrice;
	}
	public void setSnackPrice(int snackPrice) {
		this.snackPrice = snackPrice;
	}
	public int getSnackCategoryNum() {
		return snackCategoryNum;
	}
	public void setSnackCategoryNum(int snackCategoryNum) {
		this.snackCategoryNum = snackCategoryNum;
	}
	
}
