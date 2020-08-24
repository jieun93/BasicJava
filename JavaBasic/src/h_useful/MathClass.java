package h_useful;

public class MathClass {

	public static void main(String[] args) {
		/*
		 * round() :�ݿø�
		 * ceil() :�ø�
		 * floor() :����
		 * abs() :���밪
		 * random() : double ���� �߻�(0.0~1.0 �̸�)
		 */

		double d1 = 0.55;
		double d2 = -0.55;
		
		System.out.println(Math.round(d1));
		System.out.println(Math.round(d2));
	
		System.out.println(Math.ceil(d1));
		System.out.println(Math.ceil(d2));
		
		System.out.println(Math.floor(d1));
		System.out.println(Math.floor(d2));

		System.out.println(Math.abs(d1));
		System.out.println(Math.abs(d2));
		
		for(int i = 0; i <30; i++){
			int random = getRandom(5, 10);
			System.out.print
			(random +" ");
			
		}
			
		
	}
	
	public static int getRandom(int from, int to){
		return (int)(Math.random()*(Math.abs(to-from)+1))+Math.min(from,to);
	}

}
