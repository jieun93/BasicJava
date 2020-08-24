package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		/*
		 * <<����>>
		 *  �������� :ù��° ���ں��� �� ���� ��� ���ڵ�� ���ؼ� �������� �ڸ� �ٲٱ⸦ �ݺ���  �տ������� �������� ä�������� ���
		 *  �������� :ù���� ���ں��� �ٷ� �� ���ڿ� ���ؼ� �������� �ڸ��ٲٱ⸦ �ݺ��� �ڿ������� ū���� ä�������� ���
		 *  �������� :�ι��� ���ں��� �� ���� ��� ���ڵ�� ���ؼ� ū������ �ڷ� �а� �߰��� �����ϴ� ���
		 *  
		 *  <<�������ϱ�>>
		 *  ��� ������ 1������ �����ؼ� �ٸ� ������� ���� �ڽ� ������ ������ 1�� ������Ű�� ���
		 */
		
		
		int[] numbers = new int[10];
		
		// ���� ��ŭ  ���� ���°� 
		for(int i =0;  i < numbers.length; i++){
			numbers[i] = i + 1;
		}
		shuffle(numbers); // ������ ���ڰ� ���� ���°�
		System.out.println(Arrays.toString(numbers));

		//selectSort (numbers);//��������
		printRank(numbers);
		//bubbleSort(numbers); //��������
		//insertSort(numbers);//��������
		System.out.println(Arrays.toString(numbers));
		
	}	
		//��������
		private static void insertSort(int[] numbers) {
			
			for (int i = 1; i < numbers.length; i++){
				 int temp = numbers[i];
				 int j = 0;
				 for(j = i - 1; j>=0; j--){
					 if(temp <numbers[j]){
						 numbers[j+1]=numbers[j];
					 }else{
						 break;
					 }
				 }
				 numbers[j+1] = temp;
			}System.out.println(Arrays.toString(numbers));
				
		}
						 

		
		//��������
		private static void bubbleSort(int[] numbers) {
			
			for (int i = 0; i < numbers.length - 1; i++){
				boolean changed = false;
				 for(int j = 0; j < numbers.length-i-1; j++){
					 if(numbers[j] > numbers[j+1]){
						 
						 int temp = numbers[j];
						 numbers[j] = numbers[j+1];
						 numbers[j+1] = temp;
						 changed = true;
						 
					 }  
						 
				 }
				 if(!changed){
					 break; 
				 }
				 
			}System.out.println(Arrays.toString(numbers));
				 
	}
		
	//��������
	private static void selectSort(int[] numbers) {
		 int[] sort = new int[10];
		
		 for (int i = 0; i < numbers.length; i++){
			 for(int j = i+1; j <numbers.length; j++){
				 if(numbers[i]> numbers[j]){
					 
					 int temp = numbers[i];
					 numbers[i] = numbers[j];
					 numbers[j] = temp;
					 
				 }
			 }
		 }
		 System.out.println(Arrays.toString(numbers));
	}
	
	
	
	
	
	
	// <<�������ϱ�>> #�ٽ��غ���
	private static void printRank(int[] numbers) {
		 
		int[] count = new int[10];
		
		for(int i = 0; i < numbers.length;  i++){
			for(int j= 0; j <numbers.length; j++){
				if(numbers[i] < numbers[j]){
					
					count[i] += 1;   
				}
			}System.out.println(Arrays.toString(count));
			 
		 }
		
	}
	

	private static void shuffle(int[] numbers) {
		for(int i =0; i<numbers.length*10; i++){
			int random =(int)(Math.random()*numbers.length);
				
			
				int temp = numbers[0];
				numbers[0] = numbers[random];
				numbers[random]=temp;
		}
	
		
	}

}
