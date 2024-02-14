/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.Math;

import java.util.Arrays;

/**
 * @author stefa
 */
public class Math {
    
 private double numC;  
    
 public void calculate(String value){
   
     String[] numcalcul = value.split("[/x+-]");
     System.out.println(Arrays.toString(numcalcul));
     int size = numcalcul.length;
     
     double[] arrInt = new double[size];    
     
     for(int i=0; i<size; i++) {
         arrInt[i] = Double.parseDouble(numcalcul[i]);    
     }

     if (value.contains("+")) {
         double result = arrInt[0];
         for (int i = 1; i < arrInt.length; i++) {
             result += arrInt[i];
         }
         numC = result;

     }
     if (value.contains("-")) {
         double result = arrInt[0];
         for (int i = 1; i < arrInt.length; i++) {
             result -= arrInt[i];
         }
         numC = result;

     }
      
       if (value.contains("/"))
    {  
        double result = arrInt[0];
        for (int i = 1; i < arrInt.length; i++) {
            result /= arrInt[i];            
        }
        numC = result;

     }
        if (value.contains("x"))
    {  
        double result = arrInt[0];
        for (int i = 1; i < arrInt.length; i++) {
            result *= arrInt[i];            
        }
        numC = result;

     }

}
  public String getnum(){
  
      return String.valueOf(numC);

  };
}