package clasesParticulares;

import java.util.Scanner;

public class RedondeoDecimales {
	
	public static double redondearA(double x, int decimales) {
		 double z = 1;
	        for (int i = 0; i < decimales; i++) {
	            z *= 10;
	        }
	        return Math.floor(x * z + 0.5) / z;
    }


	public static void main(String[] args) {
		
		 Scanner leerNumero = new Scanner(System.in);

	        System.out.print("Ingrese un número para redondear: ");
	        double numero = leerNumero.nextDouble();

	        System.out.print("Ingrese la cantidad de decimales: ");
	        int decimales = leerNumero.nextInt();

	        double resultado = redondearA(numero, decimales);

	        System.out.println("Número redondeado: " + resultado);

	}
	System.out.println("modificacion para pruebas");
}
