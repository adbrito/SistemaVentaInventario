/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author allis
 */
public class Producto {
    protected String codigo, nombre, descripcion,categoria,estado;
    protected float precioAlXMayor, precio;
    protected int cantExist;

    public Producto(String codigo, String nombre, String descripcion, String categoria, String estado, float precioAlXMayor, float precio, int cantExist) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.precioAlXMayor = precioAlXMayor;
        this.precio = precio;
        this.cantExist = cantExist;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
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
    
    
}
