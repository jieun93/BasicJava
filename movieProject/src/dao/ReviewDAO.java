package dao;

import java.util.ArrayList;

import vo.MovieVO;
import vo.ReviewVO;
import data.Database;

public class ReviewDAO {
	
	private static ReviewDAO instance;

	public ReviewDAO() {}

	public static ReviewDAO getInstance() {
		if (instance == null) {
			instance = new ReviewDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();
	
	ReviewVO reviewVO = new ReviewVO();
	
	 public  void insertReview(ReviewVO review){
		 database.tb_review.add(review);
		 //�����߰�
	 }
	 
	 public  ArrayList<ReviewVO> selectReviewList(){
		 return database.tb_review; //���丮��Ʈ �߰����� ���並 �����ִ°�
	 }
	 public void deleteReview(int review) {
		    database.tb_review.remove(review);
	  }
	 
	 public void deleteReview(ReviewVO review) {
		 database.tb_review.remove(review);
	 }

	 MovieDAO movieDAO = MovieDAO.getInstance();
	   public static ArrayList<MovieVO> ArrayReviewDB = new ArrayList<MovieVO>();
	   
	   public void selectMovieList(){
	      for(int i=0; i<movieDAO.selectMovieList().size(); i++){
	         ArrayReviewDB.add(movieDAO.selectMovieList().get(i));
	      }
	   }

	
}
