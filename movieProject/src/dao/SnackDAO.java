package dao;

import java.util.ArrayList;

import data.Database;
import vo.SnackVO;

public class SnackDAO {
	
	private static SnackDAO instance;

	private SnackDAO() {}

	public static SnackDAO getInstance() {
		if (instance == null) {
			instance = new SnackDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();
	
	public void insertSnack(SnackVO snack) {
		database.tb_snack.add(snack);
	}
	public ArrayList<SnackVO> selectSnackList(){
		return database.tb_snack;
	}
	public void deleteSnack(int snack) {
		database.tb_snack.remove(snack);
	}
	
	public SnackVO searchSnackNoInfo(int snackNum){
		for(int i = 0 ; i < database.tb_snack.size();i++){
			if(database.tb_snack.get(i).getSnackNum()== snackNum){
				return database.tb_snack.get(i);
			}
		}
		return null;
	}
	
}
