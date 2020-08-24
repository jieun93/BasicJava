package b_operator;

public class ComparisonOperation {

	public static void main(String[] args) {
		/*
		 * <<비교연산자>>
		 * <:작다
		 * >:크다
		 * <=:작거나 같다
		 * >=:크거나 같다
		 * ==:같다
		 * !=:같지 않다
		 * 두개의 값을비교
		 */
		
		boolean b = 10 < 20;//비교연산자의 연산결과는 boolean이다.
		System.out.println(b);
		b = 10 < 20 - 15;
		//산술연산 먼저 수행
		System.out.println(b);
		
		b = 10<=10.0;
		//비교연산자도 타입이일치해야 연산이 가능하다.
		//이항 연산자는 타입을 일치시킨 후 연산한다.
		System.out.println(b);
		b = 65 >=  'B';
		System.out.println(b);
		
		b = 10.0f == 10.0;
		System.out.println(b);
		
		b=10.1f==10.1;
		System.out.println(b);
		System.out.printf("%22.20f%n", 10.1f);
		System.out.printf("%22.20f%n", 10.1);
		b=10.1f==(float)10.1;
		System.out.println(b);
		
		
		//대소비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만 등가비교는 모든 타입을 비교할 수 있다.
		
		b = 'A' ==65;
		System.out.println(b);
		
		b = 'A' ==63;
		System.out.println(b);
		
		
		
		b = true != false;
		System.out.println(b);
		
		b ="abc" =="abc";
		System.out.println(b);
		
		//스트링->참조형 타입  저장된 주소를 비교ㅎ하는것
		
		b = "abc" == new String ("abc"); //new--> 새로운 주소 생성하는것 __저장된 주소가 다르기때문에 false가 나옴
		System.out.println(b);
		//참조형 타입은 저장된 메모리 주소를 비교하기 때문에String은 등가비교 연산자로 내용을 비교 할 수 없다.
		
		
		b = "abc".equals(new String("abc")); //equals를 사용하면 String의 내용을 비교할 수 잇다.
		System.out.println(b);
		
		b = !"abc".equals("ABC"); //같지 않다의 결과를  얻기 위해서는 !(NOT)을 앞에 붙여준다.
		System.out.println(b);
		
		
		
		//다음의 문장들을 코드로 작성해주세요.
		//1보다 2가 큰가?
		
	   System.out.println(1<2);
	   
	   //0은 100보다 작거나 같은가?
	   
	   System.out.println(0<=100);
	   
		
	   //3.14f와 3.14는 다른가?
	   
	   System.out.println(3.14f != 3.14);
	   
	  // "남자"와"여자"는 다른가?
	   b = !"남자".equals("여자");
	   System.out.println(b);
	   
	   
	   
	   
	   
		
		
		
		
		
		
		
		

		
		
		// TODO Auto-generated method stub

	}

}
