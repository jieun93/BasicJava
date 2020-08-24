 package z_exam;

public class Exam07 {
	//7-3
	//상속 받은 메서드의 내용을 재정의 하는것.메서드와 리턴타입,메서드명, 파라미터가 같아야 한다.
	
	
	//7-4
	//c,d
	
	//7-5
	//product 생성자가 없어서 오류가 난다.
	//product (){}
	
	//7-6
	// 조상에 정의된 인스턴스 변수들이 초기화되도록 하기 위해서.
	
	//7-7
	//child()->child(intx0->parent()->parent(intx)->object()
	//x=200
	
	//7-8
	//1
	
	//7-9
	//c-  오버라이딩을 통해 재정의 할 수 없다.
	
	//7-10.7-11
	class MyTv2 {
	  	private boolean isPowerOn;
	  	private int channel;
	  	private int volume;
	  	private int prevChannel;
		
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		final int MAX_CHANNEL = 100;
		final int MIN_CHANNEL = 1;
		
		public int getVolume(){return volume;}
		public void setVolume (int volume){
			if(volume > MAX_VOLUME || volume < MIN_VOLUME){
				return;
			}	
				this.volume = volume;
			
			
		}
		 public int getchannel(){return channel;}
		 public void setChannel(int channel){
			 if(channel > MAX_CHANNEL || channel < MIN_CHANNEL){
				return;
			 }
			 
			 prevChannel = this.channel;
				this.channel = channel; 
		 }
		 
		 public void gotoPrevChannel(){
			 setChannel(prevChannel);
		 }
		 
	}

	class Exercise7_10 {
		public static void main(String args[]) {
			MyTv2 t = new MyTv2();
	
			t.setChannel(10);
			System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
			System.out.println("VOL:" + t.getVolume());
		}
	}
	
	//7-12
	//c번
	
	//7-13
	//Math클래스의 모든 메서드가 static메서드이고
	//인스턴스변수가 존재하지 않기 때문에 객체를 생성할 필요가 없기 때문
	
	//7-15
	//e
	
	//7-16
	//e
	
	//7-17

	

	abstract class Unit {
		int x, y;

		abstract void move(int x, int y);

		void stop() {
		};
	}

	class Marine extends Unit { // 보병
		void move(int x, int y) { /* 지정된 위치로 이동 */
		}

		void stimPack() { /* 스팀팩을 사용한다. */
		}
	}

	class Tank extends Unit { // 탱크
		void move(int x, int y) { /* 지정된 위치로 이동 */
		}

		void changeMode() { /* 공격모드를 변환한다. */
		}
	}

	class Dropship extends Unit { // 수송선

		void move(int x, int y) { /* 지정된 위치로 이동 */
		}

		void load() { /* 선택된 대상을 태운다. */
		}

		void unload() { /* 선택된 대상을 내린다. */
		}
	}

	//7-20
	class Exercise7_20 {
		public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
		}
		}
		class Parent {
		int x = 100;
		void method() {
		System.out.println("Parent Method");
		}
		}
		class Child extends Parent {
		int x = 200;
		void method() {
		System.out.println("Child Method");
		}
		}

	//p.x = 100
	//child metod 
	//c.x =200
	//child metod 
	
		
		
	
}
