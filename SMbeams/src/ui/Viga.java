package ui;

import java.awt.*;

public class Viga implements Grafico{
	
	@Override
	public void dibujar(Graphics2D g, int d) {
		GradientPaint graytoblue = new GradientPaint(35,320,Color.DARK_GRAY,35+d,340, Color.LIGHT_GRAY);
		//g.setColor(Color.ORANGE);
		g.setPaint(graytoblue);
		g.fillRect(35, 320, d, 20);
		g.setStroke(new BasicStroke(3f));
	}
	
}
