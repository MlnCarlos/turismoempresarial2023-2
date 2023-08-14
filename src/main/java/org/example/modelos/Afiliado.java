package org.example.modelos;

import com.sun.source.tree.ReturnTree;
import org.example.interfaces.Deduccion;
import org.example.interfaces.Reporte;
import org.example.utilidades.MetodosPago;

public class Afiliado extends Usuario implements Deduccion, Reporte {
    private Integer valorMembresia;
    private MetodosPago metodoPago;
    private String documentoReferido;

    public Afiliado() {
    }

    public Afiliado(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico, Integer valorMembresia, MetodosPago metodoPago, String documentoReferido) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        this.valorMembresia = valorMembresia;
        this.metodoPago = metodoPago;
        this.documentoReferido = documentoReferido;
    }

    public Integer getValorMembresia() {
        return valorMembresia;
    }

    public void setValorMembresia(Integer valorMembresia) {
        this.valorMembresia = valorMembresia;
    }

    public MetodosPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodosPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDocumentoReferido() {
        return documentoReferido;
    }

    public void setDocumentoReferido(String documentoReferido) {
        this.documentoReferido = documentoReferido;
    }

    //METODOS ORDINARIOS
    public Double aplicarIvaMembresia(){
        return this.valorMembresia + this.getIva() * this.valorMembresia;
    }


    @Override
    public Double calcularAnualidad() {
        // Necesio costoAnual y resar el 20% del valor de la mensualidad
        Double calculo = this.getCostoAnual()-(this.getValorMembresia()*0.20);
        return this.getCostoAnual()-(this.getValorMembresia()*0.20);
    }

    @Override
    public void calcularDeduccionAnualidad() {

    }

    @Override
    public Double calcularDescuentoMensualidad() {
        return null;
    }

    @Override
    public void generarReporte() {

    }

    @Override
    public void modificarReporte(Integer id) {

    }
}

