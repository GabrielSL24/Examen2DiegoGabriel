package com.example.examen2;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {

    @Test
    public void testConvertirNumeroBinario() {
        //Prueba para convertir un número binario a decimal
        String input = "1010";
        int base = 0;
        int resultadoEsperado = 10;
        int resultado = Calculadora.convertirNumero(input, base);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testConvertirNumeroBaseInvalida() {
        //Prueba para una base no soportada
        String input = "1010";
        int base = 4;
        int resultadoEsperado = -1;
        int resultado = Calculadora.convertirNumero(input, base);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSuma() {
        //Prueba para la suma de dos números
        int num1 = 5;
        int num2 = 10;
        String operador = "+";
        int resultadoEsperado = 15;
        int resultado = Calculadora.realizarOperacion(num1, num2, operador);

        assertEquals(resultadoEsperado, resultado);
    }

}
