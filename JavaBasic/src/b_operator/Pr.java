package b_operator;

public class Pr {

	public static void main(String[] args) {
		
		System.out.println(1<2);
		
		byte b = 10;
		short s = 20;
		//short d = (short)(s-d);
		
		boolean c = 10 < 20;
		c = 10 < 20-15;
		System.out.println(c);
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		//1.123456+654321
		int i = 123456+654321;
		
				 
		System.out.println(i);
		
		
		
		//2. 1번의 결과 값*123456
		
		System.out.println(i*123456);
		
		System.out.println((i*123456)/123456);
		
		int t = (i*123456)/123456;
		
		System.out.println(t-654321);
		
		System.out.println((t-654321)%123456);
		
		
		
		System.out.println(1+2);
		System.out.println(1.2+1.3);
		
		//System.out.println('생활');
		System.out.println('생');
		System.out.println("HTML\nCSS\nJavaSxript\n");
		System.out.println("생활"+"코딩");
		
		int a;
		a = 1;
		System.out.println(a+1);
		
		a = 2;
		System.out.println(a+1);
		
		double z = 1.1;
		System.out.println(a+1.1);
		
		
		String first = "coding";
		System.out.println(first+" "+"everybody");
		
		String ai, bi;
		ai = "coding";
		bi = "everybody";
		System.out.println(ai+bi);
		
		int no = 10;
		double mo = 22.2;
		System.out.println(no+mo);
		
	    byte district = 1;
	    
		int y = 1;
	double p = 2.2;
	float q = 2.2f;
	
	int w = 3;
	float r = 1.0F;
	double d = w+ r;
	
	//result의 값은 3
	int result = 1+ 2;
	System.out.println(result);
	
	long iiii= 20;
	System.out.println("!!!!!!!!!!!"+iiii);
    
	
	
	
		
		int x1 = 10;
		int y1 = 20;
		int result2 = (x1 < y1) ? x1 : y1; 
	
		System.out.println(result2);
		
				int score1 =60;
				String res2 = 60 <= score1 ? "합격 " : "불합격";
				System.out.println(score1 + "점은" + res2 +"입니다");
				
		int no1 = 4;
		String gender3 = (no1 == 1) ? "남자" : "여자";
		System.out.println("당신의 성별은"+gender3+ "입니다.");
		
		gender3 = no1 == 1 ? "남자" : (no1 == 2 ? "여자": "확인불가");
		System.out.println("당신의성별은 " + gender3 +"입니다.");
		
		
		int i1 = 3;
		int n2 = 6;
		int bigger2 = i1  < n2 ? n2 :i1;
		System.out.println(bigger2);
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

	private static void alert(int i) {
		// TODO Auto-generated method stub
		
	}

}
