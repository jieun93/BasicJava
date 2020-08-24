package dao;

import java.util.ArrayList;

import vo.TheaterScheduleVO;
import data.Database;

public class TheaterScheduleDAO {
	private static TheaterScheduleDAO instance;

	private TheaterScheduleDAO() {}

	public static TheaterScheduleDAO getInstance() {
		if (instance == null) {
			instance = new TheaterScheduleDAO();
		}
		return instance;
	}

	Database database = Database.getInstance();

	// �󿵽ð�ǥ ��ȣ �����ؼ� �������� ������ �� ������ �󿵽ð�ǥVO ����
	public TheaterScheduleVO selectTheaterSchedule(int TheaterScheduleNum) {
		for (int i = 0; i < database.tb_theaterSchedule.size(); i++) {
			TheaterScheduleVO theaterSchedule = database.tb_theaterSchedule.get(i);
			if (theaterSchedule.getScheduleNum() == TheaterScheduleNum) {
				return theaterSchedule;
			}
		}
		return null;
	}
	
	public void insertTheaterSchedule(TheaterScheduleVO theaterSchedule) {
		database.tb_theaterSchedule.add(theaterSchedule);
	}
	public ArrayList<TheaterScheduleVO> selectTheaterScheduleList(){
		return database.tb_theaterSchedule;
	}
	public void deleteTheaterSchedule(int theaterSchedule) {
		database.tb_theater.remove(theaterSchedule);
	}
}
