package com.JavaProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class TextAdventure {
	
	public static void main(String[] args) throws IOException{
		Villager villager = new Villager();
		/*
		villager1.talk("sad");
		villager2.trade("no");
		villager2.talk("funny");
		villager2.trade("yes");
		*/	
		boolean repeat = true;
		System.out.print("You are entering a Village!");
		while(repeat) {
			int max0 = 3;
			int min0 = 1;
			Random random = new Random();
			System.out.println("");
			System.out.print("to what villager do you wanna speak? (Farmer/Trader)?");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strVal = br.readLine();
			//System.out.println(strVal);
			int randInt0 = random.nextInt((max0 - min0) + 1) + min0;
			
			if(strVal.equals("Farmer")) {
				
				if( randInt0 <= 3) {
				villager.talk("funny");
				}
				
				if( randInt0  >= 1) {
					villager.talk("sad");
				}
			}
			if(strVal.equals("Trader")) {
				villager.trade("yes");
			}
			
			if(strVal.equals("n")||strVal.equals("N")){
				repeat=false;
	
			}
		}
	}

}
