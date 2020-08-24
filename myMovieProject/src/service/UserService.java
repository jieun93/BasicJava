package service;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import vo.ReviewVO;
import dao.ReviewDao;
import dao.UserDao;
import data.Database;

public class UserService {
	
	private static UserService instance;
	
	private UserService(){}
	

	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}
			
	private UserDao userDao = UserDao.getInstance();
	static String movieName;
//	static Scanner choice =  new Scanner(System.in);
	//�����ۼ��ϱ�
	public void wright(){
			Scanner s = new Scanner(System.in);
			System.out.println("�ۼ��Ͻ� ��ȭ�� �������ּ���.");
			System.out.println("------------------------------------");
//			System.out.println("1.�ܿ�ձ�2 \n2.��ġ���ʾ�\n3.��Ÿ����\n4.���۳༮��");
			
			ReviewVO review = new ReviewVO();
			
			for(int i = 0; i < Database.getInstance().tb_movie.size(); i++){
				System.out.println(userDao.selectMovieList().get(i).getMovie_number()+ ". ��ȭ���� : " + userDao.selectMovieList().get(i).getMovie_name());
			}
			System.out.println("------------------------------");
			System.out.println("�����Ͻ�  ��ȣ �Է�>");

			int input = Integer.parseInt(s.nextLine());
			movieName = userDao.selectMovieList().get(input-1).getMovie_name();
			review.setReview_name(movieName);
			moviewinter();
		
			
			
		}
	
  void moviewinter(){
		ReviewVO review = new ReviewVO(); //ReviewVO�� ���� review�� �������
		
		Scanner sc = new Scanner(System.in);

		System.out.println("��ȭ "+"'"+ movieName+"'"+" ������ �������ּ���.");
		System.out.println("--------------------------------------------------------------");
		System.out.println("1. �ڡ١١١�  2. �ڡڡ١١�  3. �ڡڡڡ١�  4. �ڡڡڡڡ�   5.�ڡڡڡڡ� ");
		System.out.println("--------------------------------------------------------------");
		System.out.println("�����Ͻ�  ��ȣ �Է�>");
		int sc1 = Integer.parseInt(sc.nextLine());
		switch (sc1) {
		case 1:
			String str="�ڡ١١١� ";
			System.out.println("�ڡ١١١� ");
			review.setReview_grade(str);//ReviewVO�� setReview�� ������
			break;
		case 2:
			String str2="�ڡڡ١١� ";
			System.out.println("�ڡڡ١١�");
			review.setReview_grade(str2);//ReviewVO�� setReview�� ������
			break;
		case 3:
			String str3="�ڡڡڡ١�";
			System.out.println("�ڡڡڡ١�");
			review.setReview_grade(str3);//ReviewVO�� setReview�� ������
			break;
		case 4:
			String str4="�ڡڡڡڡ� ";
			System.out.println("�ڡڡڡڡ�");
			review.setReview_grade(str4);//ReviewVO�� setReview�� ������
			break;
		case 5:
			String str5="�ڡڡڡڡ� ";
			System.out.println("�ڡڡڡڡ�");
			review.setReview_grade(str5);//ReviewVO�� setReview�� ������
			break;
		}
		
		Scanner wright = new Scanner(System.in);
			System.out.println("���� ������ �ۼ����ּ���.>");
			String userWright = wright.nextLine();
			System.out.println("����:"+userWright);
			review.setReview_content(userWright);
			review.setReview_name(movieName);
			ReviewDao.insertReview(review);

			
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
			String  today = format.format(date);
		    review.setReview_date(today);
		    
  }

		
	//��ü ���亸��
	public void view(){
		
		ArrayList<ReviewVO> userList=ReviewDao.selectReviewList();
		//���
		System.out.println("------------------------");
//		System.out.println("�ۼ���\t��ȭ����\t����\t����\t�ۼ���¥");
		System.out.println("------------------------");
		for(int i = 0; i < Database.getInstance().tb_review.size(); i++){
			System.out.println((i+1) + ". ��ȭ���� : " + ReviewDao.selectReviewList().get(i).getReview_name()+
					"\t���� : "+ReviewDao.selectReviewList().get(i).getReview_grade()+"\t���� : "
					+ReviewDao.selectReviewList().get(i).getReview_content()+"\t�ۼ���:"+"\t�ۼ���¥:");
		}
		
		System.out.println("------------------------");
		
		
		
		//���丮��Ʈ�� �������� ���� ����
      
		Scanner choice =  new Scanner(System.in);
		
		System.out.println("------------------------------------");
		System.out.println("1.���� ���� ȭ�� ");
		System.out.println("-------------------------------------");
		
		int userChoice = choice.nextInt();
		
		
		
	}
	
