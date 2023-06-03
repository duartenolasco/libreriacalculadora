
package pooherencia;

public class Poocalcu {
       
   public double suma(double no1, double no2){
   return no1+no2;
   }
    
   public double resta(double no1, double no2){
   return no1-no2;
   }
    
   public double multiplicacion(double no1, double no2){
   return no1*no2;
   }
    
   public double division(double no1, double no2){
   return no1/no2;
   }
   public double potencia (double no1, double no2){
   return Math.pow(no1, no2);
   }     
   
 
   public double logaritmo(double no1){
        return Math.log(no1);
   }
   
   public double raizcuadrada(double no1){
       return Math.sqrt(no1);
   }
   
   public double raizcubica(double no1){
       return Math.cbrt(no1);
   }
   
  
           
           
}