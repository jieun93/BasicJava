package z_exam;

import java.util.Arrays;

public class Exam05 {

	public static void main(String[] args) {
//		
//		//5-3
//		int[] arr1 = {10, 20, 30, 40, 50};
//		int sum = 0;
//		
//		for(int i =0; i<arr1.length; i++){
//			sum =  sum+arr1[i];
//			
//		}System.out.println("sum="+sum);
//		
//		System.out.println();
//		//5-4
//		int[][] arr = {
//				{ 5, 5, 5, 5, 5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//				};
//				int total = 0;
//				float average = 0;
//				
//				for(int i=0; i <arr.length;i++){
//					for(int j =0; j <arr[i].length; j++){
//						total += arr[i][j]; 
//					} average = (float) total/(arr.length);
//				}
//				
//				System.out.println("total="+total);
//				System.out.println("average="+average);
//		
//		//5-5
//			int[] ballArr = {1,2,3,4,5,6,7,8,9};
//			int[] ball3 = new int[3];
//			// �迭 ballArr�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�.
//			for(int i=0; i< ballArr.length;i++) {
//			int j = (int)(Math.random() * ballArr.length);
//			int tmp = 0;
//			
//			tmp = ballArr[i];
//			ballArr[i] = ballArr[j];
//			ballArr[j] = tmp;
//						
//			}
//			System.out.println(Arrays.toString(ballArr));
//			// �迭 ballArr�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�.
//			
//			for( int i = 0; i < ball3.length; i++){
//				ball3[i] = ballArr[i];
//			}
//			
//			for(int i=0;i<ball3.length;i++) {
//			System.out.print(ball3[i]);
//			}
//			
//			// �迭 ballArr�� �ڿ��� 3���� ���� �迭 ball3�� �����Ѵ�.
//			
//			/*int a = ballArr.length-3;
//			for( int i = 0; i < ball3.length; i++){
//			   ball3[i] = ballArr[a];
//			   a++;
//			}
//				 
//						
//			for(int i = 0; i < ball3.length; i++) {
//				System.out.print(ball3[i]);
//				}*/
//			
//			System.out.println();
//			
//			
//					
//			//5-6
//					int[]coinUnit = {500,100,50,10};
//					
//					int money = 2680;
//					System.out.println("money="+money);
//					for(int i = 0; i < coinUnit.length; i++){
//						int a = money/coinUnit[i];
//						money = money%coinUnit[i];
//						System.out.println(coinUnit[i]+"��"+a);
//						
//					}
//					
//			//5-7
//			//���� 5-6�� ������ ������ �߰��� ���α׷��̴�.
//			//Ŀ�ǵ�������κ��� �Ž��� ��  �ݾ��� �Է¹޾� ����Ѵ�. 
//			//������ ������ ������ �Ž������� ������ �� ������, ���Ž��� ���� �����մϴ�.����� ����ϰ� �����Ѵ�.
//	        //������ ���� ����� ������, �Ž������� ����  ��  ��ŭ ���� ������ ���� ���� ������ ������ ȭ�鿡 ����Ѵ�. 
//			//(1)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.		
//
//					
//						// ���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�.
//				
//						
//						System.out.println("money="+money);
//						
//						int[] coinUnit1 = {500, 100, 50, 10 }; // ������ ����
//						int[] coin = {5, 5, 5, 5}; // ������ ������ ����
//						
//						for(int i = 0; i < coinUnit1.length; i++) {
//						int coinNum = 0;
//						/* (1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
//						1. �ݾ�(money)�� ���������� ������ �ʿ��� ������ ����(coinNum)�� ���Ѵ�.*/
//						coinNum = money/coinUnit1[i];
//						
//						/*2. �迭 coin���� coinNum��ŭ�� ������ ����.
//						(���� ����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ�� ����.)*/
//						if(coin[i]>=coinNum){
//							coin[i]-=coinNum;
//						}else{
//							coinNum = coin[i];
//							coin[i]=0;
//						}
//							
//						/*3. �ݾ׿��� ������ ����(coinNum)�� ���������� ���� ���� ����.
//						*/
//						money -= (coinNum*coinUnit[i]);
//						
//						
//						System.out.println(coinUnit[i]+"��: "+coinNum);
//						}
//						
//						if(money > 0) {
//						System.out.println("�Ž������� �����մϴ�.");
//						System.exit(0); // ���α׷��� �����Ѵ�.
//						}
//						
//						System.out.println("=���� ������ ���� =");
//						
//						for(int i=0;i<coinUnit.length;i++) {
//						System.out.println(coinUnit[i]+"��:"+coin[i]);
//						}
//						
//						
//						//5-8
//						
////						//������ �迭 answer�� ��� �����͸� �а� �� ������ ������ ��� ������ŭ ��*��
////						�� �� �׷����� �׸��� ���α׷��̴�. (1)~(2)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�.
//						
//						int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
//						int[] counter = new int[4];//
//						
//						for (int i = 0; i < answer.length; i++) {
////							if(answer[i]==1){
////								counter[0]++;
////							}else if(answer[i]==2){
////								counter[1]++;
////							}else if(answer[i]==3){
////								counter[2]++;
////							}else{
////								counter[3]++;
////							}
//							counter[answer[i]-1]++;
//							
//						}
//						//3 2 2 4
//						
//						
//						for(int i=0; i < answer.length; i++) {
//							 counter[answer[i] -1]++;
//						 }
//						
//						
						
						//5-9
						
						//public static void main(String[] args) {
//							char[][] star = {
//							{'*','*',' ',' ',' '},
//							{'*','*',' ',' ',' '},
//							{'*','*','*','*','*'},
//							{'*','*','*','*','*'}
//							};
//							
//							char[][] result = new char[star[0].length][star.length];
//							for(int i=0; i < star.length; i++) {
//							for(int j=0; j < star[i].length; j++) {
//							System.out.print(star[i][j]);
//							}
//							System.out.println();
//							}
//							System.out.println();
//							for(int i=0; i < star.length;i++) {
//							for(int j=0; j < star[i].length;j++) {
//							 int x = j;
//							 int y = star.length-1-i;
//							 
//							 result[x][y]=star[i][j];
//							
//							}
//							}
//							for(int i=0; i < result.length;i++) {
//							for(int j=0; j < result[i].length;j++) {
//							System.out.print(result[i][j]);
//							}
//							System.out.println();
//							}
//							
//						
////							//class Exercise5_10 {
////								public static void main(String[] args) {
//								char[] abcCode =
//								{ '`','~','!','@','#','$','%','^','&','*',
//								'(',')','-','_','+','=','|','[',']','{',
//								'}',';',':',',','.','/'};
//								// 0 1 2 3 4 5 6 7 8 9
//								char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
//								String src = "abc123";
//								String result = "";
//								// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
//								for(int i=0; i < src.length();i++) {
//								char ch = src.charAt(i);
//								
//								if('a' <= ch && ch <='z'){
//									result += abcCode[ch-'a'];
//								}else if('0' <=ch&&ch<='9'){
//									result += numCode[ch-'0'];
//								}
//								
//								}
//								System.out.println("src:"+src);
//								System.out.println("result:"+result);
								
								//class Exercise5_11
								int[][] score = {
									{100, 100, 100}
									, {20, 20, 20}
									, {30, 30, 30}
									, {40, 40, 40}
									, {50, 50, 50}
									};
									int[][] result = new int[score.length+1][score[0].length+1];
									for(int i=0; i < score.length;i++) {
										for(int j=0; j < score[i].length;j++) {
									result[i][j]=score[i][j];
									result[i][score[0].length]+= result[i][j];
									result[score.length][j]+= result[i][j];
									result[score.length][score[0].length]+=result[i][j];
										}
									}
									for(int i=0; i < result.length;i++) {
										for(int j=0; j < result[i].length;j++) {
											System.out.printf("%4d",result[i][j]);
									}
										System.out.println();
									}
								
									
									
									
}	
}

	


