package z_exam;

public class Exam06 {
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
		}
		
}
class SutdaCard{
	 int num;
	 boolean iSKwang;

	 SutdaCard(){
		 this(1,true); 
	 }
	 
	 SutdaCard(int num, boolean isKwang){
		 this.num = num;
		 this.isKwang = isKwang;
	 }
	 String info(){
		 return num +(isKwang? "K" : "");
	 }
	 
}
//6-3,6-4
class Exercise6_4 {
public static void main(String args[]) {
Student s = new Student();
s.name = "홍길동";
s.ban = 1;
s.no = 1;
s.kor = 100;
s.eng = 60;
s.math = 76;
System.out.println("이름:"+s.name);
System.out.println("총점:"+s.getTotal());
System.out.println("평균:"+s.getAverage());
}
class Student{
	String name;
	int ban, no, kor, eng, math;

	int getTotal(){
		return kor+eng+math;
	}
	
	float getAverage(){
		return (int)(getTotal()/3f*10+0.5f)/10f;
	}
}

class Exercise6_5 {
public static void main(String args[]) {
Student s = new Student("홍길동",1,1,100,60,76);
System.out.println(s.info());
}
}
class Student {
 
	 Student student (){
		 String name;
		 int a,b,c,d,e,f;
		 
		 Student(String name, int a, int b, int c, int d, int e, int f){
			 this.name = name;
			 this.a = a;
			 this.b = b;
			 this.c = c;
			 this.d = d;
			 this.e = e;
			 this.f = f;
			 
		 }
		 
		 int gerTotal(){
			 return kor+eng+math;
			  
		 }
		 float gerAverage(){
			 return (int) (getTotal()/3f*10+0.5f)/10f;
			 
		 }
		 
		 public String info(){
			 return name+","+a+","+b+","+c+","+d+","+e+","+f;
			 
		 }
	 }
	
}

//6-6
class Exercise6_6 {
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
	return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y는 지역변수
	} 
	public static void main(String args[]) {
	System.out.println(getDistance(1,1,2,2));
	}
	}
//[6-7] 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서
//드로 정의하시오.
//[연습문제]/ch6/Exercise6_7.java
class MyPoint {
	int x; 
	int y; 
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
}
	double getDistance(int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
}
}
class Exercise6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1);
		//// p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2));
	}
}

//[6-8] 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
//class PlayingCard {
//int kind;
//int num;
//static int width;
//static int height;
//PlayingCard(int k, int n) {
//kind = k;
//num = n;
//}
//public static void main(String args[]) {
//PlayingCard card = new PlayingCard(1,1);
//}
//}
//- 클래스변수(static변수) :static int width,static int height
//- 인스턴스변수 :int kind,int num
//- 지역변수 : k ,n arg, card


//[6-9] 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버
//중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
//class Marine {
//int x=0, y=0; // Marine의 위치좌표(x,y)
//int hp = 60; // 현재 체력
//static int weapon = 6; // 공격력
//static int armor = 0; // 방어력
//static void weaponUp() {
//weapon++;
//}
//static void armorUp() {
//armor++;
//}
//void move(int x, int y) {
//this.x = x; // this.x는 인스턴스 변수, x는 지역변수
//this.y = y; // this.y는 인스턴스 변수, y는 지역변수
//
////[6-10] 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
//a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
//b. 생성자는 객체를 생성하기 위한 것이다.
//c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
//d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
//e. 생성자는 오버로딩 할 수 없다.
//정담: b,e


//[6-11] 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)
//a. 객체 자신을 가리키는 참조변수이다.
//b. 클래스 내에서라면 어디서든 사용할 수 있다. 
//c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
//d. 클래스 메서드 내에서는 사용할 수 없다.
//정답 : b

//
//[6-12] 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
//a. 메서드의 이름이 같아야 한다.
//b. 매개변수의 개수나 타입이 달라야 한다.
//c. 리턴타입이 달라야 한다.
//d. 매개변수의 이름이 달라야 한다.

//정답 c,d
}
}

