package com.mycompany.maven_project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        new Alien().falaInicial();
        new Alien(new Ingles()).falaInicial();
        new Alien(new Portugues()).falaInicial();
        
    }
}
