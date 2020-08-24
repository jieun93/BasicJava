package dao;

import java.util.ArrayList;

import data.Database;
import vo.MovieVO;

public class MovieDAO {
	
	private static MovieDAO instance;

	private MovieDAO() {}

	public static MovieDAO getInstance() {
		if (instance == null) {
			instance = new MovieDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();
	
	
	public void insertMovie(MovieVO movie) {
		database.tb_movie.add(movie);
	}
	
	public ArrayList<MovieVO> selectMovieList(){
		return database.tb_movie;
	}
	
	// 영화번호 대조해서 공통으로 나오는 것 있으면 영화vo 리턴
	public MovieVO selectMovie(int MovieNum) {
		for (int i = 0; i < database.tb_movie.size(); i++) {
			MovieVO movie = database.tb_movie.get(i);
			if (movie.getMovieNum() == MovieNum) {
				return movie;
			}
		}
		return null;
	}

	public ArrayList<MovieVO> selectMovieList(boolean state) {
		ArrayList<MovieVO> list = new ArrayList<MovieVO>();
		for (int i = 0; i < database.tb_movie.size(); i++) {
			if (database.tb_movie.get(i).isState() == state) {
				list.add(database.tb_movie.get(i));
			}
		}
		return list;
	}

	
	public void deleteMovie(int movie) {
		database.tb_movie.remove(movie);
	}
}





