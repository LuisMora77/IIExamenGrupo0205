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
public  abstract class Colecciones {
    
    protected ISorting orden;

    public Colecciones(ISorting orden) {
        this.orden = orden;
    }

    public void setOrden(ISorting orden) {
        this.orden = orden;
    }
    
    public abstract void ordenar(int forma);
    
}
