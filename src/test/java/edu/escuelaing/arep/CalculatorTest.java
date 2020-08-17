package edu.escuelaing.arep;

import edu.escuelaing.arep.App.Calculator;
import edu.escuelaing.arep.model.MyLinkedList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.List;




/**
 * Unit test for simple App.
 */
public class CalculatorTest 
   
{
    
    private final Calculator cal = Calculator.getInstance();
    private List<Double> l1 = new MyLinkedList<>();
    private List<Double> l2 = new MyLinkedList<>();
    

    public CalculatorTest(){
        String[] lis1 = {"160","591","114","229","230","270","128","1657","624","1503"};
        String[] lis2 = {"15.0","69.9","6.5","22.4","28.4","65.9","19.4","198.7","38.8","138.2"};
        for(int i=0;i<lis1.length;i++){
            l1.add(Double.parseDouble(lis1[i]));
        }
        for(int i=0;i<lis2.length;i++){
            l2.add(Double.parseDouble(lis2[i]));
        }
    }

    @Test
    public void meanPrueba1(){
        Double res = cal.operate(l1, cal.mean);
        assertEquals(550.6, res,2);

    }
    @Test
    public void meanPrueba2(){
        Double res = cal.operate(l2, cal.mean);
        assertEquals(60.32, res,2);

    }
    @Test
    public void desviationPrueba1(){
        Double res = cal.operate(l1, cal.standarDes);
        assertEquals(572.03, res,2);

    }
    @Test
    public void desviationPrueba2(){
        Double res = cal.operate(l2, cal.standarDes);
        assertEquals(62.26, res,2);

    }
    
    
    
    
    
}
