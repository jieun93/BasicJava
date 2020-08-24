package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * <<������ �迭>>
		 * �迭�ȿ� �迭�� ����Ǿ� �ִ� �����̴�.
		 */
		
		int[][] numbers = new int[2][3];//2ĭ¥�� �迭�ȿ� �� ĭ���� 3ĭ¥�� �迭�� �����ȴ�.
		int numbers2[][] =new int [][]{{1,2,3},{4,5,6}};
		int[]umbers3[]= {{1,2,3}
						,{4,5,6}
						,{7,8,9}};
		
		
		int[] a1 = {1,2,3};//1����
		int[][] a2 = {{1,2},{1,2,3},{4}};//2����
		int[][][] a3 = {{{5},{6,7,8}}};//3����
		
		
		int[][] numbers4 = new int[3][]; //�����迭
		numbers4[0] =  new int[3];
		numbers4[1] =  new int[4];
		numbers4[2] =  new int[10];//���̸� �ٸ��� ������ �� �ִ�.
		
		
		// numbers[0] = 10; // 1������ ���� ������ �� ����.
		numbers[0] =new int[5]; // 1 ������ �迭�� ������ �� �ִ�.
		numbers[0][0] = 10; // 2������ ���� ������ �� �ִ�.
		numbers[0][1] = 20;
		numbers[1][0] = 100;
		
		System.out.println(numbers.length); // 1���� �迭 ����
		System.out.println(numbers[0].length); // numbers�� 0��° index�� ���� 
		
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers[i].length; j++){
				System.out.println(numbers[i][j]);
				
				/*	i  j
				 * [3][2] ���� ����
				 * {{1,2}
				 * ,{4,5}
				 * ,{7,8}}
				 */
			}
		}
		
		System.out.println(Arrays.toString(numbers));//��µȰ� �ּ�[[I@15db9742, [I@6d06d69c]
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println(Arrays.toString(numbers[i]));//��µ� ��[10, 20, 0, 0, 0][100, 0, 0]
		}
		
		//Q1.
		
		int[][] scores = new int [3][5]; //int[�л���][�����]
		int[]sum = new int [scores.length]; //����
		double[]avg = new double [scores.length]; //���
		
		
		for(int i =0; i<scores.length; i++){
			for(int j=0; j<scores[i].length;j++){
				scores[i][j]= (int)(Math.random()*100+1);
			}
			System.out.println(Arrays.toString(scores[i]));
		}
		
		for(int i =0; i <scores.length; i++){
			for(int j =0; j<scores[i].length;j++){
				sum[i] += scores[i][j]; 
				avg[i] = (double) sum[i]/scores[i].length;
			}
		}
		 System.out.println(Arrays.toString(sum)); // �迭�� ����ϸ� �ּҰ��� ������ ������ toString���� �ٲ㼭 ����ؾ� �Ѵ�.
		 System.out.println(Arrays.toString(avg));
		
		 
		 
	}
		

}
