package vo;

public class UserVO {
//	ȸ�� : ȸ�� ���̵�(PK), ��й�ȣ, �̸�(�г���), ��ȭ��ȣ, �������
	
	private String userId;	//ȸ�����̵�
	private String userPwd;  //��й�ȣ
	private String userName;  //�̸�
	private String userPhone;  //��ȭ��ȣ
	private String userReg1;  //�������
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserReg1() {
		return userReg1;
	}
	public void setUserReg1(String userReg1) {
		this.userReg1 = userReg1;
	}
	
	
}
