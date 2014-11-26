/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package strategy;

import Naves.NavesAlien;

/**
 *
 * @author pedro
 */
public class Alien {
    
    private Idioma idioma;
    public void pilotarNave(NavesAlien naveAtual)
    {
        naveAtual.pilotarNaves();
    }
    public Alien(){
        this.idioma = new Alienez();
    }
    
    public Alien(Idioma idiomaInicial){
        this.idioma = idiomaInicial;
    }
    
    public void falaInicial(){
        this.idioma.falar();
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }
    
    
    
}
