package net.winneonsword.Tetris.handlers;

import org.lwjgl.opengl.GL11;

public class GraphicHandler {
	
	public static void changeColor(char c){
		
		int hex = GraphicHandler.getHexFromChar(c);
		int[] rgb = GraphicHandler.translateHex(hex);
		
		GL11.glColor3d(rgb[0], rgb[1], rgb[2]);
		
	}
	
	public static void drawRectangle(double x1, double y1, double x2, double y2){
		
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex2d(x1, y1);
		GL11.glVertex2d(x2, y1);
		GL11.glVertex2d(x2, y2);
		GL11.glVertex2d(x1, y2);
		GL11.glEnd();
		
	}
	
	public static void drawRectangleFromOrigin(double x, double y, double h, double v){
		
		GraphicHandler.drawRectangle(x - h, y - v, x + h, y + v);
		
	}
	
	public static void drawTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
		
		GL11.glBegin(GL11.GL_TRIANGLES);
		GL11.glVertex2d(x1, y1);
		GL11.glVertex2d(x2, y2);
		GL11.glVertex2d(x3, y3);
		GL11.glEnd();
		
	}
	
	public static void drawCircle(int x, int y, int radius){
		
		GraphicHandler.drawOval(x, y, radius, radius);
		
	}
	
	public static void drawOval(int x, int y, int h, int v){
		
		GL11.glPushMatrix();
		GL11.glTranslatef(x, y, 0);
		GL11.glScalef(h, v, 1);
		
		GL11.glBegin(GL11.GL_TRIANGLE_FAN);
		GL11.glVertex2f(0, 0);
		
		for (int i = 0; i <= 50; i++){
			
			double angle = Math.PI * 2 * i / 50;
			
			GL11.glVertex2f((float) Math.cos(angle), (float) Math.sin(angle));
			
		}
		
		GL11.glEnd();
		GL11.glPopMatrix();
		
	}
	
	private static int[] translateHex(int hex){
		
		int[] rgb = {
				
				(hex & 0xFF0000) >> 16,
				(hex & 0xFF00) >> 8,
				(hex & 0xFF)
				
		};
		
		return rgb;
		
	}
	
	private static int getHexFromChar(char c){
		
		int hex = 0xFFFFFF;
			
		switch (c){
		
		case '2':
			
			hex = 0x00AA00;
			break;
			
		case '3':
			
			hex = 0x00AAAA;
			break;
			
		case '4':
			
			hex = 0xAA0000;
			break;
			
		case '5':
			
			hex = 0xAA00AA;
			break;
			
		case '6':
			
			hex = 0xFFAA00;
			break;
			
		case '0':
			
			hex = 0x000000;
			break;
			
		case 'f':
			
			hex = 0xFFFFFF;
			break;
			
		}
		
		return hex;
		
	}
	
}
