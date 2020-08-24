package controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import vo.MovieVO;
import vo.SnackCategoryVO;
import vo.SnackVO;
import vo.TheaterScheduleVO;
import vo.TheaterVO;
import dao.MovieDAO;
import dao.SnackCategoryDAO;
import dao.SnackDAO;
import dao.TheaterDAO;
import dao.TheaterScheduleDAO;

public class Admin {
   // ������ �α���

   Scanner s = new Scanner(System.in);
   private SnackDAO snackDAO = SnackDAO.getInstance();
   private MovieDAO movieDAO = MovieDAO.getInstance();
   private TheaterDAO theaterDAO = TheaterDAO.getInstance();
   private TheaterScheduleDAO teaterScheduleDAO = TheaterScheduleDAO
         .getInstance();

   private TheaterScheduleDAO theaterScheduleDAO = TheaterScheduleDAO
         .getInstance();
   private TheaterScheduleVO theaterScheduleVO = new TheaterScheduleVO();

   public void admin() {
      do {
         System.out.println("------------------------------------");
         System.out.println("���� �ش��ϴ� ��ȣ�� �������ּ���.");
         System.out.println("1.�󿵰� �߰�  2.�󿵰� ���  3.��ȭ�߰�  4.��ȭ���� 5.��ȭ�����߰� 6.��ȭ���ϻ��� 7.�����߰� 8.��������");
         System.out.println("9.���Ȯ��(��ȭ, ���� ���)"); // ��Ȳ���� �����
         System.out.println("99.�α׾ƿ�");
         System.out.println("0.���α׷� ����");
         System.out.println("------------------------------------");
         int input = Integer.parseInt(s.nextLine());

         switch (input) {
         case 1:
            theaterAdd();
            break;
         case 2:
            theatoerDelete();
            break;
         case 3:
            movieAdd();
            break;
         case 4:
            movieDelete();
            break;
         case 5:
            theaterscheduleadd();
            break;
         case 6:
            theaterscheduledelete();
            break;
         case 7:
            snackAdd();
            break;
         case 8:
            snackDelete();
            break;
         case 9:
            System.out.println("1.��ȭ ���   2.���� ���");
            input = Integer.parseInt(s.nextLine());
            switch (input) {
            case 1:
               movieView();
               break;
            case 2:
               snackView();
               break;
            default:
               System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �õ����ּ���.");
            }
            break;
         case 99:
        	 System.out.println("�α׾ƿ��Ǽ̽��ϴ�");
             Controller controller = new Controller();
             controller.login_start();
        	 break;
         case 0:
            System.out.println("�α׾ƿ��Ǽ̽��ϴ�.");
            System.out.println("���α׷��� ����Ǿ����ϴ�.");
            System.exit(0);
         default:
            System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �õ����ּ���.");
         }
      } while (true);

   }

   // 1��. �󿵰� �߰�
   void theaterAdd() {
      TheaterVO theaterVO = new TheaterVO();
      int theater_number = 0;

      if (!theaterDAO.selectTheaterList().isEmpty()) {
         theater_number = theaterDAO.selectTheaterList()
               .get(theaterDAO.selectTheaterList().size() - 1)
               .getTheaterNum() + 1;
      }
      System.out.println(theater_number);
      theaterVO.setTheaterNum(theater_number);

      System.out.println("------------------------------------");
      System.out.println("�󿵰� �̸��� �Է����ּ���");
      System.out.println("------------------------------------");
      // �󿵰� �̸� ����
      String input = s.nextLine();
      
      System.out.println("------------------------------------");
      System.out.println("�󿵰��� �¼��� �����Է����ּ���");
      System.out.println("------------------------------------");
      
      int input2 = Integer.parseInt(s.nextLine());
      theaterVO.setTheaterName(input);
      theaterVO.setSeatCount(input2);
      theaterDAO.insertTheater(theaterVO);
      System.out.println("**�󿵰��� ��ϵǾ����ϴ�.**");

   }

   // 2��. �󿵰� ����
   void theatoerDelete() {
      System.out.println("����Ͻ� �󿵰��� �������ּ���");
      for (int i = 0; i < theaterDAO.selectTheaterList().size(); i++) {
         System.out.println((i + 1) + ". (�󿵰�) "
               + theaterDAO.selectTheaterList().get(i).getTheaterName());
      }
      System.out.println("------------------------------------");
      System.out.println("9.������ȭ������ �̵�");
      int input = Integer.parseInt(s.nextLine());
      if(input ==9){
         return;
      }
      theaterDAO.deleteTheater(input - 1);
      System.out.println("*�����Ͻ� ��ȭ���� ���Ǿ����ϴ�*");
   }

