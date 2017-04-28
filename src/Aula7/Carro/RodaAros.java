package Aula7.Carro;

import java.awt.Graphics2D;

public class RodaAros extends Roda {

	int nRaios;
	
	RodaAros() {
		super();
		nRaios = 8;
	}
	
	RodaAros(int r, int nR) {
		super(r);
		nRaios = nR;
	}
	
	public void desenha(Graphics2D g2d) {
		double ang_inc = 2 * Math.PI / nRaios;
		float ang_inicial = 0;
		for (int i = 0; i < nRaios; i++) {
			g2d.drawLine(0, 0, 
					(int) (raio * Math.cos(ang_inicial)),
					(int) (raio * Math.sin(ang_inicial)));
			ang_inicial += ang_inc;
		}
		g2d.drawOval(-raio, -raio, 2 * raio, 2 * raio);
	}
	
}