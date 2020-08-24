package dao;

import java.util.ArrayList;

import vo.SnackCartVO;
import data.Database;
import data.Session;

public class SnackCartDAO {
   private static SnackCartDAO instance;

   private SnackCartDAO() {}

   public static SnackCartDAO getInstance() {
      if (instance == null) {
         instance = new SnackCartDAO();
      }
      return instance;
   }

   Database database = Database.getInstance();

   public void insertSnackCart(SnackCartVO snackCart) {
      boolean check = false;
   
      if(database.tb_snackCart.isEmpty()){
         snackCart.setSnackCartNum(0);
         snackCart.setUserId(Session.loginUser.getUserId());
         database.tb_snackCart.add(snackCart);
      }else{
         for(int i = 0; i < database.tb_snackCart.size();i++){
            if(database.tb_snackCart.get(i).getSnackNum()==snackCart.getSnackNum()&&database.tb_snackCart.get(i).getPaymentNum()<0){
               check = true;   
            }
            if(check){
               database.tb_snackCart.get(i).setSnackCount(database.tb_snackCart.get(i).getSnackCount()+snackCart.getSnackCount());
             break;
            }
         }
         
         if(!check){
            snackCart.setSnackCartNum(database.tb_snackCart.get(database.tb_snackCart.size()-1).getSnackCartNum()+1);
            snackCart.setUserId(Session.loginUser.getUserId());
            database.tb_snackCart.add(snackCart);
         }
      }
      
   
   }

   public ArrayList<SnackCartVO> selectSnackCartList() {
      return database.tb_snackCart; // ¸®ºä¸®½ºÆ®
   }

   public void deleteSnackCart(SnackCartVO snackCart) {
      database.tb_snackCart.remove(snackCart);
   }
}