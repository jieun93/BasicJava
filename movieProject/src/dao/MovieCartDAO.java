package dao;

import java.util.ArrayList;

import vo.MovieCartVO;
import data.Database;

public class MovieCartDAO {
	

	private static MovieCartDAO instance;
	private MovieCartDAO() {}

	public static MovieCartDAO getInstance() {
		if (instance == null) {
			instance = new MovieCartDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();
	
	//ȸ������ �� ���� ���� ���
	public void insertMovieCart(MovieCartVO MovieCart) {
		database.tb_movieCart.add(MovieCart);
	}

	public ArrayList<MovieCartVO> selectMovieCartList() {		
		return database.tb_movieCart;
	}
	
	//ȸ������
	public void deleteMovieCart(int MovieCart){
		database.tb_movieCart.remove(MovieCart);
	}

}
