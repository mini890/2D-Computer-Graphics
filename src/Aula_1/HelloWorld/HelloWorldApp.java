package Aula_1.HelloWorld;

/**
 * Created by Miguel Silva on 16/02/2017.
 */

public class HelloWorldApp {
    public static void main(String[] args) {
        //Declarar o objeto
        Ponto2D p;
        p = new Ponto2D(3, 5);

        //Impressão para a consola
        System.out.println(p.getX());
        System.out.println(p.getY());
    }
}