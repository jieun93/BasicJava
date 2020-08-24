package dao;

import java.util.ArrayList;

import data.Database;
import vo.UserVO;

public class UserDAO {
	
	private static UserDAO instance;

	private UserDAO() {}

	public static UserDAO getInstance() {
		if (instance == null) {
			instance = new UserDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();
	
	
	//���̵� �ߺ� �˻�
	public UserVO selectUser(UserVO param){
		UserVO rtnUser = null;
		for(int i=0; i<database.tb_user.size(); i++){
			UserVO user = database.tb_user.get(i);
			boolean flag = true;
			if(param.getUserId() != null)
				if(!param.getUserId().equals(user.getUserId()))	flag = false;
			if(param.getUserPwd() != null)
				if(!param.getUserPwd().equals(user.getUserPwd())) flag = false;
			if(param.getUserName() != null)
				if(!param.getUserName().equals(user.getUserName())) flag = false;
			if(flag){
				rtnUser = user;
				break;
			}
		}
		return rtnUser;
	}
	
	
	//ȸ������ �� ���� ���� ���
	public void insertUser(UserVO user) {
		database.tb_user.add(user);		
	}

	public ArrayList<UserVO> selectUserList() {		
		return database.tb_user;
	}
	
	//ȸ������
	public void deleteUser(int user){
		database.tb_user.remove(user);
	}
	
}





