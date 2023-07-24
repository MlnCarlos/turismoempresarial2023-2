package org.example.modelos;

import org.example.utilidades.Util;
import org.example.validaciones.OfertaValidacion;

import java.time.LocalDate;
import java.util.Date;

public class Oferta {
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPersona;
    private Integer idLocal;
    private OfertaValidacion validacion = new OfertaValidacion();

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona, Integer idLocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.idLocal = idLocal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try {
            this.validacion.validarTitulo(titulo);
            this.titulo = titulo;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        try {
            this.validacion.validarFormatoFecha(fechaInicio);
            this.fechaInicio = Util.convertirFechaStringLocalDate(fechaInicio,"dd/MM/yyyy");
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        try {
            this.validacion.validarFormatoFecha(fechaFin);
            LocalDate fechaFinTemporal = Util.convertirFechaStringLocalDate(fechaFin,"dd/MM/yyyy");
            this.validacion.validarDiferenciaEntreFechas(this.fechaInicio,fechaFinTemporal);
            this.fechaFin = fechaFinTemporal;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        try {
            this.validacion.validarCosto(costoPersona);
            this.costoPersona = costoPersona;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }
}
