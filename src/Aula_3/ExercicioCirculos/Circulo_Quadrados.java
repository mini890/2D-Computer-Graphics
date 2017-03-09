package Aula_3.ExercicioCirculos;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Circulo_Quadrados {

	int n = 8;
	int raio = 20;
	int raio_quadrado = 10;
	int xi = 70;
	int yi = 50;
	
	public Circulo_Quadrados(int n, int raio) {
		this.n = n;
		this.raio = raio;
	}

	public void draw(Graphics2D g2d) {
		//Desenhar circulo
		Ellipse2D.Double circulo = new Ellipse2D.Double(xi, yi, raio * 2, raio * 2);
		g2d.draw(circulo);
		
		//Minha resolução
		Rectangle2D.Double rectangulo = new Rectangle2D.Double(xi + raio * 2- raio_quadrado, yi + raio - raio_quadrado, raio_quadrado * 2, raio_quadrado * 2);
		for (int i = 0; i <= n; i++) {
			g2d.fill(rectangulo);
			g2d.setColor(Color.RED);
			g2d.rotate(Math.toRadians(360 / n), xi + raio, yi + raio);
		}
	}
	
}