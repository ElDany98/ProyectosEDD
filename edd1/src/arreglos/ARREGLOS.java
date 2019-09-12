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
public class ARREGLOS
{

    int arr[];

    public ARREGLOS()
    {

        arr = new int[5];

    }

    public ARREGLOS(int n)
    {

        arr = new int[n];
        carga();

    }

    public ARREGLOS(int[] arr)
    {
        this.arr = arr;
    }

    public ARREGLOS(int x, int... arr)
    {
        this.arr = arr;
    }

    public int[] getArr()
    {
        return arr;
    }

    public void setArr(int[] arr)
    {
        this.arr = arr;
    }

    public String deps()
    {
        String s = " ";
        for (int i = 0; i < arr.length; i++)
        {
            s += "D[" + i + "]=" + arr[i] + "\n";
        }
        return s;
    }

    public String deps2()
    {
        String s = " ";
        for (int p : arr)
        {
            s += p + "\n";
        }
        return s;
    }

    public void carga()
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 10);

        }
    }
    
    public void remidmencion (int n) 
    {
        if(n>0)
        {
            int tmp[] = new int [n];
            
            if(tmp.length>arr.length)
            {
                System.arraycopy(arr, 0,tmp,0,arr.length);
            }else
            {
                System.arraycopy(arr, 0,tmp,0,tmp.length);
            }
            arr=tmp;
        }
    }

}
