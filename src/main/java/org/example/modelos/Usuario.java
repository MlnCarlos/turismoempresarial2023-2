package org.example.modelos;


import org.example.validaciones.UsuarioValidacion;

public abstract class Usuario{

    //ATRIBUTOS=VARIABLES=DATOS
    private Integer id;
    private String nombres;
    private String documento;
    private Integer ubicacion;
    private String correoElectronico;
    private final Integer costoAnual = 2000000;
    private final Double iva = 0.19;
    private UsuarioValidacion validacion = new UsuarioValidacion();




    //METODOS=FUNCIONES=ACCIONES
    //METODOS ESPECIALES

    public Usuario() { //constructor vacio
    }

    public Usuario(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico) {
        this.id = id;
        this.nombres = nombres;
        this.documento = documento;
        this.ubicacion = ubicacion;
        this.correoElectronico = correoElectronico;
    }

    public Integer getCostoAnual() {
        return costoAnual;
    }

    public Double getIva() {
        return iva;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        try{
            this.validacion.validarNombres(nombres);
            this.nombres = nombres;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        try{
            this.validacion.validarUbicacion(ubicacion);//Si cumple la validacion
            this.ubicacion = ubicacion;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        try {
            this.validacion.validarCorreo(correoElectronico);
            this.correoElectronico = correoElectronico;
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    @Override //ANOTACION
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", documento='" + documento + '\'' +
                ", ubicacion=" + ubicacion +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", validacion=" + validacion +
                '}';
    }

    //METODOS ORDINARIOS
    public abstract Double calcularAnualidad();


}

