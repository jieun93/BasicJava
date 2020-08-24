package data;

import java.util.ArrayList;
import java.util.Calendar;

import vo.MovieCartVO;
import vo.MovieVO;
import vo.PaymentVO;
import vo.ReviewVO;
import vo.SnackCartVO;
import vo.SnackCategoryVO;
import vo.SnackVO;
import vo.TheaterScheduleVO;
import vo.TheaterVO;
import vo.UserVO;

public class Database {

	private static Database instance;

	private Database() {}

	public static Database getInstance() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}

	public ArrayList<UserVO> tb_user = new ArrayList<>();
	{
		UserVO user = new UserVO();
		user.setUserId("admin");
		user.setUserPwd("admin");
		user.setUserName("������");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("951007");
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("hyojin");
		user.setUserPwd("4321");
		user.setUserName("ȿ��");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("951007");
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("woogyung");
		user.setUserPwd("4321");
		user.setUserName("���");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("950807");
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("jieun");
		user.setUserPwd("4321");
		user.setUserName("����");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("930329");
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("hyeokjin");
		user.setUserPwd("4321");
		user.setUserName("����");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("030102");  //18��
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("kiwan");
		user.setUserPwd("4321");
		user.setUserName("���");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("941215");
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("jongwan");
		user.setUserPwd("4321");
		user.setUserName("�ʻ＼");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("080231");  //13��
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("meja");
		user.setUserPwd("4567");
		user.setUserName("����");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("110101");  //10��
		tb_user.add(user);
	}

	public ArrayList<SnackVO> tb_snack = new ArrayList<>();
	{
		SnackVO snack = new SnackVO();
		// ����--------------------------------------------
		snack = new SnackVO();
		snack.setSnackNum(0);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("���ִ�����(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);
		
		snack = new SnackVO();
		snack.setSnackNum(1);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("�������(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(2);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("�������(L)");
		snack.setSnackPrice(6000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(3);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("��������(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(4);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("��������(L)");
		snack.setSnackPrice(6000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(5);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("������Ͼ�����(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(6);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("������Ͼ�����(L)");
		snack.setSnackPrice(6000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(7);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("����ġ������(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(8);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("����ġ������(L)");
		snack.setSnackPrice(6000);
		tb_snack.add(snack);

		// ����---------------------------------------------
		snack = new SnackVO();
		snack.setSnackNum(9);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("�ݶ�(M)");
		snack.setSnackPrice(2200);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(10);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("�ݶ�(L)");
		snack.setSnackPrice(2700);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(11);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("���̴�(M)");
		snack.setSnackPrice(2200);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(12);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("���̴�(L)");
		snack.setSnackPrice(2700);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(13);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("ȯŸ������(M)");
		snack.setSnackPrice(2200);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(14);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("ȯŸ������(L)");
		snack.setSnackPrice(2700);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(15);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("�����̵�(M)");
		snack.setSnackPrice(3500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(16);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("�����̵�(L)");
		snack.setSnackPrice(4500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(17);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("������ ���̽�Ƽ(M)");
		snack.setSnackPrice(3500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(18);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("������ ���̽�Ƽ(L)");
		snack.setSnackPrice(4500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(19);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("�Ƹ޸�ī��(M)");
		snack.setSnackPrice(3500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(20);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("�Ƹ޸�ī��(L)");
		snack.setSnackPrice(4000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(21);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("ī��");
		snack.setSnackPrice(4000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(22);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("����");
		snack.setSnackPrice(1500);
		tb_snack.add(snack);

		// ������-------------------------------------------
		snack = new SnackVO();
		snack.setSnackNum(23);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("����");
		snack.setSnackPrice(4500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(24);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("�Ｎ���̿�¡��");
		snack.setSnackPrice(5000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(25);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("ġ�");
		snack.setSnackPrice(4500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(26);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("�ֵ���");
		snack.setSnackPrice(4000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(27);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("����");
		snack.setSnackPrice(3500);
		tb_snack.add(snack);

		// ��Ʈ�޴�--------------------------------------
		snack = new SnackVO();
		snack.setSnackNum(28);
		snack.setSnackCategoryNum(3);
		snack.setSnackName("���޺�A��\t   �������(L) 1 + ź������(M) 2");
		snack.setSnackPrice(8900);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(29);
		snack.setSnackCategoryNum(3);
		snack.setSnackName("���޺�B��\t   ����/������Ͼ�/����ġ��(L) 1 + ź������(M) 2");
		snack.setSnackPrice(9900);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(30);
		snack.setSnackCategoryNum(3);
		snack.setSnackName("���޺�C��\t   ĥ��ġ��� 1 + �������(L) 1 + ź������(M) 2");
		snack.setSnackPrice(11900);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(31);
		snack.setSnackCategoryNum(3);
		snack.setSnackName("�ڽ�Ÿ���Ʈ��    �������(L) 1 + ź������(M) 2 + ������ + Ű��");
		snack.setSnackPrice(16000);
		tb_snack.add(snack);
		// -------------------------------------

	}

	   
	public ArrayList<SnackCategoryVO> tb_snackCategory = new ArrayList<>();
    {   
       SnackCategoryVO snackCategory = new SnackCategoryVO();
       snackCategory.setSnackCategoryNum(0);
       snackCategory.setSnackCategoryName("����");
       tb_snackCategory.add(snackCategory);
       
       snackCategory = new SnackCategoryVO();
       snackCategory.setSnackCategoryNum(1);
       snackCategory.setSnackCategoryName("����");
       tb_snackCategory.add(snackCategory);
       
       snackCategory = new SnackCategoryVO();
       snackCategory.setSnackCategoryNum(2);
       snackCategory.setSnackCategoryName("����");
       tb_snackCategory.add(snackCategory);
       
       snackCategory = new SnackCategoryVO();
       snackCategory.setSnackCategoryNum(3);
       snackCategory.setSnackCategoryName("��Ʈ");
       tb_snackCategory.add(snackCategory);
       
    }

	public ArrayList<MovieVO> tb_movie = new ArrayList<>();
	{

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 43);
		MovieVO movie = new MovieVO();
		movie.setMovieNum(0); // ��ȭ��ȣ
		movie.setMovieName("�ܿ�ձ�2"); // ��ȭ��
		movie.setMovieRating("��ü ������"); // ��������
		movie.setMovieCast("ũ����ƾ ��, �̵� ����, ���� �Ե�"); // �⿬��
		movie.setMovieDirector("ũ���� ��, ������ ��"); // ����
		movie.setMovieStory("���迡 ���� �Ʒ��� �ձ��� ���ؾ߸� �ϴ� ����� �ȳ��� ������ ������ ������ ã��\r\n"
				+ " ũ��������, �ö��� �׸��� ������ �Բ� ����õ���� ���� ������ ������ �ȴ�."); // �ٰŸ�
		movie.setRunTime(cal); // ��ȭ��Ÿ�ӽð� //1�ð� 43��
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 57);
		movie = new MovieVO();
		movie.setMovieNum(1);
		movie.setMovieName("��ġ���ʾ�");
		movie.setMovieRating("12��");
		movie.setMovieCast("����ȫ, ���Ҷ�, �ڿ���");
		movie.setMovieDirector("�����");
		movie.setMovieStory("������ ���� ��ȣ�� ���¼������� ã�ƿ� �ϻ��ϴ��� ��ȸ, ������ ������ ��������ũ���� ���϶�!\r\n"
				+ " �̷� ������ ó�� ��? ���� ���� �༮���� ������ ������ ���۵ȴ�!");
		movie.setRunTime(cal); // "1�ð� 57��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 2);
		cal.set(Calendar.MINUTE, 32);
		movie = new MovieVO();
		movie.setMovieNum(2);
		movie.setMovieName("��Ÿ����");
		movie.setMovieRating("12��");
		movie.setMovieCast("������ ���鸮 , ��ũ �ع�, �ƴ� ����̹�, ����ī ���̻�");
		movie.setMovieDirector("���̾� ����");
		movie.setMovieStory("���� ���� ����, �Ŵ��� ����� �����ȴ�!\r\n"
				+ " ���� ���̰� ���� ����� �� ���ΰ�? ����, ���� ���� ����� �� �Ŵ��� ������ ���۵ȴ�!");
		movie.setRunTime(cal); // "2�ð� 32��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 2);
		cal.set(Calendar.MINUTE, 4);
		movie = new MovieVO();
		movie.setMovieNum(3);
		movie.setMovieName("���۳༮��");
		movie.setMovieRating("û�ҳ� �����Ұ�");
		movie.setMovieCast("�� ���̽�, ��ƾ �η���");
		movie.setMovieDirector("�Ƶ� �� �Ƹ���, ���� �ȶ�");
		movie.setMovieStory("������ŭ �߿��� ����ũ�� ���� ��Ŀ���� �շ��ϰ�, �츮�� ������ �༮�顯�� \r\n+"
				+ "�Ž� ����� ����� ������ ��Ű�� AMMO�� �Բ� ���� ���� �ϻ��ϴ� ������ �̼��� �����ϰ� �Ǵµ�");
		movie.setRunTime(cal); // "2�ð� 4��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 2);
		cal.set(Calendar.MINUTE, 15);
		movie = new MovieVO();
		movie.setMovieNum(4);
		movie.setMovieName("�����ƾ���");
		movie.setMovieRating("��ü ������");
		movie.setMovieCast("�ÿ��� �γ�, �����ӽ�, �÷η��� ǻ, Ƽ��� �����, ������ ��ĳ��");
		movie.setMovieDirector("ũ��Ÿ ����");
		movie.setMovieStory("���� �ܿ�, ��������� �ڸŵ��� ������\r\n"
				+ "7�� ��, ��� �� �׵鿡�� ���� �ٸ� ������ ���̰� �Ǵµ��� ");
		movie.setRunTime(cal); // "2�ð� 15��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 13);
		movie = new MovieVO();
		movie.setMovieNum(5);
		movie.setMovieName("������ �̴�Ư����: ����� ���");
		movie.setMovieRating("��ü ������");
		movie.setMovieCast("�ſ��, ������, �̼ҿ�, ���¿�, ����ȭ, ������");
		movie.setMovieDirector("�̿���");
		movie.setMovieStory("ȣ��� ���� �ҳ� '��'�� ����� ����� '���'�� ���� ���ģ���� �ȴ�.\r\n"
				+ " �׷��� �� ���־Ǵ� '��'�� ������ �����ϰ� �̿� '�̴�Ư����'�� ����� '���'�� �Բ� ����� ����� ��ġ�µ�..!");
		movie.setRunTime(cal); // "1�ð� 13��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 42);
		movie = new MovieVO();
		movie.setMovieNum(6);
		movie.setMovieName("������ ���Ͼ");
		movie.setMovieRating("��ü ������");
		movie.setMovieCast("�� ���̽�, �� Ȧ����, ��ô� ���� ,DJ Į����");
		movie.setMovieDirector("�� ����, Ʈ���� ��");
		movie.setMovieStory("�߳����� ���� ������!������ ���� ���Ͼ�� ���� �Ѽ����� ������ �ƴ�!?\r\n"
				+ "  ���� �� & ���� ��, ������ ���ʿ� ���� ���÷��̰� ���۵ȴ�!");
		movie.setRunTime(cal); // "1�ð� 42��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 2);
		cal.set(Calendar.MINUTE, 27);
		movie = new MovieVO();
		movie.setMovieNum(7);
		movie.setMovieName("�μ���");
		movie.setMovieRating("12�� ������");
		movie.setMovieCast("���������� ��ī������, ��Ÿ���� ��, ���� ��� ����");
		movie.setMovieDirector("ũ�������� ���");
		movie.setMovieStory("�� VS ����   �ð�, ��Ģ, Ÿ�̹� ��� ���� �Ϻ��ؾ߸� �ϴ�,\r\n"
				+ "�� �� ���� ������ �� ���� ���μ��ǡ� ������ ���۵ȴ�!");
		movie.setRunTime(cal); // "2�ð� 27��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 44);
		movie = new MovieVO();
		movie.setMovieNum(8);
		movie.setMovieName("������ �ĺ�");
		movie.setMovieRating("12�� ������");
		movie.setMovieCast("��̶�, �蹫��, ������, ����ȣ");
		movie.setMovieDirector("������");
		movie.setMovieStory("�������� ������, ���ú��� ������ �ĺ�?!\r\n"
				+ " ���� ��! ���� ��! �ո��� ������ ���� ������ ���۵ȴ�!");
		movie.setRunTime(cal); // "1�ð� 44��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 53);
		movie = new MovieVO();
		movie.setMovieNum(9);
		movie.setMovieName("�̽��� ��: ����� VIP");
		movie.setMovieRating("12�� ������");
		movie.setMovieCast("�̼���, �輭��, ������, ���ϱ�");
		movie.setMovieDirector("������");
		movie.setMovieStory("������ ���� �鸮�� ����,������ ��Ʈ�ʰ� �ٲ��!\r\n"
				+ " ���� �Ѻ���, ����� VIP�� ã�� ���� �ΰ��� �������� ����� ���÷��̰� ���۵ȴ�!"
				+ " ���� ��! ���� ��! �ո��� ������ ���� ������ ���۵ȴ�!");
		movie.setRunTime(cal); // "1�ð� 53��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 54);
		movie = new MovieVO();
		movie.setMovieNum(10);
		movie.setMovieName("������ �����");
		movie.setMovieRating("15�� ������");
		movie.setMovieCast("�̺���, �̼���, ������, ������, �����");
		movie.setMovieDirector("���ȣ");
		movie.setMovieStory("������, ���� ��� �ϱ� ���Ͻʴϱ\r\n"
				+ " 1979�� 10�� 26��, �߾��������� �����(�̺���)�� ���ѹα� ������� �ϻ��Ѵ�.");
		movie.setRunTime(cal); // "1�ð� 54��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 50);
		movie = new MovieVO();
		movie.setMovieNum(11);
		movie.setMovieName("��Ʈ��");
		movie.setMovieRating("15�� ������");
		movie.setMovieCast("�ǻ��, ����ȣ, Ȳ�콽��, ���̰�, ������");
		movie.setMovieDirector("�ֿ���");
		movie.setMovieStory(" ���� �۰��� �� ������ �ϻ���, ���� ��Ʈ ������ �����!");
		movie.setRunTime(cal); // "1�ð� 50��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 38);
		movie = new MovieVO();
		movie.setMovieNum(12);
		movie.setMovieName("����Ʈ ����");
		movie.setMovieRating("15�� ������");
		movie.setMovieCast("� ī��, �˷����� �ٵ�ٸ���");
		movie.setMovieDirector("���̺�� ���̸��");
		movie.setMovieStory("���� ���� ��, �ܼ��� �������!\r\n"
				+ " �־��� �������н��� �Ϻ��� ����, �׸��� ������ ������ ����϶�!");
		movie.setRunTime(cal); // "1�ð� 38��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 2);
		cal.set(Calendar.MINUTE, 41);
		movie = new MovieVO();
		movie.setMovieNum(13);
		movie.setMovieName(" ���� ���� �� Ÿ��... �� �Ҹ����");
		movie.setMovieRating("û�ҳ� �����Ұ�");
		movie.setMovieCast("���������� ��ī������, �귡�� ��Ʈ, ���� �κ�");
		movie.setMovieDirector("��ƾ Ÿ��Ƽ��");
		movie.setMovieStory("����� �� �̻� �Բ� ���� �� ���� �� �������� ��Ŭ�������� ������ ���� ����� �ϰ�\r\n"
				+ " �������� ������ ���� �ų��ϰ� ���ô� �� ������ ���� ���� �湮���� �����ϰ� �Ǵµ���");
		movie.setRunTime(cal); // "2�ð� 41��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 53);
		movie = new MovieVO();
		movie.setMovieNum(14);
		movie.setMovieName("���� �� �۷θ�");
		movie.setMovieRating("û�ҳ� �����Ұ�");
		movie.setMovieCast("��ڷ��� ũ����, ����Ͽ� �ݵ���");
		movie.setMovieDirector("���� �˸𵵹ٸ�");
		movie.setMovieStory("����ȭ�� �� ��´ٸ� �� �λ��� �ǹ̰� ���\r\n"
				+ " �����ߴ� ù���, �����ߴ� ���, ���ο��� �̺�, ���� ������ ������ ���踦 �鿩�ٺ���!");
		movie.setRunTime(cal); // "1�ð� 53��"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 3);
		cal.set(Calendar.MINUTE, 00);
		movie = new MovieVO();
		movie.setMovieNum(15);
		movie.setMovieName("���� ������ ��, ���");
		movie.setMovieRating("û�ҳ� �����Ұ�");
		movie.setMovieCast("�Ƶ� �����ڸ���Ǯ�ν�, ���� ���̵�, ���� ��ġ��ü");
		movie.setMovieDirector("�е���Ƽ�� �ɽý�");
		movie.setMovieStory("15�� �ҳ� ���Ƶ���, �Ķ� �Ӹ��� �ź�ο� �ҳ� ���������� ������!\r\n"
				+ " ���Ƶ����� �ڽŰ� ���� �ٸ� ���� ��ƿ� ���������� ���� �������� ������ �߰ſ� ������ ������ �ǰ�,����ϱ⸸ �ߴ� ���Ƶ����� ���� ����鸮�� �����Ѵ�.");
		movie.setRunTime(cal); // "3�ð�"
		movie.setState(true);
		tb_movie.add(movie);

	}

    public ArrayList<TheaterScheduleVO> tb_theaterSchedule = new ArrayList<>();
    {
    	Calendar cal = Calendar.getInstance();
        TheaterScheduleVO ts = new TheaterScheduleVO();

        // 2/9 �ð�ǥ----------------------------------

        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(0); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(0); // ��ȭ��ȣ(MovieVO����) //�ܿ�ձ�
        ts.setTheaterNum(0); // �󿵰���ȣ(TheaterVO����) //2D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(1); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(0); // ��ȭ��ȣ(MovieVO����) //�ܿ�ձ�
        ts.setTheaterNum(1); // �󿵰���ȣ(TheaterVO����) //4D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(2); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(0); // ��ȭ��ȣ(MovieVO����) //�ܿ�ձ�
        ts.setTheaterNum(2); // �󿵰���ȣ(TheaterVO����) //���̸ƽ�
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(3); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(1); // ��ȭ��ȣ(MovieVO����) //��ġ���ʾ�
        ts.setTheaterNum(1); // �󿵰���ȣ(TheaterVO����) //4D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(4); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(1); // ��ȭ��ȣ(MovieVO����) //��ġ���ʾ�
        ts.setTheaterNum(2); // �󿵰���ȣ(TheaterVO����) //���̸ƽ�
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(5); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(1); // ��ȭ��ȣ(MovieVO����) //��ġ���ʾ�
        ts.setTheaterNum(0); // �󿵰���ȣ(TheaterVO����) //2D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(6); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(2); // ��ȭ��ȣ(MovieVO����) //��Ÿ����
        ts.setTheaterNum(2); // �󿵰���ȣ(TheaterVO����) //���̸ƽ�
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(7); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(2); // ��ȭ��ȣ(MovieVO����) //��Ÿ����
        ts.setTheaterNum(1); // �󿵰���ȣ(TheaterVO����) //4D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(8); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(3); // ��ȭ��ȣ(MovieVO����) //���۳༮��
        ts.setTheaterNum(0); // �󿵰���ȣ(TheaterVO����) //2D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 22);
        cal.set(Calendar.MINUTE, 00);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(9); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(3); // ��ȭ��ȣ(MovieVO����) //���۳༮��
        ts.setTheaterNum(1); // �󿵰���ȣ(TheaterVO����) //4D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 22:00
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 22);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(10); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(3); // ��ȭ��ȣ(MovieVO����) //���۳༮��
        ts.setTheaterNum(0); // �󿵰���ȣ(TheaterVO����) //2D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 22:10
        tb_theaterSchedule.add(ts);

        // 2/10 �ð�ǥ----------------------------------

        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(11); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(0); // ��ȭ��ȣ(MovieVO����) //�ܿ�ձ�
        ts.setTheaterNum(0); // �󿵰���ȣ(TheaterVO����) //2D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(12); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(0); // ��ȭ��ȣ(MovieVO����) //�ܿ�ձ�
        ts.setTheaterNum(1); // �󿵰���ȣ(TheaterVO����) //4D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(13); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(0); // ��ȭ��ȣ(MovieVO����) //�ܿ�ձ�
        ts.setTheaterNum(2); // �󿵰���ȣ(TheaterVO����) //���̸ƽ�
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(14); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(1); // ��ȭ��ȣ(MovieVO����) //��ġ���ʾ�
        ts.setTheaterNum(1); // �󿵰���ȣ(TheaterVO����) //4D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(15); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(1); // ��ȭ��ȣ(MovieVO����) //��ġ���ʾ�
        ts.setTheaterNum(2); // �󿵰���ȣ(TheaterVO����) //���̸ƽ�
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(16); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(1); // ��ȭ��ȣ(MovieVO����) //��ġ���ʾ�
        ts.setTheaterNum(0); // �󿵰���ȣ(TheaterVO����) //2D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(17); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(2); // ��ȭ��ȣ(MovieVO����) //��Ÿ����
        ts.setTheaterNum(2); // �󿵰���ȣ(TheaterVO����) //���̸ƽ�
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(18); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(2); // ��ȭ��ȣ(MovieVO����) //��Ÿ����
        ts.setTheaterNum(1); // �󿵰���ȣ(TheaterVO����) //4D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(19); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(3); // ��ȭ��ȣ(MovieVO����) //���۳༮��
        ts.setTheaterNum(0); // �󿵰���ȣ(TheaterVO����) //2D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 22);
        cal.set(Calendar.MINUTE, 00);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(20); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(3); // ��ȭ��ȣ(MovieVO����) //���۳༮��
        ts.setTheaterNum(1); // �󿵰���ȣ(TheaterVO����) //4D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 22:00
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 22);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(21); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(3); // ��ȭ��ȣ(MovieVO����) //���۳༮��
        ts.setTheaterNum(0); // �󿵰���ȣ(TheaterVO����) //2D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 22:10
        tb_theaterSchedule.add(ts);

        // 2/11 �ð�ǥ----------------------------------

        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(22); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(0); // ��ȭ��ȣ(MovieVO����) //�ܿ�ձ�
        ts.setTheaterNum(0); // �󿵰���ȣ(TheaterVO����) //2D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(23); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(0); // ��ȭ��ȣ(MovieVO����) //�ܿ�ձ�
        ts.setTheaterNum(1); // �󿵰���ȣ(TheaterVO����) //4D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(24); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(0); // ��ȭ��ȣ(MovieVO����) //�ܿ�ձ�
        ts.setTheaterNum(2); // �󿵰���ȣ(TheaterVO����) //���̸ƽ�
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(25); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(1); // ��ȭ��ȣ(MovieVO����) //��ġ���ʾ�
        ts.setTheaterNum(1); // �󿵰���ȣ(TheaterVO����) //4D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(26); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(1); // ��ȭ��ȣ(MovieVO����) //��ġ���ʾ�
        ts.setTheaterNum(2); // �󿵰���ȣ(TheaterVO����) //���̸ƽ�
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(27); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(1); // ��ȭ��ȣ(MovieVO����) //��ġ���ʾ�
        ts.setTheaterNum(0); // �󿵰���ȣ(TheaterVO����) //2D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(28); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(2); // ��ȭ��ȣ(MovieVO����) //��Ÿ����
        ts.setTheaterNum(2); // �󿵰���ȣ(TheaterVO����) //���̸ƽ�
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(29); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(2); // ��ȭ��ȣ(MovieVO����) //��Ÿ����
        ts.setTheaterNum(1); // �󿵰���ȣ(TheaterVO����) //4D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(30); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(3); // ��ȭ��ȣ(MovieVO����) //���۳༮��
        ts.setTheaterNum(0); // �󿵰���ȣ(TheaterVO����) //2D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 22);
        cal.set(Calendar.MINUTE, 00);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(31); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(3); // ��ȭ��ȣ(MovieVO����) //���۳༮��
        ts.setTheaterNum(1); // �󿵰���ȣ(TheaterVO����) //4D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 22:00
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 22);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(31); // �󿵽ð�ǥ��ȣ
        ts.setMovieNum(3); // ��ȭ��ȣ(MovieVO����) //���۳༮��
        ts.setTheaterNum(0); // �󿵰���ȣ(TheaterVO����) //2D
        ts.setMovieStartTime(cal); // �󿵽��۽ð� //2020-02-9 / 22:10
        tb_theaterSchedule.add(ts);
    	
    }
    
    public ArrayList<TheaterVO> tb_theater = new ArrayList<>();
    {
    	TheaterVO tt = new TheaterVO();
    	tt.setTheaterNum(0);  //�󿵰���ȣ
    	tt.setTheaterName("2D");  //�󿵰� �̸�
    	tt.setSeatCount(50);  //�¼� ��
    	tb_theater.add(tt);
    	
    	tt = new TheaterVO();
    	tt.setTheaterNum(1);  //�󿵰���ȣ
    	tt.setTheaterName("4D");  //�󿵰� �̸�
    	tt.setSeatCount(40);  //�¼� ��
    	tb_theater.add(tt);

    	tt = new TheaterVO();
    	tt.setTheaterNum(2);  //�󿵰���ȣ
    	tt.setTheaterName("���̸ƽ���");  //�󿵰� �̸�
    	tt.setSeatCount(30);  //�¼� ��
    	tb_theater.add(tt);
    }
    
    public ArrayList<PaymentVO> tb_payment = new ArrayList<>();
    {
       PaymentVO pp = new PaymentVO();
       Calendar cal = Calendar.getInstance();
       pp.setPaymentNum(0); // ������ȣ
       pp.setUserId("hyojin"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("������ü"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 19);
       cal.set(Calendar.HOUR_OF_DAY, 11);
       cal.set(Calendar.MINUTE, 20);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);

       pp = new PaymentVO();
       pp.setPaymentNum(1); // ������ȣ
       pp.setUserId("kiwan"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�ſ�ī��"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 11);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);

       pp = new PaymentVO();
       pp.setPaymentNum(2); // ������ȣ
       pp.setUserId("hyeokjin"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�ſ�ī��"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 2);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(3); // ������ȣ
       pp.setUserId("jieun"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("������ü"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2019);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 23);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(4); // ������ȣ
       pp.setUserId("jongwan"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�޴�������"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 10);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(5); // ������ȣ
       pp.setUserId("woogyung"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�ſ�ī��"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 19);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(6); // ������ȣ
       pp.setUserId("hyojin"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("������ü"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 27);
       cal.set(Calendar.HOUR_OF_DAY, 16);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(7); // ������ȣ
       pp.setUserId("kiwan"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�޴�������"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 19);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(8); // ������ȣ
       pp.setUserId("hyeokjin"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�ſ�ī��"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 23);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(9); // ������ȣ
       pp.setUserId("jieun"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�ſ�ī��"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 12);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(10); // ������ȣ
       pp.setUserId("jongwan"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("������ü"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 1);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(11); // ������ȣ
       pp.setUserId("woogyung"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�޴�������"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 16);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(12); // ������ȣ
       pp.setUserId("hyojin"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�ſ�ī��"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2019);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 30);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(13); // ������ȣ
       pp.setUserId("hyojin"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("������ü"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 11);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(14); // ������ȣ
       pp.setUserId("hyeokjin"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�޴�������"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2019);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 11);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(15); // ������ȣ
       pp.setUserId("jieun"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�ſ�ī��"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 14);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(16); // ������ȣ
       pp.setUserId("jongwan"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("������ü"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 1);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(17); // ������ȣ
       pp.setUserId("woogyung"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�޴�������"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 1);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(18); // ������ȣ
       pp.setUserId("hyojin"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�ſ�ī��"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2019);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 27);
       cal.set(Calendar.HOUR_OF_DAY, 12);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(19); // ������ȣ
       pp.setUserId("kiwan"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�޴�������"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 4);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(20); // ������ȣ
       pp.setUserId("hyojin"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�޴�������"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 31);
       cal.set(Calendar.HOUR_OF_DAY, 17);
       cal.set(Calendar.MINUTE, 23);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(21); // ������ȣ
       pp.setUserId("kiwan"); // ȸ�����̵�(UserVO����)
       pp.setPaymentForm("�޴�������"); // �������
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 25);
       cal.set(Calendar.HOUR_OF_DAY, 21);
       cal.set(Calendar.MINUTE, 11);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
    

    }    
    
    public ArrayList<MovieCartVO> tb_movieCart = new ArrayList<>();
    {
       MovieCartVO movieCart = new MovieCartVO();
       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(0); // ��ȭīƮ��ȣ
       movieCart.setUserId("hyojin"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(19); // �¼� ��å�� ��ġ
       movieCart.setPaymentNum(0); // ������ȣ(PaymentVO����)
       movieCart.setScheduleNum(4); // �󿵽ð�ǥ(TheaterScheduleVO����
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(1); // ��ȭīƮ��ȣ
       movieCart.setUserId("kiwan"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(18); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(2); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(0); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(2); // ��ȭīƮ��ȣ
       movieCart.setUserId("hyeokjin"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(17); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(0); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(4); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(9000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(3); // ��ȭīƮ��ȣ
       movieCart.setUserId("jieun"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(16); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(1); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(5); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(4); // ��ȭīƮ��ȣ
       movieCart.setUserId("jongwan"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(15); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(2); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(5); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(5); // ��ȭīƮ��ȣ
       movieCart.setUserId("woogyung"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(14); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(0); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(7); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(6); // ��ȭīƮ��ȣ
       movieCart.setUserId("hyojin"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(13); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(1); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(5); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(7); // ��ȭīƮ��ȣ
       movieCart.setUserId("kiwan"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(12); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(2); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(7); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(8); // ��ȭīƮ��ȣ
       movieCart.setUserId("hyeokjin"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(11); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(0); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(10); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(9); // ��ȭīƮ��ȣ
       movieCart.setUserId("jieun"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(10); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(0); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(1); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(10); // ��ȭīƮ��ȣ
       movieCart.setUserId("jongwan"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(9); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(1); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(2); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(11); // ��ȭīƮ��ȣ
       movieCart.setUserId("woogyung"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(8); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(2); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(3); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(12); // ��ȭīƮ��ȣ
       movieCart.setUserId("hyojin"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(7); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(0); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(4); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(13); // ��ȭīƮ��ȣ
       movieCart.setUserId("hyojin"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(6); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(1); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(5); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(14); // ��ȭīƮ��ȣ
       movieCart.setUserId("hyeokjin"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(5); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(2); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(6); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(15); // ��ȭīƮ��ȣ
       movieCart.setUserId("jieun"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(4); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(0); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(7); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(16); // ��ȭīƮ��ȣ
       movieCart.setUserId("jongwan"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(3); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(1); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(8); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(17); // ��ȭīƮ��ȣ
       movieCart.setUserId("woogyung"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(2); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(2); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(7); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(18); // ��ȭīƮ��ȣ
       movieCart.setUserId("hyojin"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(1); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(0); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(9); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(19); // ��ȭīƮ��ȣ
       movieCart.setUserId("kiwan"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(29); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(2); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(1); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);
       
       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(20); // ��ȭīƮ��ȣ
       movieCart.setUserId("hyojin"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(28); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(0); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(2); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);
       
       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(21); // ��ȭīƮ��ȣ
       movieCart.setUserId("kiwan"); // ȸ�����̵�(UserVO����)
       movieCart.setSeatLocation(25); // �¼� ��å�� ��ġ //0~20����
       movieCart.setPaymentNum(0); // ������ȣ(PaymentVO����) //0~2����
       movieCart.setScheduleNum(2); // �󿵽ð�ǥ(TheaterScheduleVO����)
       movieCart.setMoviePrice(12000); // ��ȭ����
       tb_movieCart.add(movieCart);
    }
    
    public ArrayList<ReviewVO> tb_review = new ArrayList<>();
    {
       // ���丮��Ʈ ��ȭ���� �ϳ��� �����
       ReviewVO review = new ReviewVO();
       Calendar cal = Calendar.getInstance();
       
       review.setReviewNum(0);
       review.setUserId("kiwan");
       review.setReviewGrade("�ڡڡ١١�");
       review.setReviewContent("��ġ�ؿ�");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 31);
       cal.set(Calendar.HOUR_OF_DAY, 10);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(0); // ��ȭPK���� (��ȭ������ ����ִ°�)
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(1);
       review.setUserId("hyojin");
       review.setReviewGrade("�ڡڡڡ١�");
       review.setReviewContent("��վ��");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 20);
       cal.set(Calendar.HOUR_OF_DAY, 10);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(5);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(2);
       review.setUserId("hyojin");
       review.setReviewGrade("�ڡڡڡڡ�");
       review.setReviewContent("¯ ��վ��");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 29);
       cal.set(Calendar.HOUR_OF_DAY, 16);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(2);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(3);
       review.setUserId("hyeokjin");
       review.setReviewGrade("�ڡڡڡ١�");
       review.setReviewContent("������� ��վ�� ¯!");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 4);
       cal.set(Calendar.HOUR_OF_DAY, 13);
       cal.set(Calendar.MINUTE, 50);
       review.setReviewDate(cal);
       review.setMovieNum(9);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(4);
       review.setUserId("hyojin");
       review.setReviewGrade("�ڡڡڡڡڡ�");
       review.setReviewContent("���� �������̾����ϴ�");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 31);
       cal.set(Calendar.HOUR_OF_DAY, 15);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(12);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(5);
       review.setUserId("jieun");
       review.setReviewGrade("�ڡ١١١�");
       review.setReviewContent("�Ǹ� ����ü");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 16);
       cal.set(Calendar.HOUR_OF_DAY, 14);
       cal.set(Calendar.MINUTE, 10);
       review.setReviewDate(cal);
       review.setMovieNum(8);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(6);
       review.setUserId("jongwan");
       review.setReviewGrade("�ڡڡڡڡ�");
       review.setReviewContent("ȯ������ ���丮�����ϴ�.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 21);
       cal.set(Calendar.HOUR_OF_DAY, 14);
       cal.set(Calendar.MINUTE, 35);
       review.setReviewDate(cal);
       review.setMovieNum(8);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(7);
       review.setUserId("woogyung");
       review.setReviewGrade("�ڡڡڡڡ�");
       review.setReviewContent("���� �������̾����ϴ�");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 22);
       cal.set(Calendar.HOUR_OF_DAY, 19);
       cal.set(Calendar.MINUTE, 23);
       review.setReviewDate(cal);
       review.setMovieNum(5);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(8);
       review.setUserId("jieun");
       review.setReviewGrade("�ڡڡ١١�");
       review.setReviewContent("���ݺ����ص� ���俵ȭ�����ϴ�.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 19);
       cal.set(Calendar.HOUR_OF_DAY, 11);
       cal.set(Calendar.MINUTE, 17);
       review.setReviewDate(cal);
       review.setMovieNum(6);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(9);
       review.setUserId("hyeokjin");
       review.setReviewGrade("�ڡڡڡڡ�");
       review.setReviewContent("���Ե��� ���ҽ��ϴ�.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 26);
       cal.set(Calendar.HOUR_OF_DAY, 15);
       cal.set(Calendar.MINUTE, 55);
       review.setReviewDate(cal);
       review.setMovieNum(4);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(10);
       review.setUserId("kiwan");
       review.setReviewGrade("�ڡڡڡ١�");
       review.setReviewContent("�ͻ콺���� ��ȭ�����ϴ�.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 21);
       cal.set(Calendar.HOUR_OF_DAY, 21);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(5);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(11);
       review.setUserId("jongwan");
       review.setReviewGrade("�ڡڡ١١�");
       review.setReviewContent("�Ǹ� ���������ϴ�.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 4);
       cal.set(Calendar.HOUR_OF_DAY, 13);
       cal.set(Calendar.MINUTE, 47);
       review.setReviewDate(cal);
       review.setMovieNum(1);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(12);
       review.setUserId("woogyung");
       review.setReviewGrade("�ڡڡڡ١�");
       review.setReviewContent("�������� �ѱ���ȭ�����ϴ�.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 20);
       cal.set(Calendar.HOUR_OF_DAY, 10);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(11);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(13);
       review.setUserId("hyojin");
       review.setReviewGrade("�ڡڡڡڡ�");
       review.setReviewContent("������ �ӱݰ� �� ��ȭ�����ϴ�.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 29);
       cal.set(Calendar.HOUR_OF_DAY, 16);
       cal.set(Calendar.MINUTE, 21);
       review.setReviewDate(cal);
       review.setMovieNum(12);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(14);
       review.setUserId("jieun");
       review.setReviewGrade("�ڡڡڡڡ�");
       review.setReviewContent("���ΰ� �Բ� ���� ������ �����ϴ�.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 25);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(14);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(15);
       review.setUserId("hyeokjin");
       review.setReviewGrade("�ڡڡڡ١�");
       review.setReviewContent("���丮�� �����߽��ϴ�.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 17);
       cal.set(Calendar.HOUR_OF_DAY, 20);
       cal.set(Calendar.MINUTE, 27);
       review.setReviewDate(cal);
       review.setMovieNum(13);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(16);
       review.setUserId("kiwan");
       review.setReviewGrade("�ڡڡڡ١�");
       review.setReviewContent("���� �������� �����Z���ϴ�");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 6);
       cal.set(Calendar.HOUR_OF_DAY, 11);
       cal.set(Calendar.MINUTE, 03);
       review.setReviewDate(cal);
       review.setMovieNum(2);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(17);
       review.setUserId("jongwan");
       review.setReviewGrade("�ڡڡڡڡ�");
       review.setReviewContent("������� ���� ������ȭ�����ϴ�.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 3);
       cal.set(Calendar.HOUR_OF_DAY, 19);
       cal.set(Calendar.MINUTE, 24);
       review.setReviewDate(cal);
       review.setMovieNum(9);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(18);
       review.setUserId("woogyung");
       review.setReviewGrade("�ڡڡڡڡ�");
       review.setReviewContent("�ٽ� ���� ���� ��ȭ�����ϴ�.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 2);
       cal.set(Calendar.HOUR_OF_DAY, 20);
       cal.set(Calendar.MINUTE, 19);
       review.setReviewDate(cal);
       review.setMovieNum(4);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(19);
       review.setUserId("hyojin");
       review.setReviewGrade("�ڡڡ١١�");
       review.setReviewContent("���丮�� �Ǹ����������ϴ�.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 1);
       cal.set(Calendar.HOUR_OF_DAY, 17);
       cal.set(Calendar.MINUTE, 25);
       review.setReviewDate(cal);
       review.setMovieNum(1);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(20);
       review.setUserId("kiwan");
       review.setReviewGrade("�ڡڡڡڡ�");
       review.setReviewContent("�����,���丮�� źź�߽��ϴ�.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 28);
       cal.set(Calendar.HOUR_OF_DAY, 14);
       cal.set(Calendar.MINUTE, 36);
       review.setReviewDate(cal);
       review.setMovieNum(5);
       tb_review.add(review);
    }
    
    public ArrayList<SnackCartVO> tb_snackCart = new ArrayList<>();
    {
       SnackCartVO snackCart = new SnackCartVO();
       snackCart.setSnackCartNum(0); //����īƮ��ȣ
       snackCart.setUserId("hyojin");  //ȸ�����̵�
       snackCart.setSnackCount(0);  //������ ����
       snackCart.setSnackNum(20);  //������ȣ(SnackVO����)
       snackCart.setPaymentNum(-1);  //������ȣ(PaymentVO����)
       
       
       snackCart = new SnackCartVO();
       snackCart.setSnackCartNum(1); //����īƮ��ȣ
       snackCart.setUserId("hyojin");  //ȸ�����̵�
       snackCart.setSnackCount(0);  //������ ����
       snackCart.setSnackNum(21);  //������ȣ(SnackVO����)
       snackCart.setPaymentNum(-1);  //������ȣ(PaymentVO����)
       
       snackCart = new SnackCartVO();
       snackCart.setSnackCartNum(2); //����īƮ��ȣ
       snackCart.setUserId("hyojin");  //ȸ�����̵�
       snackCart.setSnackCount(2);  //������ ����
       snackCart.setSnackNum(2);  //������ȣ(SnackVO����)
       snackCart.setPaymentNum(100);  //������ȣ(PaymentVO����)
       
       snackCart = new SnackCartVO();
       snackCart.setSnackCartNum(3); //����īƮ��ȣ
       snackCart.setUserId("kiwan");  //ȸ�����̵�
       snackCart.setSnackCount(2);  //������ ����
       snackCart.setSnackNum(1);  //������ȣ(SnackVO����)
       snackCart.setPaymentNum(-1);  //������ȣ(PaymentVO����)
    }
}