//	my review ���� ��  ���� �� ��ȭ����Ʈ �������� ->���� �Ұ��� �������ȭ������ ������ ����
	
	public void MyReview(){
		
		ArrayList<ReviewVO> userList=ReviewDao.selectReviewList();
		//���
		System.out.println("------------------------");
		System.out.println("�ۼ���\t��ȭ����\t����\t����\t�ۼ���¥");
		System.out.println("------------------------");
		for(int i = 0; i < Database.getInstance().tb_review.size(); i++){
			System.out.println((i+1) + ". ��ȭ���� : " + ReviewDao.selectReviewList().get(i).getReview_name()+
					"\t���� : "+ReviewDao.selectReviewList().get(i).getReview_grade()+"\t���� : "
					+ReviewDao.selectReviewList().get(i).getReview_content()+"\t�ۼ���¥:");
		}		
		System.out.println("------------------------");
		
		
		Scanner choice =  new Scanner(System.in);
		
		ReviewDao  review = new ReviewDao();
		
		System.out.println("-------------------------------------");
		System.out.println("1.������� 2.���伱��ȭ��   ");
		System.out.println("-------------------------------------");
		
		int userChoice = choice.nextInt();
			
		
		switch(userChoice){
		case 1 ://�������
		  if(userChoice == 1){
				 reviewDelet();
				System.out.println("���䰡 �����Ǿ����ϴ�.");
				ReviewDao.start();
				}
		        else if(userChoice == 2){	
				 
				System.out.println("���� ����ȭ������ ���ư��ϴ�.");
				 ReviewDao.start();
			 }
			break;
		case 2 ://���伱��ȭ��
			//�����ۼ��ϱ�� �Ѿ��
			break;
		}while(userChoice != 2);

		
	}

	// ���� ���信�� �� ���� �����ϴ°�
	
	Scanner sc = new Scanner(System.in);

	public void reviewDelet (){
		
		ReviewDao  review = new ReviewDao();
				
		for(int i = 0; i < Database.getInstance().tb_review.size(); i++){
			System.out.println((i+1) + ". ��ȭ���� : " + ReviewDao.selectReviewList().get(i).getReview_name()+
					"\t���� : "+ReviewDao.selectReviewList().get(i).getReview_grade()+"\t���� : "
					+ReviewDao.selectReviewList().get(i).getReview_content());
		}
		System.out.println("������ �����ȣ�� �������ּ���");
		int input = Integer.parseInt(sc.nextLine());
			
		System.out.println("�����Ͻðڽ��ϱ�? 1.��  2.�ƴϿ�");
			int input2 = Integer.parseInt(sc.nextLine());
			switch(input2){
			case 1 :
				ReviewDao.getInstance().deleteReview(input);
				ReviewDao.start();
				break;
			case 2 :
				break;
				
			}
				}
	
//	//���� ���信 �� ���� �����ϱ�
//	public void reviewModify(){
//		//���丮��Ʈ view �޼ҵ� ��������
//		for(int i = 0; i < Database.getInstance().tb_review.size();i++){
//			System.out.println((i+1)+"��ȭ����:"+userDao.selectReviewList().get(i).getMovie_name()+
//					"\t���� :"+userDao.selectReviewList().get(i).getReview_grade()+"\t����:"
//					+userDao.selectReviewList().get(i).getReview_content());
//		}
//		System.out.println("���� �� ���並 �������ּ���.");
//		 
//		 int reinput = Integer.parseInt(sc.nextLine());
//		 System.out.println("�����Ͻðڽ��ϱ�? 1.��  2.�ƴϿ�");
//		 int  reinput2 = Integer.parseInt(sc.nextLine());
//		 switch(reinput2){
//		 case 1 :
//			 //
//			 
//		 }
//	}
//	




	

}
