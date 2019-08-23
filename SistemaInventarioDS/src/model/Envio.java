/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author allis
 */
public class Envio {    
    protected Persona destinatario; //persona que encarga el envio, puede ser un cliente o un empleado (como un gerente que pida abastecimiento)
    protected Repartidor repAsig; //repartidor al que se asignara el envio, inicialmente nulo
    protected HashMap<String, Integer> listaProductos; //diccionario con la lista de productos asociada a la cantidad requerida de cada producto
    protected boolean firmado; //atributo que nos sirve para saber si un envio se realizo o no con exito
    protected String msg; //Mensaje que se nos pide ingresar al sistema luego de haberse realizado el envio
    
    public Envio() {
        this.firmado = false; //inicialmente los envios no estan firmados
        this.listaProductos = new HashMap<String, Integer>();
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    public Repartidor getRepAsig() {
        return repAsig;
    }

    public void setRepAsig(Repartidor repAsig) {
        this.repAsig = repAsig;
    }

    public HashMap<String, Integer> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(HashMap<String, Integer> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public boolean isFirmado() {
        return firmado;
    }

    public void setFirmado(boolean firmado) {
        this.firmado = firmado;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
            
    //metodo pra indicar que un envio ha sido firmado por el receptor y que por lo tanto se concluye como un envio exitoso   
    public void hacerFirmar() { 
        this.firmado = true;
    }
    
    public void agregarProducto(String p, int n) {        
        this.getListaProductos().put(p, n);
        System.out.println(this.getListaProductos());
    }
            
    public void verificarEnvio(String nombre, String dir) {                
        System.out.println("El envio coincide ");
    }
    
    
    
}