   // 3��. ��ȭ�߰�

   

   void movieAdd() {
      MovieVO movieVO = new MovieVO();
      Calendar cal = Calendar.getInstance();
      int MovieNum = movieDAO.selectMovieList()
            .get(movieDAO.selectMovieList().size() - 1).getMovieNum() + 1;
      
      System.out.println("------------------------------------");
      System.out.println("�߰��Ͻ� ��ȭ�� �Է����ּ���");
      String input_name = s.nextLine();
      
      System.out.println("��ȭ " + input_name + "�� ���������� �Է����ּ���");
      String input_rating = s.nextLine();
      
      System.out.println("��ȭ " + input_name + "�� �⿬���� �Է����ּ���");
      String input_cast = s.nextLine();
      
      System.out.println("��ȭ " + input_name + "�� ������ �Է����ּ���");
      String input_director = s.nextLine();
      
      System.out.println("��ȭ " + input_name + "�� �ٰŸ��� �Է����ּ���");
      String input_story = s.nextLine();
      
      System.out.println("��ȭ " + input_name + "�� ��Ÿ���� �Է����ּ���");
      System.out.println("��ȭ " + input_name + "�� �ð��� �����ּ���");
      int input_runtime = Integer.parseInt(s.nextLine());
      
      cal.set(Calendar.HOUR_OF_DAY, input_runtime);
      System.out.println("��ȭ " + input_name + "�� ���� �����ּ���");
      input_runtime = Integer.parseInt(s.nextLine());
      
      cal.set(Calendar.MINUTE, input_runtime);
      movieVO.setMovieNum(MovieNum);
      movieVO.setMovieName(input_name);
      movieVO.setMovieRating(input_rating);
      movieVO.setMovieCast(input_cast);
      movieVO.setMovieDirector(input_director);
      movieVO.setMovieStory(input_story);
      movieVO.setRunTime(cal);
      movieVO.setState(true);
      movieDAO.insertMovie(movieVO); // ��ȭ �߰�
      System.out.println("*�Է��Ͻ� ��ȭ�� �߰��Ǿ����ϴ�*");

   }

   // 4��. ��ȭ����
   void movieDelete() {
      System.out.println("�����Ͻ� ��ȭ�� �������ּ���");
      for (int i = 0; i < movieDAO.selectMovieList(true).size(); i++) {
         System.out.println((i + 1) + ". (��ȭ��) "
               + movieDAO.selectMovieList(true).get(i).getMovieName()
               + "\t" + "(��������) "
               + movieDAO.selectMovieList(true).get(i).getMovieRating());
      }
      System.out.println("------------------------------------");
      System.out.println("9.������ȭ������ �̵�");
      int input = Integer.parseInt(s.nextLine());
      if (input == 9) {
         return;
      }
      movieDAO.selectMovieList(true).get(input - 1).setState(false);
      System.out.println("*�����Ͻ� ��ȭ�� �����Ǿ����ϴ�*");
   }
///
   void theaterscheduleadd() {
      theaterScheduleVO = new TheaterScheduleVO();
      Calendar cal = Calendar.getInstance();
      int scheduleNum = theaterScheduleDAO.selectTheaterScheduleList().size();

      System.out.println("------------------------------------");
      System.out.println("�߰��Ͻ� ��ȭ�� �������ּ���");
      for (int i = 0; i < movieDAO.selectMovieList().size(); i++) {
         System.out.println(i + 1 + "."
               + movieDAO.selectMovieList().get(i).getMovieName());
      }
      int input = Integer.parseInt(s.nextLine());
      int movieNum = movieDAO.selectMovieList().get(input - 1).getMovieNum();
      
      
      
      System.out.println("�߰��Ͻ� ��ȭ���� �����ϼ���");
      for (int i = 0; i < theaterDAO.selectTheaterList().size(); i++) {
         System.out.println(i + 1 + "."
               + theaterDAO.selectTheaterList().get(i).getTheaterName());
      }
      int input2 = Integer.parseInt(s.nextLine());
      
      int theaterNum = movieDAO.selectMovieList().get(input2 - 1).getMovieNum();
      
      
      System.out.println("�⵵�� �Է����ּ���");
      int year = Integer.parseInt(s.nextLine());
      
      while(true){
         if(year!=2020){
            System.out.println("�⵵�� �ٽ��Է����ּ��� ex)2020");
            year = Integer.parseInt(s.nextLine());
         }else{
            break;
         }
      }
      System.out.println("���� �Է����ּ���");
      int month = Integer.parseInt(s.nextLine());
      
      while(true){
         if(month>12 || month<1){
            System.out.println("�ٽ� �Է����ּ���. ���� 1������ 12�� �����Դϴϴ�.");
            month = Integer.parseInt(s.nextLine());
         }else{
            break;
         }
      }

      System.out.println("���� �Է����ּ���");
      cal.set(year, month, 1);
      cal.add(Calendar.DATE, -1);
      
      int endDate = cal.get(Calendar.DATE);
      int date = Integer.parseInt(s.nextLine());
      while(true){
         if(endDate<date){
            System.out.println("�ٽ� �Է����ּ���. �ش���� ������ �ϼ��� " +endDate+ "�Դϴ�.");
            date = Integer.parseInt(s.nextLine());
         }else{
            break;
         }
      }
      System.out.println("�ð��� �Է��ϼ��� ex)15�� : 15");
      int hour = Integer.parseInt(s.nextLine());
      cal.set(Calendar.HOUR_OF_DAY, hour);
      
      System.out.println("���� �Է��ϼ��� ex)30��: 30");
      int MINUTE = Integer.parseInt(s.nextLine());
      
      cal.set(Calendar.MINUTE, MINUTE);
      theaterScheduleVO.setScheduleNum(scheduleNum);
      theaterScheduleVO.setMovieNum(movieNum);
      theaterScheduleVO.setTheaterNum(theaterNum);
      theaterScheduleVO.setMovieStartTime(cal);
      
      teaterScheduleDAO.insertTheaterSchedule(theaterScheduleVO);

   }
   
