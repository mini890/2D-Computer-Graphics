package Aula6.Carro;

import java.awt.Graphics2D;

public class RodaAros extends Roda {

	int n;

	public RodaAros(int n, int raio) {
		super(raio, 0);
		this.n = n;
	}

	public RodaAros(int raio) {
		super(raio, 0);
		n = 8;
	}

	public void draw(Graphics2D g2d) {
		double ang_inc = 2 * Math.PI / n;
		for (int i = 0; i < n; i++) {
			g2d.drawLine(xi, yi, (int) (Math.cos(ang_inicial) * raio + xi), (int) (Math.sin(ang_inicial) * raio + yi));
			ang_inicial += ang_inc;
		}

		g2d.drawOval(xi - raio, yi - raio, raio * 2, raio * 2);
	}

}