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
public class Factory {
    
    private static Factory fabricaDeNave;
    
    private Factory(){
    }
    
    public static Factory GetFabrica(){
        if(Factory.fabricaDeNave == null){
            Factory.fabricaDeNave = new Factory();
        }
        return Factory.fabricaDeNave;
    }
    
    
    public NavesAlien fabricarUmaNave(String nomeDaNave) throws NaveInvalidException
    {
        if(nomeDaNave.toLowerCase().equals("mammoth"))
        {
            return new Mammoth();
        }
        if(nomeDaNave.toLowerCase().equals("cavalosempata"))
        {
            return new CavaloSemPata();
        }
        
        throw new NaveInvalidException();
        
    }
}
