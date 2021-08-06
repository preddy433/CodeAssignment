package com.singtel.four;

public class DogSound implements SoundBehaviourIF {
	
	@Override
	public String sound(){
		System.out.println("Woof, woof");
		return "Woof, woof";
	}
}
