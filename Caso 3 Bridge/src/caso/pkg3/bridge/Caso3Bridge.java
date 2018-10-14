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
public class Caso3Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PTS pts = new PTS();
        TSTS tsts = new TSTS();
        
        Windows win = new Windows();
        win.setProc(pts);
        win.realizarProcesos();
        win.setProc(tsts);
        win.realizarProcesos();
        System.out.println("\n");
        
        Unix unix = new Unix();
        unix.setProc(pts);
        unix.realizarProcesos();
        unix.setProc(tsts);
        unix.realizarProcesos();
        System.out.println("\n");
        
        JVM jvm = new JVM();
        jvm.setProc(pts);
        jvm.realizarProcesos();
        jvm.setProc(tsts);
        jvm.realizarProcesos();
        
    }
    
}
