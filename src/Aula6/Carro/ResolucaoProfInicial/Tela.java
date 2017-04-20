package Aula6.Carro.ResolucaoProfInicial;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

public class Tela extends JPanel implements KeyListener {

	Carro c;

	Tela() {
		setFocusable(true);
		addKeyListener(this);

		c = new Carro(100, 100);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		c.desenha(g2d);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			c.avanca();
			break;
		case KeyEvent.VK_RIGHT:
			c.recua();
			break;
		}

		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}