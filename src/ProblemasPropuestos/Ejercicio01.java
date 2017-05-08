package ProblemasPropuestos;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        String nombre;
        double nota,suma_nota=0,promedio=0;

        Scanner sc= new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            
            System.out.print("Ingrese el nombre del alumno "+i+": ");
            nombre = sc.next();
            suma_nota=0; // Se debe inicializar la suma y promedio de notas por cada alumno
            promedio=0;
            
            for (int j = 1; j <= 3; j++) {
                System.out.print("Ingrese la nota "+j+": ");
                nota=sc.nextDouble();
                suma_nota+=nota;
            }
            promedio=suma_nota/3;
            System.out.println("El promedio del alumno "+i+" es: "+promedio);
            if (promedio>=11) {
                System.out.println("El alumno DESAPROBÓ el curso.");
            }
            else{
                System.out.println("El alumno APROBÓ el curso.");
            }
            System.out.println("==================================================");
        }
    }
}
