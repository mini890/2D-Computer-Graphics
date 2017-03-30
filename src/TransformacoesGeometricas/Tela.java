package TransformacoesGeometricas;

import java.awt.Color;
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
		
		Rectangle2D.Double r = new Rectangle2D.Double(50, 50, 100, 50);
		g2d.draw(r);
		
		g2d.setColor(Color.BLUE);
		g2d.translate(100, 75);
		g2d.draw(r);
		
		g2d.setColor(Color.RED);
		g2d.rotate(Math.toRadians(45));
		g2d.draw(r);

		
		//Ler de baixo para cima
		g2d.setColor(Color.GREEN);
		//Não esquecer que ainda vai somar os 50 das cordenadas
		//Em vez de começar em 0, 0 começa em -100, -75. Depois o rect desce 50 e é desenhado
		g2d.translate(-100, -75);
		g2d.draw(r);
	}
}