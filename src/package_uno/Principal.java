/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_uno;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class Principal {

    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        llenarPoligono();
        mostrarDatos();
    }

    public static void llenarPoligono() {

        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Digite el poligono que desea:");
                System.out.println("1. Trinagulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = entrada.nextInt();

            } while (opcion  < 1 || opcion >2);
            switch (opcion) {
                case 1: llenarTriangulo();
                    break;
                case 2: llenarRectangulo();
                    break;
            }

            System.out.println("Desea introducir otro poligono");
            System.out.print("yes or no: ");
            respuesta = entrada.next().charAt(0);

        } while (respuesta == 'y');

    }
    
    public static void llenarTriangulo(){
        int lado1,lado2,lado3;
        System.out.println("Digitar lado1 de triangulo");
        lado1  = entrada.nextInt();
        System.out.println("Digitar lado2 de triangulo");
        lado2  = entrada.nextInt();
        System.out.println("Digitar lado3 de triangulo");
        lado3  = entrada.nextInt();
        
        Triangulo triangulito = new Triangulo(lado1, lado2, lado3);
        poligono.add(triangulito);
    
    }
    public static void llenarRectangulo(){
        int lado1,lado2,lado3;
        System.out.println("Digitar lado1 de triangulo");
        lado1  = entrada.nextInt();
        System.out.println("Digitar lado2 de triangulo");
        lado2  = entrada.nextInt();
        
        
        
        Rectagulo rectangulito = new Rectagulo(lado1, lado2);
        poligono.add(rectangulito);
    
    }
        
    public static void mostrarDatos(){
        for (Poligono poligono1 : poligono) {
            System.out.println(""+poligono1.toString());
            System.out.println("AREA"+ poligono1.area());
        }
    }
    

}
