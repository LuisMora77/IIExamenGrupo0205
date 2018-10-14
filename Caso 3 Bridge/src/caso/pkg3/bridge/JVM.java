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
public class JVM extends SisOperativos{

    public JVM() {
        super();
    }

    @Override
    public void realizarProcesos() {
        System.out.println("JVM");
        proc.proceso();
    }
    
}
