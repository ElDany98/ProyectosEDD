/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sala
 */
public class PrbCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Colas obj=new Colas();
       obj.inserta("mauro");
       obj.inserta((Integer)5);
       obj.inserta("Hola");
       obj.inserta("Hola1");
       obj.inserta("Hola2");
       
       
       ManupulaEDD.invierte(obj);
       Object a= obj.elimina();
       if(a!=null)
       {
           if(a instanceof String)
           {
               System.out.println(""+(String)a);
       }else
           if(a instanceof Integer )
           {
               System.out.println(""+(Integer)a);
           }
       }
       a= obj.elimina();
       if(a!=null)
       {
           if(a instanceof String)
           {
               System.out.println(""+(String)a);
       }else
           if(a instanceof Integer )
           {
               System.out.println(""+(Integer)a);
           }
       }
       a= obj.elimina();
       if(a!=null)
       {
           if(a instanceof String)
           {
               System.out.println(""+(String)a);
       }else
           if(a instanceof Integer )
           {
               System.out.println(""+(Integer)a);
           }
       }
        a= obj.elimina();
       if(a!=null)
       {
           if(a instanceof String)
           {
               System.out.println(""+(String)a);
       }else
           if(a instanceof Integer )
           {
               System.out.println(""+(Integer)a);
           }
       }
       a= obj.elimina();
       if(a!=null)
       {
           if(a instanceof String)
           {
               System.out.println(""+(String)a);
       }else
           if(a instanceof Integer )
           {
               System.out.println(""+(Integer)a);
           }
       }
       a= obj.elimina();
       if(a!=null)
       {
           if(a instanceof String)
           {
               System.out.println(""+(String)a);
       }else
           if(a instanceof Integer )
           {
               System.out.println(""+(Integer)a);
           }
       }
    }
    
}
