

public class Colas implements MACHOT
{
    int atras=-1;
   Object[] Cola; 

    public Colas()
    {
        Cola=new Object[5];
    }
     public Colas(int n)
    {
        Cola=new Object[n];
    }
    public Colas(Object[] pila)
    {
        this.Cola = pila;
    }

    public Object[] getCola()
    {
        return Cola;
    }

    public void setCola(Object[] Cola)
    {
        this.Cola = Cola;
    }

    public int getAtras()
    {
        return atras;
    }

    public void setAtras(int atras)
    {
        this.atras = atras;
    }

    @Override
    public void inserta(Object d)
    {
       
       
      if(atras+1==Cola.length)
      {
          System.out.println("Cola llena");
         }else
      {
          Cola[++atras]=d;
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
       if(atras==-1)
     {
         System.out.println("Cola vacia");
         return null;
     }else
     {
         Object obj= Cola[0];
         for(int i=0;i<Cola.length;i--)
         {
             Cola[i]=Cola[i+1];
         }
         return obj;
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
