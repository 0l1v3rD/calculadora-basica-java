package calculadora;
import java.util.Scanner;

public class calculadora{

    public static void main(String[] args) {
        Scanner leer;
        leer = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSelecciona una operacion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Potencia");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");

            int opcion = leer.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingresa el primer numero (Para potencias este es el numero base): ");
                double num1 = leer.nextDouble();
                System.out.print("Ingresa el segundo numero (Para potencias este es a cuanto se eleva el primero): ");
                double num2 = leer.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + sumar(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + restar(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicacion: " + multiplicar(num1, num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado de la division: " + dividir(num1, num2));
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                    case 5:
                        if (num2 != 0) {
                            System.out.println("Resultado del modulo: " + modulo(num1, num2));
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                    case 6:
                        System.out.println("Resultado de la potencia: " + potencia(num1, num2));
                        break;
                }
            } else if (opcion == 7) {
                continuar = false;
                System.out.println("Saliendo de la calculadora...");
            } else {
                System.out.println("Opcion no valida. Intenta nuevamente.");
            }
        }

        leer.close();
    }

    public static double sumar(double a, double b) { return a + b; }
    public static double restar(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) { return a / b; }
    public static double modulo(double a, double b) {return a % b; }
    public static double potencia(double a, double b) {return Math.pow(a, b);}
}