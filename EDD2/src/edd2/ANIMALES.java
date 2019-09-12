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
public abstract class ANIMALES
{
    private String nombre;
    private String tipo;
    private String color;

    public ANIMALES()
    {
    }

    public ANIMALES(String nombre, String tipo, String color)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    
    
    
    
    
}
