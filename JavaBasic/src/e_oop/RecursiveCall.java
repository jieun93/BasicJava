package e_oop;

public class RecursiveCall {
	
	/*
	 * <<재귀호출>>
	 *  메서드내에서  메서드 자신을 호출하는 것이다.
	 *  재귀호출을 하는 메서드를 재귀 메서드라고 한다.
	 *  무한반복을 벗어나기 위하 조건이 있어야 한다.
	 * 
	 */

	public static void main(String[] args) {
		//팩토리얼 : 4! == 4*3*2*1 ==24
		int result = factorial(4);
		System.out.println(result);
		
	}
	
	/*
	 * 재귀메서드가 호출될떄 스택에 어떻게 쌓이는지 보여주는거
	 * 
	 * CallStack
	 * 
	 * |factorial(1)| 1 * 
	 * |factorial(2)| 2 * factorial(1)
	 * |factorial(3)| 3 * factorial(2)
	 * |factorial(4)| 4 * factorial(3)
	 * |main()______|
	 *     
	 *     진행 후
	 * 
	 * |            | 1 * 
	 * |            | 2 * 1
	 * |            | 3 * 2 * 1
	 * |factorial(4)| 4 * 3 * 2 * 1
	 * |main()______|
	 * 
	 */
	private static int factorial(int i) {
		int result = 0;
		
		if(i==1){
			result = 1;
		}else{
			result = i *factorial(i-1);
		}
		return result;
	}

}
