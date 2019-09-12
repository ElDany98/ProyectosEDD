/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sala
 */
public class pila implements MACHOT
{
    int tope=-1;
   Object pila[]; 

    public pila()
    {
        pila=new Object[5];
    }
     public pila(int n)
    {
        pila=new Object[n];
    }
    public pila(Object[] pila)
    {
        this.pila = pila;
    }

    public Object[] getPila()
    {
        return pila;
    }

    public void setPila(Object[] pila)
    {
        this.pila = pila;
    }

    public int getTope()
    {
        return tope;
    }

    public void setTope(int tope)
    {
        this.tope = tope;
    }

    @Override
    public void inserta(Object d)
    {
       
       
      if(tope+1==pila.length)
      {
          System.out.println("Pila llena");
         }else
      {
          pila[++tope]=d;
      }
    }

    @Override
    public Object inserta(Object r, Object d)
    {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object elimina()
    {
       if(tope==-1)
     {
         System.out.println("Pila vacia");
         return null;
     }else
     {
         return pila[tope--];
     }
    }

    @Override
    public Object elimina(Object s)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] elimina(Object r, Object s)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
