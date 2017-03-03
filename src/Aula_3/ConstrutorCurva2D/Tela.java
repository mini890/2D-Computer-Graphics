package Aula_3.ConstrutorCurva2D;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

public class Tela extends JPanel {

	//Este componente é sempre necessário para trabalhar em Java 2D
	public void paintComponent(Graphics g) {
		//Definir todas as definições do paintComponent
		super.paintComponent(g);
		// Casting (Graphics2D) serve para alterar a variável g que era do tipo "Graphics" para "Graphics2D"
		Graphics2D g2d = (Graphics2D) g;
		
		CurvaCubica c = new CurvaCubica(150, 70, 200, 20, 250, 18, 280, 70);
		
		c.desenha(g2d);
	}
}