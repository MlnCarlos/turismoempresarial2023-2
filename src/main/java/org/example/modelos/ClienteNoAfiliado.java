package org.example.modelos;

public class ClienteNoAfiliado extends Usuario{
    private Integer numeroReservas;

    public ClienteNoAfiliado() {
    }

    public ClienteNoAfiliado(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico, Integer numeroReservas) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        this.numeroReservas = numeroReservas;
    }

    public Integer getNumeroReservas() {
        return numeroReservas;
    }

    public void setNumeroReservas(Integer numeroReservas) {
        this.numeroReservas = numeroReservas;
    }

    @Override
    public Double calcularAnualidad() {
        Double calculo = this.getCostoAnual() + this.getIva();
        return calculo;
    }
}
