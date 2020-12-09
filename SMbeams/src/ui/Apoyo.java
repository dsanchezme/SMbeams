package ui;

import java.awt.*;

public class Apoyo implements Grafico{

	@Override
	public void dibujar(Graphics2D g, int d) {
		g.setStroke(new BasicStroke(2f));
		g.setColor(Color.blue);
		int i = 35+d;
		int[] x = {i,i-15,i+15};
		int[] y = {340,355,355};
		g.drawPolygon(x, y, 3);	
		g.drawLine(i-25, 355, i+25, 355);
		
		int l1 = 362;
		int l2 = i-25;
		for(int j=0;j<7;j++) {
			g.drawLine(l2, l1, l2+7, l1-7);
			l2 += 7;
			
		}
		
	}
}
