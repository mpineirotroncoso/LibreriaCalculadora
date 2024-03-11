package com.marcos.libreria;

public class Calcular {
    /**
     * Resultado final
     */
    public static Float resultado;
    /**
     * Opcion de suma
     */
    public static final String SUMA = "suma";
    /**
     * Opcion de resta
     */
    public static final String RESTA = "resta";
    /**
     * Opcion de multiplicacion
     */
    public static final String MULTIPLICACION = "multiplicacion";
    /**
     * Opcion de division
     */
    public static final String DIVISION = "division";
    /**
     * Opcion de raices
     */
    public static final String RAIZ = "raiz";

    /**
     * @param num1      primer valor
     * @param num2      segundo valor
     * @param operacion Nombre de la operacion a realizar, suma, resta, multiplicacion, division
     * @return resultado
     */
    public static Float calcular(float num1, float num2, String operacion) {
        operacion = operacion.toLowerCase();

        switch (operacion) {
            case SUMA:
                resultado = suma(num1, num2);
                break;
            case RESTA:
                resultado = resta(num1, num2);
                break;
            case MULTIPLICACION:
                resultado = multiplicacion(num1, num2);
                break;
            case DIVISION:
                resultado = division(num1, num2);
                break;
            case RAIZ:
                resultado = raiz(num1, num2);
                break;
            default:
                System.out.println("parametro no valido: " + operacion);
                break;
        }

        return resultado;
    }

    /**
     * @param num1 primer valor
     * @param num2 segundo valor
     * @return resultado
     */
    private static Float suma(float num1, float num2) {
        try {
            return num1 + num2;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @param num1 primer valor
     * @param num2 segundo valor
     * @return resultado
     */
    private static Float resta(float num1, float num2) {
        try {
            return num1 - num2;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @param num1 primer valor
     * @param num2 segundo valor
     * @return resultado
     */
    private static Float multiplicacion(float num1, float num2) {
        try {
            return num1 * num2;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @param num1 primer valor
     * @param num2 segundo valor
     * @return resultado
     */
    private static Float division(float num1, float num2) {
        try {
            return num1 / num2;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @param radicando de la raiz
     * @param indice de la raiz
     * @return resultado
     */
    private static Float raiz(float radicando, float indice) {
        // Descomentar para solo permitir raices cuadradas y cubicas
        /*if (indice != 2 && indice != 3) {
            System.out.println("El indice debe ser 2 o 3");
            return null;
        }*/
        try {
            return (float) Math.pow(radicando, 1/indice);
        } catch (Exception e) {
            return null;
        }
    }
}
