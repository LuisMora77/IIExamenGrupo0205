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
public class InsertSort implements StrategyOrdenamiento {

    @Override
    public void ascendente() {
        System.out.println("Aqui se esta implementando el ordenamiento InsertSort ascendente");
    }

    @Override
    public void descendente() {
        System.out.println("Aqui se esta implementando el ordenamiento InsertSort descendente");
    }
    
}
