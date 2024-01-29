package com.aldea;

import java.util.Scanner;

import com.aldea.DAO.Funciones;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenido a la Aldea Konoha");
        System.out.println("Que desea seleccionar?");
        System.out.println("1. Crear ninja");
        System.out.println("2. Crear mision");
        System.out.println("3. Ver todos los ninjas con sus habilidades");
        System.out.println("4. Mostrar misiones disponibles para un ninja");
        System.out.println("5. Mostrar misiones completadas para un ninja");
        System.out.println("6. Asignar mision a un ninja");
        System.out.println("7. Marcar mision como completada");
        System.out.println("8. Mostrar misiones completadas");
        System.out.println("9. Salir");
        System.out.println("Escriba su opción:");
        int opcion = scan.nextInt();
        System.out.println("**************************************************");

        switch (opcion) {
            case 1: 

                break;
            case 2:
                break;
            case 3: 
                Funciones.todosNinjasHabilidades();
                break;
            case 4:
                System.out.println("Selecciona el id del ninja al que quieres consultar sus misiones disponibles: ");
                long idNinja = scan.nextLong();

                Funciones.misionDisponiblePorId(idNinja);
                break;
            case 5: 
                System.out.println("Selecciona el id del ninja al que quieres consultar sus misiones completadas: ");
                long idNinj = scan.nextLong();

                Funciones.misionCompletadasPorId(idNinj);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8: 
                Funciones.misionesCompletadas();
                break;
            case 9:
                System.out.println("Has salido...");
                break;
            default:
                break;
        }



    }   
}