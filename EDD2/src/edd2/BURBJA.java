/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd2;

/**
 *
 * @author danie
 */
public class BURBJA
{
    
    public  char[]bubble (char []vector)
    {
        char aux;
        char [] vectorordenado;
        for (int i = 2; i < vector.length; i++)
        {
            for (int j = 0; j < vector.length-1; j++)
            {
                if (vector[j]>vector[j+1])
                {
                    aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                    
                }
                
            }
            
        }
        vectorordenado=vector;
        
        return vectorordenado;
    }
    
    
    public int[]burbu (int[]vecparam, int inc, int jinc)
    {
        int auxiliar;
        int [] orden;
        jinc = 
         
        
        return orden;
    }
    
}
