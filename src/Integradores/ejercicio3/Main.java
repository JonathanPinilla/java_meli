package Integradores.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Cliente cliente1 = new Cliente("123456789", "Daniela", "Restrepo");
        Cliente cliente2 = new Cliente("987654321", "Jonathan", "Pinilla");
        Cliente cliente3 = new Cliente("435656437", "Diana", "Bautista");
        Cliente cliente4 = new Cliente("435656437", "Manuel", "Valencia");

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        String opcion = "";

        while (opcion != "salir"){
            System.out.println("""
                    --- MENU ---
                    
                    1. Mostrar los clientes. 
                    2. Eliminar el ultimo cliente.
                    3. Buscar por DNI.
                    
                    escribe salir para terminar
                    """);
            opcion = input.next().toLowerCase();

            switch (opcion){
                case "1" -> System.out.println(clientes);
                case "2" -> clientes.remove(cliente3);
                case "3" -> {
                    System.out.println("Escriba el dni a buscar: ");
                    String dni = input.next().toLowerCase();
                    System.out.println(clientes
                            .stream()
                            .filter((cliente) -> cliente.getDni().equals(dni))
                            .findFirst());
                }
                case "salir" -> System.exit(0);
                default -> System.out.println("Opción invalida");
            }
        }

    }

}
