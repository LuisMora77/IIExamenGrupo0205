/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiexamengrupo0205.Caso1_Factory;

/**
 *
 * @author Luis
 */
public class HachaEnano extends Arma {
  private int ataque;
    private int magia;

    public HachaEnano(int ataque, int magia) {
        this.ataque = ataque;
        this.magia = magia;
    }
    
    
    
    @Override
    public void imprimirAtributos() {
        System.out.println("HachaEnano creada: ataque "+ Integer.toString(ataque) + " magia " + Integer.toString(magia));
    }
}
