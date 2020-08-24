package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		/*
		 *<<finally>>
		 *�ʿ信 ���� try-catch �ڿ� finally�� �߰��� �� �ִ�.
		 *finally �� ������ �߻����ο� ������� ���� �������� ����ǳ�.
		 *
		 * <<�ڵ� �ڿ� ��ȯ(try - with-resources)>>
		 * try(���� ����; ��������){} catch(Exception e){}
		 * ��� �� ��ȯ�� �ʿ��� ��ü�� try �� () �ȿ��� �����ϸ� try �� ����� �ڵ����� ��ȯ�ȴ�.
		 * 
		 */
		
		FileInputStream fis = null; //���� �б�
		
		try {
			fis = new FileInputStream("file.txt");//��� �� �ݾ���� �ϴ� ��ü
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//���� �߻��� ������� �ݵ�� ó���ؾ� �ϴ� ������ �־��ش�.
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//����  �߻�: try->catch->finally
		//���� �̹߻�: try -> finally
		
		//�ڵ��ڿ���ȯ(JDK1.7)
		try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){//���Ͼ���
			String str = "�ȴ�";
			byte[] bytes=str.getBytes();
			for(int i = 0; i <bytes.length; i++){
				fos.write(bytes[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
