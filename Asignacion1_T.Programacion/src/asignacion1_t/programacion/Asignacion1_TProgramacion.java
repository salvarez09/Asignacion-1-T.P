/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignacion1_t.programacion;

import java.util.Scanner;

/**
 *
 * @author Sidney
 */
public class Asignacion1_TProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
              
    int menu = 0;
    Scanner entrada = new Scanner(System.in);
        
    do {
 
        System.out.println("Digite la opcion del menu que desea ejecutar: \n\n"
            + "......BIENVENIDO AL MENU DE LA MINI CALCULADORA...... \n "
            + "1)Sumar \n "
            + "2)Restar \n"
            + "3)Multiplicar \n "
            + "4)Dividir \n "
            + "5)Verificación de número primo \n " 
            + "6)Verificación de número palíndromo  \n "
            + "7)Salir");
        
        menu = (int) entrada.nextDouble();
               
        if (menu >= 1 && menu<= 6){
             
            switch(menu){
                
                    case 1:                          
                        sumar();                        
                        break;
                       
                    case 2:                        
                        restar();                       
                        break;
                        
                    case 3:                    
                        multiplicar();              
                        break;
                    
                    case 4:                      
                        dividir();                    
                        break;
                    
                    case 5:                      
                        numeroPrimo();                    
                        break;
                    
                    case 6:                                            
                        palindromo();                       
                        break;                       
            }
        }         
    }while(menu !=7);             
}
        
    public static void sumar(){
        
        Scanner entrada = new Scanner(System.in);
        double num1,num2;
        
        System.out.println("************* Suma **************");
        System.out.print("Digite el primer numero de la suma: ");
        num1 = entrada.nextDouble();
        System.out.print("Digite el segundo numero de la suma: ");
        num2 = entrada.nextDouble();
        System.out.println("El resultado de la suma de "+num1 +" y "
                + num2 + " es: " + suma(num1,num2));
        System.out.println("*****************************************");
    }

    public static void restar(){
        Scanner entrada = new Scanner(System.in);
        double num1,num2;
        
        System.out.println("*************** Resta **************");
        System.out.print("Digite el primer numero de la resta: ");
        num1 = entrada.nextDouble();
        System.out.print("Digite el segundo numero de la resta: ");
        num2 = entrada.nextDouble();
        System.out.println("El resultado de restar a "+num1 +"  "
                + num2 + " es: " + resta(num1,num2));
        System.out.println("*****************************************");
    }

    public static void multiplicar(){
        Scanner entrada = new Scanner(System.in);
        double num1,num2;
        
        System.out.println("************* Multiplica **************");
        System.out.print("Digite el primero numero de la multiplicacion: ");
        num1 = entrada.nextDouble();
        System.out.print("Digite el segundo numero de la multiplicacion: ");
        num2 = entrada.nextDouble();
        System.out.println("El resultado de la multiplicar "+num1 +" por "
                + num2 + " es: " + multiplicacion(num1,num2));
        System.out.println("*****************************************");
    }

    public static void dividir(){
        Scanner entrada = new Scanner(System.in);
        double num1,num2;
        
        System.out.println("************* Divide **************");
        System.out.print("Digite el primer numero de la division: ");
        num1 = entrada.nextDouble();
        System.out.print("Digite el segundo numero de la division: ");
        num2 = entrada.nextDouble();
        System.out.println("El resultado de dividir "+num1 +" entre "
                + num2 + " es: " + division(num1,num2));
        System.out.println("*****************************************"); 
    }
    
    public static double suma(double num1,double num2){
        return num1+num2;
    }
    public static double resta(double num1,double num2){
        return num1-num2;
    }
    public static double multiplicacion(double num1,double num2){
        return num1*num2;
    }
    public static double division(double num1,double num2){
        return num1/num2;
    }
    
    public static void numeroPrimo(){

        Scanner entrada = new Scanner(System.in);
        int contador,i,numero;
 
        System.out.print("Ingresa un numero: ");
        numero = entrada.nextInt();
 
        contador = 0;
 
        for(i = 1; i <= numero; i++)
        {
            if((numero % i) == 0)
            {
                contador++;
            }
        }
        
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
    
    public static void palindromo(){
        
        String numeroString;
        String inversoString = "";
        int numero= 0;
        int inverso= 0;
        Scanner entrada = new Scanner(System.in);
        
        do {
        System.out.println(" Digite un numero ");
        numeroString = entrada.nextLine();
        for (int i = numeroString.length() - 1; i >= 0; i--) {
        inversoString += numeroString.charAt(i);
        }
        try {
        numero = Integer.valueOf(numeroString);
        inverso = Integer.valueOf(inversoString);
        } catch (NumberFormatException e) {
        System.out.println("Debe ser un valor numerico");
        inversoString = "";
        }
        } while (numero <= 10);

        if (numero == inverso) {
        System.out.println(" El numero SI es palindromo");
        } else {
        System.out.println(" El numero NO es palindromo");
        }
    
    }
}
