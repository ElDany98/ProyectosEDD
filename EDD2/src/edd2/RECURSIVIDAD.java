/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd2;

/**
 *
 * @author Sala
 */
public class RECURSIVIDAD
{

    public void imp (int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println("i="+i);
            System.out.println("Mexico");
            System.out.println("i="+i);
        }
    }
    public void impR (double n)
    {
        if(n>0)
        {
            System.out.println("i="+n);
            System.out.println("Mexico");
            impR(n-1);
            System.out.println("i="+n);
        }
    }
    
    public boolean palindro (char arreglo [],int i, int j)
    {
        j=arreglo.length;
        if(j<i)
        {
            if (arreglo[i]!=arreglo[j--])
            {
                System.out.println("no");
                return false;
            }
            palindro(arreglo,i-1,j-1);
            
        }
        System.out.println("si");
        return true;
        
    }
    
}
