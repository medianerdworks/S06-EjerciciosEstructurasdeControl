package ProblemasPropuestos;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        int dado;
        int tiro_ok=0;

        Scanner sc= new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            
            System.out.print("Ingrese el valor del dado "+i+": ");
            dado = sc.nextInt();
            if (dado==6) {
                tiro_ok++;
            }
        }
        
        System.out.println("=============RESULTADOS================");
        
        switch(tiro_ok){
            case 3:
                System.out.println("TIRO EXCELENTE");
                break;
            case 2:
                System.out.println("TIRO REGULAR");
                break;
            case 1:
                System.out.println("TIRO MALO");
                break;
            default:
                System.out.println("VUELVA A INTENTAR");
        }
    }
}
