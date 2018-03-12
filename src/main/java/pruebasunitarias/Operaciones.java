/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasunitarias;

/**
 *
 * @author andresteve07
 */
public class Operaciones {
    public static int suma(int num1, int num2){
        System.out.println("HOLO");
        return num1 + num2;
    }
    public static int[] removerElemento(int[] arreglo, int elemento){
        int[] nuevoArreglo = new int[arreglo.length];
        for(int i = 0; i < nuevoArreglo.length;i++){
            if(arreglo[i] != elemento){
                nuevoArreglo[i]=arreglo[i];
            }
        }
        return nuevoArreglo;
    }
    /**
     * Resuelve una jugada de piedra papel o tijeras
     * las jugadas se codifican en un solo caracter (rock, paper, scissors):
     * 'r' -> piedra
     * 'p' -> papel
     * 's' -> tijera
     * @param jugada1 jugada realizada por el jugador nro. 1
     * @param jugada2 jugada realizada por el jugador nro. 2
     * @return devuelve 1 (uno) si gana la primer jugada, 
     * devuelve 2 (dos) si gana la segunda jugada,
     * devuelve 0 (cero) si hay en empate.
     */
    public static int jugarPiedraPapelOTijera(char jugada1, char jugada2){
        return 0;
    }
    
    /**
     * Calcula la ganancia obtenida por un plazo fijo
     * @param montoInicial valor del dinero utilizado para conformar el plazo fijo.
     * @param cantidadMeses duración del plazo fijo en cantidad de meses.
     * @param tasaInteresAnual interes anual ofrecido por el banco.
     * @return valor del dinero obtenido como ganancia al finalizar el plazo fijo.
     */
    public static float calculoGananciaPlazoFijo(
            float montoInicial, 
            int cantidadMeses,
            float tasaInteresAnual){
        return -1.0f;
    }
    
    /**
     * Calcula el índice de masa corporal de una persona en base a su peso y altura.
     * Tener en cuenta las unidades de medida.
     * @param pesoEnKg peso de la persona en kilogramos.
     * @param alturaEnMts altura de la persona en metros.
     * @return indice de masa corporal.
     */
    public static float indiceDeMasaCorporal(float pesoEnKg, float alturaEnMts){
        return -1.0f;
    }
    
    /**
     * Calcula el nivel de obesidad
     * 0 -> Bajo Peso
     * 1 -> Normal
     * 2 -> Sobrepeso
     * 3 -> Obesidad
     * @param indiceDeMasaCorporal
     * @return 
     */
    public static int estadoNutricionalOMS(float indiceDeMasaCorporal){
        return -1;
    }
    
    /**
     * Valida si un año es bisiesto. 
     * @param anio
     * @return
     */
    public static boolean esBisiesto(int anio){
        return false;
    }
    
    /**
     * Calcula la cantidad de palabras dentro de un arreglo de caracteres.
     * @param oracion
     * @return 
     */
    public static int cantidadPalabras(char[] oracion){
        return -1;
    }
    
    /**
     * Valida si el password cumple con las condiciones:
     * 1. Longitud minima de 8 caracteres.
     * 2. Solo puede contener letras y digitos.
     * 3. Debe contener por lo menos dos digitos.
     * @param password
     * @return 
     */
    public static boolean validarPassword(char[] password){
        return false;
    }
    
    /**
     * Un sensor de temperatura realiza una medicion cada 5 minutos.
     * Con el objetivo de determinar cuanto tiempo tarda un sistema de
     * refrigeracion de presicion en alcanzar la temperatura deseada.
     * Esta funcion calcula la cantidad de minutos que le lleva al sistema
     * alcanzar la temperatura deseada con una tolerancia de 0.25˚C.
     * 
     * @param tiemposDeReaccion
     * @return cantidad de minutos
     */
    public static int tiempoDeEstabilizacion(float[] muestrasSensor, float temperaturaDeseada){
        return -1;
    }
}