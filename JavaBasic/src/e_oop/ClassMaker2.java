package e_oop;

public class ClassMaker2 {
	
	//전역변수 하나를 선언하고 명시적으로 초기화 해주세요.
	
	int a = 10;
	
	
	//위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화 해주세요.
	
	{
			a = 0;
		
	}
	
	static int y =0;
	static void a(){
		
	}
	
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	
	ClassMaker2 (int a){
		 this.a = a;
		 System.out.println(y);
	}
	//위에서 선언한 전역 변수를 생성자를 하나 더 만들어서 초기화해주세요.
	
	ClassMaker2(){
		this(9);
	}
	
	public static void main(String[] args) {
		ClassMaker2 cm2 = new ClassMaker2();
		System.out.println(cm2.a);
		
		cm2 = new ClassMaker2();
		System.out.println(cm2.a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
