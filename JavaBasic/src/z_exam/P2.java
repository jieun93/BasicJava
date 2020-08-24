package z_exam;

import java.util.Arrays;

public class P2 {

	public static void main(String[] args) {
		
		
		
	/*	int a = (int)(Math.random()*10+1);
		int b = (int) (Math.random()*10+1);
		while(a==b){
			b = (int) (Math.random()*10+1);
		}
		int c = (int) (Math.random()*10+1);
		while(a==c||b==c){
			c = (int) (Math.random()*10+1);
		}
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int min = 0;
		int mid = 0;
		int max = 0;
		
		if(a < b && a < c ){
			min = a;
		}else if( b < a && b < c){
			min = b;
		}else{ 
			min = c;
		}
		
		if(b < a && c < a ){
			max = a;
		}else if( a < b && c < b){
			max = b;
		}else {
			max = c;
		}
		
		if(( a < b && b < c )||(c < b && b < a)){
			mid= b;
		}else if ((b < a && a< c) || (c < a  && a < b)){
			mid =a;
		}else {
			mid = c;
		}
		
	System.out.println("a: " + min +"b: "+mid+"c: "+max);
		
	*/

				for(int i = 1; i <=5; i++){
					for(int j =1; j<=10; j++){
				System.out.print("*");
				}
					System.out.println();
	}
				
				int [] score = new int[6];
				for(int i = 0; i<6; i++){
					System.out.println(Arrays.toString(score));
					
				int sum = 0;
				float average = 0f;
				
				int [] score1 = {100, 88, 100, 100, 90};
				for(int i1 = 0; i1 < score1.length; i1++){
					sum += score1[i1];
					
					
				}
					
				System.out.println(sum);
					
					
				}

				
				int [] score3 = {79, 88, 91, 33, 100, 55, 95};
				
				int max = score3[0];
				int min = score3[0];
				
				for(int i = 1; i < score3.length; i++){
					if(score3[i] > max){
						max =score3[i];
						
					}else if(score3[i] < min){
						min = score3[i];
					}
				}System.out.println("max ="+max);
					System.out.println("min = "+min);
				
					
					int [] numArr = new int[10];
					for(int i = 0; i < numArr.length; i++){
						numArr[i] = i;
						System.out.print(numArr[i]);
					}
					System.out.println();
					
					for(int i = 0; i < 100; i++){
						int n = (int)(Math.random()*10);
						int tmp = numArr[0];
						numArr[0] = numArr[n];
						numArr[n]= tmp;
					}
					for(int i = 0; i <numArr.length; i++)
						System.out.println(numArr[i]);
					
					
					
					int [] ball = new int [45];
					
					for(int i = 0; i < ball.length; i++)
						ball[i] = i + 1;
					
					int temp = 0;
					int j = 0;
					
					for(int i =0; i<6; i++){
						j = (int)(Math.random()*45);
						
						temp = ball[i];
						ball[i] = ball[j];
						ball[j] = temp;
						
								
					}
					for(int i=0; i<6; i++)
						System.out.println("ball["+i+"]"+ball[i]);
					
					int[] code ={-4, -1, 3, 6,11};
					int[] arr = new int [10];					
					for (int i = 0; i < arr.length; i++){
						int tmp = (int)(Math.random()*code.length);
						arr[i] =code[tmp];
						
					}
					System.out.println(Arrays.toString(arr));
						
					
					String[] name = {"Kim","Park","Yi"};
					
					for(int i = 0; i< name.length; i++)
						System.out.println("name["+i+"]:"+name[i]);
					String tmp = name[2];
					System.out.println("tmp:"+tmp);
					name[0] = "Yu";
					
					for(String str : name)
						System.out.println(str);
					
}
}
