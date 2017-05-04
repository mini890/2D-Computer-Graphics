package Aula9.Animacao;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import javafx.scene.transform.Affine;

public class Tela extends JPanel {

	Player player;
	Timer t;

	Tela() {
		player = new Player();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		t = new Timer();
		t.scheduleAtFixedRate(new Anima(), 0, 100);

		player.desenha(g2d);
	}

	class Anima extends TimerTask {

		@Override
		public void run() {
			repaint();
		}

	}

}