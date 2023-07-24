package org.example.modelos;

import org.example.utilidades.Util;
import org.example.validaciones.ReservaValidacion;

import java.time.LocalDate;
import java.util.Date;

public class Reserva {
    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;
    private Integer numeroReserva;
    private ReservaValidacion validacion = new ReservaValidacion();
    //private Oferta costoPersona = new Oferta(); PREGUNTAR AL PROFE SI EL CALCULO TOTAL SE HACE SOBRE EL COSTO POR PERSONA O SOBRE QUE?

    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReserva, Integer numeroReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal; //* 0.19; //PREGUNTAR AL PROFE CUAL VENDRIA SIENDO EL COSTO TOTAL DE LA RESERVA
        this.fechaReserva = fechaReserva;
        this.numeroReserva = numeroReserva;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        try {
            this.validacion.validarFechaReserva(fechaReserva);
            LocalDate fechaReservaLocalDate = Util.convertirFechaStringLocalDate(fechaReserva,"dd/MM/yyyy");
            this.fechaReserva = fechaReservaLocalDate;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public Integer getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(Integer numeroReserva) {
        try {
            this.validacion.validarNumeroReserva(numeroReserva);
            this.numeroReserva = numeroReserva;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }
}
