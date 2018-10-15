/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiexamengrupo0205;

import iiexamengrupo0205.Caso1_Factory.Arma;
import iiexamengrupo0205.Caso1_Factory.FactoryAbstracto;
import iiexamengrupo0205.Caso1_Factory.FactoryArmaOrco;
import iiexamengrupo0205.Caso1_Factory.FactoryDagaElfica;
import iiexamengrupo0205.Caso1_Factory.FactoryGarroteSauron;
import iiexamengrupo0205.Caso1_Factory.FactoryHachaEnano;
import iiexamengrupo0205.Caso1_Factory.Tipo;

/**
 *
 * @author Luis
 */
public class IIExamenGrupo0205 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        
 
        FactoryAbstracto factoDaga = new FactoryDagaElfica();
        Arma daga =factoDaga.fabricarArma();
        daga.imprimirAtributos();
    
        
        FactoryAbstracto factoOrco = new FactoryArmaOrco();
        Arma orco =factoOrco.fabricarArma();
        orco.imprimirAtributos();
        
        FactoryAbstracto factoSauron = new FactoryGarroteSauron();
        Arma garrote =factoSauron.fabricarArma();
        garrote.imprimirAtributos();
        
        FactoryAbstracto factoHacha = new FactoryHachaEnano();
        Arma hacha =factoHacha.fabricarArma();
        hacha.imprimirAtributos();

        
        
    }
    
}
