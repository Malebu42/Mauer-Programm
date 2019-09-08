
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Formatter;


public class Main {
	
	   public static void main(String[ ] args) {
		  /*
		   ArrayList<String> List = new ArrayList<String>();
		   
		   Scanner sc = new Scanner(System.in);
		   String eingabe = sc.nextLine();
		   sc.close();
		   
		   List.add(eingabe);
		   
		   System.out.println(List);
		   */
		   
		   File file = new File("C:\\Benutzer\\Marius\\Liste\\List.txt");
		   
		   ArrayList<String> List = new ArrayList<String>();
		   
		   try {
	            Formatter f = new Formatter("List.txt");
	            f.format("Schokolade");
	      
	            f.close();
	            File x = new File("List.txt");
	            Scanner sc = new Scanner(x);
	            while(sc.hasNext()) {
	                System.out.println(sc.next());
	                
	           
	            }
	            sc.close();
	        } catch (Exception e) {
	        System.out.println("Error");
		   
		   
	        } 
	   }
	   
	}
		
   

	

	


