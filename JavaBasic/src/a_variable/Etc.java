package a_variable;

public class Etc {

	public static void main(String[] args) {
		/*
		 * <<비트 연산자 >> 1비트는 0 또는 1로 표현
		 *  |(OR) : 피연산자 중 한쪽이라도 값이 1이면, 1을  그외는 0을 결과로 얻는다.
		 *  &(AND) : 피연산자 양 쪽이 모두 1이어야만 1을 그외는 0을 결과로 얻는다.
		 *  ^(XOR) : 피연산자의 값이 서로 다를 때만 1을 같을 때는 0을 겱과로 얻는다.
		 *  ~(비트전환): 피연산자를 0은 1로 1은 0으로 바꾼다.
		 *  <<(쉬프트): 피연산자의 각 자리를 왼쪽으로 이동시킨다. 빈칸은 0으로 채운다.
		 *  >>(쉬프트_: 피연산자의 각 자리를 오른쪽으로 이동시킨다. 빈칸은 앞자리와 동일한 값으로 채운다.
		 *  
		 *  <<기타 연산자>>
		 *  .(참조 연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할때 사용한다.
		 *  (TYPE) : 형변환(CASTING)
		 *  ?(조건식):(조건식) (삼항연산자): 조건식? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문자
		 *  instanceof :참조형 타입확인
		 *  
		 *  
		 */
		
		/*
		 * - 10진수 -> 2 진수 : 10진수 값을 1이 될때까지2로 나눈다.
		 * 10
		 * 5  0
		 * 2  1
		 * 1  0
		 * --->1010
		 * 
		 * 15를 2진수로 만들어주세요.
		 * 
		 * 15
		 * 7  1
		 * 3  1
		 * 1  1
		 * -->1111
		 * 
		 * 2진수->10진수 : 각 자리에 1,2,4,8,16,32...을 곱한값을 더한다.
		 * 
		 * 1 0 1 0
		 * 8 4 2 1
		 * 8+0+2+0==>10
		 * 
		 * 1111을 10진수로 만들어주세여.
		 * 
		 * 1111
		 * 8421
		 * 8+4+2+1==>15
		 * 
		 *  
		 */
		
		//8자리
		//00001010 : 10
		//00001111 : 15
		
		//|(or)피연산자 중 한쪽이라도 값이 1이면, 1을  그외는 0을 결과로 얻는다.==> 00001111
		System.out.println(10 | 15);
		
		//&(and)피연산자 양 쪽이 모두 1이어야만 1을 그외는 0을 결과로 얻는다.==> 00001010
		System.out.println(10 & 15);
		
		//^(XOR) : 피연산자의 값이 서로 다를 때만 1을 같을 때는 0을 겱과로 얻는다.==>00000101
		System.out.println(10 ^ 15);
		
		//~(비트전환): 피연산자를 0은 1로 1은 0으로 바꾼다.
		//00001010 : 10 ==> 11110101  (앞에 자리가 1 음수 /0양수)
		System.out.println(~10);
		
		//<<(쉬프트): 피연산자의 각 자리를 왼쪽으로 이동시킨다. 빈칸은 0으로 채운다.
		//00001010 : 10 ==> 00010100 
		System.out.println(10 << 1);//1칸을 이동시키는것
		
		//>>(쉬프트_: 피연산자의 각 자리를 오른쪽으로 이동시킨다. 빈칸은 앞자리와 동일한 값으로 채운다.
		//00001010 : 10 ==>00000101
		System.out.println(10 >> 1);
		
		
		int x = 10;
		int y = 20;
		int result = ( x < y ) ? x : y ;
		//int result = true ? x : y;
		//int result = x; //연산결과
		System.out.println(result);
		
		//점수가 60점 이상이면 합격 미만이면 불합격
		int score = 60;
		String res = 60 <= score ? " 합격" : " 불합격";
		System.out.println(score + "점은" + res + "입니다.");
		
		//주민등록버노 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 1; //주민등록번호 첫자리
		String gender = (regNo == 1 ) ? "남자" : "여자";
		System.out.println("당신의 성별은" + gender + "입니다");
		
		gender = regNo == 1 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		System.out.println("당신의성별은" + gender + "입니다");
		
		
		//두개의 변수에 저장된 수 중에 큰 숫자를 출력해주세요.
		
		int i = 3;
		int n = 5;
		int bigger = i < n ? n : i;
		System.out.println(bigger);
		
		//변수에 저장된 수의 절대값을출력해주세여.
		
		int p = -4;
		int r =  p < 0 ? -p : p;
		System.out.println(r);
		
		//변수에 저장된 주민등록번호 뒷자리의 첫번째  숫자가 1이나 3 이면 남자를 2나 4 면 여자를 출력해주세요.
		//그외 숫자는 확인불가를 출력해주세요.
		
	
		int d = 5;
		String gen = d == 1 || d == 3 ? "남자" : d == 2 || d == 4 ? "여자" :" 확인불가";
		System.out.println("당신의 성별은 "+ gen + "입니다.");
		
		int f = 4;
		String ge = f == 1 || f==3 ? "남자" : f == 2 || f == 4 ? "여자" : "확인불가";
		System.out.println("당신의 성별은 "+ ge + "입니다.");
		
		
	
		
		
		
		
		
		
		

	   
	  
	   
		
		
		
		
		
		
	
		
		
		
			
		// TODO Auto-generated method stub

	}

}
