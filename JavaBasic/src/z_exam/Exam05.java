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
//			// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
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
//			// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
//			
//			for( int i = 0; i < ball3.length; i++){
//				ball3[i] = ballArr[i];
//			}
//			
//			for(int i=0;i<ball3.length;i++) {
//			System.out.print(ball3[i]);
//			}
//			
//			// 배열 ballArr의 뒤에서 3개의 수를 배열 ball3로 복사한다.
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
//						System.out.println(coinUnit[i]+"원"+a);
//						
//					}
//					
//			//5-7
//			//문제 5-6에 동전의 개수를 추가한 프로그램이다.
//			//커맨드라인으로부터 거슬러 줄  금액을 입력받아 계산한다. 
//			//보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름 돈이 부족합니다.’라고 출력하고 종료한다.
//	        //지불할 돈이 충분히 있으면, 거스름돈을 지불  한  만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. 
//			//(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.		
//
//					
//						// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
//				
//						
//						System.out.println("money="+money);
//						
//						int[] coinUnit1 = {500, 100, 50, 10 }; // 동전의 단위
//						int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
//						
//						for(int i = 0; i < coinUnit1.length; i++) {
//						int coinNum = 0;
//						/* (1) 아래의 로직에 맞게 코드를 작성하시오.
//						1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.*/
//						coinNum = money/coinUnit1[i];
//						
//						/*2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
//						(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)*/
//						if(coin[i]>=coinNum){
//							coin[i]-=coinNum;
//						}else{
//							coinNum = coin[i];
//							coin[i]=0;
//						}
//							
//						/*3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
//						*/
//						money -= (coinNum*coinUnit[i]);
//						
//						
//						System.out.println(coinUnit[i]+"원: "+coinNum);
//						}
//						
//						if(money > 0) {
//						System.out.println("거스름돈이 부족합니다.");
//						System.exit(0); // 프로그램을 종료한다.
//						}
//						
//						System.out.println("=남은 동전의 개수 =");
//						
//						for(int i=0;i<coinUnit.length;i++) {
//						System.out.println(coinUnit[i]+"원:"+coin[i]);
//						}
//						
//						
//						//5-8
//						
////						//다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
////						을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
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
//								// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
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

	


