package Aula6.Carro;

import java.awt.Graphics2D;

public class Roda {

	int raio, xi, yi;
	float ang_inicial;

	Roda(int raio, float ang_inicial) {
		this.raio = 17;
		this.xi = 0;
		this.yi = 0;
		this.ang_inicial = 0;
	}

	public void avanca(int npixel) {
		xi -= npixel;
	}

	public void recua(int npixel) {
		xi += npixel;
	}

	public void sobe(int npixel) {
		yi -= npixel;
	}
	
	public void desce(int npixel) {
		yi += npixel;
	}

	public void draw(Graphics2D g2d) {
	}

}