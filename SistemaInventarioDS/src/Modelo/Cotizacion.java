/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author allis
 */
public class Cotizacion {
    protected String numCotizacion,fechaAct;
    protected float iva,subtotal,total;
    protected List<DetalleVenta> detalleVenta;
    protected Vendedor vendedor;

    public Cotizacion(String numCotizacion, String fechaAct, float iva, float subtotal, float total, List<DetalleVenta> detalleVenta, Vendedor vendedor) {
        this.numCotizacion = numCotizacion;
        this.fechaAct = fechaAct;
        this.iva = iva;
        this.subtotal = subtotal;
        this.total = total;
        this.detalleVenta = detalleVenta;
        this.vendedor = vendedor;
    }

    public String getNumCotizacion() {
        return numCotizacion;
    }

    public void setNumCotizacion(String numCotizacion) {
        this.numCotizacion = numCotizacion;
    }

    public String getFechaAct() {
        return fechaAct;
    }

    public void setFechaAct(String fechaAct) {
        this.fechaAct = fechaAct;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<DetalleVenta> getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(List<DetalleVenta> detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public void calcularIVA(){
        this.setSubtotal(subtotal*12/100 + subtotal);
    }
    
    
}
