package e_oop;

public class AirConditioner {
	
	boolean power;//����
	int temperature; //�µ�
	int airVolume;//ǳ��
	
	
	
	AirConditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	//�µ��� 18~30 ������ ������ �� �ְ� ���ֽð�,
	//������ �������� ��Ʈ���� �۵��ǵ��� �޼������ �������ּ���.
	
	void power(){
		power = !power;
	}
	
	void temperatureUp(){
		if(temperature<=30&&power==true){
			temperature++;
			
		}
	}
	
	void temperatureDown(){
		if(18<=temperature&&power==true){
			temperature--;
		}
	}
	
	void airVolume(){
		if(3<airVolume && power){
			airVolume = 1;
		}
	}
	
	
	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
		
		
		ac.power();
		System.out.println("power : "+ac.power);
		
		ac.temperatureUp();
		System.out.println("temperature : "+ac.temperature);
		
		ac.temperatureDown();
		System.out.println("temperature : " +ac.temperature);
		
		ac.airVolume();
		System.out.println("airVolume : "+ac.airVolume);

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
