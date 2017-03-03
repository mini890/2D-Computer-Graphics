package Aula_3.Exemplo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPanel;

import com.sun.prism.paint.Color;

public class ExercicioCurvaCubica extends JPanel {

	//Este componente é sempre necessário para trabalhar em Java 2D
	public void paintComponent(Graphics g) {
		//Definir todas as definições do paintComponent
		super.paintComponent(g);
		// Casting (Graphics2D) serve para alterar a variável g que era do tipo "Graphics" para "Graphics2D"
		Graphics2D g2d = (Graphics2D) g;
		
		//Curva Cubica - Chamar construtor para a variável
		CubicCurve2D.Double curvaCubica = new CubicCurve2D.Double();
		//Definir os valores da curva
		curvaCubica.setCurve(60D, 100D, 30D, 50D, 200D, 50D, 200D, 90D);
		//Desenhar a curva
		g2d.draw(curvaCubica);
		
		Ellipse2D.Double circle1 = new Ellipse2D.Double();
		circle1.setFrame(55D, 95D, 10, 10);
		g2d.fill(circle1);
		
		Ellipse2D.Double circle2 = new Ellipse2D.Double();
		circle2.setFrame(195D, 85D, 10, 10);
		g2d.fill(circle2);
		
		Ellipse2D.Double blueCircle1 = new Ellipse2D.Double();
		blueCircle1.setFrame(45D, 55D, 10, 10);
		g2d.fill(blueCircle1);
		
		Ellipse2D.Double blueCircle2 = new Ellipse2D.Double();
		blueCircle2.setFrame(185D, 45D, 10, 10);
		g2d.fill(blueCircle2);
		
		Line2D.Double linha1 = new Line2D.Double();
		linha1.setLine(60, 100, 50, 60);
		g2d.draw(linha1);
		
		Line2D.Double linha2 = new Line2D.Double();
		linha2.setLine(200, 90, 190, 50);
		g2d.draw(linha2);
		
		//Inicio da Resolução do professor
		
		int raio = 3;
		
		float x1 = 400, y1 = 100;
		float x2 = 400, y2 = 200;
		
		float ctrlx1 = 420;
		float ctrlx2 = 650;
		float ctrly1 = 50, ctrly2 = 50;
		
		CubicCurve2D curvaResolvida = new CubicCurve2D.Float(x1, y1, ctrlx1, ctrly1, ctrlx2, ctrly2, x2, y2);
		
		g2d.draw(curvaResolvida);
		
		g2d.fillOval((int) x1 - raio, (int) y1 - raio , 2 * raio, 2 * raio);
		g2d.fillOval((int) x2 - raio, (int) y2 - raio , 2 * raio, 2 * raio);
		
		g2d.fillOval((int) ctrlx1 - raio, (int) ctrly1- raio , 2 * raio, 2 * raio);
		g2d.fillOval((int) ctrlx2 - raio, (int) ctrly2 - raio , 2 * raio, 2 * raio);
		g2d.drawLine((int) x1, (int) y1, (int) ctrlx1, (int) ctrly1);
		g2d.drawLine((int) x2, (int) y2, (int) ctrlx2, (int) ctrly2);
	}
}