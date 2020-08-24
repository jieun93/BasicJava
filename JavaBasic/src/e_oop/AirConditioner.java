package e_oop;

public class AirConditioner {
	
	boolean power;//전원
	int temperature; //온도
	int airVolume;//풍량
	
	
	
	AirConditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	//온도가 18~30 까지만 변경할 수 있게 해주시고,
	//전원을 켰을때만 버트들이 작동되도록 메서드들을 변경해주세요.
	
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
