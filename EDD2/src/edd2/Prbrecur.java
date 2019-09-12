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
public class Prbrecur
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        RECURSIVIDAD obj = new RECURSIVIDAD();
        int n=0;
        System.out.println("Elige una opcion ");
        System.out.println("1.- Metodo Recursivo");
        System.out.println("2.- Obten el factorial de un numero");
        System.out.println("3.- Animales");
        System.out.println("4.- Salir");
        int opc = lecturas.archivo.Lecturas.entero();

        do
        {            
            switch (opc)
        {
            case 1:
                //obj.imp(n);
                System.out.println("----RECURSIVO");
                n = lecturas.archivo.Lecturas.entero(true);
                obj.impR(n);
                break;

            case 2:
                FACTORIAL fact = new FACTORIAL();
                System.out.println("Escribe el numero de lcual deseas obtener el factorial");
                n = lecturas.archivo.Lecturas.entero(true);
                fact.Fact(n);
                break;
                
           case 3:
               RECURSIVIDAD recur = new RECURSIVIDAD ();
               char [] pal = {'w','n','a'};
               recur.palindro(pal, 0, 1);
               
                break;
           case 4:
               BURBJA bubb = new BURBJA();
               char [] serie = {'d','a','e'};
               char [] ser = bubb.bubble(serie);
               for (int i = 0; i < serie.length; i++)
               {
                   System.out.print(ser[i]);
               }
               break;
                
    }
        
            
        } while(opc!=5);
        {
            System.out.println("Adios");
        }

    }

}
