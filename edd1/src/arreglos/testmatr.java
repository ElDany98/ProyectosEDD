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
public class testmatr
{

    int[][][][][] matriz;

    public testmatr()
    {

        matriz = new int[1][3][5][2][9];

    }

    public testmatr(int n)
    {

        matriz = new int[n][n][n][n][n];
        carga();

    }

    public testmatr(int[][][][][] arr)
    {
        this.matriz = arr;
    }

    /* Metodo con parametros no definidos
    public MATRICES(int x, int... arr)
    {
        this.matriz = arr;
    }
     */
    public int[][][][][] getMatriz()
    {
        return matriz;
    }

    public void setMatriz(int[][][][][] matriz)
    {
        this.matriz = matriz;
    }

    public String deps()
    {
        String s = "";
        for (int i = 0; i < matriz.length; i++)
        {//primera dimencion
            for (int j = 0; j < matriz[i].length; j++)
            {//segunda dimencion
                for (int k = 0; k < matriz[i][j].length; k++)
                {//tercera dimencion
                    for (int l = 0; l < matriz[i][j][k].length; l++)
                    {//cuarta dimencion
                        for (int m = 0; m < matriz[i][j][k][l].length; m++)
                        {//quinta dimencion
                            s += "[" + (i + 1) + "," + (j + 1) +","+(k+1)+","+(l+1)+","+(m+1)+ "]= " + matriz[i][j][k][l][m]+" " ;   
                        }//quinta dimencion
                    }//cuarta dimencion
                }//tercera dimencion   
            }//segunda dimencion
            s += "\n";//empezar a imprimir el dato desde el inicio de la fila
        }//primera dimencion
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
        {//primera dimencion
            for (int j = 0; j < matriz[i].length; j++)
            {//segunda dimencion
                for (int k = 0; k < matriz[i][j].length; k++)
                {//tercera dimencion
                    for (int l = 0; l < matriz[i][j][k].length; l++)
                    {//cuarta dimencion
                        for (int m = 0; m < matriz[i][j][k][l].length; m++)
                        {//quinta dimencion
                            matriz[i][j][k][l][m] = (int) (Math.random() * 10);
                        }
                        
                    }
                       
                }  
                
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
