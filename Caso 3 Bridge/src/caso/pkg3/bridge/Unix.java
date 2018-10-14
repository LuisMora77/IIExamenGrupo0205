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
public class Unix extends SisOperativos {

    public Unix() {
        super();
    }

    @Override
    public void realizarProcesos() {
        System.out.println("Unix");
        proc.proceso();
    }
    
}
