package Aula9.Animacao;

import javax.swing.JFrame;

public class Janela extends JFrame {

	public Janela() {

		// Adicionar janela
		add(new Tela());
		// Definir titulo
		setTitle("Exemplo");
		// Fazer com que o botão X faça algo, neste caso fechar
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Definir tamanho da janela
		setSize(1920, 1080);
		// Desativar posição relativa
		setLocationRelativeTo(null);
		// Fazer com que a janela estaja visivel. Por pré definição não está
		setVisible(true);
		// Impedir o resize da janela
		setResizable(false);

	}

	public static void main(String[] args) {
		new Janela();
	}

}