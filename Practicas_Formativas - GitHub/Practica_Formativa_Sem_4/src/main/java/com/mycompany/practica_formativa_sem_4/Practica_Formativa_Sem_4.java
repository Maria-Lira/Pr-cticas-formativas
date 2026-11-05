
package com.mycompany.practica_formativa_sem_4;

import javax.swing.JOptionPane;

public class Practica_Formativa_Sem_4 {

    public static void main(String[] args) {
        
    /*
    PRACTICA 1: Imprime una línea horizontal de 10 asteriscos:
    */
        int i = 1;
        while(i<=10){
        System.out.print("*");
        i++;
        }
        
    /*
    PRACTICA 2: Imprime una línea vertical de 5 asteriscos: 
    */  
        int k = 1;
        while(k<=5){
        System.out.println("*");
        k++;
        }
        
    /*
    PRACTICA 3: Imprime un cuadrado de 4x4 asteriscos:    
    */ 
        for (int j=1;j<=4;j++){
            for(int m=1;m<=4;m++){
            System.out.print("*");
        }
        System.out.println("");
        }
        
    /*
    PRACTICA 4:Imprime un triángulo rectángulo de 5 filas:   
    */   
        for (int j=1;j<=5;j++){
            for(int m=1;m<=j;m++){
            System.out.print("*");
        }
        System.out.println("");
        }
        
    /*
    PRACTICA 5:Imprime un triángulo rectángulo invertido de 5 filas:   
    */        
        for (int j=1;j<=5;j++){
            for(int m=5;m>=j;--m){
            System.out.print("*");
        }
        System.out.println("");
        } 
        
    /*
    PRACTICA 6:Imprime un triángulo isósceles de 5 filas:     
    */  
        int n=5;
        /*
        imprimir filas
        */
        for (int s = 1; s <= n; s++){
            /*
            imprimir espacios
            */
            for(int b = 1;b <= n - s; b++){
                System.out.print(" ");         
            }
            /*
            Imprimir asteriscos
            */
            for (int f = 1; f<=(2* s - 1); f++){
                System.out.print("*");
            }
            System.out.println(); 
       }
        
    /*
    PRACTICA 7:Imprime un rombo de 9 filas:   
    */ 
        /*
        Primer bloque de ciclo
        */
        int u=5;
        /*
        imprimir filas
        */
        for (int s = 1; s <= u; s++){
            /*
            imprimir espacios
            */
            for(int b = 1;b <= u - s; b++){
                System.out.print(" ");         
            }
            /*
            Imprimir asteriscos
            */
            for (int f = 1; f<=(2* s - 1); f++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        /*
        Segundo bloque de ciclo
        */
        /*
        imprimir filas
        */
        for (int s = u-1; s >= 1; s--){
            /*
            imprimir espacios
            */
            for(int b = 1;b <= u - s; b++){
                System.out.print(" ");         
            }
            /*
            Imprimir asteriscos
            */
            for (int f = 1; f<=(2* s - 1); f++){
                System.out.print("*");
            }
            System.out.println(); 
        }
                  
    /*
    PRACTICA 8:Escribe un programa que cuente el número de vocales y consonantes de un texto ingresado por el usuario.   
    */
        // Declarar variable
        String Texto;
        int vocales = 0;
        int consonantes = 0;

        // Pedir texto
        Texto = JOptionPane.showInputDialog("Ingrese el texto, para contar las vocales y consonantes");
        Texto = Texto.toLowerCase();

        // Procedimiento
        for (int h = 0; h < Texto.length(); h++) {
            char c = Texto.charAt(h);
    
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        vocales++;
        } 
        else if (c >= 'a' && c <= 'z') {
        consonantes++;
        }
    }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, 
        "Texto: " + Texto + "\n" +
        "Vocales: " + vocales + "\n" +
        "Consonantes: " + consonantes);
     
        
    /*
    PRACTICA 9:Escribe un programa que imprima los caracteres de una cadena en las posiciones impares.   
    */  
        //Declarar Variable
        String Texto_cadena;
        String Resultado_u;
        Resultado_u = "";
        
        //Pedir informacion
        Texto_cadena = JOptionPane.showInputDialog("Ingrese el texto, para ver las cadenas en posiciones impares");
        
         //Procedimiento
         for (int d  = 1; d < Texto_cadena.length();d+=2){
            Resultado_u += Texto_cadena.charAt(d) + " ";
        }
         JOptionPane.showMessageDialog(null, "Caracteres en posiciones impares:\n" + Resultado_u);
         
        
    /*
    PRACTICA 10:Escribe un programa que cuente el número de palabras en una cadena 
    ingresada por el usuario. Las palabras están separadas por espacios.  
    */         
        //Declarar Variables
        String Frase_u;
        int cantidad_palabras = 0;
        
        //pedir frase
        Frase_u = JOptionPane.showInputDialog("Ingrese el texto, para ver la cantidad de palabras");
        
        String[]Palabras = Frase_u.trim().split("\\s+");
        cantidad_palabras = Palabras.length;
        
        JOptionPane.showMessageDialog(null, "el numero de palabras es: " + cantidad_palabras);
        

    /*
    PRACTICA 11:Escribe un programa que convierta una cadena a mayúsculas si el número de 
    vocales es mayor que el de consonantes. Si no, conviértela a minúsculas.   
    */     
        // Declarar variables
        String texto;
        int vocales_pala = 0;
        int consonantes_pala = 0;
        String resultado_pala = "";

        // Pedir texto
        texto = JOptionPane.showInputDialog("Ingrese el texto,para comvertir a mayusculas o minusculas:");

        
        // Convertimos a minúsculas
        String texto_Minu = texto.toLowerCase();
    
        // Contar vocales y consonantes
        for (int q = 0; q < texto_Minu.length(); q++) {
            char c = texto_Minu.charAt(q);
        
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vocales_pala++;
        } else if (c >= 'a' && c <= 'z') {
            consonantes_pala++;
        }
        
    
        // Evaluacion
        if (vocales_pala > consonantes_pala) {
            resultado_pala = texto.toUpperCase();
        } else {
            resultado_pala = texto.toLowerCase();
        }
    
        // Mostrar el resultado final
        JOptionPane.showMessageDialog(null, 
        "Vocales: " + vocales_pala + "\n" +
        "Consonantes: " + consonantes_pala + "\n" +
        "Resultado: " + resultado_pala);
}
   
    
    /*
    PRACTICA 12: Escriba un programa que solicite al usuario un número entero entre 1 y 20. 
    Luego, el programa debe mostrar los primeros 10 múltiplos de ese número.
    Pero si el múltiplo es también un número primo, debe indicar esto con un mensaje adicional: " <- es primo"
    */     
     
