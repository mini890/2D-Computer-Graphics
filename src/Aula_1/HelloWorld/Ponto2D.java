package Aula_1.HelloWorld;

/**
 * Created by Miguel Silva on 16/02/2017.
 */
public class Ponto2D {

    //Cria��o de Vari�veis X e Y
    protected int x; //Protected faz com que as subclasses possam aceder e modificar estas vari�veis
    protected int y;

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

    int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }

    int getY() {
        return y;
    }

    void setY(int y1) {
        y = y1;
    }
}