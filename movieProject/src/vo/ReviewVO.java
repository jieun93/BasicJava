package vo;

import java.util.Calendar;

public class ReviewVO {
   //���� : �����ȣ(PK), ȸ�����̵�, ����, ���� ����, ��¥, ��ȭ��ȣ(FK)
   
   private int reviewNum;  //�����ȣ
   private String userId;   //ȸ�����̵�(UserVO����)
   private String reviewGrade;  //����
   private String reviewContent;  //���䳻��
   private Calendar reviewDate;  //��¥
   private int movieNum;  //��ȭ��ȣ(MoviewVO����)
   
   
   public int getReviewNum() {
      return reviewNum;
   }
   public void setReviewNum(int reviewNum) {
      this.reviewNum = reviewNum;
   }
   public String getUserId() {
      return userId;
   }
   public void setUserId(String userId) {
      this.userId = userId;
   }
   public String getReviewGrade() {
      return reviewGrade;
   }
   public void setReviewGrade(String reviewGrade) {
      this.reviewGrade = reviewGrade;
   }
   public String getReviewContent() {
      return reviewContent;
   }
   public void setReviewContent(String reviewContent) {
      this.reviewContent = reviewContent;
   }
   public Calendar getReviewDate() {
      return reviewDate;
   }
   public void setReviewDate(Calendar reviewDate) {
      this.reviewDate = reviewDate;
   }
   public int getMovieNum() {
      return movieNum;
   }
   public void setMovieNum(int movieNum) {
      this.movieNum = movieNum;
   }
   
   
}