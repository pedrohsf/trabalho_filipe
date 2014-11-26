package com.mycompany.maven_project;

import strategy.Portugues;
import strategy.Alien;
import strategy.Ingles;
import Naves.Factory;
import Naves.NaveInvalidException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NaveInvalidException
    {
        
        new Alien().falaInicial();
        new Alien(new Ingles()).falaInicial();
        new Alien(new Portugues()).falaInicial();
        
        
        
        new Alien(new Ingles()).pilotarNave( Factory.GetFabrica().fabricarUmaNave("Mammoth") );
        new Alien(new Portugues()).pilotarNave( Factory.GetFabrica().fabricarUmaNave("CavaloSemPata") );
        
        
        
    }
}
