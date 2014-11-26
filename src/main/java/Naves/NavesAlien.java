/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Naves;

/**
 *
 * @author Dillei
 */
public abstract class NavesAlien {
    public abstract String velocidadeMaxima();
    
    
    public void pilotarNaves()
    {
        System.out.println("Ligar nave");
        System.out.println("Acelerar até a velocidade maxima da nave : "+this.velocidadeMaxima());
    }
    
}
