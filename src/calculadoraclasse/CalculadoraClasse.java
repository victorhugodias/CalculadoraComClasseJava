/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraclasse;

import java.util.Scanner;

/**
 *
 * @author DesenvolvedorJava
 */
public class CalculadoraClasse {

    public static void main(String[] args) {
        
        Calculadora calc1 = new Calculadora(5, 3, 1);
        Calculadora calc2 = new Calculadora();
        
        
                        int opcao = menu ();
                        while(opcao != 5){
                            float op1 = entraOperando();
                            float op2 = entraOperando();
                            calc2.setOp1(op1);
                            calc2.setOp2(op2);
                            calc2.setOper(opcao);
                            System.out.println(calc2.calcula());
                            opcao = menu ();
                                    
                        }
                        if(opcao == 5){
                            System.out.println("Fim da calculadora!");
                        }
        
        
        
    }
    
    
    
                    public static float entraOperando(){
                        Scanner entrada = new Scanner(System.in);
                        float op;
                        
                        System.out.print("Entre com o operando: ");
                        op = entrada.nextFloat();
                        return op;
                    }

                    public static int menu (){

                        int opcao = 0;
                         Scanner entrada = new Scanner (System.in);

                         do{
                            System.out.println("Entre com a operação desejada");
                            System.out.println("1 - Soma");
                            System.out.println("2 - Subtração");
                            System.out.println("3 - Multiplicação");
                            System.out.println("4 - Divisão");
                            System.out.println("5 - Sair");
                            System.out.print("Escolha sua opção: ");
                            opcao = entrada.nextInt();
                            if((opcao < 1) || (opcao > 5)){
                                System.out.println("Digite uma opção válida : entre 1 e 5 !");
                            }
                         }while((opcao < 1) || (opcao > 5));

                        return opcao;
                    }
                    
    
}
