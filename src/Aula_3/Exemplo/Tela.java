package Aula_3.Exemplo;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Tela extends JPanel {

	//Este componente � sempre necess�rio para trabalhar em Java 2D
	public void paintComponent(Graphics g) {
		//Definir todas as defini��es do paintComponent
		super.paintComponent(g);
		// Casting (Graphics2D) serve para alterar a vari�vel g que era do tipo "Graphics" para "Graphics2D"
		Graphics2D g2d = (Graphics2D) g;
		
		//Desenhar a palavr� ol� na posi��o 50 do X e Y por essa ordem
		g2d.drawString("Ol�", 50, 50);
	}
	
}
