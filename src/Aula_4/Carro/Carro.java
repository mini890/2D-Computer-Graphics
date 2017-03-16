package Aula_4.Carro;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;

public class Carro {
	int xinicial, yinicial;
	
	public Carro(int xinicial, int yinicial){
		this.xinicial = xinicial;
		this.yinicial = yinicial;
	}
	
	public void desenha (Graphics2D g2d){
		
		g2d.setColor(Color.WHITE);
		GeneralPath gp = new GeneralPath();
		//Começar o path
		gp.moveTo(xinicial,yinicial);
		gp.lineTo(xinicial + 40, yinicial);
		gp.curveTo(xinicial + 40, yinicial - 30, xinicial + 80, yinicial - 30, xinicial + 80, yinicial);
		gp.lineTo(xinicial + 140, yinicial);
		gp.curveTo(xinicial + 140, yinicial - 30, xinicial + 180, yinicial - 30, xinicial + 180, yinicial);
		gp.lineTo(xinicial + 220, yinicial);
		gp.lineTo(xinicial + 220, yinicial - 35);
		gp.lineTo(xinicial + 200, yinicial - 50);
		gp.lineTo(xinicial + 175, yinicial - 75);
		gp.lineTo(xinicial + 100, yinicial - 75);
		gp.lineTo(xinicial + 60, yinicial - 50);
		gp.lineTo(xinicial, yinicial - 35);
		gp.lineTo(xinicial, yinicial);
		g2d.fill(gp); //contorno do carro
		
		GeneralPath gp2 = new GeneralPath();
		gp2.moveTo(xinicial + 75, yinicial - 45);
		gp2.lineTo(xinicial + 155, yinicial - 45);
		gp2.lineTo(xinicial + 155, yinicial - 65);
		gp2.lineTo(xinicial + 100, yinicial - 65);
		gp2.lineTo(xinicial + 75, yinicial - 45);
		g2d.setColor(Color.BLACK);
		g2d.fill(gp2);//janela
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(xinicial - 8, yinicial - 20, 25, 15, 5 , 5); //para-choques
		g2d.fillRoundRect(xinicial + 200, yinicial - 20, 25, 15, 5 , 5);
		g2d.drawLine(xinicial + 110, yinicial - 75, xinicial + 140, yinicial - 85); //antena
		g2d.fillOval(xinicial + 140, yinicial -90, 7, 7); //antena(circulo)
		
		Arc2D.Float farol = new Arc2D.Float(Arc2D.CHORD);
		farol.setFrame(xinicial - 20, yinicial - 50, 30, 22);
		farol.setAngleStart(90);
		farol.setAngleExtent(-180);
		g2d.fill(farol);//farol
		
		RodasAros roda1 = new RodasAros(8, 17, xinicial + 60, yinicial);
		roda1.draw(g2d);
		
		RodasAros roda2 = new RodasAros(8, 17, xinicial + 160, yinicial);
		roda2.draw(g2d);
	}

}