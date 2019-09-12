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
public class FACTORIAL
{

    int fa = 1;

    public void Fact(int num)
    {
        if (num > 0)
        {
            fa = fa * num;
            Fact(num - 1);
        }
        System.out.println(fa);
    }

}
