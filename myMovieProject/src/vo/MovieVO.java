package vo;


public class MovieVO {
	//��ȭ : ��ȭ��ȣ(PK), ��ȭ��, ��������, �⿬��, ����, �ٰŸ�
	String movie_number;  //��ȭ��ȣ
	String movie_name;  //��ȭ��
	String movie_rating;  //��������
//	String movie_cast;  //�⿬��
	String movie_director;  //����
//	String movie_story;  //�ٰŸ�
	
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