   void theaterscheduledelete(){
      
      System.out.println("�����Ͻ� ��ȭ������ �������ּ���");
      for (int i = 0; i < theaterScheduleDAO.selectTheaterScheduleList().size(); i++) {
         System.out.println((i + 1) + ". (�󿵰�) "
               + "�󿵽ð�ǥ��ȣ :" +theaterScheduleDAO.selectTheaterScheduleList().get(i).getScheduleNum()
               + "��ȭ����ȣ :"+ theaterScheduleDAO.selectTheaterScheduleList().get(i).getMovieNum()
               + "�󿵰���ȣ :"+theaterScheduleDAO.selectTheaterScheduleList().get(i).getTheaterNum()
               + "�ð� :"+ theaterScheduleDAO.selectTheaterScheduleList().get(i).getMovieStartTime()
               .get(Calendar.HOUR_OF_DAY)
               + "�� :"+theaterScheduleDAO.selectTheaterScheduleList().get(i).getMovieStartTime()
               .get(Calendar.MINUTE) 
               );
      }
      System.out.println("------------------------------------");
      System.out.println("9.������ȭ������ �̵�");
      int input = Integer.parseInt(s.nextLine());
      if (input == 9) {
         return;
      }
      
      theaterScheduleDAO.deleteTheaterSchedule(input-1);
      System.out.println("*�����Ͻ� ��ȭ���� ���Ǿ����ϴ�*");
   }
   

   // 5��. �����߰�
   void snackAdd() {      
        SnackVO snack = new SnackVO();
        SnackCategoryVO snackCartegory = new SnackCategoryVO();
         
         int SnackNum = snackDAO.selectSnackList().get(snackDAO.selectSnackList().size() - 1).getSnackNum() + 1;
         snack.setSnackNum(SnackNum);
         System.out.println("------------------------------------");
         System.out.println("�߰��Ͻ� ������ ������ �������ּ���>");
         System.out.println("1.����  2.����  3.������   4.��Ʈ");
         int sm_type = Integer.parseInt(s.nextLine());
         if(sm_type>4 || sm_type<1){
        	 System.out.println("�ٽ� �Է����ּ���");
        	 snackAdd();
        	 return;
         }
         System.out.println("������ �̸��� �Է����ּ���");
         String snack_name = s.nextLine();
         System.out.println("������ �ݾ��� �Է����ּ���(���ڷθ� �Է����ּ���)");
         int snack_price = Integer.parseInt(s.nextLine());

         switch (sm_type) {
         case 1:
            snackCartegory.setSnackCategoryName("����"); // ���� ����
            break;
         case 2:
            snackCartegory.setSnackCategoryName("����"); // ���� ����
            break;
         case 3:
            snackCartegory.setSnackCategoryName("������"); // ������ ����
            break;
         case 4:
            snackCartegory.setSnackCategoryName("��Ʈ"); // ��Ʈ ����
            break;
         default:
            System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
            snackAdd();
            break;
         }

         snack.setSnackName(snack_name);
         snack.setSnackPrice(snack_price);
         snack.setSnackCategoryNum(sm_type-1);
         snackDAO.insertSnack(snack);
         snackCategoryDao.insertSnackCategory(snackCartegory);
         
         System.out.println("*�Է��Ͻ� ������ �߰��Ǿ����ϴ�*");
      }

