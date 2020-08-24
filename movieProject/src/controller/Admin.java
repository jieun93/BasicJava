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
   // 관리자 로그인

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
         System.out.println("다음 해당하는 번호를 선택해주세요.");
         System.out.println("1.상영관 추가  2.상영관 폐쇄  3.영화추가  4.영화삭제 5.영화상영일추가 6.영화상영일삭제 7.스낵추가 8.스낵삭제");
         System.out.println("9.목록확인(영화, 스낵 목록)"); // 상황보고 만들기
         System.out.println("99.로그아웃");
         System.out.println("0.프로그램 종료");
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
            System.out.println("1.영화 목록   2.스낵 목록");
            input = Integer.parseInt(s.nextLine());
            switch (input) {
            case 1:
               movieView();
               break;
            case 2:
               snackView();
               break;
            default:
               System.out.println("잘못 입력하셨습니다. 다시 시도해주세요.");
            }
            break;
         case 99:
        	 System.out.println("로그아웃되셨습니다");
             Controller controller = new Controller();
             controller.login_start();
        	 break;
         case 0:
            System.out.println("로그아웃되셨습니다.");
            System.out.println("프로그램이 종료되었습니다.");
            System.exit(0);
         default:
            System.out.println("잘못 입력하셨습니다. 다시 시도해주세요.");
         }
      } while (true);

   }

   // 1번. 상영관 추가
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
      System.out.println("상영관 이름을 입력해주세요");
      System.out.println("------------------------------------");
      // 상영관 이름 저장
      String input = s.nextLine();
      
      System.out.println("------------------------------------");
      System.out.println("상영관의 좌석의 수를입력해주세요");
      System.out.println("------------------------------------");
      
      int input2 = Integer.parseInt(s.nextLine());
      theaterVO.setTheaterName(input);
      theaterVO.setSeatCount(input2);
      theaterDAO.insertTheater(theaterVO);
      System.out.println("**상영관이 등록되었습니다.**");

   }

   // 2번. 상영관 삭제
   void theatoerDelete() {
      System.out.println("폐쇠하실 상영관를 선택해주세요");
      for (int i = 0; i < theaterDAO.selectTheaterList().size(); i++) {
         System.out.println((i + 1) + ". (상영관) "
               + theaterDAO.selectTheaterList().get(i).getTheaterName());
      }
      System.out.println("------------------------------------");
      System.out.println("9.관리자화면으로 이동");
      int input = Integer.parseInt(s.nextLine());
      if(input ==9){
         return;
      }
      theaterDAO.deleteTheater(input - 1);
      System.out.println("*선택하신 영화관이 폐쇄되었습니다*");
   }

   // 3번. 영화추가

   

   void movieAdd() {
      MovieVO movieVO = new MovieVO();
      Calendar cal = Calendar.getInstance();
      int MovieNum = movieDAO.selectMovieList()
            .get(movieDAO.selectMovieList().size() - 1).getMovieNum() + 1;
      
      System.out.println("------------------------------------");
      System.out.println("추가하실 영화를 입력해주세요");
      String input_name = s.nextLine();
      
      System.out.println("영화 " + input_name + "의 관람연령을 입력해주세요");
      String input_rating = s.nextLine();
      
      System.out.println("영화 " + input_name + "의 출연진을 입력해주세요");
      String input_cast = s.nextLine();
      
      System.out.println("영화 " + input_name + "의 감독을 입력해주세요");
      String input_director = s.nextLine();
      
      System.out.println("영화 " + input_name + "의 줄거리를 입력해주세요");
      String input_story = s.nextLine();
      
      System.out.println("영화 " + input_name + "의 런타임을 입력해주세요");
      System.out.println("영화 " + input_name + "의 시간을 입해주세요");
      int input_runtime = Integer.parseInt(s.nextLine());
      
      cal.set(Calendar.HOUR_OF_DAY, input_runtime);
      System.out.println("영화 " + input_name + "의 분을 입해주세요");
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
      movieDAO.insertMovie(movieVO); // 영화 추가
      System.out.println("*입력하신 영화가 추가되었습니다*");

   }

   // 4번. 영화삭제
   void movieDelete() {
      System.out.println("삭제하실 영화를 선택해주세요");
      for (int i = 0; i < movieDAO.selectMovieList(true).size(); i++) {
         System.out.println((i + 1) + ". (영화명) "
               + movieDAO.selectMovieList(true).get(i).getMovieName()
               + "\t" + "(관람연령) "
               + movieDAO.selectMovieList(true).get(i).getMovieRating());
      }
      System.out.println("------------------------------------");
      System.out.println("9.관리자화면으로 이동");
      int input = Integer.parseInt(s.nextLine());
      if (input == 9) {
         return;
      }
      movieDAO.selectMovieList(true).get(input - 1).setState(false);
      System.out.println("*선택하신 영화가 삭제되었습니다*");
   }
