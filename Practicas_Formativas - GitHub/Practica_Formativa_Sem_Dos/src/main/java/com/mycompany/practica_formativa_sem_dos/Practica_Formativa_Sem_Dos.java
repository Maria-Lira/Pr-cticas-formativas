
package com.mycompany.practica_formativa_sem_dos;

import javax.swing.JOptionPane;

public class Practica_Formativa_Sem_Dos {

    public static void main(String[] args) {
         
    /*
    Ejercicio 1 y 2 :Declara tres variables: sujeto, verbo, y complemento. 
    Asigna valores a estas variables para formar una estrofa de un poema. 
    Utiliza concatenación para combinar las variables en una línea completa.
    Añadir opcion para que le usuario ingrese los datos.
    */
        
        /*
        Declarar Variables
        */
        String Sujeto;
        String Verbo;
        String Complemento;
        
        /*
        Pedir Información
        */
        Sujeto = JOptionPane.showInputDialog("Ingrese el sujeto");
        Verbo = JOptionPane.showInputDialog("Ingrese el verbo");
        Complemento = JOptionPane.showInputDialog("Ingrese el complemento");
        
        /*
        Mostrar información
        */
        JOptionPane.showMessageDialog(null, "El poema completo es "+ Sujeto + Verbo + Complemento );
        
        
    /*
    Ejercicio 3:Solicite al usuario su, nombre, profesión y años de experiencia luego muestra 
    el mensaje el siguiente mensaje: "Su nombre es [NOMBRE] y es usted cuenta con una experiencia 
    de [AÑOS] años en la profesión de [PROFESION]."   
    */
    
        /*
        Declaración de Variables
        */
        String Nombre;
        String Años_usu;
        String Profesión;
        int Años;
        
        /*
        Pedir Información
        */
        Nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        Años_usu = JOptionPane.showInputDialog("Ingrese sus años de experiencia");
        Profesión = JOptionPane.showInputDialog("Ingrese su profesión");
        
        /*
        Conversión
        */
        Años = Integer.parseInt(Años_usu);
        
        /*
        Mostrar información
        */
        JOptionPane.showMessageDialog(null, "Su nombre es " + Nombre + " y usted cuenta con una experiencia de " + Años + ", en la profesión de " + Profesión);
    
        
    /*
    Ejercicio 4:Declara una variable para la edad de una persona en la Tierra y calcula cuántos años 
    tendría en Marte, Júpiter y Saturno usando factores de conversión predefinidos.
    Muestra los resultados en consola y con JOptionPane.    
    */
        
        /*
        Declarar Variables
        */
        String Edad;
        int Edad_Tierra;
        float Edad_Marte;
        float Edad_Júpiter;
        float Edad_Saturno;
        
        /*
        Pedir Información
        */
        Edad = JOptionPane.showInputDialog("Cual es tu edad");
        
        /*
        Conversión
        */
        Edad_Tierra = Integer.parseInt(Edad);
        
        /*
        Prosedimientos
        */
        Edad_Marte = (Edad_Tierra * 0.53f);
        Edad_Júpiter = (Edad_Tierra * 0.084f);
        Edad_Saturno = (Edad_Tierra * 0.034f);
        
        /*
        Mostrar información
        */
        JOptionPane.showMessageDialog(null, "En la tierra tienes " + Edad_Tierra + "años, y en marte tienes " + Edad_Marte + " años y en saturno tienes " + Edad_Saturno + "años, y en júpiter " + Edad_Júpiter + " años");
    
    
    /*
    Ejercicio 5: Declara variables para ingredientes de una receta y calcula la cantidad 
    total necesaria para una preparación específica. Utiliza concatenación para mostrar los 
    ingredientes y la cantidad total en consola y con JOptionPane.   
    */
    
        /*
        Declarar Variables
        */
        String Harina_usu;
        String Azucar_usu;
        String Mantequilla_usu;
        String Chocolate_usu;
        int Harina;
        int Azucar;
        int Mantequilla;
        int Chocolate;
        int Total;
        
        /*
        Pedir Información
        */
        Harina_usu = JOptionPane.showInputDialog("Ingrese los gramos de la harina");
        Azucar_usu = JOptionPane.showInputDialog("Ingrese los gramos de la azucar");
        Mantequilla_usu = JOptionPane.showInputDialog("Ingrese los gramos de la mantequilla");
        Chocolate_usu = JOptionPane.showInputDialog("Ingrese los gramos del chocolate");
        
        /*
        Conversión
        */
        Harina = Integer.parseInt(Harina_usu);
        Azucar = Integer.parseInt(Azucar_usu);
        Mantequilla = Integer.parseInt(Mantequilla_usu);
        Chocolate = Integer.parseInt(Chocolate_usu);
        
        /*
        Procedimiento
        */
        Total = (Harina + Azucar + Mantequilla + Chocolate);
        
        /*
        Mostrar información
        */
        JOptionPane.showMessageDialog(null, "Para la receta necesitas de cada ingrediente en gramos: Harina" + Harina + ", Azucar " + Azucar + ", Mantequilla " + Mantequilla + " y de chosolate " + Chocolate );
        
        
    /*
    Ejercicio 6 y 7:Declara variables para registrar una actividad diaria, incluyendo la 
    descripción, tiempo dedicado y un resultado breve. Usa concatenación para generar 
    una entrada completa del diario y muestra con JOptionPane.
    */
    
        /*
        Declarar Variables
        */
        String Actividad;
        String Tiempo_usu;
        String Resultado;
        int Tiempo;
        
        /*
        Pedir Información
        */
        Actividad = JOptionPane.showInputDialog("Ingrese la actividad");
        Tiempo_usu = JOptionPane.showInputDialog("Ingrese el tiempo");
        Resultado = JOptionPane.showInputDialog("Ingrese el resultado");
        
        /*
        Conversión
        */
        Tiempo = Integer.parseInt(Tiempo_usu);
        
        /*
        Mostrar Información
        */
        JOptionPane.showMessageDialog(null, "Actividad " + Actividad + ", Tiempo " + Tiempo + ", Resultado " + Resultado);
        
        
    /*
    Ejercicio 8: Declara variables para diferentes tipos de ahorros y realiza una suma 
    total. Muestra un desglose de los ahorros en consola y un resumen total con JOptionPane.    
    */
        
        /*
        Declarar Variables
        */
        String Efectivo_usu;
        String Banco_usu;
        String Alcancía_usu;
        int Efectivo;
        int Banco;
        int Alcancía;
        int Total_Dine;
        
        /*
        Pedir Información
        */
        Efectivo_usu = JOptionPane.showInputDialog("Ingrese sus ahorros en efectivo");
        Banco_usu = JOptionPane.showInputDialog("Ingrese sus ahorros en el banco");        
        Alcancía_usu = JOptionPane.showInputDialog("Ingrese sus ahorros en la alcancía");        
        
        /*
        Conversión
        */        
        Efectivo = Integer.parseInt(Efectivo_usu);
        Banco = Integer.parseInt(Banco_usu);
        Alcancía = Integer.parseInt(Alcancía_usu);
        
        /*
        Procedimiento
        */
        Total_Dine = (Efectivo + Banco + Alcancía);
        
        /*
        Mostrar Información
        */
        JOptionPane.showMessageDialog(null, "Tus ahorros son: Efectivo " + Efectivo + ", Banco " + Banco + ", Alcancía " + Alcancía + " y en total serian " + Total_Dine);
        
   
    }
}
