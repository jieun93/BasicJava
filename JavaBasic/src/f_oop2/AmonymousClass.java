package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AmonymousClass {

	public static void main(String[] args) {
		//�͸� Ŭ����  : �ϳ��� �θ� Ŭ������ �������̽��� ��ӹ޾� Ŭ������ �����԰� ���ÿ� ��ü�� �����ϴ� Ŭ����
		Button b = new Button();
		
		b.addActionListener(new ActionListener() {
			//ActionListener�� ��ӹ��� �ڽ� Ŭ����
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("��ư�� ������ ����");
				
				
			}
		});
		

	}

}
