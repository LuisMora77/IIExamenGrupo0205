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
public class Windows extends SisOperativos{

    public Windows(Procesos proc) {
        super(proc);
    }

    @Override
    public void realizarProcesos() {
        System.out.println("Windows");
        proc.proceso();
    }
    
}
