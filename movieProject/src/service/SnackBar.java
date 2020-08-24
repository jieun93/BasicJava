package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.SnackCartVO;
import vo.SnackVO;
import dao.SnackCartDAO;
import dao.SnackCategoryDAO;
import dao.SnackDAO;
import data.Session;

//������ ����
public class SnackBar {

   static Scanner s = new Scanner(System.in);
   
   public static void popcornMenu() {

      boolean check = false; //�̹� ����ִ��� Ȯ���� ����
      SnackDAO snackDAO = SnackDAO.getInstance();
      ArrayList<SnackVO> popcornList = new ArrayList<SnackVO>();
      SnackCategoryDAO snackCategoryDAO = SnackCategoryDAO.getInstance();

      do {
         //ī�װ� ����
         System.out.println("------------------------------------");
         System.out.println("����\tī�װ���");
         System.out.println("------------------------------------");
         for (int i = 0; i < snackCategoryDAO.selectSnackCategoryList()
               .size(); i++) {
            System.out.println(" " + (1 + i) + "\t" + snackCategoryDAO.selectSnackCategoryList().get(i).getSnackCategoryName());
         }
         System.out.println();
         System.out.println(" 0\t�ʱ�ȭ������");
         
         
         System.out.println("------------------------------------");
         System.out.println("�����Ͻ� ī�װ� ��ȣ�� �������ּ���.");
         System.out.println("------------------------------------");
         String temp = s.nextLine().trim();
         
         //�����޴��� ���ư���
         if (temp.equals("0")) {
            return;
         } 
         
         //�޴�����
         else {
            int CategoryKey = snackCategoryDAO.selectSnackCategoryList().get(Integer.parseInt(temp) - 1).getSnackCategoryNum();
            //�Է¹��� ī�װ� ��ȣ�� ���ں�ȯ�ؼ� �ε���(-1)�� ���� -> ī�װ� �ѹ� ������
            
            //ī�װ� ���
            for (int i = 0; i < snackDAO.selectSnackList().size(); i++) {
               if (snackDAO.selectSnackList().get(i).getSnackCategoryNum() == CategoryKey) {
                  popcornList.add(snackDAO.selectSnackList().get(i));
               }
            }
            
            System.out.println("------------------------------------");
            System.out.println("����\t�޴�\t\t����");
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
            System.out.println("0\t�ʱ�ȭ������");
            System.out.println("------------------------------------");
            System.out.println("���� �ش��ȣ�� �Է����ּ���>");

            temp = s.nextLine().trim();
            if (temp.equals("0")) {
               check = true;
            } else {
               int snackNum = popcornList.get(Integer.parseInt(temp) - 1)
                     .getSnackNum();

               System.out.println(popcornList.get(
                     Integer.parseInt(temp) - 1).getSnackName()
                     + "�� �����ϼ̽��ϴ�.");
               System.out.println("�ֹ��Ͻ� ������ �Է����ּ���.");

               int count = Integer.parseInt(s.nextLine().trim());
               // ������ ���ܹ�ȣ
               SnackCartDAO snackCartDAO = SnackCartDAO.getInstance();
               SnackCartVO snackCartVO = new SnackCartVO();
               snackCartVO.setSnackCartNum(snackCartDAO.selectSnackCartList().size());
               snackCartVO.setUserId(Session.loginUser.getUserId());
               snackCartVO.setSnackCount(count);
               snackCartVO.setSnackNum(snackNum);
               snackCartVO.setPaymentNum(-1);
               
               snackCartDAO.insertSnackCart(snackCartVO);
               
               System.out.println("1.��ٱ��Ϸ� �̵�  2.�ʱ�ȭ������ �̵�");
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