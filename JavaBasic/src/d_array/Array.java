package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * <<�迭 �Է¹�� 3����>>
		 * int[] number = new int[5];// �⺻������ �ʱ�ȭ�Ǵ�.
		 * int[] number = new int[]{10,20,30,40,50};
		 * int[] number = {10,20,30,40,50};
		 */
		
		//�迭�� ������ Ÿ���̴�.
		int[]array;//�迭�� �ּҸ� ������ ������ ���������.
		array = new int[5];//�迭�� �����ǰ� �� �ּҰ� ����ȴ�.
		//new : ���ο� ������� ���� �� �ּҹ�ȯ
		//int[5] : int�� ������ �� �ִ� 5���� ����
		//�迭 �ʱ�ȭ�� �⺻���� ����ȴ�.
		
		System.out.println(array);//�ּҰ� ����Ǿ� �ִ�.
		
		System.out.println(array[0]);//�������� �����ϱ����ؼ��� index�� ����������Ѵ�.
		//index���� int�� ����� �� �ִ�.(���ͷ�, ����, ���, ���� ��)
		//�迭�� �ִ� ũ��� int��  �ִ밪(�� 20��)�̴�.
		
		String arrayStr = Arrays.toString(array);
		//�迭�� ��� �ε����� ����� ���� ���ڿ��� ��ȯ�Ѵ�.
		System.out.println(arrayStr);
		
		int[] iArray1 = new int[]{1,2,3};//���� ������ �迭�� ���̰� ��������.
		int[] iArray2 = {1,2,3};//����� �ʱ�ȭ�� ���ÿ� �ؾ��Ѵ�.
		int[] iArray3;
		//iArray3 = {1,2,3};//������ ���� �߻�
		
		array[0] = 10;//�ε����� 0���� �����Ѵ�.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;//������ �ε����� "�迭�� ���� -1"�̴�.
		
		//������ ������ �� �ִ� ���̰� 10�� �迭�� ���� �� �ʱ�ȭ ���ּ���.
		
		int[] array1 = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
		
		//��� �ε����� �ִ� ���� �������ּ���.
		
		 array1[0] = 10;
		 array1[1] = 20;
		 array1[2] = 30;
		 array1[3] = 40;
		 array1[4] = 50;
		 array1[5] = 60;
		 array1[6] = 70;
		 array1[7] = 80;
		 array1[8] = 90;
		 array1[9] = 100;
		 
		 //��� �ε����� �ִ� ���� �����ּ���.
		 
		 int sum = 0;
		 sum += array1[0];
		 sum += array1[1];
		 sum += array1[2];
		 sum += array1[3];
		 sum += array1[4];
		 sum += array1[5];
		 sum += array1[6];
		 sum += array1[7];
		 sum += array1[8];
		 sum += array1[9];
		 System.out.println(sum);
		 
		 
		 //index�� 1�� �����ϴ� ��Ģ���־� for���� �Բ� ����ϱ� ����.
		 for(int i=0; i < array.length; i++){
			 System.out.println(array[i]);
		 }
		 
		 //�迭�� ���̸� �˰� �ִٰ� ���ڸ� ����ϴ� ���� �ϵ��ڵ��̶�� �Ѵ�.
		 //���̸� �˴��� length�� ����ϴ� ���� �� ���� �ڵ��̴�.
		 
		 for(int i = 0; i < array.length; i++){
			 array[i] = i + 1;
		 }
		 System.out.println(Arrays.toString(array));
		 
		 //�迭�� ���ڸ� ��� �հ�� ����� ���غ���.
		 int[] number = new int[10];
		 
		 for(int i = 0; i < number.length; i++){
			 number[i] = (int)(Math.random() * 100)+1;
			 }
		 System.out.println(Arrays.toString(number));
		 
		 sum = 0;//�հ�
		 double avg = 0;//���
		 
		 for(int i = 0; i < number.length; i++){
			 sum += number[i];
		 }
		 avg =(double) sum / number.length;
		 System.out.println("�հ�: "+sum+" / ���: "+avg);
		 
		 //���� for��
		 for(int number1 : number){//�迭�� �ִ� ���� ���ʴ�� ������ �ִ´�.
			 System.out.println(number1);
		 }
		 
		 //�迭�� ����� ���ڵ� �� �ּҰ��� �ִ밪�� ã���ּ���.
		 
		 int min = number[0];
		 int max = number[0];
		 
		 for(int i=0; i < number.length; i++){
		  if(number[i]<min){
			  min = number[i];
			  
		  }
		  if(max<number[i]){
			  max = number[i];
		  }
		 }	 
		 System.out.println("min :"+min+" max :"+max);
		 
		 
		 
		 
		 //	Q1.
		 
		 int[]shuffle = new int[30];
		 for(int i = 0; i < shuffle.length; i++){
			 
			 shuffle[i] = i + 1;
		 }
		 System.out.println(Arrays.toString(shuffle));
		 
		
		 //�迭�� ���� �����ּ���.
		 //0�� �ε������� ���� �ε��� ���� ���� ��ȯ�Ѵ�.
		 for(int i = 0; i < shuffle.length*10; i++){
		 int random =(int)(Math.random()*shuffle.length);
		 int temp =shuffle[0];
		 shuffle[0]=shuffle[random]; 
		 shuffle[random] = temp;
		 
	}
		 System.out.println(Arrays.toString(shuffle));
		 
		 
		 //1~10 ������ ������ 500�� �����ϰ�,�� ���ڰ� ������ Ƚ���� ������ּ���.
		 
		 int[] counts = new int[10];
		
		 
		 for(int i=0; i<500; i++ ){
			 int random =(int)(Math.random()*10)+1;
			 counts[random-1] ++ ;
			 // 1 2 3 4 5 6 7 8 9 10
			 // 0 1 2 3 4 5 6 7 8 9
		 }
		 for(int i = 0; i < counts.length; i++){
		 System.out.println(i+1+":"+counts[i]);
		 }
		 //Math.random() 0~1�̸�(0.99999...)
			

		 //�ּҰ�,�ִ밪,�ݺ�Ƚ�� �Է¹޾� ������ Ƚ���� ���
		 Scanner  s = new Scanner(System.in);
		 
		 
		 System.out.println("�ּҰ�>");
		 int minNum = Integer.parseInt(s.nextLine());
		 System.out.println("�ִ밪>");
		 int maxNum = Integer.parseInt(s.nextLine());
		 System.out.println("�ݺ�Ƚ��>");
		 int repeat = Integer.parseInt(s.nextLine());
		 
		 counts = new int[maxNum - minNum +1];
		 
		 for(int i = 0; i < repeat; i++){
			 int random = (int)(Math.random()*(maxNum - minNum +1))+minNum;
			 counts[random - minNum]++;
			 
		 }
		 for(int i = 0; i < counts.length; i++ ){
			 System.out.println( i + 1 + ":" + counts[i]);
		 }
		 
		

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