        // Pedir el número entero entre 1 y 20
        
        String numero = JOptionPane.showInputDialog("Ingrese un número entero entre el 1 y el 20:");


        if (numero != null) {
        int numero_u = Integer.parseInt(numero);
        
        String resultados = "Primeros 10 múltiplos de " + numero + ":\n";
    
        // Bucle 
    
        for (int o = 1; o <= 10; o++) {
            int multiplo = numero_u * o;
        
        // Verificar si el múltiplo es un número primo
        
        int divisores = 0;
        for (int w = 1; w <= multiplo; w++) {
            if (multiplo % w == 0) {
                divisores++;
            }
        }
        
        // Si es primo
        resultados += multiplo;
        if (divisores == 2) {
            resultados += " (Es primo)";
        }
        resultados += "\n";
    }
    
        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, resultados);
}
    
    
    /*
    PRACTICA 13:Una nave viaja por el espacio y avanza una distancia aleatoria entre 100 y 500 
    kilómetros por cada salto. El combustible inicial permite 10 saltos.
    Por cada salto, el programa debe mostrar la distancia acumulada. Si en algún salto el total 
    acumulado supera los 3000 km, debe mostrar: "¡Alerta! Distancia máxima superada" y detener el recorrido.
    */ 
    
        // Declarar variables
        int distancia_Acumulada = 0;
        String reporte = "Bitácora de viaje de la nave:\n";
        boolean alertaSuperada = false;

        // Bucle para los 10 saltos permitidos por el combustible
        for (int t = 1; t <= 10; t++) {
    
        // Generar distancia aleatoria entre 100 y 500 km
        int Salto = (int) (Math.random() * 401) + 100;
    
        // Acumular la distancia
        distancia_Acumulada += Salto;
    
        reporte += "Salto " + i + ": Avanzó " + Salto + " km (Total: " + distancia_Acumulada + " km)\n";
    
        // Verificar si el acumulado supera los 3000 km
        if (distancia_Acumulada > 3000) {
            reporte += "\n¡Alerta! Distancia máxima superada";
            alertaSuperada = true;
            break;
            }
        }

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, reporte);
    
 
    }
}
