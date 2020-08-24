package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * �츮�� ����� Java, Oracle, HTML,CSS,JQuery, JSP ������ 50 ~100 ����
		 * �������� ���� �����ֽð�, ���������� ����, �̸�, ���� ����, ����, ����� ������ּ���.
		 * ����	  �̸� 	 Java	 Oracle	 HTML	CSS	 JQuery	 JSP	 ����	 ���
		 * 	1      ȫ�浿		  80	  90	 100	90		70	 60		500	 80
		 *  2      ȫ�浿		  80	  90	 100	90		70	 60		500	 80
		 *  3      ȫ�浿		  80	  90	 100	90		70	 60		500	 80
		 *  4      ȫ�浿		  80	  90	 100	90		70	 60		500	 80
		 */
		
		
	
		int[][] scores = new int [4][6]; //int[�л���][�����]
		String[] name = new String[]{"���ֿ�","���O��","������","�ڼ���"}; 

		
		//���� ����
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j]= (int)(Math.random()*50+51);
			}
			
		}
		
		//���� ���
		int[]sum = new int [scores.length];//����
		double[]avg = new double [scores.length];//���
		
		for(int i =0; i <scores.length; i++){
		   for(int j =0; j<scores[i].length; j++){
				sum[i] += scores[i][j]; 
				}
		   avg[i] = (double) sum[i]/scores[i].length;
		}
		
		//���
		int[] rank = new int[sum.length]; 
		
		for(int i =0; i <sum.length; i++){
			rank[i] = 1;
		}
		for(int i = 0; i < sum.length; i++){
			for(int j= 0; j <sum.length; j++){
				if(sum[i] < sum[j]){
					
					rank[i] += 1;   
				}
			}
		}
			//��������(�������� �̿�)
		
			for(int i = 0; i<sum.length-1; i++){
				for(int j = i+1; j <sum.length;j++){
					if(sum[i]<sum[j]){
						int tmp = rank[i];
						 rank [i] = rank[j];
						 rank[j] = tmp;
						 
						 tmp = sum[i];
						 sum[i] = sum[j];
						 sum[j] = tmp;
						 
						 
						 double tmp2 = avg[i];
						 avg[i] = avg[j];
						 avg[j] = tmp2;
						
						
						 
						 String temp4 = name[i];
						 name[i] = name[j];
						 name[j] = temp4;
						 
						 for(int k = 0; k< scores[i].length; k++){
							 int temp = scores[i][k];
							 scores[i][k] = scores[j][k];
							 scores[i][k]=temp;
						
						
						 }
				}
			}	
	}	
	//���
	System.out.println("���� \t�̸�\tJAVA\tOracle\tHTML\tCSS\tJQuery \tjsp\t���� \t���\t");
	for(int i = 0; i <scores.length;i++){
		System.out.print(rank[i]+"\t"+name[i]+"\t");
		for(int j =0; j < scores[i].length; j++){
			System.out.print(scores[i][j]+"\t");
		}
		System.out.println(sum[i]+"\t"+avg[i]);
		
	
	
	
	
	
	}	
}
}
