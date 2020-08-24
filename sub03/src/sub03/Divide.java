package sub03;

public abstract class Divide {

	public Multi getMulti() {
		return multi;
	}

	private Multi multi;
	public void setMulti(Multi multi){
		this.multi=multi;
	}
	
	public abstract Object divide(Object o);
}
