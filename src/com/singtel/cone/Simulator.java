package com.singtel.cone;

public class Simulator {
	public static void main(String args[]){

		Caterpillar caterpillar = new Caterpillar();
		caterpillar.walk();
		caterpillar.fly();
		
		caterpillar.setFlyBehaviour(new Butterfly());
		caterpillar.setSoundBehaviour(new Butterfly());
		
		caterpillar.performAction();
	}

}
