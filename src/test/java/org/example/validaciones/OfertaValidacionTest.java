package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OfertaValidacionTest {
    OfertaValidacion ofertaValidacion;

    @BeforeEach
    void setUp() {
        this.ofertaValidacion = new OfertaValidacion();
    }

    @Test
    void validarTituloCorrecto() throws Exception{
        String tituloCorrecto = "Este es un titulo correcto";
        this.ofertaValidacion.validarTitulo(tituloCorrecto);
        Assertions.assertDoesNotThrow(() -> this.ofertaValidacion.validarTitulo(tituloCorrecto));
    }

    @Test
    void validarTituloIncorrecto() {
        String tituloIncorrecto = "Este es un titulo inccorrecto porque creo que tiene mas de 30 caracteres";
        Exception exception = Assertions.assertThrows(Exception.class, () -> this.ofertaValidacion.validarTitulo(tituloIncorrecto));
        Assertions.assertEquals("El titulo de la oferta no puede sobrepasar los 20 caracteres",exception.getMessage());
    }

    @Test
    void validarFormatoFechaCorrecta() throws Exception{
        String formatoFechaCorrecta = "14/08/2023";
        this.ofertaValidacion.validarFormatoFecha(formatoFechaCorrecta);
        Assertions.assertDoesNotThrow(() -> this.ofertaValidacion.validarFormatoFecha(formatoFechaCorrecta));
    }

    @Test
    void validarFormatoFechaIncorrecta() {
        String formatoFechaIncorrecta = "2023/08/14";
        Exception exception = Assertions.assertThrows(Exception.class, () -> this.ofertaValidacion.validarFormatoFecha(formatoFechaIncorrecta));
        Assertions.assertEquals("El formato de fecha debe de ser DD/MM/YYY",exception.getMessage());
    }

    @Test
    void validarDiferenciaFechasCorrectas() throws Exception{
        LocalDate fechaInicioCorrecta = LocalDate.of(2023,8,13);
        LocalDate fechaFinCorrecta = LocalDate.of(2023,8,14);
        this.ofertaValidacion.validarDiferenciaEntreFechas(fechaInicioCorrecta,fechaFinCorrecta);
        Assertions.assertDoesNotThrow(() -> this.ofertaValidacion.validarDiferenciaEntreFechas(fechaInicioCorrecta,fechaFinCorrecta));
    }

    @Test
    void validarDiferenciasFechasIncorrectas() {
        LocalDate fechaInicioIncorrecta = LocalDate.of(2023,8,13);
        LocalDate fechaFinIncorrecta = LocalDate.of(2023,8,14);
        Exception exception = Assertions.assertThrows(Exception.class, () -> this.ofertaValidacion.validarDiferenciaEntreFechas(fechaFinIncorrecta,fechaInicioIncorrecta));
        Assertions.assertEquals("La fecha de inicio no puede ser despues de la fecha fin",exception.getMessage());
    }

    @Test
    void validarCostoCorrecto() throws Exception{
        Double costoPersona = 1.0;
        this.ofertaValidacion.validarCosto(costoPersona);
        Assertions.assertDoesNotThrow(() -> this.ofertaValidacion.validarCosto(costoPersona));
    }

    @Test
    void validarCostoIncorrecto() {
        Double costoPersonaIncorrecto = -1.0;
        Exception exception = Assertions.assertThrows(Exception.class, () -> this.ofertaValidacion.validarCosto(costoPersonaIncorrecto));
        Assertions.assertEquals("El costo de la entrada no puede ser negativo",exception.getMessage());
    }
}