//[6-13] 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
//long add(int a, int b) { return a+b;}
//a. long add(int x, int y) { return x+y;}
//b. long add(long a, long b) { return a+b;}
//c. int add(byte a, byte b) { return a+b;}
//d. int add(long a, int b) { return (int)(a+b);}
// 정답: b,d,c

////[6-14] 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
//a.멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다.
//b.지역변수는 사용하기 전에 반드시 초기화해야 한다.
//c.초기화 블럭보다 생성자가 먼저 수행된다. 
//d.명시적 초기화를 제일 우선적으로 고려해야 한다.
//e.클래스변수보다 인스턴스변수가 먼저 초기화된다.
//정답 : c,e
//
//[6-15] 다음중 인스턴스변수의 초기화 순서가 올바른 것은?
//a. 기본값-명시적초기화-초기화블럭-생성자
//b. 기본값-명시적초기화-생성자-초기화블럭
//c. 기본값-초기화블럭-명시적초기화-생성자
//d. 기본값-초기화블럭-생성자-명시적초기화

//정답:a

//[6-16] 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
//a. 자동 초기화되므로 별도의 초기화가 필요없다.
//b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
//c. 매서드의 매개변수로 선언된 변수도 지역변수이다.
//d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
//e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.
//정답 a,e

//[6-20] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
//[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
//메서드명 : shuffle
//기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
//처리한 배열을 반환한다.
//반환타입 : int[]
//매개변수 : int[] arr - 정수값이 담긴 배열
////[연습문제]/ch6/Exercise6_20.java
//class Exercise6_20
//{
//   public static int[] shuffle(int[] arr){
//	  if(arr==null || arr.length==0)
//		  return arr;
//	  
//	  for(int i = 0; i<arr.length; i++){
//		  int j = (int)(Math.random()*arr.length);
//		  
//		  int tmp= arr[i];
//		  arr[i] =arr[j];
//		  arr[j] = tmp;
//	  }
//	  return arr;
//   }
//public static void main(String[] args)
//{
//int[] original = {1,2,3,4,5,6,7,8,9};
//System.out.println(java.util.Arrays.toString(original));
//int[] result = shuffle(original);
//System.out.println(java.util.Arrays.toString(result));
//}
//}
//
//
////[6-21] Tv클래스를 주어진 로직대로 완성하시오. 완성한 후에 실행해서 주어진 실행결과
////와 일치하는지 확인하라.
////[참고] 코드를 단순히 하기 위해서 유효성검사는 로직에서 제외했다.
////[연습문제]/ch6/Exercise6_21.java
//class MyTv {
//boolean isPowerOn;
//int channel;
//int volume;
//final int MAX_VOLUME = 100;
//final int MIN_VOLUME = 0;
//final int MAX_CHANNEL = 100;
//final int MIN_CHANNEL = 1;
//
//void turnOnOff() {
//	isPowerOn != isPoweron
//}
//void volumeUp() {
//	// (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
//	if(volume < MAX_VOLUME)
//		volume++;
//	
//	}
//	void volumeDown() {
//	// (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
//		if(volume > MIN_VOLUME)
//			volume--;
//	}
//	void channelUp() {
//	// (4) channel의 값을 1증가시킨다.
//	
//	// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
//		if(channel==MAX_CHANNEL){
//			channel = MIN_CHANNEL;
//		}else {
//			channel++;
//		}
//	}
//	void channelDown() {
//	// (5) channel의 값을 1감소시킨다.
//	// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
//		if(channel==MIN_CHANNEL){
//			channel=MAX_CHANNEL;
//		}else {
//			channel--;
//		}
//		
//	}
//	} // class MyTv
//	class Exercise6_21 {
//	public static void main(String args[]) {
//	MyTv t = new MyTv();
//	t.channel = 100;
//	t.volume = 0;
//	System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
//	t.channelDown();
//	t.volumeDown();
//	System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
//	t.volume = 100;
//	t.channelUp();
//	t.volumeUp();
//	System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
//	}


//6-22
public  static void


