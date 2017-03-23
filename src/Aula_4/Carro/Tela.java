package Aula_4.Carro;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Tela extends JPanel implements KeyListener {

	Carro carro;

	Tela() {
		addKeyListener(this);
		setFocusable(true);
		carro = new Carro(100, 100);
	}

	// Este componente é sempre necessário para trabalhar em Java 2D
	public void paintComponent(Graphics g) {
		// Definir todas as definições do paintComponent
		super.paintComponent(g);
		// Casting (Graphics2D) serve para alterar a variável g que era do tipo
		// "Graphics" para "Graphics2D"
		Graphics2D g2d = (Graphics2D) g;

		// Carro carro = new Carro();
		// carro.draw(g2d);

		// RodasAros r = new RodasAros(8, 200, 350, 350);
		// r.draw(g2d);
		carro.desenha(g2d);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			carro.goUp();
			break;
		case KeyEvent.VK_DOWN:
			carro.goDown();
			break;
		case KeyEvent.VK_LEFT:
			carro.goLeft();
			break;
		case KeyEvent.VK_RIGHT:
			carro.goRight();
			break;
		default:
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