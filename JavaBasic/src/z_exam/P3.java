package z_exam;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1+x<<33);
		System.out.println(y >= 5 || x <0 && x > 2);
	
	
	//3-2
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples/sizeOfBucket)+1;
		
		System.out.println("필요한 바구니의 수:"+numOfBucket);
	
	//3-3
		int num = 10;
		System.out.println((num>0)?"양수":(num<0)?"음수":"0");
	//3-4
		int num1 = 456;
		System.out.println((num1/100)*100);
		
	//3-5
		int num2 = 333;
		System.out.println((num2/10)*10+1);
	
	//3-6	
		int num3 = 24;
		System.out.println(((num3/10)*10+10)-num3);
		
	//3-7
		int fahrenheit = 100;
		float celcius = (float)5/9*(fahrenheit-32);
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
	//3-9
		char ch = 'z';
		boolean b = 'z' == ch && 'Z' == ch;
		System.out.println(b);
	
		//3-10
		
		char ch1 = 'A';
		char lowerCase = (ch1+32 >= 97) ? 'a' : ch1;
		System.out.println("ch1:"+ch1);
		System.out.println("ch to lowerCase:"+lowerCase);
		
		
	//4-2
//		int a = 0;
//		int sum = 0;
//		if(1 <= a && a <= 20){
//			int y = a/20 != 0
//		
	//4-3
	//	1+(1+2)+(1+2+3)+....+(1+2+3+...+10)의결과를계산하시오.
		
		int sum = 0;
		int sum2 =0;
		
		for(int i = 1 ; i <= 10; i++){
			
			sum = sum+i;
			sum2 = sum2 + sum;
			System.out.print(sum2);	
		}
		
	//4-4
	//	1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		
//		 int sum1 = 100;
//		for(int i = 1; i < sum1; i+=2){
//			for(int j = -2; j <sum1; j-=2)
//		}
	
		
		//4-5
/*		for(int i =0; i<=10; i++){
			for(int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
		*/
		int i1 = 0;
		
		while(i1<=10){
			System.out.println();
			i1++;
				int j1 = 0;
				while(j1<=i1){
					System.out.println("*");
					j1++;
			}
		}
		
		//4-6
		 int sum3 = 0;
		
		 
		 for(int i = 1; i <=6; i++){
			 for(int j =1; j<=6; j++)
		
				  if(i+j == 6){
					  System.out.println("x="+i+"\t");
					  System.out.println("y="+j);
					  sum3++;
				  }
		 }
		 
		System.out.println("sum3 ="+sum3);
	
		
					
		//4-7
		
		
			int value = (int)(Math.random()*6+1);
			System.out.println("value:"+value);
	
	
		//4-8
			
			//방정식 2x+4y =10
			//범위 0<=x<=10, 0<=y<=10
			
					
			for(int i = 0; i <= 10; i++){
				for(int j =0; j <= 10; j++){
					if((2*i)+(4*j)==10){
						System.out.print("x :"+i+"\t");
						
						System.out.println("y :"+j);
					}
				}
			}	
				
			//4-9
				
				String str ="12345";
				int sum1 = 0;
				
				for(int i =0; i <str.length(); i++){
					sum1 += sum1+i;			
								
			}System.out.println("sum="+sum1);
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		
		

		
		
		
		
	
	
	
	
	}

}
