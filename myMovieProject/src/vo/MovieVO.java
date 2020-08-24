package vo;


public class MovieVO {
	//영화 : 영화번호(PK), 영화명, 관람연령, 출연진, 감독, 줄거리
	String movie_number;  //영화번호
	String movie_name;  //영화명
	String movie_rating;  //관람연령
//	String movie_cast;  //출연진
	String movie_director;  //감독
//	String movie_story;  //줄거리
	
	public String getMovie_number() {
		return movie_number;
	}
	public void setMovie_number(String movie_number) {
		this.movie_number = movie_number;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMovie_rating() {
		return movie_rating;
	}
	public void setMovie_rating(String movie_rating) {
		this.movie_rating = movie_rating;
	}
//	public String getMovie_cast() {
//		return movie_cast;
//	}
//	public void setMovie_cast(String movie_cast) {
//		this.movie_cast = movie_cast;
//	}
	public String getMovie_director() {
		return movie_director;
	}
	public void setMovie_director(String movie_director) {
		this.movie_director = movie_director;
	}
//	public String getMovie_story() {
//		return movie_story;
//	}
//	public void setMovie_story(String movie_story) {
//		this.movie_story = movie_story;
//	}
	
	
}
