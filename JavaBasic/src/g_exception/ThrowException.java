package g_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		/*
		 * <<���� �߻���Ű��>>
		 * throw new Exception();
		 * throw Ű����� ���� Ŭ������ ��ü�� ���ܸ� ���Ƿ� �߻���ų �� �ִ�.
		 */
		
			IOException ioe = new IOException();
			
			try {
				throw ioe;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			throw new NullPointerException();
//			System.out.println("����� ������� �ʽ��ϴ�.");
			

	}

}
