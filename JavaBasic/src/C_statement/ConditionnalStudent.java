package C_statement;

import java.util.Scanner;

public class ConditionnalStudent {

	public static void main(String[] args) {
		
		/*
		 * <<if��>>
		 * - if : ���ǽ��� ����� ture�̸� ������ ������ �����Ѵ�.
		 * - else if : �ټ��� ������ �ʿ��Ҷ� if �ڿ� �߰��Ѵ�.
		 * - else : ����� true�� ���ǽ��� �ϳ��� ���� ��츦 ���� �߰��Ѵ�.
		 * 
		 */
		
		
		int a = 10;
		
		if(a < 100){
			System.out.println("���ǽ��� �������� true�̸� ����ȴ�.");
		}
		
		
		if(a < 10){
			System.out.println("���ǽ��� �������� false �̸� ������� �ʴ´�.");
		}
		
		
		int regNo = 2; //�ֹε�Ϲ�ȣ ù�ڸ�
		String gender = null;//���� 
		
		if(regNo == 1){
		 gender = "����";
		} else if(regNo == 2){//if�� �ڿ� else if�� ������ �߰��Ҽ��մ�.
			gender = "����";
		} else if (regNo == 3){
		   gender = "����";
	    }else if (regNo == 4){
	       gender ="����";
	    }else{//true �� ���ǽ��� �ϳ��� ������ ����ȴ�.else�� ���ǽ��� ����.
	       
	    	 gender = "Ȯ�κҰ�";
	    }
		System.out.println("����� ������"+gender +"�Դϴ�.");
	   		
		int score = 88;
		String grade = null;
		
		if(90 <= score){
			 grade = "A";
		}else if (80 <= score && score <90){
			grade = "B";
		}else if (70 <= score && score <80){
			grade = "C";
		}else if (60 <= score && score < 70){
			grade = "D";
		}else if (50 <= score && score < 60){
			grade = "E";
		}else {
			grade = "F";
		}
		System.out.println(score+"���� �ش��ϴ� ������"+grade+"�Դϴ�.");
		
		
		score = 100;
		grade = null;
		if(90 <= score){
			grade = "A";
			if(97 <= score){
				grade += "+";
				//grade = grade + "+";
				
			}else if (score <= 93){
				grade += "-";
			//grade = grade + "-";	
			}
			
		}else if(80 <= score){
			grade = "B";
			if(87 <= score){
				grade += "+";
			}else if (score <= 83){
				grade += "-";
			}	
				
		}else if (70 <= score){
			grade  = "C";
			if (77 <= score){
				grade += "+";
			}else if (score <=73){
				 grade += "-";
			}
			}else{
	    	 grade = "F";
			}
		System.out.println(score+"���� �ش��ϴ� �����"+grade+"�Դϴ�.");
		
		
		
		
		
		/*
		 * <<switch ��>>
		 * ���ǽİ� ��ġ�ϴ� case �� ������ ������ �����Ѵ�.
		 * ���ǽ��� ����� ������ ���ڿ��� (JDK1.7���� ���ڿ� ���) ����Ѵ�.
		 * case���� �����θ� �Է� ���� �񱳹��ȵ�
		 */
		
		regNo = 2;
	    gender =  null;
	   switch(regNo){
	   	case 1 : case 3 :
	   		gender = "����";
	   		break;
	   	case 2 : case 4 :
	   	  gender = "����";
	   	  break;
	   	  
	   	  default://if ���� else�� ���� ������ �Ѵ�.
	   		  gender = "Ȯ�κҰ�";
	   		  
	   }
		System.out.println("����� ������"+gender +"�Դϴ�.");
				
		
		score = 95;
		grade = null;
		switch(score/10){
		case 9 :
			grade = "A";
			break;
		case 8 :
			grade = "B";
			break;
		default :
			grade = "F";
		}
			System.out.println("����� ������"+grade +"�Դϴ�.");
		
			
			//���ڸ� �Է¹޾�  �� ���ڰ� 0 ���� 0�� �ƴ����� ������ּ���.
			Scanner s = new Scanner(System.in);
			
			System.out.println("���ڸ� �Է����ּ���>");
			int input = Integer.parseInt(s.nextLine());
			
			if(input == 0){
				
			System.out.println("0�Դϴ�");
			}else{
				System.out.println("0�� �ƴմϴ�.");
				
				
				
				
				
				
				
				
	
			}
	}
}

			
           
           
		
		
	     
	    		 	
		
		// TODO Auto-generated method stub



