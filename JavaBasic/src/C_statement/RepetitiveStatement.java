package C_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		
			/*
			 * <<for��>>
			 * - for(int i = 1; i <= 10; i++){}
			 * - for(1���� 10���� 1�� �����ϸ鼭 �ݺ�){}
			 */
			
			for(int i = 1; i<= 10; i++){
				//for(�ʱ�ȭ; ���ǽ�; ������){}
				//�ʱ�ȭ  : ���ǽİ� �����Ŀ� ����� ���� �ʱ�ȭ
				//���ǽ�  : �������� true�̸� ������ ������ �����Ѵ�.
				//������  : ������ ����/���ҽ��� �ݺ����� �����Ѵ�.
				System.out.println(i + "��° �ݺ�");
			}
			
			int sum =0; // 1���� 10���� �հ踦 ����
			for(int i =1; i<=10; i++){
				sum += i;
			}			
			System.out.println(sum);
			
			sum = 0; // ���� sum�� �ʱ�ȭ �����ذ�
			for(int i = 100; i >=1; i--){//100���� 1���� 1�� �����ϸ鼭 �ݺ��Ѵ�.
				sum += i;
			}
			System.out.println(sum);
			
			//1���� 100���� ¦���� ���� ���غ���.
			sum = 0;
			for(int i = 0; i <= 100; i += 2){
				sum += i;
			}
			System.out.println(sum);
			
			sum = 0;
			for(int i = 1; i <= 100; i++){
				if(i % 2 == 0){
					sum += i;
				}
			}
			System.out.println(sum);
			
			//1���� 100���� Ȧ���� ���� �����ּ���.
			sum = 0;
			for(int i = 1; i <= 100; i += 2){
				sum += i;
			}
			System.out.println(sum);
			
			sum = 0;
			for(int i = 1; i <= 100; i++){
				if(i % 2 == 1){
					sum += i;
				}
			}
			System.out.println(sum);
			
			//�������� ����غ��ʴ�.
			/* 
			 * 2 * 1 = 2
			 * 2 * 2 = 4
			 * 2 * 3 = 6
			 * ...
			 * 
			 */
			
			for(int i =1; i <= 9; i++){
				System.out.println("2 * " + i + " = " + i * 2);
			}
			
			//7���� ������ּ���.
			for(int i = 1; i <=9; i++){
				System.out.println("7 * " + i + " = " + i * 7);
			}
			
			//�ܼ��� �Է¹޾� �������� �ش��ϴ� ���� ������ּ���.
		
//		    Scanner s = new Scanner(System.in);
//			int i2 = s.nextInt();
//			for(int i = 1; i <= 9; i++){
//			
//			System.out.println(i2 +"*" + i + " = "+ i2 * i);
//			
//			}
			
			 //������ ��ü�� ������ּ���.
			
			for(int i = 2; i <= 9; i++){
				for(int j = 1; j <= 9; j++){
					System.out.println(i +"*"+j+"="+i*j);
				}
			}		
			
			//������ ��ü�� ¦���� Ȧ�� �ٸ� ������ּ���.
			
			for(int i = 2; i <= 9; i += 2){
				for(int j = 1; j <= 9; j += 2){
					System.out.println(i +"*"+j+"="+i*j);
				}
			}
			
			//������ ��ü�� ���η� ������ּ���.
			/*
			 * 2 * 1 = 2  3 * 1 = 3  4 * 1 = 4 
			 * 2 * 2 = 4  3 * 2 = 6  4 * 2 = 8
			 * 
			 */
			
			for(int i = 1; i <= 9; i++){
				for(int j = 2; j <= 9; j++){
					System.out.print(j +"*"+i+"="+i*j + " ");
				}
				System.out.println();
			
			}
			
			for(int i = 1; i <= 5; i++){
				for(int j = 1; j <= 10; j++){
					System.out.print("*");
				}
				System.out.println();
			}
			
			//�ﰢ��������� ���� ����غ���.
			for(int i = 1; i <= 10; i++){
				for(int j = 1; j <= i; j++){
					System.out.print("*");                          
				}
				System.out.println();
			}
			
			//���ﰢ��������� ���� ����غ���.
			for(int i = 10; i >= 1; i--){
				for(int j = 1; j <= i; j++){
					System.out.print("*");
				}
				System.out.println();
			
			}
			
			/*
			 * <<while��>>
			 * - while(���ǽ�){}
			 * - ���ǽ��� ����� true�� ���� ����ؼ� �ݺ�
			 * - �ݺ�Ƚ���� �� �� ������ ����Ѵ�.
			 * - ���ǽ� �ۿ� ����.
			 */
			
			
//			Scanner s = new Scanner(System.in);
//			
//			while(true){
//				System.out.println("����� ����ұ��?(����:0)");
//				int dan = Integer.parseInt(s.nextLine());
//				
//				if(dan == 0){
//					System.out.println("����Ǿ����ϴ�.");
//					break;//����� �ݺ��� �ϳ��� Ż���Ѵ�.
//					
//				}
//				for(int i = 1; i <= 9; i++){
//					System.out.println(dan+ "*" + i + "=" + i*dan);
//				}
//			}
			
			/*
			 * <<do-while��>>
			 *  - do{}while(���ǽ�);
			 *  - �ּ��� �ѹ��� ������ �����Ѵ�.
			 *  - ������ ������ �����Ҷ�
			 * 
			 */
			
			//���ڸ��߱����
			/*
			 	int answer = (int)(Math.random() * 100)+ 1; //1~100 ������ ���� ���� �߻�
				int input  = 0;
			
				Scanner s = new Scanner(System.in);
			
				do{
					System.out.println("1~100 ������ ���� �Է����ּ���>");
					input = Integer.parseInt(s.nextLine());
				
					if(answer < input){
						System.out.println(input + "���� �۽��ϴ�.");
					}else if (input < answer){
						System.out.println(input +"���� Ů�ϴ�");
					}else{
						System.out.println("�����Դϴ�");
					}
				}while(input != answer);//�����ݷ����پ�� �Ѵ�.
			
			*/
			
			//�̸����� �ݺ���
			outer : for(int i = 2; i <= 9; i++){
				    	for(int j = 1; j <= 9; j++){
				    		if(j == 5){
						//break;//���� ����� �ݺ��� �ϳ��� ����������.
						// break outer;// outer��� �̸��� �ݺ����� ����������.
						// continue;//���� ����� �ݺ����� ���� �ݺ�ȸ���� ����������.
						// continue outer;// outer��� �̸��� ���� �ݺ�ȸ���� ����������.
				    		}
				    		System.out.println(i+"*" + j +" = " + i*j);
				    	}
				    	System.out.println();
				}
			
			
		}
}
			
			
			
			
			
			
			
			
			
			
			
			

















