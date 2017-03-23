package Aula_4.Carro;

import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class RodaPneu {

	int xi, yi, n, raio, espessura;

	public RodaPneu(int n, int raio, int espessura, int xi, int yi) {
		this.n = n;
		this.raio = raio;
		this.espessura = espessura;
		this.xi = xi;
		this.yi = yi;
	}

	public void draw(Graphics2D g2d) {
		double ang;
		for (int i = 0; i < n; i++) {
			ang = Math.toRadians(i * 360 / n);
			g2d.drawLine(xi, yi, (int) (Math.cos(ang) * raio + xi), (int) (Math.sin(ang) * raio + yi));
		}
		Ellipse2D.Double c1 = new Ellipse2D.Double(xi - raio, yi - raio, raio * 2, raio * 2);
		Area a1 = new Area(c1);
		
		Ellipse2D.Double c2 = new Ellipse2D.Double(xi - raio + espessura, yi - raio + espessura, raio * 2 - 2 * espessura , raio * 2 - 2 * espessura);
		Area a2 = new Area(c2);
		
		a1.subtract(a2);
		g2d.draw(a1);
	}

}