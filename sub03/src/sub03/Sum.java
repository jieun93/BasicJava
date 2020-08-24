package sub03;

public abstract class Sum {
	
  private Input input;
  public void setInput(Input input){
	  this.input=input;
  }
  
  public abstract Object sum(Object o);

public Input getInput() {
	return input;
}
}
