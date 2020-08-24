package f_oop2;

public class Store {

	public static void main(String[] args) {
		
		//�迭: ���� Ÿ���� �����͸� ��� ����ϴ°�
		//����ü: �ٸ�Ÿ���� �����͸� ��� ����ϴ°�
		//Ŭ����: �ٸ�Ÿ���� �����͸� ��� ����ϴ°�+���ø޼���
				
		Customer c = new Customer();
		
		Product p = new Desktop();
		
		
		p.info();
		c.buy(p);;
		
		p = new TV();
		p.info();
		c.buy(p);
		
		c.showItem();
		
	}

}

class Product {
	String name;
	int price;

	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void info() {
		System.out.println("--------------------------");
		System.out.println("��ǰ�� :" + name);
		System.out.println("�� ��:" + price + "��");
		System.out.println("---------------------------");
	}
}

class Desktop extends Product{
	Desktop(){
		super("�Ｚ ��ǻ��", 500000);//�θ� Ŭ������ ������ ȣ��
	}
}

class TV extends Product{
	TV(){
		super("LG TV", 1000000);
	}
}


class Customer{
	int money = 2000000000;
	Product[] item = new Product[10]; //��ٱ���

	void buy(Product x){
		if(money < x.price){
			System.out.println("���� �����ϴ�.");
			return;
		}
		money -= x.price;
		
		for(int i = 0; i <item.length; i++){
			if(item[i] == null){
				item[i] = x;
				break;
			}
		}
		System.out.println(x.name + "�� �����ߴ�.");
	}
	
	void showItem(){
		System.out.println("----------��ٱ���---------");
		for(int i = 0; i < item.length; i++){
			if(item[i] != null){
				
			System.out.println(i +1+ "."+item[i].name);
		}
	}
	System.out.println("--------------------------");
}


}














