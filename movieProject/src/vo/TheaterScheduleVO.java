package vo;

import java.util.Calendar;

public class TheaterScheduleVO {
	//�󿵽ð�ǥ : �󿵽ð�ǥ��ȣ(PK), ��ȭ��ȣ(FK), �󿵰���ȣ(FK), �󿵽��۽ð�
	
	private int scheduleNum;  //�󿵽ð�ǥ��ȣ
	private int movieNum;  //��ȭ��ȣ(MovieVO����)
	private int theaterNum;  //�󿵰���ȣ(TheaterVO����)
	private Calendar movieStartTime;  //�󿵽��۽ð�
	
	public int getScheduleNum() {
		return scheduleNum;
	}
	public void setScheduleNum(int scheduleNum) {
		this.scheduleNum = scheduleNum;
	}
	public int getMovieNum() {
		return movieNum;
	}
	public void setMovieNum(int movieNum) {
		this.movieNum = movieNum;
	}
	public int getTheaterNum() {
		return theaterNum;
	}
	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}
	public Calendar getMovieStartTime() {
		return movieStartTime;
	}
	public void setMovieStartTime(Calendar movieStartTime) {
		this.movieStartTime = movieStartTime;
	}
	
	
}
