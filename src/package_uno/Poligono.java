/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_uno;

/**
 *
 * @author Alexander
 */
public abstract class Poligono {
    int numero_lados;

    public Poligono(int numero_lados) {
        this.numero_lados = numero_lados;
    }

    public int getNumero_lados() {
        return numero_lados;
    }

    //metodo utilizado para mostrar datos,es muy usado
    @Override
    public String toString() {
        return "Poligono" + " numero_lados = " + numero_lados ;
    }
    

//Declaramos el metod
   public abstract double area();
    
    
    
    
}
