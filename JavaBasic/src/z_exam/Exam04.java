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
				
					// 1~100 answer . ������ ������ ���� �� �� �����Ѵ�
					 
			        int answer = (int)(Math.random()*100+1);
			 
			        int input = 0; // ������Է��� ������ ����
			 
			        int count = 0; // �õ�Ƚ���� �������� ����
			 
			        // Scanner ȭ������ ���� ������Է��� �ޱ� ���ؼ� Ŭ���� ���
			 
			        java.util.Scanner s = new java.util.Scanner(System.in);
			 
			        do {
			 
			            count++;
			 
			            System.out.print("1 �� 100 ������ ���� �Է��ϼ��� :");
			 
			            input = s.nextInt(); // input . �Է¹��� ���� ���� �� �����Ѵ�
			 
			            if (input<answer) {="" system.out.println(count+"��°,="" �Է°���="" �亸��="" �۾ƿ�");="" }else="" if(input="">answer){
			 
			                System.out.println(count+"��°, �Է°��� �亸�� Ů�ϴ�");
			 
			            }else {
			 
			                System.out.println(count+"��°, �����Դϴ�");
			 
			                break;
			 
			            }
			 
			        } while(true); // ���ѹݺ���



				
			//4-15
				
			        int number = 12321;
			        
			        int tmp = number;   // �Ųٷ� ��ȯ�ϱ� ���� ������ �Լ� tmp�� 10���� ����
			 
			        int result =0;      // number ���� �� �Ųٷ� ��ȯ�ؼ� ���� ����
			 
			        while(tmp !=0) {
			 
			            result = result*10 + tmp % 10; //�Ųٷ� ��ȯ�� ���� 10�� Ű��� �ڿ� ������ �� ����
			 
			            System.out.println("result"+result);
			 
			            tmp /= 10;
			 
			            System.out.println("tmp"+tmp);
			 
			        }
			 
			        if(number == result)
			 
			            System.out.println( number + " �� ȸ���� �Դϴ�.");
			 
			        else
			 
			            System.out.println( number + " �� ȸ������ �ƴմϴ�.");*/
			 
//			    } // main
			 
		

	}

}
