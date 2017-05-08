package ProblemasPropuestos;

public class Ejercicio02 {
    public static void main(String[] args) {
        int suma=0;
        int par=2;
        for (int i = 1; i <= 300; i++) {
            suma+=par;
            par+=2; //Calculo el siguiente numero par
        }
        System.out.println("La suma de los primeros 300 números pares es: "+suma);
    }
    
}
