/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraclasse;

public class Calculadora {
    
    private float op1, op2;
    private int oper; //atributos
    
    
    
    public Calculadora(){
        op1 = op2 = 0;
        oper = 0;
    }
    
    
    
    Calculadora(float operando1, float operando2, int operador){
        op1 = operando1;
        op2 = operando2;
        oper = operador;
        
    }
    
    
    
    public void setOp1(float operando1){
        op1 = operando1;
    }
    
    public void setOp2(float operando2){
        op2 = operando2;
    }
    
    public void setOper(int operador){
        oper = operador;
    }
    
    
    
 public float calcula(){
     float result = 0;
     
     switch(oper){
         case 1: {
             result = op1 + op2; break;
         }
         case 2: {
             result = op1 - op2; break;
         }
         case 3: {
             result = op1 * op2; break;
         }
         case 4: {
             if(op2 != 0){
               result = op1 / op2;
             }else{
            System.out.println("Erro : não pode dividir por 0");
             } 
            break;
         }
     }
     return result;
    }
}

   


