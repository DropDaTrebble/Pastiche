package main;

/**
 * Main class of Pastiche or ADER
 * Author: Mateusz Murak
 */
 
import gui.MainGUI;
		
public class NewMain {

	public static void main(String[] args) {
		
		System.out.print("-NewMain: Main up and running, next executing the MainGUI:\n");
		
		MainGUI mainGUI = new MainGUI();
		
		System.out.print("-NewMain: created mainGUI, executing mainGUI.MainGUI():\n");
		
		mainGUI.MainGUI();
		
		System.out.print("-NewMain: Main GUI executed.\n");
		
	}
	
}
