package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * <<����>> ������ ���� : ������ �ÿ� �߻��Ǵ� ����(������) ���� ���� : ������ ������, �ǵ��� �ٸ��� �����ϴ°�
		 * (����) ��Ÿ�� ���� : ����ÿ� �߻��Ǵ� ����(�츮�� ó���� ����)
		 * 
		 * <<��Ÿ�ӿ���>> ��Ÿ�� ���� �߻��� �߻��� ��ġ���� ���α׷��� ������������ ����ȴ�. ���� : ���α׷� �ڵ忡�� ���ؼ�
		 * ������ �� ���� �ɰ��� ����(ó���Ұ�) ����: ���α׷� �ڵ忡 ���ؼ� ������ �� �ִ� �ټ� �̾��� ����(ó������)
		 * 
		 * <<����>> ��� ���ܴ� Exception Ŭ������ �ڽ� Ŭ�����̴�. RuntimeException Ŭ������ �� �ڽĵ���
		 * ����ó���� �������� �ʴ´�(unchecked ����) [RuntimeException Ŭ������ ���ڽĵ��� ������]
		 * Exception Ŭ������ �ڽĵ��� ����ó���� �����ȴ�.
		 * 
		 * 
		 * << ����ó�� (try-catch)>> ����ó���� ���� ���α׷��� ������������ ����Ǵ� ���� ������ �� �ִ�. try{}
		 * catch(Exception e){} try �� ���� ������ ���� �� ���ܰ� �߻��ϸ� catch �� �Ѿ��. catch
		 * �� () �ȿ��� ó���� ���ܸ� ������ �� �� �ִ�. ���������� ���ܸ� ó���Ҽ� �ֵ��� catch�� �ϳ� �̻� �ü��ִ�.
		 * �߻��� ���ܿ� ��ġ�ϴ� catch ������ ������ ����� �� try catch �� ����������. �߻��� ���ܿ� ��ġ�ϴ�
		 * catch�� ���� ��� ���ܴ� ó�� ���� �ʴ´�.
		 */

		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException | IndexOutOfBoundsException e) {
			// ���� �߻��� �߻��� ���ܿ� ��ġ�ϴ� catch ���� ����ǰ�
			// ��ġ�ϴ� catch�� ���� ��� ���ܴ� ó������ �ʴ´�.
			 e.printStackTrace();//���� �޽����� ����Ѵ�.
		} catch (NullPointerException e) {

		} catch (Exception e) {
			// ����ġ ���� ���ܸ� ó���� �� �ִ�.
			// ��� ���ܸ� �ѹ��� ó���� �� �ִ�.

		}

		test1();
	}

	private static void test1() {
		

		test2();
	}

	private static void test2() {
//			System.out.println(10/0); //���ܹ߻�
		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
		

}
