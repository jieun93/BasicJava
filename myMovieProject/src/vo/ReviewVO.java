package vo;


public class ReviewVO {
   //리뷰 : 리뷰번호(PK), 회원아이디(FK), 평점, 리뷰 내용, 날짜, 영화이름(FK)
   
   private int review_number;
   private String user_id;   //회원아이디 
   private String review_grade;
   private String review_content;
   private String review_date;
   private String review_name;  //영화이름
   
   public int getReview_number() {
      return review_number;
   }
   public void setReview_number(int review_number) {
      this.review_number = review_number;
   }
   public String getUser_id() {
      return user_id;
   }
   public void setUser_id(String user_id) {
      this.user_id = user_id;
   }
   public String getReview_grade() {
      return review_grade;
   }
   public void setReview_grade(String review_grade) {
      this.review_grade = review_grade;
   }
   public String getReview_content() {
      return review_content;
   }
   public void setReview_content(String review_content) {
      this.review_content = review_content;
   }
   public String getReview_date() {
      return review_date;
   }
   public void setReview_date(String review_date) {
      this.review_date = review_date;
   }
   public String getReview_name() {
	return review_name;
   }
   public void setReview_name(String review_name) {
	this.review_name = review_name;
   }
 


	
}