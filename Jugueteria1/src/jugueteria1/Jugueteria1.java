package jugueteria1;
import java.util.*;
public class Jugueteria1 {
    public static void main(String[] args) {
            //instanciamos al scanner para el codigo futuro
            Scanner scanner = new Scanner(System.in);
            boolean salir = false;
            while(!salir){
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
                int opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1:
                        boolean salir_puno = false;
                        while(!salir_puno){
                            System.out.println("+-----------------------------------+");
                            System.out.println("En Puno tenemos las siguientes categoria de juguetes:");
                            System.out.println("1. Juguetes de superhéroes");
                            System.out.println("2. Juguetes de construcción");
                            System.out.println("3. Juguetes para bebés");
                            System.out.println("4. Peluches");
                            System.out.println("5. Volver al menú principal");
                            System.out.println("+-----------------------------------+");

                            System.out.print("Ingrese la categoría que desea explorar: ");
                            int opcion_puno = scanner.nextInt();
                            
                            switch (opcion_puno){
                                case 1:
                                    System.out.println("+-----------------------------------+");
                                    System.out.println("En Superheroes tenemos los siguientes juguetes:");
                                    
                                    Map<String, Double> juguetesSuper = new HashMap<>();
                                    juguetesSuper.put("Marvel Legends", 100.00);
                                    juguetesSuper.put("Bandai", 120.00);
                                    juguetesSuper.put("Mafex", 300.00);
                                    
                                    for(Map.Entry<String, Double> juguete : juguetesSuper.entrySet()){
                                        System.out.println(juguete.getKey() + " - Precio: " + juguete.getValue());
                                    }
                                    
                                    System.out.print("Seleccione el juguete que desea comprar: ");
                                    String jugueteSsuper = scanner.next();
                                    
                                    if(juguetesSuper.containsKey(jugueteSsuper)){
                                        System.out.print("Ingrese la cantidad que desea comprar: ");
                                        int cantidad = scanner.nextInt();
                                        double total = juguetesSuper.get(jugueteSsuper) * cantidad;
                                        
                                        // Selección de método de pago
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("Seleccione el método de pago");
                                        System.out.println("1. Visa");
                                        System.out.println("2. MasterCard");
                                        System.out.println("3. ClubDinners");
                                        System.out.println("+-----------------------------------+");
                                        int opcionPago = scanner.nextInt();
                                        
                                        // Generar boleta de venta
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("\nBoleta de Venta:");
                                        System.out.println("Juguete: " + jugueteSsuper);
                                        System.out.println("Cantidad: " + cantidad);
                                        System.out.println("Precio unitario: $" + juguetesSuper.get(jugueteSsuper));
                                        System.out.println("Total: $" + total);
                                        System.out.println("Metodo de pago: " + obtenerMetodoPago(opcionPago));
                                        System.out.println("+-----------------------------------+");
                                    } else {
                                        System.out.println("El juguete seleccionado no está disponible.");
                                    }
                                    break;
                                case 2:
                                    System.out.println("+-----------------------------------+");
                                    System.out.println("En construccion tenemos los siguientes juguetes:");
                                    
                                    Map<String, Double> juguetesCons = new HashMap<>();
                                    juguetesCons.put("Lego", 132.00);
                                    juguetesCons.put("Mega Blocks", 70.00);
                                    
                                    for(Map.Entry<String, Double> juguete : juguetesCons.entrySet()){
                                        System.out.println(juguete.getKey() + " - Precio: " + juguete.getValue());
                                    }
                                    
                                    System.out.print("Seleccione el juguete que desea comprar: ");
                                    String jugueteScons = scanner.next();
                                    
                                    if(juguetesCons.containsKey(jugueteScons)){
                                        System.out.print("Ingrese la cantidad que desea comprar: ");
                                        int cantidad = scanner.nextInt();
                                        double total = juguetesCons.get(jugueteScons) * cantidad;
                                        
                                        // Selección de método de pago
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("Seleccione el método de pago");
                                        System.out.println("1. Visa");
                                        System.out.println("2. MasterCard");
                                        System.out.println("3. ClubDinners");
                                        System.out.println("+-----------------------------------+");
                                        int opcionPago = scanner.nextInt();
                                        
                                        // Generar boleta de venta
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("\nBoleta de Venta:");
                                        System.out.println("Juguete: " + jugueteScons);
                                        System.out.println("Cantidad: " + cantidad);
                                        System.out.println("Precio unitario: $" + juguetesCons.get(jugueteScons));
                                        System.out.println("Total: $" + total);
                                        System.out.println("Método de pago: " + obtenerMetodoPago(opcionPago));
                                        System.out.println("+-----------------------------------+");
                                    } else {
                                        System.out.println("El juguete seleccionado no está disponible.");
                                    }
                                    break;
                                case 3:
                                    System.out.println("+-----------------------------------+");
                                    System.out.println("En juguetes para bebe tenemos los siguientes juguetes:");
                                    
                                    Map<String, Double> juguetesBebe = new HashMap<>();
                                    juguetesBebe.put("Play-Doh", 32.00);
                                    juguetesBebe.put("Telefono", 50.00);
                                    
                                    for(Map.Entry<String, Double> juguete : juguetesBebe.entrySet()){
                                        System.out.println(juguete.getKey() + " - Precio: " + juguete.getValue());
                                    }
                                    
                                    System.out.print("Seleccione el juguete que desea comprar: ");
                                    String jugueteSbebe = scanner.next();
                                    
                                    if(juguetesBebe.containsKey(jugueteSbebe)){
                                        System.out.print("Ingrese la cantidad que desea comprar: ");
                                        int cantidad = scanner.nextInt();
                                        double total = juguetesBebe.get(jugueteSbebe) * cantidad;
                                        
                                        // Selección de método de pago
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("Seleccione el método de pago");
                                        System.out.println("1. Visa");
                                        System.out.println("2. MasterCard");
                                        System.out.println("3. ClubDinners");
                                        System.out.println("+-----------------------------------+");
                                        int opcionPago = scanner.nextInt();
                                        
                                        // Generar boleta de venta
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("\nBoleta de Venta:");
                                        System.out.println("Juguete: " + jugueteSbebe);
                                        System.out.println("Cantidad: " + cantidad);
                                        System.out.println("Precio unitario: $" + juguetesBebe.get(jugueteSbebe));
                                        System.out.println("Total: $" + total);
                                        System.out.println("Método de pago: " + obtenerMetodoPago(opcionPago));
                                        System.out.println("+-----------------------------------+");
                                    } else {
                                        System.out.println("El juguete seleccionado no está disponible.");
                                    }
                                    break;
                                case 4:
                                    System.out.println("+-----------------------------------+");
                                    System.out.println("En peluches tenemos los siguientes juguetes:");
                                    
                                    Map<String, Double> juguetesPeluches = new HashMap<>();
                                    juguetesPeluches.put("My little ponny", 30.00);
                                    juguetesPeluches.put("Oso", 25.00);
                                    juguetesPeluches.put("Pony", 35.00);
                                    juguetesPeluches.put("Leon", 40.00);
                                    
                                    for(Map.Entry<String, Double> juguete : juguetesPeluches.entrySet()){
                                        System.out.println(juguete.getKey() + " - Precio: " + juguete.getValue());
                                    }
                                    
                                    System.out.print("Seleccione el juguete que desea comprar: ");
                                    String jugueteSpelu = scanner.next();
                                    
                                    if(juguetesPeluches.containsKey(jugueteSpelu)){
                                        System.out.print("Ingrese la cantidad que desea comprar: ");
                                        int cantidad = scanner.nextInt();
                                        double total = juguetesPeluches.get(jugueteSpelu) * cantidad;
                                        
                                        // Selección de método de pago
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("Seleccione el método de pago");
                                        System.out.println("1. Visa");
                                        System.out.println("2. MasterCard");
                                        System.out.println("3. ClubDinners");
                                        System.out.println("+-----------------------------------+");
                                        int opcionPago = scanner.nextInt();
                                        
                                        // Generar boleta de venta
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("Los Backyardigans S.R.L");
                                        System.out.println("Boleta de Venta:");
                                        System.out.println("Juguete: " + jugueteSpelu);
                                        System.out.println("Cantidad: " + cantidad);
                                        System.out.println("Precio unitario: $" + juguetesPeluches.get(jugueteSpelu));
                                        System.out.println("Total: $" + total);
                                        System.out.println("Método de pago: " + obtenerMetodoPago(opcionPago));
                                        System.out.println("+-----------------------------------+");
                                    } else {
                                        System.out.println("El juguete seleccionado no está disponible.");
                                    }
                                    break;
                                case 5:
                                    salir_puno = true;
                                    break;
                                default:
                                    System.out.println("Opción no válida");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        boolean salir_ar = false;
                        while (!salir_ar) {
                            System.out.println("+-----------------------------------+");
                            System.out.println("En Arequipa tenemos las siguientes categoría de juguetes:");
                            System.out.println("1. Juguetes de Hasbro");
                            System.out.println("2. Juguetes Musicales");
                            System.out.println("3. Juguetes de aprendizaje");
                            System.out.println("4. Volver al menú principal");
                            System.out.println("+-----------------------------------+");

                            System.out.print("Ingrese la categoría que desea explorar: ");
                            int opcion_ar = scanner.nextInt();
                            
                            switch (opcion_ar){
                                case 1:
                                    System.out.println("+-----------------------------------+");
                                    System.out.println("En Hasbro tenemos los siguientes juguetes:");
                                    
                                    Map<String, Double> juguetesHasbro = new HashMap<>();
                                    juguetesHasbro.put("Transformers", 85.00);
                                    juguetesHasbro.put("Gi-Joe", 130.00);
                                    juguetesHasbro.put("Monopoly", 105.00);
                                    
                                    for(Map.Entry<String, Double> juguete : juguetesHasbro.entrySet()){
                                        System.out.println(juguete.getKey() + " - Precio: " + juguete.getValue());
                                    }
                                    
                                    System.out.print("Seleccione el juguete que desea comprar: ");
                                    String jugueteShas = scanner.next();
                                    
                                    if(juguetesHasbro.containsKey(jugueteShas)){
                                        System.out.print("Ingrese la cantidad que desea comprar: ");
                                        int cantidad = scanner.nextInt();
                                        double total = juguetesHasbro.get(jugueteShas) * cantidad;
                                        
                                        // Selección de método de pago
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("Seleccione el método de pago");
                                        System.out.println("1. Visa");
                                        System.out.println("2. MasterCard");
                                        System.out.println("3. ClubDinners");
                                        System.out.println("+-----------------------------------+");
                                        int opcionPago = scanner.nextInt();
                                        
                                        // Generar boleta de venta
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("\nBoleta de Venta:");
                                        System.out.println("Juguete: " + jugueteShas);
                                        System.out.println("Cantidad: " + cantidad);
                                        System.out.println("Precio unitario: $" + juguetesHasbro.get(jugueteShas));
                                        System.out.println("Total: $" + total);
                                        System.out.println("Metodo de pago: " + obtenerMetodoPago(opcionPago));
                                        System.out.println("+-----------------------------------+");
                                    } else {
                                        System.out.println("El juguete seleccionado no está disponible.");
                                    }
                                    break;
                                case 2:
                                    System.out.println("+-----------------------------------+");
                                    System.out.println("En juguetes musicales tenemos los siguientes juguetes:");
                                    
                                    Map<String, Double> juguetesCons = new HashMap<>();
                                    juguetesCons.put("Piano", 225.00);
                                    juguetesCons.put("Tambor", 125.00);
                                    juguetesCons.put("Trompeta", 85.00);
                                    juguetesCons.put("Guitarra", 60.00);
                                    juguetesCons.put("Saxofon", 98.00);
                                    
                                    for(Map.Entry<String, Double> juguete : juguetesCons.entrySet()){
                                        System.out.println(juguete.getKey() + " - Precio: " + juguete.getValue());
                                    }
                                    
                                    System.out.print("Seleccione el juguete que desea comprar: ");
                                    String jugueteScons = scanner.next();
                                    
                                    if(juguetesCons.containsKey(jugueteScons)){
                                        System.out.print("Ingrese la cantidad que desea comprar: ");
                                        int cantidad = scanner.nextInt();
                                        double total = juguetesCons.get(jugueteScons) * cantidad;
                                        
                                        // Selección de método de pago
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("Seleccione el método de pago");
                                        System.out.println("1. Visa");
                                        System.out.println("2. MasterCard");
                                        System.out.println("3. ClubDinners");
                                        System.out.println("+-----------------------------------+");
                                        int opcionPago = scanner.nextInt();
                                        
                                        // Generar boleta de venta
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("\nBoleta de Venta:");
                                        System.out.println("Juguete: " + jugueteScons);
                                        System.out.println("Cantidad: " + cantidad);
                                        System.out.println("Precio unitario: $" + juguetesCons.get(jugueteScons));
                                        System.out.println("Total: $" + total);
                                        System.out.println("Método de pago: " + obtenerMetodoPago(opcionPago));
                                        System.out.println("+-----------------------------------+");
                                    } else {
                                        System.out.println("El juguete seleccionado no está disponible.");
                                    }
                                    break;
                                case 3:
                                    System.out.println("+-----------------------------------+");
                                    System.out.println("En juguetes de aprendizaje tenemos los siguientes juguetes:");
                                    
                                    Map<String, Double> juguetesBebe = new HashMap<>();
                                    juguetesBebe.put("Abecedario", 36.00);
                                    juguetesBebe.put("rompecabeza", 20.00);
                                    juguetesBebe.put("Pizarra", 55.00);
                                    
                                    for(Map.Entry<String, Double> juguete : juguetesBebe.entrySet()){
                                        System.out.println(juguete.getKey() + " - Precio: " + juguete.getValue());
                                    }
                                    
                                    System.out.print("Seleccione el juguete que desea comprar: ");
                                    String jugueteSbebe = scanner.next();
                                    
                                    if(juguetesBebe.containsKey(jugueteSbebe)){
                                        System.out.print("Ingrese la cantidad que desea comprar: ");
                                        int cantidad = scanner.nextInt();
                                        double total = juguetesBebe.get(jugueteSbebe) * cantidad;
                                        
                                        // Selección de método de pago
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("Seleccione el método de pago");
                                        System.out.println("1. Visa");
                                        System.out.println("2. MasterCard");
                                        System.out.println("3. ClubDinners");
                                        System.out.println("+-----------------------------------+");
                                        int opcionPago = scanner.nextInt();
                                        
                                        // Generar boleta de venta
                                        System.out.println("+-----------------------------------+");
                                        System.out.println("\nBoleta de Venta:");
                                        System.out.println("Juguete: " + jugueteSbebe);
                                        System.out.println("Cantidad: " + cantidad);
                                        System.out.println("Precio unitario: $" + juguetesBebe.get(jugueteSbebe));
                                        System.out.println("Total: $" + total);
                                        System.out.println("Método de pago: " + obtenerMetodoPago(opcionPago));
                                        System.out.println("+-----------------------------------+");
                                    } else {
                                        System.out.println("El juguete seleccionado no está disponible.");
                                    }
                                    break;
                                case 4:
                                    salir_ar = true;
                                    break;
                                default:
                                    System.out.println("Opción no válida");
                                    break;
                            }
                        }
                        break;   
                    case 3:
                        
                        break;
                    case 4:
                        // Caso para la sucursal de Trujillo
                        break;
                    case 5:
                        // Caso para la sucursal de Chiclayo
                        break;
                    case 6:
                        // Caso para la sucursal de Lima
                        break;
                    case 7:
                        // Caso para salir del programa
                        System.out.println("+-----------------------------------+");
                        System.out.println("¡Vuelva pronto!");
                        System.out.println("+-----------------------------------+");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            }
        
    }
    
    // Método para obtener el nombre del método de pago seleccionado
    static String obtenerMetodoPago(int opcion) {
        switch (opcion) {
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

