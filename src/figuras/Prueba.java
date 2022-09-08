package figuras;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Figura[] figs=new Figura[3];
        int opcion;
        do {
            menu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    int opcionF;
                    double lado;
                    System.out.print("Ingresa el lado: ");
                    lado = entrada.nextDouble();
                    figs[0]=new Cuadrado(lado);
                    System.out.println("selecciona uno: ");
                    System.out.println("1 Area");
                    System.out.println("2 Perimetro:");
                    opcionF = entrada.nextInt();
                    if(opcionF==1){
                        System.out.println(figs[0].calcularArea());
                    }
                    if (opcionF==2){
                        System.out.println(figs[0].calcularPerimetro());
                    }
                    break;
                case 2:
                    System.out.println("ingresa los lados");
                    double lado1, lado2, lado3;
                    System.out.print("lado 1: ");
                    lado1 = entrada.nextDouble();
                    System.out.print("lado 2: ");
                    lado2 = entrada.nextDouble();
                    System.out.print("lado 3: ");
                    lado3 = entrada.nextDouble();
                    figs[1]=new Triangulo(lado1, lado2, lado3);
                    System.out.println("selecciona uno: ");
                    System.out.println("1 Area");
                    System.out.println("2 Perimetro:");
                    opcionF = entrada.nextInt();
                    if(opcionF==1){
                        System.out.println(figs[1].calcularArea());
                    }
                    if(opcionF==2){
                        System.out.println(figs[1].calcularPerimetro());
                    }
                    break;
                case 3:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("No valido");
                    break;
            }
        } while (opcion != 3);
    }
    private static void menu() {
        System.out.println();
        System.out.println("elige una figura");
        System.out.println("1 Cuadrado");
        System.out.println("2 Triangulo");
        System.out.println("3 Salir");
        System.out.print("Escoje una opción: ");
    }
}