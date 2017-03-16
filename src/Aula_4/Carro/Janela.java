package Aula_4.Carro;

import javax.swing.JFrame;

public class Janela extends JFrame {
	
	public Janela() {
		//Adicionar janela
		add(new Tela());
		
		//Definir titulo
		setTitle("Exemplo");
		//Fazer com que o bot�o X fa�a algo, neste caso fechar
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Definir tamanho da janela
		setSize(360, 310);
		//Desativar posi��o relativa
		setLocationRelativeTo(null);
		//Fazer com que a janela estaja visivel. Por pr� defini��o n�o est�
		setVisible(true);
		//Impedir o resize da janela
		setResizable(false);
		setSize(1280, 720);
	}
	
	public static void main(String[] args) {
		new Janela();
	}

}