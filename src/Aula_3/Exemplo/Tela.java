package Aula_3.Exemplo;

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
		
		//Chamar construtor
		CubicCurve2D.Double curvaCubica = new CubicCurve2D.Double();
		//Definir curva
		curvaCubica.setCurve(100D, 100D, 30D, 50D, 200D, 50D, 200D, 90D);
		//Desenhar
		g2d.draw(curvaCubica);
		
		Rectangle2D rect = new Rectangle2D.Double();
		rect.setRect(100, 100, 250, 300);
		g2d.draw(rect);
		
		RoundRectangle2D roundRect = new RoundRectangle2D.Double();
		roundRect.setRoundRect(300, 300, 150, 150, 25, 25);
		g2d.draw(roundRect);
	}
}