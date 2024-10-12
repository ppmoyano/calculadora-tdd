package main.java.com.example;
import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean continuar = true;

        while (continuar) {
            System.out.println("¿Qué función desea realizar?");
            System.out.println("Suma (ingrese +)");
            System.out.println("Resta (ingrese -)");
            System.out.println("Multiplicación (ingrese *)");
            System.out.println("División (ingrese /)");
            System.out.print("Seleccione una opción: ");
            String operacion = scanner.nextLine().trim();

            if (!operacion.matches("[+\\-*/]")) {
                System.out.println("Operación inválida. Por favor, intente de nuevo.\n");
                continue;
            }

            int num1 = 0;
            int num2 = 0;
            boolean numerosValidos = false;

            // Obtener el primer número
            while (!numerosValidos) {
                try {
                    System.out.print("Ingrese el primer número: ");
                    num1 = Integer.parseInt(scanner.nextLine().trim());
                    numerosValidos = true;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                }
            }

            // Obtener el segundo número
            numerosValidos = false;
            while (!numerosValidos) {
                try {
                    System.out.print("Ingrese el segundo número: ");
                    num2 = Integer.parseInt(scanner.nextLine().trim());
                    numerosValidos = true;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                }
            }

            try {
                int resultado = 0;
                String operacionNombre = "";

                switch (operacion) {
                    case "+":
                        resultado = calculator.add(num1, num2);
                        operacionNombre = "suma";
                        break;
                    case "-":
                        resultado = calculator.subtract(num1, num2);
                        operacionNombre = "resta";
                        break;
                    case "*":
                        resultado = calculator.multiply(num1, num2);
                        operacionNombre = "multiplicación";
                        break;
                    case "/":
                        System.out.println("Dividion aun no implementada");
                        return;
                }

                System.out.println("El resultado de la " + operacionNombre + " es " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Preguntar si desea realizar otra operación
            boolean respuestaValida = false;
            while (!respuestaValida) {
                System.out.print("¿Desea realizar otra operación? (S/N): ");
                String respuesta = scanner.nextLine().trim().toUpperCase();

                if (respuesta.equals("S")) {
                    respuestaValida = true;
                    System.out.println();
                } else if (respuesta.equals("N")) {
                    respuestaValida = true;
                    continuar = false;
                    System.out.println("¡Hasta luego!");
                } else {
                    System.out.println("Respuesta inválida. Por favor, ingrese 'S' para sí o 'N' para no.");
                }
            }
        }

        scanner.close();
    }
}
