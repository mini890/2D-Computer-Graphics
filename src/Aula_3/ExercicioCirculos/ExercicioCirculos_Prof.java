package Aula_3.ExercicioCirculos;

import java.awt.Graphics2D;

public class ExercicioCirculos_Prof {

	int n, raio;

	public ExercicioCirculos_Prof(int n, int raio) {
		this.n = n;
		this.raio = raio;
	}

	public void draw(Graphics2D g2d) {
		int dim = 5;
		int posx_init = 350;
		int posy_init = 350;
		double ang;
		for (int i = 0; i <= n; i++) {
			//Outra forma de converter para radianos
			//ang = i * (360 / n) * Math.PI / 180;
			ang = Math.toRadians(i * 360 / n);
			g2d.fillOval(
					(int) (Math.cos(ang) * raio + posx_init),
					(int) (Math.sin(ang) * raio + posy_init),
					dim, dim);
		}
		
		g2d.drawOval(posx_init - raio + dim / 2, posy_init - raio + dim / 2, raio * 2, raio * 2);
	}

}