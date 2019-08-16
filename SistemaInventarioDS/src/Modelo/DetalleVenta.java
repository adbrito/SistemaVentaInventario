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
public class DetalleVenta {
    protected String numVenta;
    protected int cant;
    protected Producto producto;
    protected float subtotal;

    public DetalleVenta(String numVenta, int cant, Producto producto, float subtotal) {
        this.numVenta = numVenta;
        this.cant = cant;
        this.producto = producto;
        this.subtotal = subtotal;
    }

    public String getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(String numVenta) {
        this.numVenta = numVenta;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    
    
}
