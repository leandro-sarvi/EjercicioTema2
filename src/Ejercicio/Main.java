package Ejercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar precio");
        int precio = Integer.parseInt(teclado.nextLine());
        System.out.println("El precio con IVA incluido es: "+calcularIva(precio));
    }
    static int calcularIva(int precio){
        return precio+((precio*21)/100);
    }
}