   // 6��. ���� ����
   void snackDelete() {
      System.out.println("�����Ͻ� ������ �������ּ���");
      for (int i = 0; i < snackDAO.selectSnackList().size(); i++) {
         System.out.println((i + 1) + ". (������) "
               + snackDAO.selectSnackList().get(i).getSnackName() + "\t"
               + "(�����ݾ�) "
               + snackDAO.selectSnackList().get(i).getSnackPrice());
      }
      System.out.println("------------------------------------");
      System.out.println("9.������ȭ������ �̵�");
      int input = Integer.parseInt(s.nextLine());
      if (input == 9) {
         return;
      }

      snackDAO.deleteSnack(input - 1);

      System.out.println("*�����Ͻ� ������ �����Ǿ����ϴ�*");

   }

   // 7-1��. ��ȭ��� Ȯ��
   void movieView() {
      System.out.println("-------------------��ȭ���--------------------");
      for (int i = 0; i < movieDAO.selectMovieList().size(); i++) {
         System.out.println("(��ȭ������ȣ): "
               + movieDAO.selectMovieList().get(i).getMovieNum()
               + "\t"
               + "\n(��ȭ��): "
               + movieDAO.selectMovieList().get(i).getMovieName()
               + "\t"
               + "\n(�⿬��): "
               + movieDAO.selectMovieList().get(i).getMovieCast()
               + "\t"
               + "\n(��������): "
               + movieDAO.selectMovieList().get(i).getMovieRating()
               + "\t"
               + "\n(��ȭ����): "
               + movieDAO.selectMovieList().get(i).getMovieDirector()
               + "\n"
               + "(�ٰŸ�): "
               + movieDAO.selectMovieList().get(i).getMovieStory()
               + "\t"
               + "\n(����Ÿ��): "
               + movieDAO.selectMovieList().get(i).getRunTime()
                     .get(Calendar.HOUR_OF_DAY)
               + "�ð�"
               + +movieDAO.selectMovieList().get(i).getRunTime()
                     .get(Calendar.MINUTE) + "��");
      }
      System.out.println("------------------------------------");
      System.out.println("9.������ȭ������ �̵�");
      int input = Integer.parseInt(s.nextLine());
      if (input == 9) {
         return;
      }
   }

   // 7-2��. ������� Ȯ��
   SnackCategoryDAO snackCategoryDao = SnackCategoryDAO.getInstance();

   void snackView() {
      System.out.println("--------------�������----------------");
      ArrayList<String> ss = new ArrayList<String>();
      for (int i = 0; i < snackDAO.selectSnackList().size(); i++) {
         for (int j = 0; j < snackCategoryDao.selectSnackCategoryList()
               .size(); j++) {
            if (snackCategoryDao.selectSnackCategoryList().get(j)
                  .getSnackCategoryName().equals("����")) {
               ss.add("����");
            } else if (snackCategoryDao.selectSnackCategoryList().get(j)
                  .getSnackCategoryName().equals("����")) {
               ss.add("����");
            } else if (snackCategoryDao.selectSnackCategoryList().get(j)
                  .getSnackCategoryName().equals("������")) {
               ss.add("������");
            } else if (snackCategoryDao.selectSnackCategoryList().get(j)
                  .getSnackCategoryName().equals("��Ʈ")) {
               ss.add("��Ʈ");
            }
         }
         System.out.println("(����������ȣ): "
               + snackDAO.selectSnackList().get(i).getSnackNum() + "\t"
               + "(������): "
               + snackDAO.selectSnackList().get(i).getSnackName() + "\t"
               + "(��������): " + ss.get(i) + "\t" + "(�ݾ�): "
               + snackDAO.selectSnackList().get(i).getSnackPrice() + "\t");
      }
      System.out.println("------------------------------------");
      System.out.println("9.������ȭ������ �̵�");
      int input = Integer.parseInt(s.nextLine());
      if (input == 9) {
         return;
      }
   }

}