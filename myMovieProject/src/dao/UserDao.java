package dao;


import java.util.ArrayList;

import vo.MovieVO;

import data.Database;

public class UserDao {
	private static UserDao instance;

	private UserDao() {
	}

	public static UserDao getInstance() {
		if (instance == null) {
			instance = new UserDao();
		}
		return instance;
	}

	Database database = Database.getInstance();

	public void insertMovie(MovieVO movie) {
		database.tb_movie.add(movie);// 영화추가
	}

	public ArrayList<MovieVO> selectMovieList() {
		return database.tb_movie;// 영화리스트
	}
	   




	

	

}






