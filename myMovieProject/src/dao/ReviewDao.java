package dao;


import java.util.ArrayList;

import vo.ReviewVO;
import data.Database;


public class ReviewDao{
	private static ReviewDao instance;

	public ReviewDao(){}
	
	public static ReviewDao getInstance() {
		if(instance == null){
			instance = new ReviewDao();
		}
		return instance;
	}

 Database database = Database.getInstance();
 
 //유저서비스에서 데이터 베이스 중간다리 
	 public void insertReview1(ReviewVO review){
		 database.tb_review.add(review);
		 //리뷰추가
	 }
	 
	 public ArrayList<ReviewVO> selectReviewList1(){
		 return database.tb_review; //리뷰리스트
	 }

	public static void insertReview(ReviewVO review) {
	}

	public static void start() {
		// TODO Auto-generated method stub
		
	}
	public static ArrayList<ReviewVO> selectReviewList() {
		// TODO Auto-generated method stub
		return null;
	}
	public void deleteReview(int review) {
	    database.tb_review.remove(review);
	   	   //리뷰 삭제   
   }
}