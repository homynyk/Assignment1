package ca.ualberta.homynyk_notes;

import java.io.Serializable;

public class Counter implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int value;

	public Counter (String name, int value){
		super();
		this.name=name;
		this.value=value;
	}
	
	public Counter (String name){
		super();
		this.name=name;
		value=0;
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
