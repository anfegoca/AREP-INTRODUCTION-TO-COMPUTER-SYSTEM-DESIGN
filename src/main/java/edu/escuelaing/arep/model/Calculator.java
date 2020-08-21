package edu.escuelaing.arep.model;

import java.util.List;

/**
 *
 * @author Andres Gonzalez
 */
public class Calculator {
    private static class helper {
        private static final Calculator INSTANCE = new Calculator();
    }
    public static Calculator getInstance() {
        return helper.INSTANCE;
    }
    /**
     * Calcula la media dada una lista de Doubles
     * 
     * param lis lista de Doubles
     * return el valor de la media como tipo Double
     */
    public final Operations mean = (lis) -> {
        Double sum = 0.0;
        for (int i = 0; i < lis.size(); i++) {
            sum += lis.get(i);
        }
        sum = sum / lis.size();
        return sum;
    };
    /**
     * Calcula la desviación estandar de la lista dada
     * 
     * param lis lista de Doubles
     * return el valor de la desviación estandar como tipo Double
     */
    public final Operations standarDes = (List<Double> lis) -> {
        Double sum = 0.0;
        Double avr = getInstance().operate(lis, mean);
        for (int i = 0; i < lis.size(); i++) {
            sum += Math.pow(lis.get(i) - avr, 2);
        }
        sum = Math.sqrt(sum / (lis.size() - 1));
        return sum;
    };
    /**
     * Interfaz funcional de las operaciones
     */
    interface Operations {
        Double operation(List<Double> lis);
    }
    /**
     * 
     * @param lis Lista de numeros con los cuales se va a realizar la operación
     * @param op operacion la cual se quiere realizar
     * @return Double resultado de la operación
     */
    public Double operate(List<Double> lis, Operations op) {
        return op.operation(lis);
    }
}
