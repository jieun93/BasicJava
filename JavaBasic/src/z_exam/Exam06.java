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
s.name = "ȫ�浿";
s.ban = 1;
s.no = 1;
s.kor = 100;
s.eng = 60;
s.math = 76;
System.out.println("�̸�:"+s.name);
System.out.println("����:"+s.getTotal());
System.out.println("���:"+s.getAverage());
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
Student s = new Student("ȫ�浿",1,1,100,60,76);
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
	// �� �� (x,y)�� (x1,y1)���� �Ÿ��� ���Ѵ�.
	static double getDistance(int x, int y, int x1, int y1) {
	return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); // x, y�� ��������
	} 
	public static void main(String args[]) {
	System.out.println(getDistance(1,1,2,2));
	}
	}
//[6-7] ����6-6���� �ۼ��� Ŭ�����޼��� getDistance()�� MyPointŬ������ �ν��Ͻ��޼�
//��� �����Ͻÿ�.
//[��������]/ch6/Exercise6_7.java
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
		//// p�� (2,2)�� �Ÿ��� ���Ѵ�.
		System.out.println(p.getDistance(2,2));
	}
}

//[6-8] ������ �ڵ忡 ���ǵ� �������� �������� �����ؼ� �����ÿ�.
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
//- Ŭ��������(static����) :static int width,static int height
//- �ν��Ͻ����� :int kind,int num
//- �������� : k ,n arg, card


//[6-9] ������ ��ǻ�� ������ ����(marine)�� Ŭ������ ������ ���̴�. �� Ŭ������ ���
//�߿� static�� �ٿ��� �ϴ� ���� � �͵��̰� �� ������ �����ΰ�?
//(��, ��� ������ ���ݷ°� ������ ���ƾ� �Ѵ�.)
//class Marine {
//int x=0, y=0; // Marine�� ��ġ��ǥ(x,y)
//int hp = 60; // ���� ü��
//static int weapon = 6; // ���ݷ�
//static int armor = 0; // ����
//static void weaponUp() {
//weapon++;
//}
//static void armorUp() {
//armor++;
//}
//void move(int x, int y) {
//this.x = x; // this.x�� �ν��Ͻ� ����, x�� ��������
//this.y = y; // this.y�� �ν��Ͻ� ����, y�� ��������
//
////[6-10] ���� �� �����ڿ� ���� �������� ���� ���� ����? (��� ���ÿ�)
//a. ��� �������� �̸��� Ŭ������ �̸��� �����ؾ��Ѵ�.
//b. �����ڴ� ��ü�� �����ϱ� ���� ���̴�.
//c. Ŭ�������� �����ڰ� �ݵ�� �ϳ� �̻� �־�� �Ѵ�.
//d. �����ڰ� ���� Ŭ������ �����Ϸ��� �⺻ �����ڸ� �߰��Ѵ�.
//e. �����ڴ� �����ε� �� �� ����.
//����: b,e


//[6-11] ���� �� this�� ���� �������� ���� ���� ����? (��� ���ÿ�)
//a. ��ü �ڽ��� ����Ű�� ���������̴�.
//b. Ŭ���� ��������� ��𼭵� ����� �� �ִ�. 
//c. ���������� �ν��Ͻ������� ������ �� ����Ѵ�.
//d. Ŭ���� �޼��� �������� ����� �� ����.
//���� : b

//
//[6-12] ���� �� �����ε��� �����ϱ� ���� ������ �ƴ� ����? (��� ���ÿ�)
//a. �޼����� �̸��� ���ƾ� �Ѵ�.
//b. �Ű������� ������ Ÿ���� �޶�� �Ѵ�.
//c. ����Ÿ���� �޶�� �Ѵ�.
//d. �Ű������� �̸��� �޶�� �Ѵ�.

//���� c,d
}
}

