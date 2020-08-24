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
	//리뷰작성하기
	public void wright(){
			Scanner s = new Scanner(System.in);
			System.out.println("작성하실 영화를 선택해주세요.");
			System.out.println("------------------------------------");
//			System.out.println("1.겨울왕국2 \n2.해치지않아\n3.스타워즈\n4.나쁜녀석들");
			
			ReviewVO review = new ReviewVO();
			
			for(int i = 0; i < Database.getInstance().tb_movie.size(); i++){
				System.out.println(userDao.selectMovieList().get(i).getMovie_number()+ ". 영화제목 : " + userDao.selectMovieList().get(i).getMovie_name());
			}
			System.out.println("------------------------------");
			System.out.println("선택하실  번호 입력>");

			int input = Integer.parseInt(s.nextLine());
			movieName = userDao.selectMovieList().get(input-1).getMovie_name();
			review.setReview_name(movieName);
			moviewinter();
		
			
			
		}
	
  void moviewinter(){
		ReviewVO review = new ReviewVO(); //ReviewVO에 담을 review를 만들어줌
		
		Scanner sc = new Scanner(System.in);

		System.out.println("영화 "+"'"+ movieName+"'"+" 평점을 선택해주세요.");
		System.out.println("--------------------------------------------------------------");
		System.out.println("1. ★☆☆☆☆  2. ★★☆☆☆  3. ★★★☆☆  4. ★★★★☆   5.★★★★★ ");
		System.out.println("--------------------------------------------------------------");
		System.out.println("선택하실  번호 입력>");
		int sc1 = Integer.parseInt(sc.nextLine());
		switch (sc1) {
		case 1:
			String str="★☆☆☆☆ ";
			System.out.println("★☆☆☆☆ ");
			review.setReview_grade(str);//ReviewVO의 setReview에 담을거
			break;
		case 2:
			String str2="★★☆☆☆ ";
			System.out.println("★★☆☆☆");
			review.setReview_grade(str2);//ReviewVO의 setReview에 담을거
			break;
		case 3:
			String str3="★★★☆☆";
			System.out.println("★★★☆☆");
			review.setReview_grade(str3);//ReviewVO의 setReview에 담을거
			break;
		case 4:
			String str4="★★★★☆ ";
			System.out.println("★★★★☆");
			review.setReview_grade(str4);//ReviewVO의 setReview에 담을거
			break;
		case 5:
			String str5="★★★★★ ";
			System.out.println("★★★★★");
			review.setReview_grade(str5);//ReviewVO의 setReview에 담을거
			break;
		}
		
		Scanner wright = new Scanner(System.in);
			System.out.println("리뷰 내용을 작성해주세요.>");
			String userWright = wright.nextLine();
			System.out.println("내용:"+userWright);
			review.setReview_content(userWright);
			review.setReview_name(movieName);
			ReviewDao.insertReview(review);

			
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
			String  today = format.format(date);
		    review.setReview_date(today);
		    
  }

		
	//전체 리뷰보기
	public void view(){
		
		ArrayList<ReviewVO> userList=ReviewDao.selectReviewList();
		//출력
		System.out.println("------------------------");
//		System.out.println("작성자\t영화제목\t평점\t내용\t작성날짜");
		System.out.println("------------------------");
		for(int i = 0; i < Database.getInstance().tb_review.size(); i++){
			System.out.println((i+1) + ". 영화제목 : " + ReviewDao.selectReviewList().get(i).getReview_name()+
					"\t평점 : "+ReviewDao.selectReviewList().get(i).getReview_grade()+"\t내용 : "
					+ReviewDao.selectReviewList().get(i).getReview_content()+"\t작성자:"+"\t작성날짜:");
		}
		
		System.out.println("------------------------");
		
		
		
		//리뷰리스트가 보여지고 다음 선택
      
		Scanner choice =  new Scanner(System.in);
		
		System.out.println("------------------------------------");
		System.out.println("1.리뷰 메인 화면 ");
		System.out.println("-------------------------------------");
		
		int userChoice = choice.nextInt();
		
		
		
	}
	
//	my review 선택 후  내가 본 영화리스트 보여지고 ->삭제 할건지 리뷰메인화면으로 갈건지 선택
	
	public void MyReview(){
		
		ArrayList<ReviewVO> userList=ReviewDao.selectReviewList();
		//출력
		System.out.println("------------------------");
		System.out.println("작성자\t영화제목\t평점\t내용\t작성날짜");
		System.out.println("------------------------");
		for(int i = 0; i < Database.getInstance().tb_review.size(); i++){
			System.out.println((i+1) + ". 영화제목 : " + ReviewDao.selectReviewList().get(i).getReview_name()+
					"\t평점 : "+ReviewDao.selectReviewList().get(i).getReview_grade()+"\t내용 : "
					+ReviewDao.selectReviewList().get(i).getReview_content()+"\t작성날짜:");
		}		
		System.out.println("------------------------");
		
		
		Scanner choice =  new Scanner(System.in);
		
		ReviewDao  review = new ReviewDao();
		
		System.out.println("-------------------------------------");
		System.out.println("1.리뷰삭제 2.리뷰선택화면   ");
		System.out.println("-------------------------------------");
		
		int userChoice = choice.nextInt();
			
		
		switch(userChoice){
		case 1 ://리뷰삭제
		  if(userChoice == 1){
				 reviewDelet();
				System.out.println("리뷰가 삭제되었습니다.");
				ReviewDao.start();
				}
		        else if(userChoice == 2){	
				 
				System.out.println("리뷰 메인화면으로 돌아갑니다.");
				 ReviewDao.start();
			 }
			break;
		case 2 ://리뷰선택화면
			//리뷰작성하기로 넘어가기
			break;
		}while(userChoice != 2);

		
	}

	// 마이 리뷰에서 내 리뷰 삭제하는거
	
	Scanner sc = new Scanner(System.in);

	public void reviewDelet (){
		
		ReviewDao  review = new ReviewDao();
				
		for(int i = 0; i < Database.getInstance().tb_review.size(); i++){
			System.out.println((i+1) + ". 영화제목 : " + ReviewDao.selectReviewList().get(i).getReview_name()+
					"\t평점 : "+ReviewDao.selectReviewList().get(i).getReview_grade()+"\t내용 : "
					+ReviewDao.selectReviewList().get(i).getReview_content());
		}
		System.out.println("삭제할 리뷰번호를 선택해주세요");
		int input = Integer.parseInt(sc.nextLine());
			
		System.out.println("삭제하시겠습니까? 1.예  2.아니오");
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
	
//	//마이 리뷰에 내 리뷰 수정하기
//	public void reviewModify(){
//		//리뷰리스트 view 메소드 가져오기
//		for(int i = 0; i < Database.getInstance().tb_review.size();i++){
//			System.out.println((i+1)+"영화제목:"+userDao.selectReviewList().get(i).getMovie_name()+
//					"\t평점 :"+userDao.selectReviewList().get(i).getReview_grade()+"\t내용:"
//					+userDao.selectReviewList().get(i).getReview_content());
//		}
//		System.out.println("수정 할 리뷰를 선택해주세요.");
//		 
//		 int reinput = Integer.parseInt(sc.nextLine());
//		 System.out.println("수정하시겠습니까? 1.예  2.아니오");
//		 int  reinput2 = Integer.parseInt(sc.nextLine());
//		 switch(reinput2){
//		 case 1 :
//			 //
//			 
//		 }
//	}
//	




	

}
