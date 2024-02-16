package com.marcos.libreria;

public class Calcular {
    /**
     * Resultado final
     */
    public static float resultado;
    /**
     * Opcion de suma
     */
    public static final String SUMA="suma";
    /**
     * Opcion de resta
     */
    public static final String RESTA="resta";
    /**
     * Opcion de multiplicacion
     */
    public static final String MULTIPLICACION="multiplicacion";
    /**
     * Opcion de division
     */
    public static final String DIVISION="division";

    /**
     *
     * @param num1 primer valor
     * @param num2 segundo valor
     * @param operacion Nombre de la operacion a realizar, suma, resta, multiplicacion, division
     * @return resultado
     */
    public static float calcular(float num1, float num2, String operacion) {
        operacion = operacion.toLowerCase();

        switch(operacion) {
            case SUMA:
                resultado=suma(num1,num2);
                break;
            case RESTA:
                resultado=resta(num1, num2);
                break;
            case MULTIPLICACION:
                resultado=multiplicacion(num1, num2);
                break;
            case DIVISION:
                resultado=division(num1, num2);
                break;
            default:
                System.out.println("parametro no valido: "+operacion);
                break;
        }

        return resultado;
    }

    /**
     *
     * @param num1 primer valor
     * @param num2 segundo valor
     * @return resultado
     */
    private static float suma(float num1, float num2) {
        return num1+num2;
    }

    /**
     *
     * @param num1 primer valor
     * @param num2 segundo valor
     * @return resultado
     */
    private static float resta(float num1, float num2) {
        return num1-num2;
    }

    /**
     *
     * @param num1 primer valor
     * @param num2 segundo valor
     * @return resultado
     */
    private static float multiplicacion(float num1, float num2) {
        return num1*num2;
    }

    /**
     *
     * @param num1 primer valor
     * @param num2 segundo valor
     * @return resultado
     */
    private static float division(float num1, float num2) {
        return num1/num2;
    }
}
