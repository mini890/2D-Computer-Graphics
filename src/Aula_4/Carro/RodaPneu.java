package Aula_4.Carro;

import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class RodaPneu extends Roda {

	int n, espessura;

	public RodaPneu(int n, int raio, int espessura, int xi, int yi) {
		super(raio, xi, yi, 0);
		this.n = n;
		this.espessura = espessura;
	}

	public void draw(Graphics2D g2d) {
		double ang_inc = 2 * Math.PI / n;
		for (int i = 0; i < n; i++) {
			g2d.drawLine(xi, yi, (int) (Math.cos(ang_inicial) * raio + xi), (int) (Math.sin(ang_inicial) * raio + yi));
			ang_inicial += ang_inc;
		}
		Ellipse2D.Double c1 = new Ellipse2D.Double(xi - raio, yi - raio, raio * 2, raio * 2);
		Area a1 = new Area(c1);

		Ellipse2D.Double c2 = new Ellipse2D.Double(xi - raio + espessura, yi - raio + espessura,
				raio * 2 - 2 * espessura, raio * 2 - 2 * espessura);
		Area a2 = new Area(c2);

		a1.subtract(a2);
		g2d.fill(a1);
	}

}