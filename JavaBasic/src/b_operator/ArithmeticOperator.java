package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * <<1.산술 연산자>>
		 * +:더학기
		 * -:빼기
		 * *:곱하기
		 * /:나누기
		 * %:나머지(몫을제외한나머지)
		 * -이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 * 
		 * 변수:데이터 8가지 + 참조형타입:스트링  총 9가지 타입
		 */
		
		int a = 10 + 20 - 10 * 5 / 10 % 2;
		
		//수학과 같이 *,/,% 연산자가 +,- 보다 연산의 우선순위가 높다.
		//우선순위가동일할경우 왼쪽부터 연산이 수행된다.
		
		
		System.out.println(a);
		
		a = (int)(10+ 20.3);
		//표현범위가 작은쪽에서 큰쪽으로 형변(생략가능)
		//피연산자의 타입이 서로다를경우표현범위가큰쪽으로형변환후연산이수행된다.
		//따라서연산의결과도 표현범위가 큰쪽의타입이된다.
		
		byte b = 10;
		short c = 20;
		
		short d = (short)( c- b);
		//최소 4바이트가되야 연산이 가능하다(int)
		//int 보다작은정수타입은 int로 형변환 후 연산이 수행된다.
		
		long e1 = 100000 * 100000;
		System.out.println(e1);
		
		//최소 하나는 LONG타입으로 바꿔줘야한다.
		long e2 = 100000L * 100000;
		System.out.println(e2);
		
		float f1 = 10 /4;
		System.out.println(f1);
		//소수점이 사라진다.
		float f2 = 10 /4f;
		System.out.println(f2);
		
		
		int f3 = 10 % 4; //10을 4로 나눈 나머지
		System.out.println(f3);
		
		// 정수는 0으로 나눌  수 없다.
		
		// int g1 = 10 / 0;// 런타임 에러 발생
		
		float g2 = 10.0f /0;
		System.out.println(g2);//결과 : infinity : 무한대
		float g3 = 0 / 0f;
		System.out.println(g3);//결과 : NAN --> NOT A NUMBER
		
		char h1 = 'A';
		char h2 = (char)(h1 + 1);
		
		int h3 = 'D' - 'A';
		System.out.println(h3);
		
		
		int h4 ='5' - '0';
		System.out.println(h4);
		
		
		//산술연산자와 대입연사자를 합해 연산시을줄여서표현할수잇다.
		int i = 0;
		
		i = i +1;
		i += 1; //줄여서표현가능
		i += 2;//복합연산자
		//더하는 값이 1인 경우에는 더 줄일수있다.
		++i; //전위형 : 변수가 참조되기 전 수행
		i++; //후위형 : 변수가 참조된 후 수행
		
		//전위형은 증가시킨 다음에 수행한다,후위형 먼저i의값을 읽어와서 실행 후 1을 +
		
		
		i = 0;
		System.out.println("++i = " + ++i);
		i = 0;
		System.out.println("i++= " + i++);
		System.out.println(i);
		
		i = i - 1;
		i -= 1;
		--i;
		i--;
		
		i = i *2;
		i *= 2;
		
		i =i / 3;
		i /= 3;
		
		i = i % 4;
		i %= 4;
		
		double round = 50.6;
		System.out.println((int)(round + 0.5));
		//대괄호를 꼭해야한다.
		//반올림을 하기위해 0.5를더하고 소수점을 없애기 위해 int로 형변환한다.
		
		//둘째자리 반올림하는거
		System.out.println((int)(round * 10 + 0.5)/10.0); //실수로나눠야함
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1.123456+654321
		//2. 1번의 결과 값*123456
		//3. 2번의결과값/123456
		//4. 3번의결과값 -654321
		//5. 4번의 결과값 % 12346
		
		//int g1 = 123456+654321;
		//System.out.println(g1);
		
		double result = 123456+654321;
		result *= 123456;
		result /= 123456;
		result -= 654321;
		result %= 123456;
		System.out.println(result);
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세여(소수점 둘째자리반올림)
		
		int ab = 1000;
		int cd = 20000;
		int ef = 350;
		
		int aa = ab+cd+ef;
		System.out.println(aa);
	
		double avg = (((int)(aa/3.0)*10+0.5)/10.0);
		
		System.out.println("합계:"+aa+"/평균:"+avg);
		
		
		
		//int num1=345;
		//int num2=344;
		//int num3=432;
		//int sum = num1+num2+num3;
		//double avg =((int)(sum/3.0)*10+0.5)/10.0);
		//System.out.println("합계:"+sum+"/평균:"+avg);
		
		
		
		
		

		
		
		
		
				
		
		
		
		
	
		
				
		

		
		
		
		
		
		
		
		
		
		 
		// TODO Auto-generated method stub

	}

}
