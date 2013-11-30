package net.winneonsword.Tetris.handlers;

import net.winneonsword.Tetris.Tetris;
import net.winneonsword.Tetris.gui.GuiMainMenu;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

public class DisplayHandler {
	
	public static int width;
	public static int height;
	
	public Tetris tetris;
	
	public DisplayHandler(){
		
		this.width = 640;
		this.height = 480;
		
		this.tetris = new Tetris();
		
	}
	
	public void startDisplay(){
		
		PixelFormat format = new PixelFormat().withDepthBits(24);
		
		try {
			
			Display.setResizable(false);
			Display.setDisplayMode(new DisplayMode(this.width, this.height));
			Display.setTitle("Tetris - A game designed in Java.");
			Display.create(format.withStencilBits(8));
			
			this.reloadIdentities();
			this.clearCanvas();
			
		} catch (LWJGLException e){
			
			e.printStackTrace();
			Display.destroy();
			System.exit(1);
			
		}
		
		this.tetris.displayGui(new GuiMainMenu());
		
		while (!(Display.isCloseRequested())){
			
			this.tetris.updateGui(tetris.currentGui);
			this.updateScreen();
			
		}
		
		Display.destroy();
		
	}
	
	public void reloadIdentities(){
		
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		
		GL11.glOrtho(0, this.width, this.height, 0, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glLoadIdentity();
		
	}
	
	public void clearCanvas(){
		
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
		
	}
	
	public static void updateScreen(){
		
		Display.update();
		Display.sync(60);
		
	}
	
}