///
   void theaterscheduleadd() {
      theaterScheduleVO = new TheaterScheduleVO();
      Calendar cal = Calendar.getInstance();
      int scheduleNum = theaterScheduleDAO.selectTheaterScheduleList().size();

      System.out.println("------------------------------------");
      System.out.println("추가하실 영화를 선택해주세요");
      for (int i = 0; i < movieDAO.selectMovieList().size(); i++) {
         System.out.println(i + 1 + "."
               + movieDAO.selectMovieList().get(i).getMovieName());
      }
      int input = Integer.parseInt(s.nextLine());
      int movieNum = movieDAO.selectMovieList().get(input - 1).getMovieNum();
      
      
      
      System.out.println("추가하실 영화관을 선택하세요");
      for (int i = 0; i < theaterDAO.selectTheaterList().size(); i++) {
         System.out.println(i + 1 + "."
               + theaterDAO.selectTheaterList().get(i).getTheaterName());
      }
      int input2 = Integer.parseInt(s.nextLine());
      
      int theaterNum = movieDAO.selectMovieList().get(input2 - 1).getMovieNum();
      
      
      System.out.println("년도를 입력해주세요");
      int year = Integer.parseInt(s.nextLine());
      
      while(true){
         if(year!=2020){
            System.out.println("년도를 다시입력해주세요 ex)2020");
            year = Integer.parseInt(s.nextLine());
         }else{
            break;
         }
      }
      System.out.println("월을 입력해주세요");
      int month = Integer.parseInt(s.nextLine());
      
      while(true){
         if(month>12 || month<1){
            System.out.println("다시 입력해주세요. 월은 1월부터 12월 까지입니니다.");
            month = Integer.parseInt(s.nextLine());
         }else{
            break;
         }
      }

      System.out.println("일을 입력해주세요");
      cal.set(year, month, 1);
      cal.add(Calendar.DATE, -1);
      
      int endDate = cal.get(Calendar.DATE);
      int date = Integer.parseInt(s.nextLine());
      while(true){
         if(endDate<date){
            System.out.println("다시 입력해주세요. 해당월의 마지막 일수는 " +endDate+ "입니다.");
            date = Integer.parseInt(s.nextLine());
         }else{
            break;
         }
      }
      System.out.println("시간을 입력하세요 ex)15시 : 15");
      int hour = Integer.parseInt(s.nextLine());
      cal.set(Calendar.HOUR_OF_DAY, hour);
      
      System.out.println("분을 입력하세요 ex)30분: 30");
      int MINUTE = Integer.parseInt(s.nextLine());
      
      cal.set(Calendar.MINUTE, MINUTE);
      theaterScheduleVO.setScheduleNum(scheduleNum);
      theaterScheduleVO.setMovieNum(movieNum);
      theaterScheduleVO.setTheaterNum(theaterNum);
      theaterScheduleVO.setMovieStartTime(cal);
      
      teaterScheduleDAO.insertTheaterSchedule(theaterScheduleVO);

   }
   
   void theaterscheduledelete(){
      
      System.out.println("삭제하실 영화상영일을 선택해주세요");
      for (int i = 0; i < theaterScheduleDAO.selectTheaterScheduleList().size(); i++) {
         System.out.println((i + 1) + ". (상영관) "
               + "상영시간표번호 :" +theaterScheduleDAO.selectTheaterScheduleList().get(i).getScheduleNum()
               + "영화관번호 :"+ theaterScheduleDAO.selectTheaterScheduleList().get(i).getMovieNum()
               + "상영관번호 :"+theaterScheduleDAO.selectTheaterScheduleList().get(i).getTheaterNum()
               + "시간 :"+ theaterScheduleDAO.selectTheaterScheduleList().get(i).getMovieStartTime()
               .get(Calendar.HOUR_OF_DAY)
               + "분 :"+theaterScheduleDAO.selectTheaterScheduleList().get(i).getMovieStartTime()
               .get(Calendar.MINUTE) 
               );
      }
      System.out.println("------------------------------------");
      System.out.println("9.관리자화면으로 이동");
      int input = Integer.parseInt(s.nextLine());
      if (input == 9) {
         return;
      }
      
      theaterScheduleDAO.deleteTheaterSchedule(input-1);
      System.out.println("*선택하신 영화관이 폐쇠되었습니다*");
   }
   

   // 5번. 스낵추가
   void snackAdd() {      
        SnackVO snack = new SnackVO();
        SnackCategoryVO snackCartegory = new SnackCategoryVO();
         
         int SnackNum = snackDAO.selectSnackList().get(snackDAO.selectSnackList().size() - 1).getSnackNum() + 1;
         snack.setSnackNum(SnackNum);
         System.out.println("------------------------------------");
         System.out.println("추가하실 스낵의 종류를 선택해주세요>");
         System.out.println("1.팝콘  2.음료  3.스낵류   4.세트");
         int sm_type = Integer.parseInt(s.nextLine());
         if(sm_type>4 || sm_type<1){
        	 System.out.println("다시 입력해주세요");
        	 snackAdd();
        	 return;
         }
         System.out.println("스낵의 이름을 입력해주세요");
         String snack_name = s.nextLine();
         System.out.println("스낵의 금액을 입력해주세요(숫자로만 입력해주세요)");
         int snack_price = Integer.parseInt(s.nextLine());

         switch (sm_type) {
         case 1:
            snackCartegory.setSnackCategoryName("팝콘"); // 팝콘 저장
            break;
         case 2:
            snackCartegory.setSnackCategoryName("음료"); // 음료 저장
            break;
         case 3:
            snackCartegory.setSnackCategoryName("스낵류"); // 스낵류 저장
            break;
         case 4:
            snackCartegory.setSnackCategoryName("세트"); // 세트 저장
            break;
         default:
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            snackAdd();
            break;
         }

         snack.setSnackName(snack_name);
         snack.setSnackPrice(snack_price);
         snack.setSnackCategoryNum(sm_type-1);
         snackDAO.insertSnack(snack);
         snackCategoryDao.insertSnackCategory(snackCartegory);
         
         System.out.println("*입력하신 스낵이 추가되었습니다*");
      }

   // 6번. 스낵 삭제
   void snackDelete() {
      System.out.println("삭제하실 스낵을 선택해주세요");
      for (int i = 0; i < snackDAO.selectSnackList().size(); i++) {
         System.out.println((i + 1) + ". (스낵명) "
               + snackDAO.selectSnackList().get(i).getSnackName() + "\t"
               + "(스낵금액) "
               + snackDAO.selectSnackList().get(i).getSnackPrice());
      }
      System.out.println("------------------------------------");
      System.out.println("9.관리자화면으로 이동");
      int input = Integer.parseInt(s.nextLine());
      if (input == 9) {
         return;
      }

      snackDAO.deleteSnack(input - 1);

      System.out.println("*선택하신 스낵이 삭제되었습니다*");

   }

   // 7-1번. 영화목록 확인
   void movieView() {
      System.out.println("-------------------영화목록--------------------");
      for (int i = 0; i < movieDAO.selectMovieList().size(); i++) {
         System.out.println("(영화고유번호): "
               + movieDAO.selectMovieList().get(i).getMovieNum()
               + "\t"
               + "\n(영화명): "
               + movieDAO.selectMovieList().get(i).getMovieName()
               + "\t"
               + "\n(출연진): "
               + movieDAO.selectMovieList().get(i).getMovieCast()
               + "\t"
               + "\n(관람연령): "
               + movieDAO.selectMovieList().get(i).getMovieRating()
               + "\t"
               + "\n(영화감독): "
               + movieDAO.selectMovieList().get(i).getMovieDirector()
               + "\n"
               + "(줄거리): "
               + movieDAO.selectMovieList().get(i).getMovieStory()
               + "\t"
               + "\n(러닝타임): "
               + movieDAO.selectMovieList().get(i).getRunTime()
                     .get(Calendar.HOUR_OF_DAY)
               + "시간"
               + +movieDAO.selectMovieList().get(i).getRunTime()
                     .get(Calendar.MINUTE) + "분");
      }
      System.out.println("------------------------------------");
      System.out.println("9.관리자화면으로 이동");
      int input = Integer.parseInt(s.nextLine());
      if (input == 9) {
         return;
      }
   }

   // 7-2번. 스낵목록 확인
   SnackCategoryDAO snackCategoryDao = SnackCategoryDAO.getInstance();

   void snackView() {
      System.out.println("--------------스낵목록----------------");
      ArrayList<String> ss = new ArrayList<String>();
      for (int i = 0; i < snackDAO.selectSnackList().size(); i++) {
         for (int j = 0; j < snackCategoryDao.selectSnackCategoryList()
               .size(); j++) {
            if (snackCategoryDao.selectSnackCategoryList().get(j)
                  .getSnackCategoryName().equals("팝콘")) {
               ss.add("팝콘");
            } else if (snackCategoryDao.selectSnackCategoryList().get(j)
                  .getSnackCategoryName().equals("음료")) {
               ss.add("음료");
            } else if (snackCategoryDao.selectSnackCategoryList().get(j)
                  .getSnackCategoryName().equals("스낵류")) {
               ss.add("스낵류");
            } else if (snackCategoryDao.selectSnackCategoryList().get(j)
                  .getSnackCategoryName().equals("세트")) {
               ss.add("세트");
            }
         }
         System.out.println("(스낵고유번호): "
               + snackDAO.selectSnackList().get(i).getSnackNum() + "\t"
               + "(스낵명): "
               + snackDAO.selectSnackList().get(i).getSnackName() + "\t"
               + "(스낵종류): " + ss.get(i) + "\t" + "(금액): "
               + snackDAO.selectSnackList().get(i).getSnackPrice() + "\t");
      }
      System.out.println("------------------------------------");
      System.out.println("9.관리자화면으로 이동");
      int input = Integer.parseInt(s.nextLine());
      if (input == 9) {
         return;
      }
   }

}