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
		
		//���丮��Ʈ ��ȭ���� �ϳ��� �����
		
		ReviewVO review = new ReviewVO();
		review.setReview_name("�ܿ�ձ�2 ");
		review.setReview_grade("�ڡڡ١١�");
		review.setReview_content("��ġ�ؿ�");
		tb_review.add(review);
		
		review = new ReviewVO();
		review.setReview_name("��ġ�� �ʾ�");
		review.setReview_grade("�ڡڡڡ١�");
		review.setReview_content("��վ��");
		tb_review.add(review);
		
		review = new ReviewVO();
		review.setReview_name("��Ÿ����");
		review.setReview_grade("�ڡڡڡڡ�");
		review.setReview_content("¯ ��վ��");
		tb_review.add(review);
		
		review = new ReviewVO();
		review.setReview_name("���۳༮��");
		review.setReview_grade("�ڡڡڡ١�");
		review.setReview_content("������� ��վ�� ¯!");
		tb_review.add(review);
	}
	
	public ArrayList<MovieVO> tb_movie = new ArrayList<>();
	{
		MovieVO movie = new MovieVO();
		movie.setMovie_number("1");
		movie.setMovie_name("�ܿ�ձ�2");
		movie.setMovie_rating("��ü ������");
//		movie.setMovie_cast("ũ����ƾ ��, �̵� ����, ���� �Ե�");
		movie.setMovie_director("ũ���� ��, ������ ��");
//		movie.setMovie_story("���迡 ���� �Ʒ��� �ձ��� ���ؾ߸� �ϴ� ����� �ȳ��� ������ ������ ������ ã��\r\n" + 
//				" ũ��������, �ö��� �׸��� ������ �Բ� ����õ���� ���� ������ ������ �ȴ�.");
		tb_movie.add(movie);
		
		movie = new MovieVO();
		movie.setMovie_number("2");
		movie.setMovie_name("��ġ���ʾ�");
		movie.setMovie_rating("��ü ������");
//		movie.setMovie_cast("ũ����ƾ ��, �̵� ����, ���� �Ե�");
		movie.setMovie_director("ũ���� ��, ������ ��");
//		movie.setMovie_story("���迡 ���� �Ʒ��� �ձ��� ���ؾ߸� �ϴ� ����� �ȳ��� ������ ������ ������ ã��\r\n" + 
//				" ũ��������, �ö��� �׸��� ������ �Բ� ����õ���� ���� ������ ������ �ȴ�.");
		tb_movie.add(movie);
		movie = new MovieVO();
		movie.setMovie_number("3");
		movie.setMovie_name("��Ÿ����");
		movie.setMovie_rating("��ü ������");
//		movie.setMovie_cast("ũ����ƾ ��, �̵� ����, ���� �Ե�");
		movie.setMovie_director("ũ���� ��, ������ ��");
//		movie.setMovie_story("���迡 ���� �Ʒ��� �ձ��� ���ؾ߸� �ϴ� ����� �ȳ��� ������ ������ ������ ã��\r\n" + 
//				" ũ��������, �ö��� �׸��� ������ �Բ� ����õ���� ���� ������ ������ �ȴ�.");
		tb_movie.add(movie);
		
		movie = new MovieVO();
		movie.setMovie_number("4");
		movie.setMovie_name("���۳༮��");
		movie.setMovie_rating("��ü ������");
//		movie.setMovie_cast("ũ����ƾ ��, �̵� ����, ���� �Ե�");
		movie.setMovie_director("ũ���� ��, ������ ��");
//		movie.setMovie_story("���迡 ���� �Ʒ��� �ձ��� ���ؾ߸� �ϴ� ����� �ȳ��� ������ ������ ������ ã��\r\n" + 
//				" ũ��������, �ö��� �׸��� ������ �Բ� ����õ���� ���� ������ ������ �ȴ�.");
		tb_movie.add(movie);
		
	}
	
}
