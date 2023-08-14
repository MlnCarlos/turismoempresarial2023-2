package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {
    LocalValidacion localValidacion;

    @BeforeEach
    public void setUp() {
        this.localValidacion = new LocalValidacion();
    }

    @Test
    public void validarNitCorrecto() throws Exception {
        String nitCorrecto = "1234567899";
        this.localValidacion.validarNit(nitCorrecto);
        Assertions.assertDoesNotThrow(()-> this.localValidacion.validarNit(nitCorrecto));
    }
    @Test
    public void validarNitIncorrecto(){
        String nitIncorrecto = "123456789";
        Exception exception = Assertions.assertThrows(Exception.class, ()-> this.localValidacion.validarNit(nitIncorrecto));
        Assertions.assertEquals(" NIT debe de contener 10 caracteres",exception.getMessage());
    }

    @Test
    void validarNombreCorrecto() throws Exception {
        String nombreCorrecto = "Nombre Correcto Para Local";
        this.localValidacion.validarNombreLocal(nombreCorrecto);
        Assertions.assertDoesNotThrow(() -> this.localValidacion.validarNombreLocal(nombreCorrecto));
    }

    @Test
    void validarNombreIncorrecto() {
        String nombreIncorrecto = "Este es un nombre incorrecto para Local porque tiene mas de 30 caracteres";
        Exception exception = Assertions.assertThrows(Exception.class, () -> this.localValidacion.validarNombreLocal(nombreIncorrecto));
        Assertions.assertEquals("El nombre de la empresa no puede sobrepasar los 30 caracteres",exception.getMessage());
    }

    @Test
    void validarUbicacionCorrecta() {
        Integer ubicacionCorrecta = 1;
        Assertions.assertDoesNotThrow(() -> this.localValidacion.validarUbicacion(ubicacionCorrecta));
    }

    @Test
    void validarUbicacionIncorrecta() {
        Integer ubicacionIncorrecta = 5;
        Exception exception = Assertions.assertThrows(Exception.class, () -> this.localValidacion.validarUbicacion(ubicacionIncorrecta));
        Assertions.assertEquals("La zona ingresada no es valida",exception.getMessage());
    }
}