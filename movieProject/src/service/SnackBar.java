package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.SnackCartVO;
import vo.SnackVO;
import dao.SnackCartDAO;
import dao.SnackCategoryDAO;
import dao.SnackDAO;
import data.Session;

//스낵바 구매
public class SnackBar {

   static Scanner s = new Scanner(System.in);
   
   public static void popcornMenu() {

      boolean check = false; //이미 담겨있는지 확인할 변수
      SnackDAO snackDAO = SnackDAO.getInstance();
      ArrayList<SnackVO> popcornList = new ArrayList<SnackVO>();
      SnackCategoryDAO snackCategoryDAO = SnackCategoryDAO.getInstance();

      do {
         //카테고리 선택
         System.out.println("------------------------------------");
         System.out.println("순번\t카테고리명");
         System.out.println("------------------------------------");
         for (int i = 0; i < snackCategoryDAO.selectSnackCategoryList()
               .size(); i++) {
            System.out.println(" " + (1 + i) + "\t" + snackCategoryDAO.selectSnackCategoryList().get(i).getSnackCategoryName());
         }
         System.out.println();
         System.out.println(" 0\t초기화면으로");
         
         
         System.out.println("------------------------------------");
         System.out.println("선택하실 카테고리 번호를 선택해주세요.");
         System.out.println("------------------------------------");
         String temp = s.nextLine().trim();
         
         //이전메뉴로 돌아가기
         if (temp.equals("0")) {
            return;
         } 
         
         //메뉴고르기
         else {
            int CategoryKey = snackCategoryDAO.selectSnackCategoryList().get(Integer.parseInt(temp) - 1).getSnackCategoryNum();
            //입력받은 카테고리 번호를 숫자변환해서 인덱스(-1)로 접근 -> 카테고리 넘버 가져옴
            
            //카테고리 출력
            for (int i = 0; i < snackDAO.selectSnackList().size(); i++) {
               if (snackDAO.selectSnackList().get(i).getSnackCategoryNum() == CategoryKey) {
                  popcornList.add(snackDAO.selectSnackList().get(i));
               }
            }
            
            System.out.println("------------------------------------");
            System.out.println("순번\t메뉴\t\t가격");
            System.out.println("------------------------------------");
            for (int i = 0; i < popcornList.size(); i++) {

               String name = popcornList.get(i).getSnackName();
               if (name.length() > 6) {
                  name += "\t";
               } else {
                  name += "\t\t";
               }
               System.out.println(1 + i + "\t" + name
                     + popcornList.get(i).getSnackPrice());
            }
            System.out.println();
            System.out.println("0\t초기화면으로");
            System.out.println("------------------------------------");
            System.out.println("다음 해당번호를 입력해주세요>");

            temp = s.nextLine().trim();
            if (temp.equals("0")) {
               check = true;
            } else {
               int snackNum = popcornList.get(Integer.parseInt(temp) - 1)
                     .getSnackNum();

               System.out.println(popcornList.get(
                     Integer.parseInt(temp) - 1).getSnackName()
                     + "을 선택하셨습니다.");
               System.out.println("주문하실 수량을 입력해주세요.");

               int count = Integer.parseInt(s.nextLine().trim());
               // 마지막 팝콘번호
               SnackCartDAO snackCartDAO = SnackCartDAO.getInstance();
               SnackCartVO snackCartVO = new SnackCartVO();
               snackCartVO.setSnackCartNum(snackCartDAO.selectSnackCartList().size());
               snackCartVO.setUserId(Session.loginUser.getUserId());
               snackCartVO.setSnackCount(count);
               snackCartVO.setSnackNum(snackNum);
               snackCartVO.setPaymentNum(-1);
               
               snackCartDAO.insertSnackCart(snackCartVO);
               
               System.out.println("1.장바구니로 이동  2.초기화면으로 이동");
               int input = Integer.parseInt(s.nextLine());
               if(input==1) {
            	   Cart cart = new Cart();
            	   cart.cart();
               }
               check = false;
            }
            
         }
      } while (check);
   }
   
   
   
}