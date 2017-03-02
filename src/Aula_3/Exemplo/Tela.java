package Aula_3.Exemplo;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Tela extends JPanel {

	//Este componente é sempre necessário para trabalhar em Java 2D
	public void paintComponent(Graphics g) {
		//Definir todas as definições do paintComponent
		super.paintComponent(g);
		// Casting (Graphics2D) serve para alterar a variável g que era do tipo "Graphics" para "Graphics2D"
		Graphics2D g2d = (Graphics2D) g;
		
		//Desenhar a palavrá olá na posição 50 do X e Y por essa ordem
		g2d.drawString("Olá", 50, 50);
	}
	
}
