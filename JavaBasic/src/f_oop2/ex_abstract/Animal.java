package f_oop2.ex_abstract;

public abstract class Animal {

	
	void run(){
		System.out.println("�޷����ϴ�.");
		
	}
	
	abstract void bark();
	
}




class Dog extends Animal{

	@Override
	void bark() {
		System.out.println("�۸�");
		
	}
	
}

class Cat extends Animal{
	
	void bark(){
		System.out.println("�߿˾߿�");
		
	}
	
class Lion extends Animal{
	void bark(){
		System.out.println("�������");
		
		
	}
	
}
}
