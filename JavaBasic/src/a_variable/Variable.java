package a_variable;

import java.util.Scanner;

//

public class Variable {

//	int a; //전역변수
//	
//	public static void main(String[] args) {
//		/*
//		 * << 변수 >>
//		 * - 하나의 데이터를 저장할 수 있는 메모리상의 공간
//		 * 
//		 * << 사용 가능한 기본형 데이터의 종류 >>
//		 * - 정수 : byte, short, int, long
//		 * - 실수 : float, double
//		 * - 문자 : char
//		 * - 논리 : boolean
//		 * 
//		 * - 타입의 크기와 표현범위는 자바의정석 29쪽 참조
//		 * - 데이터를 사용하기 위해서는 어떤 종류의 데이터를 사용할 것인지, 그것의 이름이 무엇인지 알려줘야 한다.
//		 * - 명명규칙은 자바의 정석 25~26쪽 참조
//		 * 
//		 */
//		
//		//변수 선언 방법 : 데이터 타입 + 변수이름
//		byte abc;
//		char moonja;
//		
//		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
//		byte abo;
//		short def;
//		int  ghi;
//		long jkl;
//		float mnk;
//		double ab;
//		char cd;
//		boolean ef;
//		
//		//선언한 이후 변수를 사용할 때는 변수의 이름으로 사용한다.
//		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
////	 	System.out.println(_int);//컴파일 에러 발생(문법이 틀렸다.)
//		
//		//=(대입연산자) : 대입 연산자 오른쪽의 값을 왼쪽(변수)에 저장한다.
//		abo =127; //타입에 맞는 값을 저장해야 한다.
//		def = 30000;
//		ghi = 20;
//		jkl = 900L; //long : 접미사 : L
//		mnk = 3.14f; //float 접미사 : f
//		ab = 3.14; //double 접미사 : d(생략가능)
//		cd = '가';
//		ef = true;
//		//초기화 : 변수에 처음으로 값을 저장하는 것
//		
//		System.out.println(ghi);
//		//ctrl+f11 : 프로그램 실행
//		//f11 : 디버그 실행
//		
//		ghi= 30;
//		System.out.println(ghi);
//		ghi = 30 + 40;
//		System.out.println(ghi);
//		ghi = def;
//		System.out.println(ghi);
//		
//		
//		//위에서 초기화한 변수에 새로운 값을 저장학고 출력해주세요.
//		
//		byte a;
//		short b;
//		int c;
//		long d;
//		float e;
//		double f;
//		char g;
//		boolean h;
//		
//		a = 20;
//		b = 30;
//		c = 30000;
//		d = 900L;
//		
//		System.out.println(a);
//		System.out.println(c);
//		
//		
//		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
//		//문자열 : ""(큰따옴표)로 감싸진 글자
//		String _String = new String("abcd");
//		System.out.println(_String);
//		_String = "1234";
//		System.out.println(_String);
//		
//		/*
//		 *<< 리터럴(값)의 종류 >>
//		 *-숫자:0,10,-5,3.14
//		 *-문자:'가','a','0',''
//		 *-문자열:"가나다","abc","123"," ",""
//		 *-그 외: ture,false,null
//		 *
//		 *<<참조형타입>>
	//   *기본값 null
//		 *-기본형 타입을 제외한 모든 데이터 타입(배열,클래스)
//		 *-ex) String,ABC,Variable
//		 *값이 변수에 저장되지 않고 따로 저장되며,그 주소가 변수에 저장된다.
//		 *변수의 크기는 4byte이다.
//		 */
//		
//		//기본값: 전역변수에 아무것도 저장하지 않았을때 저장되어 있는 값
//	= 0;
//		_short = 0;
//		_int = 0;
//		_long = 0L;
//		_float = 0.0f;
//		_double = 0.0;
//		
//		_boolean = false;
//	_String = null;
//	
//		
//		//경우에따라 변수에타입이다른값을저장하기도한다.
//		_byte = 127;
//		_int = 128;
//		_byte =(byte)_int;//형변환:데이터타입을 변환하는것
//		System.out.println(_byte);//128->-128(오버플로우)
//		
//		_byte = -128;
//		_int = -129;
//		_byte = (byte)_int;
//		System.out.println(_byte);//-129->127(언더플로우)
//		//표현한범위가큰타입에서작은타입으로형변환할경우데이터가손실될수있다.
//		
//		//표현범위가작은타입에서큰타입으로 형변환할경우데이터가손실될염려가없다.
//		//그러므로형변환을 생략할수있다.
//		_int = _byte;
//		_long =_int;
//		_double = _float;
//		
//		//위에서만든변수들을 표현범위가 작은타입으로형변환해주세요.
//		_byte = 127;
//		_int = 128;
//		_byte = (byte)_int;
//		System.out.println(_byte);
//		
//		
//				
//		_byte = (byte)_int;
//		_int = (int)_long;
//		_long = (long)_float; 
//		
//		
//		/*
//		 * <<상수>>
//		 * 값을한번저장하면변경할수없는저장공간
//		 * final int MAX_NUMBER;
//		 * 리터럴에의미를부여하기위해사용한다.
//		 */
//		final int MAX_NUMBER;
//			MAX_NUMBER = 10; //초기화
//			MAX_NUMBER = 100;
//		
//				
//		//콘솔창에서 입력받는 방법
//		Scanner s = new Scanner(System.in);
	//  System.out.println("문자열을 입력해주세요>");
//		String input1 = s.nextline();
//		System.out.println("입력받은 문자열 : " + input1);
//		
	
	///Scanner s = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세여>");
//		int input2 = Integer.parseInt(s.nextInt());
//		System.out.println("입력받은숫자 : " + input2);
//	//
//		Scanner s = new Scanner(System.in);
//		System.out.println("문자열을 입력해주세여>");
//		String input1 = s.nextline();
//		System.out.println("입력받음문자열 :"+input1);
		
//		System.out.println(‘A' + 'B')
//		
//				$ystem
//				channel#5
//				7eleven
//				If
//				$ystem
//				new
//				$MAX_NUM
//				hello@com
//				 True
//				 NULL
//				 Class
//				 System
				 

	    
		// TODO Auto-generated method stub

	}


