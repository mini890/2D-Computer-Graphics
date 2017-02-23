package Aula_1.HelloWorld;

/**
 * Created by Miguel Silva on 16/02/2017.
 */
public class Ponto2D {

    //Cria��o de Vari�veis X e Y
    int x;
    int y;

    //Cria��o de Construtor
    Ponto2D() {
        x = y = 0;
    }

    //Cria��o de 2� Construtor
    Ponto2D(int x, int y1) {
        //Usar this quando existe 2 m�todos com o mesmo nome
        this.x = x;
        //Esta seria outra alternativa ao this
        y = y1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y1) {
        y = y1;
    }
}