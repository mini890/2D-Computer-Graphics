package Aula_3.Matriz;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

public class Tela extends JPanel {

	//Este componente � sempre necess�rio para trabalhar em Java 2D
	public void paintComponent(Graphics g) {
		//Definir todas as defini��es do paintComponent
		super.paintComponent(g);
		// Casting (Graphics2D) serve para alterar a vari�vel g que era do tipo "Graphics" para "Graphics2D"
		Graphics2D g2d = (Graphics2D) g;
		
		//Chamar construtor e desenhar no ecr�
		Matrix m = new Matrix(5, 4, 15, 15);
		m.desenha(g2d);
	}
}