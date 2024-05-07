package jugueteria3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jugueteria3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("+-----------------------------------+");
            System.out.println("Tienda de juguetes los Backyardigans");
            System.out.println("En qué sucursal desea comprar:");
            System.out.println("1. Sucursal Puno");
            System.out.println("2. Sucursal Arequipa");
            System.out.println("3. Sucursal Cusco");
            System.out.println("4. Sucursal Trujillo");
            System.out.println("5. Sucursal Chiclayo");
            System.out.println("6. Sucursal Lima");
            System.out.println("7. Salir");
            System.out.println("+-----------------------------------+");
            System.out.print("Ingrese el número de sucursal: ");
            
            int opcionSucursal = scanner.nextInt();
            if(opcionSucursal == 7) {
                System.out.println("+-----------------------------------+");
                System.out.println("¡Vuelva pronto!");
                System.out.println("+-----------------------------------+");
                break;
            }
            
            switch(opcionSucursal) {
                case 1:
                    comprarJuguete(scanner);
                    break;
                // Casos para las demás sucursales
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        
        scanner.close();
    }
    
    static void comprarJuguete(Scanner scanner) {
        Map<String, Double> juguetes = new HashMap<>();
        juguetes.put("Marvel Legends", 100.00);
        juguetes.put("Bandai", 120.00);
        juguetes.put("Mafex", 300.00);
        
        System.out.println("+-----------------------------------+");
        System.out.println("En Superhéroes tenemos los siguientes juguetes:");
        juguetes.forEach((nombre, precio) -> System.out.println(nombre + " - Precio: " + precio));
        System.out.print("Seleccione el juguete que desea comprar: ");
        String jugueteSeleccionado = scanner.next();
        
        if(juguetes.containsKey(jugueteSeleccionado)) {
            System.out.print("Ingrese la cantidad que desea comprar: ");
            int cantidad = scanner.nextInt();
            double total = juguetes.get(jugueteSeleccionado) * cantidad;
            
            // Selección de método de pago
            System.out.println("+-----------------------------------+");
            System.out.println("Seleccione el método de pago:");
            System.out.println("1. Visa");
            System.out.println("2. MasterCard");
            System.out.println("3. ClubDinners");
            System.out.println("+-----------------------------------+");
            int opcionPago = scanner.nextInt();
            
            // Generar boleta de venta
            System.out.println("+-----------------------------------+");
            System.out.println("Boleta de Venta:");
            System.out.println("Juguete: " + jugueteSeleccionado);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio unitario: $" + juguetes.get(jugueteSeleccionado));
            System.out.println("Total: $" + total);
            System.out.println("Método de pago: " + obtenerMetodoPago(opcionPago));
            System.out.println("+-----------------------------------+");
        } else {
            System.out.println("El juguete seleccionado no está disponible.");
        }
    }
    
    static String obtenerMetodoPago(int opcion) {
        switch(opcion) {
            case 1:
                return "Visa";
            case 2:
                return "MasterCard";
            case 3:
                return "ClubDinners";
            default:
                return "Desconocido";
        }
    }
}
