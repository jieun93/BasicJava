package e_oop;

import java.util.Scanner;

public class SimLiTest {

	Scanner s= new Scanner(System.in);
	
	//9개의 메서드 만들기
	
	void q1(){
		System.out.println("나는 금사빠다(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q2();
		}else if(answer.equals("n")){
			q3();
		}
	}
	void q2(){
		System.out.println("연애할때 끌려다니는 타입이다(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q5();
		}else if(answer.equals("n")){
			q3();
		}
	}
	void q3(){
		System.out.println("데이트 코스는 미리짜는게 편하다(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q6();
		}else if(answer.equals("n")){
			q5();
		}
	}
	void q4(){
		System.out.println("감정기복이크지 않다(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q7();
		}else if(answer.equals("n")){
			q5();
		}
	}
	void q5(){
		System.out.println("감정표현에 솔직한편이다(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q8();
		}else if(answer.equals("n")){
			q6();
		}
	}
	void q6(){
		System.out.println("활동적인 데이트가 좋다(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q8();
		}else if(answer.equals("n")){
			q9();
		}
	}void q7(){
		System.out.println("연락이 없어도 믿고 기다리는 편이다(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			System.out.println("A");
		}else if(answer.equals("n")){
			q8();
		}
	}void q8(){
		System.out.println("이성친구느 존재할 수 없다(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			q9();
		}else if(answer.equals("n")){
			System.out.println("B");
		}
	}void q9(){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다(y/n)");
		String answer = s.nextLine();
		if(answer.equals("y")){
			System.out.println("D");
		}else if(answer.equals("n")){
			System.out.println("C");
		}
	}
}
