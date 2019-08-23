/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author allis
 */
public class JefeBodega {
    
    protected Queue<Repartidor> colaRep;

    public JefeBodega() {
        this.colaRep = new LinkedList();
    }
            
    public Repartidor seleccionarRepartidor() {        
        Repartidor rep = this.colaRep.poll();
        rep.setDisponible(false);
        return rep;
    }
    
    public void liberarRepartidor(Repartidor r) {
        r.setDisponible(true);
        this.colaRep.offer(r);
    }
    
    //public void crearRutaEntrega(List<Envio)
    
    public void asignarRuta(Repartidor rep, RutaEntrega ruta) {
        rep.setRutaAsig(ruta);
        rep.setDisponible(false);
    }
    
    
    public void recibirReporte(Repartidor rep, List<Envio> reporte) {
        for (int i=0;i<reporte.size();i++) {
            Envio e = reporte.get(i);
            if (!e.isFirmado()) {
                e.setMsg("El envio no fue realizado con exito");
            }else{ e.setMsg("El envio fue realizado con exito");}
            rep.setDisponible(true);
            liberarRepartidor(rep);        
        }
    }    
}
