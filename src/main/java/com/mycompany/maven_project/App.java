package com.mycompany.maven_project;

import Naves.Factory;
import Naves.Mammoth;
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
        Factory f = new Factory();
        new Alien(new Ingles()).pilotarNave(f.fabricarUmaNave("Mammoth"));
        new Alien(new Portugues()).pilotarNave(f.fabricarUmaNave("CavaloSemPata"));
        
    }
}
