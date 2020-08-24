package z_exam;

public class Exam04 {

	public static void main(String[] args) {
		
		//4-1
/*				//1.
				
				if( x > 10 && x <20) 
			
				//2.
				
				if(ch != ' ' || ch != '\t' );
				
				//3.
				if(ch == 'x' || ch == 'X');
				
				//4.
				if( '0' <= ch && ch <='9');
				
				//5
				if('A'<=ch && ch<='Z') ||('a' <= ch && ch <='z');
				
				//6
				int year = 0;
				
				if( year % 400 == 0 || year % 4 == 0 && year % 100 !=0);
						
				//7.
				if(powerOn = false) ;
				
				
				//8
				
				if(str.equals("yes"));
				
				
				//4-2
				int sum = 0;
				for(int i= 1; i<=20; i++) {
					if( i % 2 != 0 || i % 3 != 0 ) {
						sum = sum + i;
					}
			
				}*/
			
			//4-3 
		int a = 0;
		int b = 0;
		for (int i = 1; i <= 10; i++) {
			a += i; // 1 + 2+3
			System.out.print(a + " ");
			b += a; // 1 +1+2 +1+2+3 +
			System.out.print(" " + b);
		}
					
			/*	
			//4-4			 * 
				
				
			//4-5
			

			int i = 0;
			
		while(i<=10) {
			++i;
			int j = 0;
			System.out.println();
			while (j<i){
			j++;
			System.out.print("*");
			
				
			}
			System.out.println(i);
			
			
			//4-6
						
				for(int i = 0; i < 7; i++) {
					for(int j = 0; j <6; i++) {
						if(i+j==6) {
							System.out.println(i+"+"+j+"=6");
						}
					}
				
				}
			//4-7
				int value = (int)(Math.random()*6)+1;
				System.out.println("value:"+value);
				
			//4-8
				for(int x = 0; x<11; x++){
					for(int y = 0; y<11; y++) {
						if(2*x+4*y==10) {
							System.out.println("x="+x+",y="+y);
							System.out.println("2*"+x+"+4*"+y+"=10");
						}
					}
				}
				
			//4-10
				while (num > 0) {

					sum += num%10;

					System.out.println(sum);

					num /= 10;

					System.out.println(num);

				}




				
			//4-11
				for (int i = 3 ; i < 11 ; i++ ) {

					num3 = num1+num2;

					System.out.print(","+num3);

					num1 = num2;

					num2 = num3;




				
				
				
			//4-14
				
					// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
					 
			        int answer = (int)(Math.random()*100+1);
			 
			        int input = 0; // 사용자입력을 저장할 공간
			 
			        int count = 0; // 시도횟수를 세기위한 변수
			 
			        // Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
			 
			        java.util.Scanner s = new java.util.Scanner(System.in);
			 
			        do {
			 
			            count++;
			 
			            System.out.print("1 과 100 사이의 값을 입력하세요 :");
			 
			            input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다
			 
			            if (input<answer) {="" system.out.println(count+"번째,="" 입력값이="" 답보다="" 작아요");="" }else="" if(input="">answer){
			 
			                System.out.println(count+"번째, 입력값이 답보다 큽니다");
			 
			            }else {
			 
			                System.out.println(count+"번째, 정답입니다");
			 
			                break;
			 
			            }
			 
			        } while(true); // 무한반복문



				
			//4-15
				
			        int number = 12321;
			        
			        int tmp = number;   // 거꾸로 변환하기 위해 정의한 함수 tmp를 10으로 나눠
			 
			        int result =0;      // number 변수 를 거꾸로 변환해서 담을 변수
			 
			        while(tmp !=0) {
			 
			            result = result*10 + tmp % 10; //거꾸로 변환된 수는 10씩 키우고 뒤에 가져온 수 붙임
			 
			            System.out.println("result"+result);
			 
			            tmp /= 10;
			 
			            System.out.println("tmp"+tmp);
			 
			        }
			 
			        if(number == result)
			 
			            System.out.println( number + " 는 회문수 입니다.");
			 
			        else
			 
			            System.out.println( number + " 는 회문수가 아닙니다.");*/
			 
//			    } // main
			 
		

	}

}
