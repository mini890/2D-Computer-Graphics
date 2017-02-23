package Aula_2.HelloWorld;

/**
 * Created by Miguel Silva on 16/02/2017.
 */

public class HelloWorldApp {
    public static void main(String[] args) {
        //Declarar o objeto
        Ponto3D p = new Ponto3D();
        p.setX(1);
        p.setY(2);
        p.setZ(3);
        //Impressão para a consola
        System.out.println(p.getX());
        System.out.println(p.getY());
        System.out.println(p.getZ());
        
        System.out.println("ou \n");
        
        Ponto3D p2 = new Ponto3D(5, 8, 10);
        
        System.out.println(p2.getX());
        System.out.println(p2.getY());
        System.out.println(p2.getZ());
    }
}