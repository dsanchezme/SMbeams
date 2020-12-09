package ui;

import java.awt.*;

public class Cota{

	public void cotaApoyo(Graphics2D g, int h, int w, String str) {
		g.setStroke(new BasicStroke(1f));
		g.setColor(Color.RED);
		
		g.drawLine(35, 395+h, 35, 425+h);	

		int[] x1 = {35,40,40};
		int[] y1 = {410+h,405+h,415+h};
		
		g.fillPolygon(x1, y1, 3);	
		
		g.drawLine(35, 410+h, (w/2)+15, 410+h);
		g.setColor(Color.BLUE);
		g.drawString(str, (w/2)+25, 415+h);
		g.setColor(Color.RED);
		g.drawLine((w/2)+65, 410+h, w+35, 410+h);
		
		int[] x2 = {w+35,w+30,w+30};
		int[] y2 = {410+h,405+h,415+h};
		
		g.fillPolygon(x2, y2, 3);
		
		g.drawLine(w+35, 400+h, w+35, 420+h);
			
	}
	
	public void cotaCarga(Graphics2D g, int h, int w, String str) {
		g.setStroke(new BasicStroke(1f));
		g.setColor(Color.RED);
		
		g.drawLine(35, 300+h, 35, 205+h);

		int[] x1 = {35,40,40};
		int[] y1 = {220+h,215+h,225+h};
		
		g.fillPolygon(x1, y1, 3);	
		
		g.drawLine(35, 220+h, (w/2)+15, 220+h);
		g.setColor(Color.BLUE);
		g.drawString(str, (w/2)+25, 225+h);
		g.setColor(Color.RED);
		g.drawLine((w/2)+65, 220+h, w+35, 220+h);
		
		int[] x2 = {w+35,w+30,w+30};
		int[] y2 = {220+h,215+h,225+h};
		
		g.fillPolygon(x2, y2, 3);
		
		g.drawLine(w+35, 210+h, w+35, 230+h);
			
	}

}
