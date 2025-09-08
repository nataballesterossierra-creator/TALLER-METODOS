import java.util.Scanner;

public class Main {

    // Métodos estáticos sin retorno
    public static void saludo() {
        System.out.println("Hola, ¿cómo va tu día? Bienvenido.");
    }

    public static void descripcion() {
        System.out.println("En este código verás diferentes métodos que puedes usar.");
    }

    // Métodos con retorno (int)
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    // Métodos con retorno (double)
    public static double calcularPromedio(double a, double b) {
        return (a + b) / 2;
    }

    public static double calcularPerimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    // Métodos con retorno (String)
    public static String nombre() {
        return "Ruth";
    }

    public static String obtenerNombreUsuario(Scanner scanner) {
        System.out.print("Por favor, ingresa tu nombre: ");
        scanner.nextLine(); // limpiar buffer
        return scanner.nextLine();
    }

    // Métodos con retorno (boolean)
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static boolean esPositivo(int numero) {
        return numero > 0;
    }

    // Método con condiciones
    public static String clasificarNota(int nota) {
        if (nota >= 90) return "Excelente";
        else if (nota >= 70) return "Bueno";
        else return "Insuficiente";
    }

    public static void verificarEdad(int edad) {
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }

    // MENU PRINCIPAL
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mostrar métodos estáticos sin retorno
        saludo();
        descripcion();

        // Probar métodos
        System.out.println("--- PRESENTACION DE MÉTODOS ---");
        System.out.println("Suma 5 + 3 = " + sumar(5, 3));
        System.out.println("Resta 10 - 4 = " + restar(10, 4));
        System.out.println("Promedio de 8 y 6 = " + calcularPromedio(8, 6));
        System.out.println("Perímetro de rectángulo (4, 7) = " + calcularPerimetroRectangulo(4, 7));
        System.out.println("Nombre fijo = " + nombre());
        System.out.println("¿7 es primo? " + esPrimo(7));
        System.out.println("¿-2 es positivo? " + esPositivo(-2));
        System.out.println("Clasificación de nota 85 = " + clasificarNota(85));
        verificarEdad(16);

        // Menú interactivo
        int opcion;
        do {
            System.out.println("\n--- MENÚ MATEMÁTICO ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. Promedio");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el 1mer: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Ingresa el 2do: ");
                    double num2 = sc.nextDouble();
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Ingresa el 1mer: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingresa el 2do: ");
                    num2 = sc.nextDouble();
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Ingresa el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    num2 = sc.nextDouble();
                    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                    break;

                case 4:
                    System.out.print("¿Cuántos números quieres promediar?: ");
                    int cantidad = sc.nextInt();
                    double sumaProm = 0;
                    for (int i = 1; i <= cantidad; i++) {
                        System.out.print("Ingresa el número " + i + ": ");
                        double num = sc.nextDouble();
                        sumaProm += num;
                    }
                    double promedio = sumaProm / cantidad;
                    System.out.println("El promedio es: " + promedio);
                    break;

                case 0:
                    System.out.println("GOOD BYE,*_*");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
