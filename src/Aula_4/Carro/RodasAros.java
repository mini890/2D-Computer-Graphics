package Aula_4.Carro;

import java.awt.Graphics2D;

public class RodasAros {

	int n, raio, posx_init, posy_init;

	public RodasAros(int n, int raio, int posx_init, int posy_init) {
		this.n = n;
		this.raio = raio;
		this.posx_init = posx_init;
		this.posy_init = posy_init;
	}

	public void draw(Graphics2D g2d) {
		double ang;
		for (int i = 0; i < n; i++) {
			ang = Math.toRadians(i * 360 / n);
			g2d.drawLine(posx_init, posy_init, (int) (Math.cos(ang) * raio + posx_init), (int) (Math.sin(ang) * raio + posy_init));
		}
		
		g2d.drawOval(posx_init - raio, posy_init - raio, raio * 2, raio * 2);
	}

}