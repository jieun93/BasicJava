 package z_exam;

public class Exam07 {
	//7-3
	//��� ���� �޼����� ������ ������ �ϴ°�.�޼���� ����Ÿ��,�޼����, �Ķ���Ͱ� ���ƾ� �Ѵ�.
	
	
	//7-4
	//c,d
	
	//7-5
	//product �����ڰ� ��� ������ ����.
	//product (){}
	
	//7-6
	// ���� ���ǵ� �ν��Ͻ� �������� �ʱ�ȭ�ǵ��� �ϱ� ���ؼ�.
	
	//7-7
	//child()->child(intx0->parent()->parent(intx)->object()
	//x=200
	
	//7-8
	//1
	
	//7-9
	//c-  �������̵��� ���� ������ �� �� ����.
	
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
	//c��
	
	//7-13
	//MathŬ������ ��� �޼��尡 static�޼����̰�
	//�ν��Ͻ������� �������� �ʱ� ������ ��ü�� ������ �ʿ䰡 ���� ����
	
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

	class Marine extends Unit { // ����
		void move(int x, int y) { /* ������ ��ġ�� �̵� */
		}

		void stimPack() { /* �������� ����Ѵ�. */
		}
	}

	class Tank extends Unit { // ��ũ
		void move(int x, int y) { /* ������ ��ġ�� �̵� */
		}

		void changeMode() { /* ���ݸ�带 ��ȯ�Ѵ�. */
		}
	}

	class Dropship extends Unit { // ���ۼ�

		void move(int x, int y) { /* ������ ��ġ�� �̵� */
		}

		void load() { /* ���õ� ����� �¿��. */
		}

		void unload() { /* ���õ� ����� ������. */
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
