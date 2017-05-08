package ProblemasPropuestos;

public class Ejercicio03 {
    public static void main(String[] args) {
        int i=1,suma=0;
        int impar=1;
        while (i <= 300) {
            suma+=impar;// Suma los numeros impares acumulados
            impar+=2; // Calcula el siguiente n{umero impar
            i++;
        }
        System.out.println("La suma de los primeros 300 números impares es: "+suma);
    }
    
}
