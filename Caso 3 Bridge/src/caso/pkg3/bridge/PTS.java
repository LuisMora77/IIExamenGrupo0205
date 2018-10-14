/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso.pkg3.bridge;

/**
 *
 * @author Monserrath
 */
public class PTS implements Procesos{

    @Override
    public void proceso() {
        System.out.println("Esta ejecutando Preemtive Thread Scheduler");
    }
    
}
