package Aula6.Carro.ResolucaoProfInicial;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class Carro {

	AffineTransform rotacaoRodas, posicao;
	Roda rf, rt;

	public Carro(int x, int y) {
		rotacaoRodas = new AffineTransform();
		posicao = new AffineTransform();
		posicao.translate(x, y);
		rf = new RodaAros(40, 16);
		rt = new RodaAros(40, 16);
	}

	public void desenha(Graphics2D g2d) {

		g2d.setTransform(posicao);
		AffineTransform eixoParaGuardar = g2d.getTransform();
		AffineTransform eixoParaTransformar = g2d.getTransform();

		eixoParaTransformar.concatenate(posicao);
		eixoParaTransformar.concatenate(rotacaoRodas);
		g2d.setTransform(eixoParaTransformar);

		rf.desenha(g2d);

		eixoParaGuardar.translate(150, 0);
		eixoParaGuardar.concatenate(posicao);
		eixoParaGuardar.concatenate(rotacaoRodas);
		g2d.setTransform(eixoParaGuardar);

		rt.desenha(g2d);
	}

	public void avanca() {
		rotacaoRodas.rotate(Math.toRadians(-10));
		posicao.translate(-3, 0);
	}

	public void recua() {
		rotacaoRodas.rotate(Math.toRadians(10));
		posicao.translate(3, 0);
	}

}