package com.JavaProject;

import java.util.Random;

public class Villager extends TextAdventure{
	int min = 1;
	int max = 10;
	Random random = new Random();
	
	public void talk(String mood) {
		
		
		if (mood == "funny") {
			int randInt = random.nextInt((max - min) + 1) + min;
			if( randInt >= 5) {
				System.out.println("Halihalo");
			}
			if( randInt <= 1) {
				System.out.println("Tagchen!");
			}
			
		}		
		if (mood == "sad") {
			int randInt2 = random.nextInt((max - min) + 1) + min;
			if( randInt2 >= 5) {
				System.out.println("halo");
			}
			if( randInt2 <= 1) {
				System.out.println("hi");
			}
		   }
		}
		
	public void trade(String trademood) {
		if (trademood == "yes") {
			int randInt = random.nextInt((max - min) + 1) + min;
			if( randInt >= 5) {
			System.out.println("I want to trade with you");
			}
			if( randInt <= 5) {
				System.out.println("I can make you make you a deal you cant dismiss");
				}
		}	
		
		if (trademood == "no") {
			System.out.println("I dont want to trade with you");
		 
		}	
		
	  
	}
}
