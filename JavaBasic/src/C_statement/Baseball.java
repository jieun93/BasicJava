package C_statement;

import java.util.Scanner;

public class Baseball {

	 

	public static void main(String[] args) {

		//���ھ߱� ���� ����� 

		//3�ڸ��� �ߺ������ʴ� ���ڸ� �߻���Ų�� (1~9) ***

		//�ι�°�ڸ����� ù��° �ڸ��� ���� ���� ������ �ȵȴ�.

		//���� ���߱� ����		

		

		//1~9������ ���� ���� �߻������ִ� method

		//����ڿ��� ������ ���ڸ� �Է¹޴´�.

		//����ڰ� �Է��� ���� ��ǻ���� ���� ���� SBOī����

		//3S�� ��� �����̹Ƿ� ���α׷� ����

		

		Scanner s = new Scanner(System.in);

		

		int com1,com2,com3; //��ǻ�Ͱ� ���� �������� ���ڰ� ����� ���� 

		

		int h1 = 0, h2 = 0, h3 = 0;  

		

		int strike; // �ڸ����� ���ڰ� ��� ��ġ�� ���

		int ball;   // ���ڸ� ��ġ�ϰ� �ڸ����� Ʋ�����

		int out;    // ���ڿ� �ڸ����� ��� Ʋ�����

		int count=0;

		

		

		com1 = (int)(Math.random() * 9) +1; //com1�� 1~9������ ���� �������� �ο��޴´�.

		do

		{
			com2 = (int)(Math.random() * 9) +1;
			
		}while(com1==com2); 

		//com1�� com2�� ���� ������ do���� ����� ��� �ݺ��ؼ� �ߺ��Ȱ��� ������ �ʵ��� �Ѵ�. 

		//com2�� ���� �� ���·� com1�� ���� ���ؾ� �Ǳ� ������ do~while�� ����ϴ� ���� ����.

		

		do

		{		

			com3 = (int)(Math.random()*9) +1;		

		}while(com3==com1||com3==com2); //com1/com2�� ���� com3�� ���� ������ do���� ����� ��� �ݺ��ؼ� �ߺ��Ȱ��� ������ �ʵ��� �Ѵ�.

		

		System.out.println("��ǻ�Ͱ� ���� �� : " + com1 + com2 + com3);

		

		

					

		do

		{

			strike = 0;

			ball = 0;

			out = 0; //���� �ʱ�ȭ

		

					

			System.out.println();

			System.out.println("���ڸ� ���ڸ� �Է��ϼ��� >> (�ߺ��ȼ��ڸ� ���� ������)");

			int input = Integer.parseInt(s.nextLine());

				h3 = input % 10; //h3 �� 1�� �ڸ��� ���� �־��ش�.

				h2 = (input/10) % 10;//h2�� 2�� �ڸ��� ���� �־��ش�.

				h1 = (input/100) % 10;//h3�� 3�� �ڸ��� ���� �־��ش�.

			

				//���� �Է��� ���� ��ǻ�Ͱ� �߻���Ų ���� ���Ѵ�.

				

					if(h1 == com1) 

					{

						strike ++;

					}

					else if(h1 == com2 || h1 == com3)

					{

						ball ++;

					}

					else 

					{

						out ++;

					}

					

				

					if(h2 == com2)

					{

						strike ++;

				

					}

					else if(h2 == com1 || h2 == com3)

					{

						ball ++;

				

					}

					else

					{

						out ++;

				

					}

			

					if(h3 == com3)

					{

						strike ++;

				

					}

					else if(h3 == com1 || h3 == com2)

					{

						ball ++;

				

					}

					else

					{

						out ++;

				

					}	

//					++count ;

					System.out.println("�õ�Ƚ��"  + ++count );

					System.out.println("S:" + strike + " B:" + ball + " O:" + out );

						

 

		}while(strike < 3); //strike�� 3�ϰ�� ������ ������̹Ƿ� do while���� Ż���Ѵ�.	

		

 

		System.out.println("�����Դϴ�.");

		

		

		}

 



// 3���� ���ڸ� �ϳ��� �ν��ϴ°��� �ƴ϶� ���� �ν��ϹǷ� �ߺ��� ���� 

 

// ���ڸ� ���ڸ� �Է¹޾��� ���  --> "���� ������ �Է��ϼ���"

 

// �ߺ��� ���ڸ� �Է¹޾��� ���  --> "�Է°��� �߸��Ǿ����ϴ�." �� ����ؾ��ϴµ�...

 

// �����Է��� �õ��� Ƚ��  --> counting ��ġ�� ���� ��ƾ� �ұ� 

 



		
	
		
	}


