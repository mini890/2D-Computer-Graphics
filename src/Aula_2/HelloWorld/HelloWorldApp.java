package Aula_2.HelloWorld;

import java.util.ArrayList;

/**
 * Created by Miguel Silva on 16/02/2017.
 */

public class HelloWorldApp {
    public static void main(String[] args) {
        //Declarar o objeto
        Ponto3D p = new Ponto3D();
        //Apesar de Ponto3D não ter definido em si o X e Y, vai buscar a partir do Ponto2D
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
        
        System.out.println("Ponto3D Usando Array\n");

        //Declaração de 1 Array com 3 Posições
        Ponto3D[] pa = new Ponto3D[3];
        //Posição 0 é ...
        pa[0] = new Ponto3D(3,6, 9);
        pa[1] = new Ponto3D(5,7, 11);
        pa[2] = new Ponto3D(7,10, 15);
        
        //Ciclo for que percorre o array automáticamente
        for (Ponto3D pTemp: pa) {
        	//Format permite imprimir com um determinado formato, %d para inteiro, %f para float %1.2f para 2 casas décimais
        	//e determinar á frente o que vai ser impresso por ordem de escrita 
        	System.out.format("Ponto (%d,%d,%d)\n", pTemp.getX(), pTemp.getY(), pTemp.getZ());
        }
        
        //ArrayList é um array dinámico, sem limite
        ArrayList<Ponto3D> pa1 = new ArrayList<Ponto3D>();
        System.out.println("ou \n");
        //Usar add para adicionar o ponto, como definimos o array como Ponto3D temos de criar um novo Ponto3D para adicionar ao Array
        pa1.add(new Ponto3D(1,2,3));
        pa1.add(new Ponto3D(4,5,6));
        pa1.add(new Ponto3D(7,8,9));
        
        for (Ponto3D pArrayListTemp: pa1) {
        	System.out.format("Ponto (%d, %d, %d)\n", pArrayListTemp.getX(), pArrayListTemp.getY(), pArrayListTemp.getZ());
        }
    }
}