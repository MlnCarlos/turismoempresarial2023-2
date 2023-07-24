package org.example.modelos;

import org.example.validaciones.LocalValidacion;

public class Local {
    private Integer id;
    private String nit;
    private String nombre;
    private Integer ubicacion;
    private String descripcion;
    private LocalValidacion validacion = new LocalValidacion();

    public Local() {
    }

    public Local(Integer id, String nit, String nombre, Integer ubicacion, String descripcion) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try{
            this.validacion.validarNit(nit);
            this.nit = nit;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try {
            this.validacion.validarNombreLocal(nombre);
            this.nombre = nombre;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        try{
            this.validacion.validarUbicacion(ubicacion);
            this.ubicacion = ubicacion;
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
}
