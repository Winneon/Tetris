package net.winneonsword.Tetris.gui;

import java.util.ArrayList;
import java.util.List;

import net.winneonsword.Tetris.handlers.DisplayHandler;
import net.winneonsword.Tetris.handlers.GraphicHandler;

import org.lwjgl.opengl.GL11;

public class FontRenderer {
	
	public static void drawLetter(double x, double y, char c){
		
		switch (Character.toLowerCase(c)){
		
		case 'a':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y, x + 15, y + 5);
			GraphicHandler.drawRectangle(x + 10, y, x + 15, y + 20);
			GraphicHandler.drawRectangle(x, y + 10, x + 15, y + 15);
			break;
			
		case 'b':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y + 5, x + 15, y + 10);
			GraphicHandler.drawRectangle(x + 10, y + 5, x + 15, y + 20);
			GraphicHandler.drawRectangle(x, y + 15, x + 15, y + 20);
			break;
			
		case 'c':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y, x + 15, y + 5);
			GraphicHandler.drawRectangle(x, y + 15, x + 15, y + 20);
			break;
			
		case 'd':
			
			GraphicHandler.drawRectangle(x + 10, y, x + 15, y + 20);
			GraphicHandler.drawRectangle(x, y + 5, x + 15, y + 10);
			GraphicHandler.drawRectangle(x, y + 5, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y + 15, x + 15, y + 20);
			break;
			
		case 'e':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y, x + 15, y + 5);
			GraphicHandler.drawRectangle(x, y + 8, x + 10, y + 12);
			GraphicHandler.drawRectangle(x, y + 15, x + 15, y + 20);
			break;
			
		case 'f':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y, x + 15, y + 5);
			GraphicHandler.drawRectangle(x, y + 10, x + 10, y + 15);
			break;
			
		case 'g':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y, x + 15, y + 5);
			GraphicHandler.drawRectangle(x, y + 15, x + 15, y + 20);
			GraphicHandler.drawRectangle(x + 10, y + 10, x + 15, y + 20);
			break;
			
		case 'h':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x + 10, y, x + 15, y + 20);
			GraphicHandler.drawRectangle(x, y + 7.5, x + 15, y + 13.5);
			break;
			
		case 'i':
			
			GraphicHandler.drawRectangle(x, y, x + 15, y + 5);
			GraphicHandler.drawRectangle(x + 5, y, x + 10, y + 20);
			GraphicHandler.drawRectangle(x, y + 15, x + 15, y + 20);
			break;
			
		case 'j':
			
			GraphicHandler.drawRectangle(x + 10, y, x + 15, y + 20);
			GraphicHandler.drawRectangle(x, y + 15, x + 15, y + 20);
			break;
			
		case 'k':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			
			GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2d(x + 5, y + 7.5);
			GL11.glVertex2d(x + 15, y + 20);
			GL11.glVertex2d(x + 10, y + 20);
			GL11.glVertex2d(x + 5, y + 13.5);
			GL11.glEnd();
			
			GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2d(x + 5, y + 7.5);
			GL11.glVertex2d(x + 10, y);
			GL11.glVertex2d(x + 15, y);
			GL11.glVertex2d(x + 5, y + 13.5);
			GL11.glEnd();
			
			break;
			
		case 'l':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y + 15, x + 15, y + 20);
			break;
			
		case 'm':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y + 4, x + 15, y + 9);
			GraphicHandler.drawRectangle(x + 10, y, x + 15, y + 20);
			break;
			
		case 'n':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y, x + 15, y + 5);
			GraphicHandler.drawRectangle(x + 10, y, x + 15, y + 20);
			break;
			
		case 'o':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y, x + 15, y + 5);
			GraphicHandler.drawRectangle(x + 10, y, x + 15, y + 20);
			GraphicHandler.drawRectangle(x, y + 15, x + 15, y + 20);
			break;
			
		case 'p':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y, x + 15, y + 5);
			GraphicHandler.drawRectangle(x + 10, y, x + 15, y + 15);
			GraphicHandler.drawRectangle(x, y + 10, x + 15, y + 15);
			break;
			
		case 'q':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y, x + 15, y + 5);
			GraphicHandler.drawRectangle(x + 10, y, x + 15, y + 15);
			GraphicHandler.drawRectangle(x, y + 15, x + 10, y + 20);
			break;
			
		case 'r':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y, x + 15, y + 5);
			GraphicHandler.drawRectangle(x + 10, y, x + 15, y + 10);
			break;
			
		case 's':
			
			GraphicHandler.drawRectangle(x, y, x + 15, y + 5);
			GraphicHandler.drawRectangle(x, y, x + 5, y + 12);
			GraphicHandler.drawRectangle(x, y + 8, x + 15, y + 12);
			GraphicHandler.drawRectangle(x + 10, y + 8, x + 15, y + 20);
			GraphicHandler.drawRectangle(x, y + 15, x + 15, y + 20);
			break;
			
		case 't':
			
			GraphicHandler.drawRectangle(x, y, x + 15, y + 5);
			GraphicHandler.drawRectangle(x + 5, y, x + 10, y + 20);
			break;
			
		case 'u':
			
			GraphicHandler.drawRectangle(x, y, x + 5, y + 20);
			GraphicHandler.drawRectangle(x, y + 15, x + 15, y + 20);
			GraphicHandler.drawRectangle(x + 10, y, x + 15, y + 20);
			break;
			
		}
		
	}
	
	public static void drawString(double x, double y, String s){
		
		char[] array = s.toCharArray();
		
		for (int i = 0; i < array.length; i++){
			
			char c = array[i];
			
			if (c == '§'){
				
				i++;
				GraphicHandler.changeColor(array[i]);
				
			} else {
				
				FontRenderer.drawLetter(x, y, c);
				x += 20;
				
			}
			
		}
		
		GraphicHandler.changeColor('f');
		
	}
	
	public static void drawStringFromRight(double x, double y, String s){
		
		FontRenderer.drawString(DisplayHandler.width - x, y, s);
		
	}
	
	public static void drawCenteredString(double y, String s){
		
		FontRenderer.drawString((DisplayHandler.width / 2) - (FontRenderer.getStringWidth(s) / 2), y, s);
		
	}
	
	public static double getStringWidth(String s){
		
		Character[] array = FontRenderer.toCharacterArray(s);
		
		for (int i = 0; i < array.length; i++){
			
			char c = array[i];
			
			if (c == '§'){
				
				List<Character> list = new ArrayList<Character>();
				
				for (char a : array){
					
					list.add(a);
					
				}
				
				list.remove(i);
				list.remove(i + 1);
				
				array = list.toArray(new Character[list.size()]);
				
			}
			
		}
		
		return (array.length * 20) - 5;
		
	}
	
	public static Character[] toCharacterArray(String s){
		
		if (s == null){
			
			return null;
			
		}
		
		Character[] array = new Character[s.length()];
		
		for (int i = 0; i < s.length(); i++){
			
			array[i] = new Character(s.charAt(i));				
		}
		
		return array;
		
	}
	
}
