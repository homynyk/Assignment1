package ca.ualberta.homynyk_notes;

public class Counter {
	
	private String name;
	private int value;

	public Counter (String name, int value){
		super();
		this.name=name;
		this.value=value;
	}
	
	public Counter (){
		super();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value){
		this.value=value;
	}


}
