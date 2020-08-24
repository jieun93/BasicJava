package z_exam;

public class Exam03 {

	public static void main(String[] args) {
		
		//연습문제
				//3-1
				int ex = 2;
				int yi = 5;
				char ce = 'A';
				
				System.out.println(yi >= 5 || ex < 0 && ex >2);//true
				System.out.println(yi += 10 - ex++);//5-->13
				System.out.println(ex+=2);//4-->5
				System.out.println(! ('A' <= ce && ce <='z'));//false
				System.out.println('C'-ce);//2
				System.out.println('5'-'0');//5
				System.out.println(ce+1);//66
				System.out.println(++ce);//B
				System.out.println(ce++);//B
				System.out.println(ce);//C
				
				//3-2
				int numOfApples = 123;
				int sizeOfBucket = 10;
				int numOfBucket = numOfApples / sizeOfBucket +(numOfApples%sizeOfBucket>0?1:0);
				
				System.out.println("필요한 바구니의 수 : "+numOfBucket);//13
				
				
				
				//3-3
				int num = 10;
				System.out.println (num > 0 ? "양수" :(num<0 ? "음수": "0"));//양수
				
				
				
				//3-4
				int numb =456;
				System.out.println((numb/100)*100);
				
				
				//3-5
				int num1 = 333;
				System.out.println(num1/10*10+1);
				
				//3-6
				
				int num2 = 24;
				System.out.println( 10-num2%10);
			
				
				
				//3-7
				int fahrenheit = 100;
				float celcius =((int) (5/9f *(fahrenheit-32)*100+0.5)/100f);
				
				System.out.println("Fahrenheit:"+fahrenheit);
				System.out.println("Celcius:"+celcius);
				
				
				
				
				//3-8
				byte a = 10;
				byte b = 20;
				byte c = (byte)(a + b);
				
				char ch = 'A';
				ch = (char)(ch + 2);
				
				float f = (float)3/2;
				long l = 3000L * 3000 * 3000;
				
				float f2 = 0.1f;
				double d = (float)0.1;
				
				boolean result = d==f2;
				
				System.out.println("c="+c);//c=30		
				System.out.println("ch="+ch);//ch=c
				System.out.println("f="+f);//f=1.5		
				System.out.println("l="+l);//l=27000000000
				System.out.println("result="+result);//result=true
				
				//3-9
				char ch1 ='z';
				boolean b1 = ('a'<=ch1&&ch1<='z')||('A'<=ch1&&ch1<='Z')||('0'<=ch1&&ch1<='9');
						
			 System.out.println(b1);
				
						
				
				//3-10
				char ch2 ='A';
				char lowerCase = ('A'<=ch&&ch<='Z'?(char)(ch+32) : ch);
				
				
							
				
				
				
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
				
				
				

				
			
				
				
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
