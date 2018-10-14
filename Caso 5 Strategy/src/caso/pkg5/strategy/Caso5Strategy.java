/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso.pkg5.strategy;

/**
 *
 * @author Monserrath
 */
public class Caso5Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuickSort quick = new QuickSort();
        InsertSort insert = new InsertSort();
        BubbleSort bubble = new BubbleSort();
        
        Usuario prueba = new Usuario();
        
        System.out.println("Prueba con QuickSort");
        prueba.setOrden(quick);
        prueba.ordenar(1);
        prueba.ordenar(0);
        System.out.println("\n");
        
        System.out.println("Prueba con InsertSort");
        prueba.setOrden(insert);
        prueba.ordenar(1);
        prueba.ordenar(0);
        System.out.println("\n");
        
        System.out.println("Prueba con BubbleSort");
        prueba.setOrden(bubble);
        prueba.ordenar(1);
        prueba.ordenar(0);
        System.out.println("\n");
    }
    
}
