package f_oop2.ex_abstract;

public abstract class Animal {

	
	void run(){
		System.out.println("崔妨癌聪促.");
		
	}
	
	abstract void bark();
	
}




class Dog extends Animal{

	@Override
	void bark() {
		System.out.println("港港");
		
	}
	
}

class Cat extends Animal{
	
	void bark(){
		System.out.println("具克具克");
		
	}
	
class Lion extends Animal{
	void bark(){
		System.out.println("绢蕊绢蕊");
		
		
	}
	
}
}
