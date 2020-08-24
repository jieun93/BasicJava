package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 Java, Oracle, HTML,CSS,JQuery, JSP 점수를 50 ~100 까지
		 * 램던으로 생성 시켜주시고, 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 석차	  이름 	 Java	 Oracle	 HTML	CSS	 JQuery	 JSP	 총점	 평균
		 * 	1      홍길동		  80	  90	 100	90		70	 60		500	 80
		 *  2      홍길동		  80	  90	 100	90		70	 60		500	 80
		 *  3      홍길동		  80	  90	 100	90		70	 60		500	 80
		 *  4      홍길동		  80	  90	 100	90		70	 60		500	 80
		 */
		
		
	
		int[][] scores = new int [4][6]; //int[학생수][과목수]
		String[] name = new String[]{"심주영","송횽진","연지은","박선정"}; 

		
		//과목별 점수
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j]= (int)(Math.random()*50+51);
			}
			
		}
		
		//총점 평균
		int[]sum = new int [scores.length];//총점
		double[]avg = new double [scores.length];//평균
		
		for(int i =0; i <scores.length; i++){
		   for(int j =0; j<scores[i].length; j++){
				sum[i] += scores[i][j]; 
				}
		   avg[i] = (double) sum[i]/scores[i].length;
		}
		
		//등수
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
			//순서정렬(선택정렬 이용)
		
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
	//출력
	System.out.println("석차 \t이름\tJAVA\tOracle\tHTML\tCSS\tJQuery \tjsp\t총점 \t평균\t");
	for(int i = 0; i <scores.length;i++){
		System.out.print(rank[i]+"\t"+name[i]+"\t");
		for(int j =0; j < scores[i].length; j++){
			System.out.print(scores[i][j]+"\t");
		}
		System.out.println(sum[i]+"\t"+avg[i]);
		
	
	
	
	
	
	}	
}
}
