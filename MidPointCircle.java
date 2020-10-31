package assignment_6_midPointCircle;

import java.io.*;
import java.util.*;
import java.math.*;
import java.applet.*;
import java.awt.*;
public class MidPointCircle extends Panel{
	
	private int radius;
	private int xc;
	private int yc;
	private int x;
	private int y;
	private int d;
	
	MidPointCircle(int radius, int xc, int yc){
		this.radius = radius;
		this.xc = xc;
		this.yc = yc;
		x = 0;
		y = radius;
		d=(5/4)*radius;;  // initial decision parameter
	}
	
	public void paint(Graphics g){
	
		
		
		do{
			g.setColor(Color.red);
			g.drawLine(xc+x,yc+y,xc+x,yc+y);
			g.drawLine(x+xc,yc-y,xc+x,yc-y);
			g.drawLine(xc-x,yc+y,xc-x,yc+y);
			g.drawLine(xc-x,yc-y,xc-x,yc-y);
			g.drawLine(xc+y,yc+x,xc+y,yc+x);
			g.drawLine(xc+y,yc-x,xc+y,yc-x);
			g.drawLine(xc-y,yc+x,xc-y,yc+x);
			g.drawLine(xc-y,yc-x,xc-y,yc-x);


			if(d<0){
				d=d+2*x+3;
			}
			else
			{
				d=d+2*(x-y)+5;                         
				y=y-1;              
			}
			x=x+1;
		}
		while (x<y);

	}
}
