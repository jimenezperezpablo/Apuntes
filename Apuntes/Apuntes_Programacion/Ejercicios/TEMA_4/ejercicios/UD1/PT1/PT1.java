package ejercicios.UD1.PT1;

import java.util.Scanner;

public class PT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerosEncargo;
        int stockMadera;
        double stockAcero;
        int contador = 1;
        boolean ejecutar = true;

        int maderaPedido;
        double aceroPedido;

        String producto = "";
        int unidades;

        double precioPedido = 0;

        final int FLECHAMADERA = 1;
        final double FLECHACERO = 0.05;
        final int FLECHAMONEDAS = 2;

        final int ESCUDOMADERA = 3;
        final double ESCUDOACERO = 1.5;
        final int ESCUDOMONEDAS = 30;

        final int ESPADAMADERA = 1;
        final double ESPADACERO = 1.2;
        final int ESPADAMONEDAS = 25;

        // Pido el numero de encargos
        System.out.print("Introduce el numero de encargos: ");
        numerosEncargo = scanner.nextInt();
        while (numerosEncargo <= 0) {
            System.out.println("Error Al introducir los numeros de Encargos debe ser un numero mayor que 0");
            System.out.print("Introduce el numero de encargos: ");
            numerosEncargo = scanner.nextInt();
        }
        // Pido el stock de Madera
        System.out.print("Introduce el stock de Madera: ");
        stockMadera = scanner.nextInt();
        while (stockMadera < 0) {
            System.out.println("Error Al introducir el stock de madera debe ser un numero mayor que 0");
            System.out.print("Introduce el stock de Madera: ");
            numerosEncargo = scanner.nextInt();
        }
        // Pido el stock de Acero
        System.out.print("Introduce el stock de Acero: ");
        stockAcero = scanner.nextDouble();
        while (stockAcero < 0) {
            System.out.println("Error Al introducir el stock de Acero debe ser un numero mayor que 0");
            System.out.print("Introduce el stock de Acero: ");
            numerosEncargo = scanner.nextInt();
        }
        scanner.nextLine();
        while (ejecutar) {
            System.out.println("--- Encargo " + contador + " ---");
            // Nombre Articulo
            System.out.print("Articulo: ");
            producto = scanner.next();
            producto.toLowerCase();
            while (!producto.equals("flecha") && !producto.equals("escudo") && !producto.equals("espada")) {
                System.out.print("Articulo: ");
                producto = scanner.next();
                producto.toLowerCase();
            }
            scanner.nextLine();
            // Unidades Articulo
            System.out.print("Unidades: ");
            unidades = scanner.nextInt();
            while (unidades < 0) {
                System.out.print("Unidades: ");
                unidades = scanner.nextInt();
            }
            if (producto.equals("flecha")) {
                precioPedido = FLECHAMONEDAS * unidades;
                maderaPedido = FLECHAMADERA * unidades;
                aceroPedido = FLECHACERO * unidades;
                if (maderaPedido > stockMadera && aceroPedido > stockAcero) {
                    ejecutar = false;
                } else {
                    stockMadera -= maderaPedido;
                    stockAcero -= aceroPedido;
                }
            } else if (producto.equals("escudo")) {
                precioPedido = ESCUDOMONEDAS * unidades;
                maderaPedido = ESCUDOMADERA * unidades;
                aceroPedido = ESCUDOACERO * unidades;
                if (maderaPedido > stockMadera && aceroPedido > stockAcero) {
                    ejecutar = false;
                } else {
                    stockMadera -= maderaPedido;
                    stockAcero -= aceroPedido;
                }
            } else {
                precioPedido = ESPADAMONEDAS * unidades;
                maderaPedido = ESPADAMADERA * unidades;
                aceroPedido = ESPADACERO * unidades;
                if (maderaPedido > stockMadera && aceroPedido > stockAcero) {

                    ejecutar = false;
                } else {
                    stockMadera -= maderaPedido;
                    stockAcero -= aceroPedido;
                }
            }
            if (ejecutar) {
                System.out
                        .println("Articulo: " + producto + " || Unidades :" + unidades + " || Precio: " + precioPedido);
                System.out.println("Madera Gastada: " + maderaPedido);
                System.out.println("Acero Gastado: " + aceroPedido);
                contador++;
            } else {
                System.out.println("No hay suficiente material para el pedido");
            }
            if (numerosEncargo == contador) {
                ejecutar = false;
            }
        }
        System.out.println("=== RESUMEN FINAL === \nNºEncargos: " + (contador - 1) + "\n ");
        scanner.close();
    }
}
