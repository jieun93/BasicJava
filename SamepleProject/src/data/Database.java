package data;

import java.util.ArrayList;

import vo.UserVO;

public class Database {

	
	private static Database instance;
	
	private Database(){}
	
	public static Database getInstance() {
		if(instance == null){
			instance = new Database();
		}
		
		return instance;

	}
	
	public ArrayList<UserVO> tb_user = new ArrayList<>();
	
	{
		UserVO user = new UserVO();
		user.setId("admin");
		user.setPassword("admin");
		user.setName("������");
		tb_user.add(user);
		
		user = new UserVO();
		user.setId("adm��������in");
		user.setPassword("ad��������min");
		user.setName("������������");
		tb_user.add(user);
	}
	
	
	
	
}




