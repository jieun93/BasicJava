package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

		/*ȸ�����Խ� ���̵�/�ڵ���/�̸��Ͽ� ���ȴ�.
		 * 
		 *����ǥ���� : ���ڿ��� ������ �˻��ϴ� ǥ����(���̵�,�н����忡 ����ҋ�)
		 *
		 * ^ �޹��ڷ� ����
		 * $ �� ���ڷ� ����
		 * . ������ ����(�ٹٲ� ����)
		 * * �� ���ڰ� 0�� �̻�
		 * + �� ���ڰ� 1�� �̻�
		 * ? �� ���ڰ� ���ų� 1��
		 * [] ������ �����̳� ����([a-z] :a ���� z����, [^a-z] : a���� z�� �ƴѰ�)
		 * {} �� ������ ���� ({2} :2��, {2,4}: 2���̻�4������)
		 * () �׷�ȭ(1���� ����ó�� �ν�)
		 * | or����
		 * \s ����, ��, �ٹٲ�
		 * \S ����, ��, �ٹٲ��� �ƴ� ����
		 * \w ���ĺ��̳� ����
		 * \W ���ĺ��̳� ���ڰ� �ƴ� ����
		 * \d ����
		 * \D ���ڰ� �ƴ� ����
		 * (?i) �� ������ ��ҹ��� ���� ����
		 * \ ����ǥ���Ŀ��� ���Ǵ� Ư������ ǥ��
		 *  
		 */
		
		
		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";//a����z���� 0���� 9���� 1���̻� �ð��̴�.
//		String regex = "\\w*";
//		String regex = ".*";
		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
		
//		System.out.println(m.matches());
		
		//���̵�, ��ȭ��ȣ, �̸����ּ��� ��ȿ���� �˻��ϴ� ����ǥ������ ������ּ���.
		

		String myEmail ="xovud926@naver.com";
				
		String id =  "(?i)[a-z]{5}[0-9]{1,5}";
		//���̵� : [a-z0-9_-]{5,20} "_""-" �ΰ� Ư�����ڸ� ��밡���ϴ�.
		String ph = "[0-9]{0,9}";//^0\\d{1,3}-\\d{3,4}-\\d{4} 
		//  \:�̽������� ���ڷ� ���,  \�� 2���� �־�� 1���� ǥ���ϴ� ���̴�.
		String email = "[a-z]{9}[0-9]{1,9}@[a-z]{7}\\.com";
		//email : [a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?I)(com|net|org|([a-z]{2}\\.kr))$
		Pattern p = Pattern.compile(email);
		Matcher m = p.matcher(myEmail);
		
		System.out.println(m.matches());
	
	}

	
	
}














