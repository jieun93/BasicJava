package vo;

import java.util.Calendar;

public class MovieVO {
	//��ȭ : ��ȭ��ȣ(PK), ��ȭ��, ��������, �⿬��, ����, �ٰŸ�, ����Ÿ��
	
	private int movieNum;  //��ȭ��ȣ
	private String movieName;  //��ȭ��
	private String movieRating;  //��������
	private String movieCast;  //�⿬��
	private String movieDirector;  //����
	private String movieStory;  //�ٰŸ�
	private Calendar runTime;   //����Ÿ��
	private boolean state;  //true:����  false:����
	
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getMovieNum() {
		return movieNum;
	}
	public void setMovieNum(int movieNum) {
		this.movieNum = movieNum;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}
	public String getMovieCast() {
		return movieCast;
	}
	public void setMovieCast(String movieCast) {
		this.movieCast = movieCast;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getMovieStory() {
		return movieStory;
	}
	public void setMovieStory(String movieStory) {
		this.movieStory = movieStory;
	}
	public Calendar getRunTime() {
		return runTime;
	}
	public void setRunTime(Calendar runTime) {
		this.runTime = runTime;
	}
	
	
}
