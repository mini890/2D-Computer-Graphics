package Aula_3.Matriz;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;

public class Matrix {
	//Definição de variáveis default
	int raio = 5;
	int xi = 50;
	int yi = 50;

	int spcx = 20;
	int spcy = 20;
	int nx = 5;
	int ny = 4;

	//Criação do construtor
	public Matrix(int nx, int ny, int spcx, int spcy) {
		this.spcx = spcx;
		this.spcy = spcy;
		this.nx = nx;
		this.ny = ny;
	}

	public void desenha(Graphics2D g2d) {
		//Duplo ciclo para haver criação
		for (int j = 0; j < ny; j++) {
			for (int i = 0; i < nx; i++) {
				//Definir cor para os circulos
				g2d.setColor(Color.RED);
				//spcx * (raio / 5) serve para ter sempre o mesmo tamanho entre os circulos independentemente do seu raio
				g2d.fillOval(xi + i * (spcx * (raio / 5)), yi + j * (spcy * (raio / 5)), raio * 2, raio * 2);
			}
		}
	}

}