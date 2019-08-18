/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.LinkedList;

/**
 *
 * @author allis
 */
public class Producto {
    protected String nombre, descripcion,categoria;
    protected float precioAlXMayor, precio;
    protected int cantExist,codigo;
    protected char estado;

    public Producto(int codigo, String nombre, String descripcion, String categoria, char estado, float precioAlXMayor, float precio, int cantExist) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.precioAlXMayor = precioAlXMayor;
        this.precio = precio;
        this.cantExist = cantExist;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public float getPrecioAlXMayor() {
        return precioAlXMayor;
    }

    public void setPrecioAlXMayor(float precioAlXMayor) {
        this.precioAlXMayor = precioAlXMayor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantExist() {
        return cantExist;
    }

    public void setCantExist(int cantExist) {
        this.cantExist = cantExist;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria + ", estado=" + estado + ", precioAlXMayor=" + precioAlXMayor + ", precio=" + precio + ", cantExist=" + cantExist + ", codigo=" + codigo + '}';
    }
    
    
    
}
