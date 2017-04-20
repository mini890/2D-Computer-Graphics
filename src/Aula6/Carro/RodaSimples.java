package Aula6.Carro;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class RodaSimples extends Roda {

	RodaSimples(int raio) {
		super(raio,  0);
	}

	public void draw(Graphics2D g2d) {
		Ellipse2D.Double c1 = new Ellipse2D.Double(xi - raio, yi - raio, raio * 2, raio * 2);
		g2d.draw(c1);
	}

}