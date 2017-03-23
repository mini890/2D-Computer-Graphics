package Aula_4.Carro;

import java.awt.Graphics2D;

public class Roda {

	int raio, xi, yi;
	float ang_inicial;

	Roda(int raio, int xi, int yi, float ang_inicial) {
		this.raio = raio;
		this.xi = xi;
		this.yi = yi;
		this.ang_inicial = ang_inicial;
	}

	public void avanca(int npixel) {
		xi -= npixel;
		ang_inicial -= Math.toRadians(10);
	}

	public void recua(int npixel) {
		xi += npixel;
		ang_inicial += Math.toRadians(10);
	}

	public void sobe(int npixel) {
		yi -= npixel;
	}
	
	public void desce(int npixel) {
		yi += npixel;
	}

	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
	}

}