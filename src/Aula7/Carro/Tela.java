package Aula7.Carro;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class Tela extends JPanel implements KeyListener {

	Carro c1, c2;
	Timer t;

	Tela() {
		setFocusable(true);
		addKeyListener(this);

		c1 = new Carro(100, 100, 200, 80);
		c2 = new Carro(100, 300, 250, 100);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		t = new Timer();
		t.scheduleAtFixedRate(new Anima(), 0, 20);

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

		c1.desenha(g2d);
		c2.desenha(g2d);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			c1.avanca();
			break;
		case KeyEvent.VK_RIGHT:
			c1.recua();
			break;
		case KeyEvent.VK_UP:
			c1.sobe();
			break;
		case KeyEvent.VK_DOWN:
			c1.desce();
			break;

		case KeyEvent.VK_A:
			c2.avanca();
			break;
		case KeyEvent.VK_D:
			c2.recua();
			break;
		case KeyEvent.VK_S:
			c2.desce();
			break;
		case KeyEvent.VK_W:
			c2.sobe();
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	class Anima extends TimerTask {
		@Override
		public void run() {
			repaint();
		}

	}

}