//[6-13] ���� �� �Ʒ��� add�޼��带 �ùٸ��� �����ε� �� ����? (��� ���ÿ�)
//long add(int a, int b) { return a+b;}
//a. long add(int x, int y) { return x+y;}
//b. long add(long a, long b) { return a+b;}
//c. int add(byte a, byte b) { return a+b;}
//d. int add(long a, int b) { return (int)(a+b);}
// ����: b,d,c

////[6-14] ���� �� �ʱ�ȭ�� ���� �������� ���� ���� ����? (��� ���ÿ�)
//a.��������� �ڵ� �ʱ�ȭ�ǹǷ� �ʱ�ȭ���� �ʰ� ���� ������ �� �ִ�.
//b.���������� ����ϱ� ���� �ݵ�� �ʱ�ȭ�ؾ� �Ѵ�.
//c.�ʱ�ȭ ������ �����ڰ� ���� ����ȴ�. 
//d.����� �ʱ�ȭ�� ���� �켱������ ����ؾ� �Ѵ�.
//e.Ŭ������������ �ν��Ͻ������� ���� �ʱ�ȭ�ȴ�.
//���� : c,e
//
//[6-15] ������ �ν��Ͻ������� �ʱ�ȭ ������ �ùٸ� ����?
//a. �⺻��-������ʱ�ȭ-�ʱ�ȭ��-������
//b. �⺻��-������ʱ�ȭ-������-�ʱ�ȭ��
//c. �⺻��-�ʱ�ȭ��-������ʱ�ȭ-������
//d. �⺻��-�ʱ�ȭ��-������-������ʱ�ȭ

//����:a

//[6-16] ���� �� ���������� ���� �������� ���� ���� ����? (��� ���ÿ�)
//a. �ڵ� �ʱ�ȭ�ǹǷ� ������ �ʱ�ȭ�� �ʿ����.
//b. ���������� ����� �޼��尡 ����Ǹ� ���������� �Բ� �Ҹ�ȴ�.
//c. �ż����� �Ű������� ����� ������ ���������̴�.
//d. Ŭ���������� �ν��Ͻ��������� �޸� �δ��� ����.
//e. ��(heap)������ �����Ǹ� ������ �÷��Ϳ� ���� �Ҹ�ȴ�.
//���� a,e

//[6-20] ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
//[����] Math.random()�� ����ϴ� ��� �������� �ٸ� �� ����.
//�޼���� : shuffle
//�� �� : �־��� �迭�� ��� ���� ��ġ�� �ٲٴ� �۾��� �ݺ��Ͽ� �ڼ��̰� �Ѵ�.
//ó���� �迭�� ��ȯ�Ѵ�.
//��ȯŸ�� : int[]
//�Ű����� : int[] arr - �������� ��� �迭
////[��������]/ch6/Exercise6_20.java
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
////[6-21] TvŬ������ �־��� ������� �ϼ��Ͻÿ�. �ϼ��� �Ŀ� �����ؼ� �־��� ������
////�� ��ġ�ϴ��� Ȯ���϶�.
////[����] �ڵ带 �ܼ��� �ϱ� ���ؼ� ��ȿ���˻�� �������� �����ߴ�.
////[��������]/ch6/Exercise6_21.java
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
//	// (2) volume�� ���� MAX_VOLUME���� ���� ���� ���� 1������Ų��.
//	if(volume < MAX_VOLUME)
//		volume++;
//	
//	}
//	void volumeDown() {
//	// (3) volume�� ���� MIN_VOLUME���� Ŭ ���� ���� 1���ҽ�Ų��.
//		if(volume > MIN_VOLUME)
//			volume--;
//	}
//	void channelUp() {
//	// (4) channel�� ���� 1������Ų��.
//	
//	// ���� channel�� MAX_CHANNEL�̸�, channel�� ���� MIN_CHANNEL�� �ٲ۴�.
//		if(channel==MAX_CHANNEL){
//			channel = MIN_CHANNEL;
//		}else {
//			channel++;
//		}
//	}
//	void channelDown() {
//	// (5) channel�� ���� 1���ҽ�Ų��.
//	// ���� channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL�� �ٲ۴�.
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


