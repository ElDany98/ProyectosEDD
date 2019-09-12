/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sala
 */
public class ManupulaEDD 
{
public static  void invierte(Colas c){
    pila p= new pila(c.getCola().length);
    while(c.getAtras()!=-1)
    {
        p.inserta(c.elimina());
    }
    while(p.getTope()!=-1)
    {
        c.inserta(p.elimina());
    }
    
}
    
}
