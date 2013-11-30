package net.winneonsword.Tetris;

import net.winneonsword.Tetris.gui.Gui;
import net.winneonsword.Tetris.handlers.DisplayHandler;

public class Tetris {
	
	public Gui currentGui;
	
	public Tetris(){
		
		this.currentGui = null;
		
	}
	
	public void displayGui(Gui gui){
		
		this.currentGui = gui;
		
		gui.init();
		gui.drawScreen();
		DisplayHandler.updateScreen();
		
	}
	
	public void updateGui(Gui gui){
		
		gui.drawScreen();
		DisplayHandler.updateScreen();
		
	}
	
}
