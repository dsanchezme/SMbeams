package ui;

import java.awt.*;

public class Carga implements Grafico{

	@Override
	public void dibujar(Graphics2D g, int d) {
		g.setColor(Color.red);
		int i = 35+d;
		int[] x = {i,i-8,i+8};
		int[] y = {320,304,304};
		g.fillPolygon(x, y, 3);	
		g.fillRect(i-1, 269, 2,35);	
	
	}

}
