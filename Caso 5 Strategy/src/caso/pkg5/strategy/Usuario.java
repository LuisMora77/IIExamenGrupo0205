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
public class Usuario {
    
    private StrategyOrdenamiento orden;

    public Usuario() {
    }    

    public void setOrden(StrategyOrdenamiento orden) {
        this.orden = orden;
    }
    
    public void ordenar(int forma){
        if(forma == 1){
            orden.ascendente();
        }
        else{
            orden.descendente();
        }
    }
}
