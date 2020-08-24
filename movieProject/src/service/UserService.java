package service;

import java.util.Scanner;

import vo.UserVO;
import controller.Admin;
import controller.Controller;
import dao.UserDAO;
import data.Session;

//���̵� �ߺ�Ȯ��
public class UserService {
	
	private static UserService instance;

	private UserService() {}

	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}
	
	Scanner s = new Scanner(System.in);
	
	private UserDAO userDao = UserDAO.getInstance();
	
	//ȸ������
	public void join(){
		UserVO user = new UserVO();
		
		//����� ���� �Է�
		System.out.println("���̵� : ");
		String id = s.nextLine();
		user.setUserId(id);
		
		//���̵� �ߺ� �˻�
		UserVO userCheck = userDao.selectUser(user);
		
		//������ ȸ������
		if(userCheck == null){
			System.out.println("��й�ȣ : ");
			String password = s.nextLine();
			System.out.println("�̸� : ");
			String name = s.nextLine();
			System.out.println("����ó : ");
			String phone = s.nextLine();
			System.out.println("�ֹι�ȣ ���ڸ� : ");
			String reg1 = s.nextLine();
			
			user.setUserPwd(password);
			user.setUserName(name);
			user.setUserPhone(phone);
			user.setUserReg1(reg1);
			
			userDao.insertUser(user);
			System.out.println("�������ּż� �����մϴ�.");
		}else{
			//������ ���̵� �ߺ�
			System.out.println("�ߺ��� ���̵��Դϴ�.");
		}
		
	}
	
	//�α���
	public void login(){
		Admin admin = new Admin();
		
		//���̵�, ��й�ȣ�� �Է�
		System.out.println("------------------------------------");
		System.out.println("���̵� : ");
		String id = s.nextLine();
		System.out.println("��й�ȣ : ");
		String pwd = s.nextLine();
		System.out.println("------------------------------------");
		
		UserVO user = new UserVO();
		user.setUserId(id);
		user.setUserPwd(pwd);
		
		UserVO userCheck = userDao.selectUser(user);
		
		//������ �α��� ����
		if(userCheck == null){
			System.out.println("���̵� Ȥ�� ��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			login();
		}else{  //������ �α���
			//������ �������� �̵�
			if(id.equals("admin") && pwd.equals("admin")) {
				System.out.println("**������ �������� �α��� �Ǽ̽��ϴ�.**");
				admin.admin();
				System.exit(0);
			}
			System.out.println("�α��� ����!!");
			System.out.println(userCheck.getUserName() + "�� ȯ���մϴ�.");
			Session.loginUser = userCheck;	//���ǿ� ��������
			
		}
		Controller.menu_start();
		
	}
	
	
}









