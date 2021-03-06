package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * <<OOP(Object Oriented Programming): 객체지향 프로그래밍>>
		 *  프로그래밍을 단순히 코드의 연속으로 보느것이 아니라 객체가의상호작용으로 보는것.
		 *  코드이 재상용성이 높고 유지보수가 용이하다.
		 *  
		 *  
		 * <<객체생성(인스턴스화)>>
		 *   클래슬를 사용하기위해 메모리(Heap영역)에 올려 놓은 것
		 *   new 클래스 명();-> 객체가 저장된 메모리 주소반환
		 *   객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 *   객체는 생성 될때마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 */
		
		SampleClass sc = new SampleClass();
		
		sc.method1();
		
		sc.method2(5);
		
		
		//System.out.println(sc.method3);
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(6, 8);
		System.out.println(returnInt);
		
		sc.flowTest1();
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		//객제가 저장된 변수를통해 메서드들을 호춣해주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
		//리턴타입이 있는메서드는 리턴 받은 값을 출력해주세요.ㅣ
		
		ClassMaker cm = new ClassMaker();
		
		cm.method1();
		
		cm.method2(3);
		
		int return1 = cm.method3(2, 3);
		System.out.println(return1);
		
		
		
		Calculator ca = new Calculator();
		
		double addre = ca.add(123456,654321);
		System.out.println(addre);
		
		double mulre = ca.mul(addre, 123456);
		System.out.println(mulre);
		
		double divre = ca.div(mulre,123456);
		System.out.println(divre);
		
		double minre = ca.min(divre,654321);
		System.out.println(minre);
		
		double remre = ca.rem(minre, 123456);
		System.out.println(remre);
		
		
		//심리테스트
		new SimLiTest().q1();
		
		
		
		
		
		
		

	}

}
