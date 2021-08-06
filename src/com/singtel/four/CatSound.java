package com.singtel.four;

public class CatSound implements SoundBehaviourIF{
	
	@Override
	public String sound(){
		System.out.println("Meow");
		return "Meow";
	}

}
