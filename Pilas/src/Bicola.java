/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sala
 */
public class Bicola {

    Object bc[];
    int atras1, atras2;

    public Bicola() {
        bc = new Object[5];
        atras1 = -1;
        atras2 = 5;
    }//Constructor

    public Bicola(int n) {
        bc = new Object[n];
        atras1 = -1;
        atras2 = n;
    }//constr8uctor 2

    public int insert(Object dat, int a, int lim, int factor) {
        if (a + factor == lim) {
            System.out.println("Bicola llena");

        } else {
            bc[a + factor] = dat;
            a += factor;
        }
        return a;
    } // inserta

    public Object[] remove(int atras, int pos, int fact) {
        Object temp[] = new Object[2];
        if (pos - fact == atras) 
        {
         System.out.println("Bicola modificada   ");
         temp[0]=null;
         temp[1]=atras;
        }
        else 
        {
            temp[0]=bc[pos];
            for (int i = pos; i != atras; i+=fact) 
            {
                bc[i]=bc[i+fact];
            }
            temp[1]=atras-fact;
        }      
        return temp;
    }

    //**************************************************SET & GET
    public Object[] getBc() {
        return bc;
    }

    public void setBc(Object[] bc) {
        this.bc = bc;
    }

    public int getAtras1() {
        return atras1;
    }

    public void setAtras1(int atras1) {
        this.atras1 = atras1;
    }

    public int getAtras2() {
        return atras2;
    }

    public void setAtras2(int atras2) {
        this.atras2 = atras2;
    }
    //*************************************************SET&GET
}


