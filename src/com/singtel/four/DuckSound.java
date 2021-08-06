package com.singtel.four;

public class DuckSound implements SoundBehaviourIF{
	
	@Override
	public String sound(){
		System.out.println("Quack, quack");
		return "Quack, quack";
	}

}
