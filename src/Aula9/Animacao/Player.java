package Aula9.Animacao;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;

public class Player {

	private int posicao = 0;
	BufferedImage img;
	AffineTransform transform;
	Timer t;

	public Player() {
		transform = new AffineTransform();
		transform.translate(100, 100);

		img = null;
		try {
			img = ImageIO.read(new File("src/Aula9/Animacao/spritestrip.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		t = new Timer();
		t.scheduleAtFixedRate(new Anima(), 0, 100);

	}

	public void desenha(Graphics2D g2d) {
		g2d.setTransform(transform);
		g2d.drawImage(img, 0, 0, 128, 128, posicao * 256, 0, posicao * 256 + 256, 256, null);
	}

	class Anima extends TimerTask {

		@Override
		public void run() {
			posicao++;
			if (posicao == 5)
				posicao = 0;

			transform.translate(50, 0);
		}

	}

}