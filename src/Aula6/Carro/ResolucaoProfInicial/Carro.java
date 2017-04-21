package Aula6.Carro.ResolucaoProfInicial;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Carro {

	AffineTransform rotacaoRodas, posicao;
	int comp, alt;
	Roda rf, rt;
	BufferedImage bi;

	public Carro(int x, int y, int c, int a) {
		rotacaoRodas = new AffineTransform();
		posicao = new AffineTransform();
		posicao.translate(x, y);
		rf = new RodaAros(30, 16);
		rt = new RodaAros(30, 16);

		comp = c;
		alt = a;

		try {
			bi = ImageIO.read(new File("src/Aula6/Carro/ResolucaoProfInicial/fundo.jpg"));
		} catch (IOException e) {
			System.out.println("Erro ao carregar o ficheiro.");
		}
	}

	public void desenha(Graphics2D g2d) {
		g2d.setTransform(posicao);

		Paint paintInicial = g2d.getPaint();
		// GradientPaint g = new GradientPaint(0, -alt / 4, Color.PINK, 0, alt /
		// 4, Color.YELLOW, true);
		TexturePaint g = new TexturePaint(bi, new Rectangle(0, 0, bi.getWidth(), bi.getHeight()));
		g2d.setPaint(g);
		g2d.fillRoundRect(-comp / 2, -alt / 2, comp, alt, 5, 5);

		g2d.setPaint(paintInicial);
		g2d.drawRoundRect(-comp / 2, -alt / 2, comp, alt, 5, 5);

		AffineTransform eixoParaGuardar = g2d.getTransform();
		AffineTransform eixoParaTransformar = g2d.getTransform();

		eixoParaTransformar.translate(-comp / 4, alt / 2);
		eixoParaTransformar.concatenate(rotacaoRodas);
		g2d.setTransform(eixoParaTransformar);
		rf.desenha(g2d);

		eixoParaGuardar.translate(comp / 4, alt / 2);
		eixoParaGuardar.concatenate(rotacaoRodas);
		g2d.setTransform(eixoParaGuardar);
		rt.desenha(g2d);
	}

	public void avanca() {
		rotacaoRodas.rotate(Math.toRadians(-10));
		posicao.translate(-5, 0);
	}

	public void recua() {
		rotacaoRodas.rotate(Math.toRadians(10));
		posicao.translate(5, 0);
	}

	public void sobe() {
		posicao.rotate(Math.toRadians(-2));
	}

	public void desce() {
		posicao.rotate(Math.toRadians(2));
	}

}