package data;


import java.util.ArrayList;

import vo.MovieVO;
import vo.ReviewVO;

public class Database {
	
	
private static Database instance;
	
	private Database(){}
	
	public static Database getInstance() {
		if(instance == null){
			instance = new Database();
		}
		return instance;

	}
	
	public ArrayList <ReviewVO> tb_review = new ArrayList<>();
	
	{
		
		//리뷰리스트 영화별로 하나씩 만들기
		
		ReviewVO review = new ReviewVO();
		review.setReview_name("겨울왕국2 ");
		review.setReview_grade("★★☆☆☆");
		review.setReview_content("유치해요");
		tb_review.add(review);
		
		review = new ReviewVO();
		review.setReview_name("해치지 않아");
		review.setReview_grade("★★★☆☆");
		review.setReview_content("재밌어요");
		tb_review.add(review);
		
		review = new ReviewVO();
		review.setReview_name("스타워즈");
		review.setReview_grade("★★★★★");
		review.setReview_content("짱 재밌어요");
		tb_review.add(review);
		
		review = new ReviewVO();
		review.setReview_name("나쁜녀석들");
		review.setReview_grade("★★★☆☆");
		review.setReview_content("흥미진진 재밌어요 짱!");
		tb_review.add(review);
	}
	
	public ArrayList<MovieVO> tb_movie = new ArrayList<>();
	{
		MovieVO movie = new MovieVO();
		movie.setMovie_number("1");
		movie.setMovie_name("겨울왕국2");
		movie.setMovie_rating("전체 관람가");
//		movie.setMovie_cast("크리스틴 벨, 이디나 멘젤, 조시 게드");
		movie.setMovie_director("크리스 벅, 제니퍼 리");
//		movie.setMovie_story("위험에 빠진 아렌델 왕국을 구해야만 하는 엘사와 안나는 숨겨진 과거의 진실을 찾아\r\n" + 
//				" 크리스토프, 올라프 그리고 스벤과 함께 위험천만한 놀라운 모험을 떠나게 된다.");
		tb_movie.add(movie);
		
		movie = new MovieVO();
		movie.setMovie_number("2");
		movie.setMovie_name("해치지않아");
		movie.setMovie_rating("전체 관람가");
//		movie.setMovie_cast("크리스틴 벨, 이디나 멘젤, 조시 게드");
		movie.setMovie_director("크리스 벅, 제니퍼 리");
//		movie.setMovie_story("위험에 빠진 아렌델 왕국을 구해야만 하는 엘사와 안나는 숨겨진 과거의 진실을 찾아\r\n" + 
//				" 크리스토프, 올라프 그리고 스벤과 함께 위험천만한 놀라운 모험을 떠나게 된다.");
		tb_movie.add(movie);
		movie = new MovieVO();
		movie.setMovie_number("3");
		movie.setMovie_name("스타워즈");
		movie.setMovie_rating("전체 관람가");
//		movie.setMovie_cast("크리스틴 벨, 이디나 멘젤, 조시 게드");
		movie.setMovie_director("크리스 벅, 제니퍼 리");
//		movie.setMovie_story("위험에 빠진 아렌델 왕국을 구해야만 하는 엘사와 안나는 숨겨진 과거의 진실을 찾아\r\n" + 
//				" 크리스토프, 올라프 그리고 스벤과 함께 위험천만한 놀라운 모험을 떠나게 된다.");
		tb_movie.add(movie);
		
		movie = new MovieVO();
		movie.setMovie_number("4");
		movie.setMovie_name("나쁜녀석들");
		movie.setMovie_rating("전체 관람가");
//		movie.setMovie_cast("크리스틴 벨, 이디나 멘젤, 조시 게드");
		movie.setMovie_director("크리스 벅, 제니퍼 리");
//		movie.setMovie_story("위험에 빠진 아렌델 왕국을 구해야만 하는 엘사와 안나는 숨겨진 과거의 진실을 찾아\r\n" + 
//				" 크리스토프, 올라프 그리고 스벤과 함께 위험천만한 놀라운 모험을 떠나게 된다.");
		tb_movie.add(movie);
		
	}
	
}
