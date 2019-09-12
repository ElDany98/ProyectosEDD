/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Dany
 */
public class MATRICES
{

    int[][] matriz;

    public MATRICES()
    {

        matriz = new int[5][5];

    }

    public MATRICES(int n)
    {

        matriz = new int[n][n];
        carga();

    }

    public MATRICES(int[][] arr)
    {
        this.matriz = arr;
    }
/* Metodo con parametros no definidos
    public MATRICES(int x, int... arr)
    {
        this.matriz = arr;
    }
*/
    public int[][] getMatriz()
    {
        return matriz;
    }

    public void setMatriz(int[][]matriz)
    {
        this.matriz = matriz;
    }

    public String deps()
    {
        String s = "";
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
             s += "Datos[" + (i+1)+","+(j+1) + "]=" + matriz[i][j] + "\t";
            }
           s+="\n";
        }
        return s;
    }
/*
    public String deps2()
    {
        String s = " ";
        for (int p : matriz[])
        {
            s += p + "\n";
        }
        return s;
    }
*/
    public void carga()
    {
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
                matriz[i][j] = (int) (Math.random() * 10);
            }
            

        }
    }
    
    /*metodo para redmiencionar vectores
    public void remidmencion (int n) 
    {
        if(n>0)
        {
            int tmp[] = new int [n];
            
            if(tmp.length>matriz.length)
            {
                System.arraycopy(matriz, 0,tmp,0,matriz.length);
            }else
            {
                System.arraycopy(matriz, 0,tmp,0,tmp.length);
            }
            matriz=tmp;
        }
    }
*/
}
