package g_exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		/*
		 * <<�޼��忡 ���ܼ����ϱ�>> �޼��� ȣ��� �߻��� �� �ִ� ���ܸ� �������� �� �ִ�. void method() throws
		 * IOException {} �޼����� ������ ���� throws Ű����� ���� Ŭ���������� ���ܸ� ������ �� �ִ�. ���ܸ�
		 * �����ϸ� ����ó���� ���� �ʰ� �ڽ��� ȣ���� �޼ҵ�� ����ó���� �Ѱ��ش�.
		 */

		try {
			method();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void method() throws IOException {//���ܸ� ó������ �ʰ� �Ѱ��ش�.
		throw new IOException();
		
// 		������ ���� ���� �Ǵ� ����		
//		throw new NullPointerException();
//		throw new IndexOutOfBoundsException();

		

	}

}
