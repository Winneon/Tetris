package net.winneonsword.Tetris.gui;

public class GuiMainMenu extends Gui {
	
	@Override
	public void init(){
		
		
		
	}
	
	@Override
	public void drawScreen(){
		
		FontRenderer.drawString(100, 100, "abcdefghijklmnopqrstuvwxyz:");
		FontRenderer.drawCenteredString(this.height - (this.height / 3), "§6Tetris");
		FontRenderer.drawString(((this.width / 4) + (this.width / 6)) - (FontRenderer.getStringWidth("Start") / 2), this.height - (this.height / 4), "Start");
		FontRenderer.drawStringFromRight(((this.width / 4) + (this.width / 6)) + (FontRenderer.getStringWidth("Quit") / 2), this.height - (this.height / 4), "Quit");
		
	}
	
}
