package e_oop;

public class RecursiveCall {
	
	/*
	 * <<���ȣ��>>
	 *  �޼��峻����  �޼��� �ڽ��� ȣ���ϴ� ���̴�.
	 *  ���ȣ���� �ϴ� �޼��带 ��� �޼����� �Ѵ�.
	 *  ���ѹݺ��� ����� ���� ������ �־�� �Ѵ�.
	 * 
	 */

	public static void main(String[] args) {
		//���丮�� : 4! == 4*3*2*1 ==24
		int result = factorial(4);
		System.out.println(result);
		
	}
	
	/*
	 * ��͸޼��尡 ȣ��ɋ� ���ÿ� ��� ���̴��� �����ִ°�
	 * 
	 * CallStack
	 * 
	 * |factorial(1)| 1 * 
	 * |factorial(2)| 2 * factorial(1)
	 * |factorial(3)| 3 * factorial(2)
	 * |factorial(4)| 4 * factorial(3)
	 * |main()______|
	 *     
	 *     ���� ��
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
