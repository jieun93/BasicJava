package d_array;
import java.util.Scanner;


public class StringArray {

	public static void main(String[] args) {
		String s = new String("ABCD");//������ Ÿ���� �ʱ�ȭ�ϴ� ���
		String str = "ABCD";//String�� Ư���� �����ϰ� �ʱ�ȭ ����
		
		
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		
		/*
		 * <<String�� �ֿ� �޼���>>
		 * equals() : ���ڿ��� ������ ������ Ȯ���Ѵ�.
		 * length() : ���ڿ��� ���̸� ��ȯ�Ѵ�.
		 * charAt() : ���ڿ�����  �ش� ��ġ�� �ִ� ���ڸ� ��ȯ�Ѵ�
		 * substring() : ���ڿ����� �ش������ �ִ� ���ڸ� ��ȯ�Ѵ�
		 * indexOf() : ���ڿ� ���� Ư�� ���ڿ��� �ε����� ��ȯ�Ѵ�
		 * replace() : ���ڿ� ���� Ư�� ���ڿ��� ���ϴ� ���ڿ��� ������ ��ȯ�Ѵ�
		 */
		
		
	for(int i = 0; i< str.length(); i++){
		System.out.println(str.charAt(i));
	}
	
	String revStr= "";//str�� �Ųٷ� ���� ����
	//�ڿ������� �ѱ��ھ� �����ͼ� ���ο� ������ ���Ѵ�.
	//ABCD
	for(int i = str.length() - 1; i>=0; i--){
		revStr += str.charAt(i);
		//revStr = revStr + str.charAt(i)
		
	}
	System.out.println(revStr);
	
	str = "0123456789";
	String sub1 = str.substring(3); //3�� �ε������� �߶� ��ȯ�Ѵ�.
	System.out.println(sub1);
	String sub2 = str.substring(5,8);//5�� �ε������� 8�� �ε��� ������ �߶� ��ȯ�Ѵ�.
	System.out.println(sub2);
		
	str = "ġŲ ���� ��� ������";
	int idx = str.indexOf("����");//������ ���� �ε����� ��ȯ�Ѵ�.
	System.out.println(idx);
		
	
	idx = str.indexOf("¥���");
	System.out.println(idx);//���� ���ڸ� �ѱ�� �Ǹ� -1�� �ȴ�.
	
	String[] menus = {
			"ġŲ 1800��",
			"���� 9900��",
			"��� 8000��",
			"������ 500��"
			
			};
				//�̸��� �������� ���� ���
				for(int i = 0; i < menus.length; i++){
				String name = menus[i].substring(0, menus[i].indexOf(" "));//ù��°������ 0��
				System.out.println(name);
				
				
				//���ݸ� �и����� int�� ������ ����ּ���.
				
				for(int i1 = 0; i1 < menus.length; i1++){
					int price = Integer.parseInt( menus[i1].substring(menus[i1].indexOf(" ")+1,menus[i1].indexOf("��")));
					System.out.println(price);
					
				}
				
				str = "123456789";
				str = str.replace("3","¦");
				System.out.println(str);
				str= str.replace("6", "¦");
				System.out.println(str);
				str =str.replace("9","¦");
				System.out.println(str);
				
				String pn ="010-2363-3647";
				//������(-)�� �����ؼ� ������ּ���.
				
				pn = pn.replace("-","");
				System.out.println(pn);
				
				
				//���߸� �Է¹޾� �Է¹������ڿ� 3�ڸ� ���� �޸�(,)�� �ٿ� ������ּ���.
				//1235467==>1,234,567
				
				
				/*Scanner scanner = new Scanner(System.in);
				System.out.println("���ڸ� �Է����ּ���>");
				String number = scanner.nextLine();
				String newNumber = "";
				
				int count =0;
					
				for(int i2 = number.length()-1; i2 >= 0; i2--){
					newNumber = number.charAt(i2) + newNumber;
					count++;
					if(count %3 == 0 && count!= number.length()){
						newNumber = ","+newNumber;
					}
								}System.out.println(newNumber);
				
				
			}*/
			}//4-9
			String str1 = "12345";
			int sum = 0;
			for(int i=0; i < str1.length(); i++) {
				sum += str1.charAt(i)-48;
				
				
			}
			System.out.println("sum="+sum);
			
			
			//4-13
			String value = "12o34";
			char ch = ' ';
			boolean isNumber = true;
			// �ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ�
			// �ϳ��� �о �˻��Ѵ�.
			for(int i=0; i < value.length() ;i++) {
				ch = value.charAt(i);
				
				if(!(ch >= '0'&& ch<='0')){
					isNumber= false;
					break;
					
				}
			}
			if (isNumber) {
			System.out.println(value+"�� �����Դϴ�.");
			} else {
			System.out.println(value+"�� ���ڰ� �ƴմϴ�.");
			}
			 // end of main
			 // end of class
			
	}

}
