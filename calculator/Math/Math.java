/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator.Math;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author stefa
 */
public class Math {
    
 private Integer numC;  
    
 public void calculate(String value){
   
     String[] numcalcul = value.split("[+-/x]");
     System.out.println(Arrays.toString(numcalcul));
     
     int size = numcalcul.length;
     System.out.println(size);
    
     int[] arrInt = new int[size];    
     for(int i=0; i<size; i++) {
         arrInt[i] = Integer.parseInt(numcalcul[i]);    
      }

    if (value.contains("+"))
    {  
        Integer sum1 = IntStream.of(arrInt).sum();
        numC = sum1;

     }
      if (value.contains("-"))
    {  
        int result = arrInt[0];
        for (int i = 1; i < arrInt.length; i++) {
            result -= arrInt[i];            
        }
        numC = result;

     }
      
       if (value.contains("/"))
    {  
        int result = arrInt[0];
        for (int i = 1; i < arrInt.length; i++) {
            result /= arrInt[i];            
        }
        numC = result;

     }
        if (value.contains("x"))
    {  
        int result = arrInt[0];
        for (int i = 1; i < arrInt.length; i++) {
            result *= arrInt[i];            
        }
        numC = result;

     }

}
  public String getnum(){
  
      return numC.toString();

  };
}