package jugueteriamenu1;
import java.util.Scanner;

class Juguete {
    String nombre;
    String categoria;
    double precio;

    // Constructor de la clase Juguete
    public Juguete(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }
}

class Empleado {
    String nombre;
    String genero;
    String usuario;
    String turno;

    // Constructor de la clase Empleado
    public Empleado(String nombre, String genero, String usuario, String turno) {
        this.nombre = nombre;
        this.genero = genero;
        this.usuario = usuario;
        this.turno = turno;
    }
}

class Compra {
    Empleado empleado;
    String almacen;
    Juguete juguete;
    int cantidad;
    double precioTotal;

    // Constructor de la clase Compra
    public Compra(Empleado empleado, String almacen, Juguete juguete, int cantidad) {
        this.empleado = empleado;
        this.almacen = almacen;
        this.juguete = juguete;
        this.cantidad = cantidad;
        this.precioTotal = juguete.precio * cantidad;
    }
}

public class JugueteriaMenu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Bienvenida al sistema
        System.out.println("+-------------------------------------+");
        System.out.println("|     LOS BACKSYARDIGANS STORE        |");
        System.out.println("|   INGRESE SUS DATOS DE EMPLEADO     |");
        System.out.println("+-------------------------------------+");

        // Solicitar nombre, género, usuario y turno del empleado
        System.out.print("Nombre del empleado: ");
        String nombreEmpleado = scanner.nextLine();
        System.out.print("Género del empleado: ");
        String generoEmpleado = scanner.nextLine();
        System.out.print("Usuario del empleado: ");
        String usuarioEmpleado = scanner.nextLine();
        System.out.print("Turno del empleado: ");
        String turnoEmpleado = scanner.nextLine();

        // Crear instancia de Empleado
        Empleado empleado = new Empleado(nombreEmpleado, generoEmpleado, usuarioEmpleado, turnoEmpleado);

        // Validar el usuario del empleado
        System.out.print("Ingrese su usuario: ");
        try {
            String usuarioIngresado = scanner.nextLine();
            if (!usuarioIngresado.equals(empleado.usuario)) {
                throw new IllegalArgumentException("Usuario incorrecto");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage() + ". Saliendo del programa.");
            return;
        }

        // Menú de selección de almacén
        System.out.println("+-------------------------------+");
        System.out.println("Seleccione el almacén:");
        System.out.println("1. Puno");
        System.out.println("2. Arequipa");
        System.out.println("3. Cusco");
        System.out.println("4. Trujillo");
        System.out.println("5. Chiclayo");
        System.out.println("6. Lima Norte");
        System.out.print("Elija un almacén: ");
        int opcionAlmacen = 0;
        try {
            opcionAlmacen = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Entrada invalida para el almacen. Saliendo del programa.");
            return;
        }
        
        System.out.println("+-------------------------------+");
        System.out.println("|  Que producto va a vender?    |");
        System.out.println("+-------------------------------+");

        // Nombres de los almacenes
        String[] nombresAlmacenes = {"Puno", "Arequipa", "Cusco", "Trujillo", "Chiclayo", "Lima Norte"};

        // Definir juguetes para cada almacén
        Juguete[][] juguetesPorAlmacen = {
            // Puno
            {
                new Juguete("Muñeca", "Juguetes para niñas", 25.50),
                new Juguete("Carro de juguete", "Juguetes para niños", 18.75),
                new Juguete("Pelota", "Juguetes deportivos", 10.25),
                new Juguete("Lego set mediano", "Juguete de construccion", 79.90),
                new Juguete("Marvel Legends", "Juguetes de superheroes", 119.90),
                new Juguete("Uno", "Juegos de mesa", 10.25)
            },
            // Arequipa
            {
                new Juguete("Avión de juguete", "Juguetes para niños", 30.0),
                new Juguete("Rompecabezas", "Juegos educativos", 15.0),
                new Juguete("Peluche", "Juguetes para niñas", 20.0),
                new Juguete("Mega Blocks", "Juguete de construccion", 49.90),
                new Juguete("Mc Farleen Toys", "Juguetes de superheroes", 109.90),
                new Juguete("Jenga", "Juegos de mesa", 99.90)
            },
            // Cusco
            {
                new Juguete("Tren de juguete", "Juguetes para niños", 35.0),
                new Juguete("Set de construcción", "Juegos educativos", 25.0),
                new Juguete("Barbie", "Juguetes para niñas", 28.0),
                new Juguete("Lego set grande", "Juguete de construccion", 249.90),
                new Juguete("Bandai", "Juguetes de superheroes", 249.90),
                new Juguete("Risk", "Juegos de mesa", 79.90)
            },
            // Trujillo
            {
                new Juguete("Carrito de control remoto", "Juguetes para niños", 40.0),
                new Juguete("Laberinto", "Juegos educativos", 20.0),
                new Juguete("Superhéroe de acción", "Juguetes para niños", 15.0),
                new Juguete("Lego set pequeño", "Juguete de construccion", 39.90),
                new Juguete("BanPresto", "Juguetes de superheroes", 169.90),
                new Juguete("Monopoly", "Juegos de mesa", 109.90)
            },
            // Chiclayo
            {
                new Juguete("Cocina de juguete", "Juguetes para niñas", 50.0),
                new Juguete("Ajedrez", "Juegos educativos", 18.0),
                new Juguete("Pistola de agua", "Juguetes para niños", 12.0),
                new Juguete("Lego Batman", "Juguete de construccion", 119.90),
                new Juguete("Hasbro Transformers", "Juguetes de superheroes", 199.90),
                new Juguete("Clue", "Juegos de mesa", 99.90)
            },
            // Lima Norte
            {
                new Juguete("Tableta educativa", "Juegos educativos", 60.0),
                new Juguete("Puzzle 3D", "Juegos educativos", 22.0),
                new Juguete("Peluche de dinosaurio", "Juguetes para niños", 25.0),
                new Juguete("Lego Spiderman", "Juguete de construccion", 299.90),
                new Juguete("Sh Figuarts", "Juguetes de superheroes", 349.90),
                new Juguete("Adivina quien", "Juegos de mesa", 119.90)
            }
        };

        // Imprimir menú de juguetes según el almacén seleccionado
        System.out.println("Juguetes disponibles en " + nombresAlmacenes[opcionAlmacen - 1] + ":");
        Juguete[] juguetes = juguetesPorAlmacen[opcionAlmacen - 1];
        for (int i = 0; i < juguetes.length; i++) {
            System.out.println((i + 1) + ". " + juguetes[i].nombre + " - " + juguetes[i].categoria + " - S/ " + juguetes[i].precio);
        }

        // Solicitar selección de juguete y cantidad
        System.out.print("Seleccione un juguete: ");
        int opcionJuguete = 0;
        try {
            opcionJuguete = scanner.nextInt() - 1;
        } catch (Exception e) {
            System.out.println("Error: Entrada invalida para la selección de juguete. Saliendo del programa.");
            return;
        }
        System.out.print("Cantidad: ");
        int cantidad = 0;
        try {
            cantidad = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Entrada invalida para la cantidad. Saliendo del programa.");
            return;
        }

        // Crear instancia de Compra
        Compra compra = new Compra(empleado, nombresAlmacenes[opcionAlmacen - 1], juguetes[opcionJuguete], cantidad);

        // Imprimir boleta o factura de venta
        System.out.println("¿Qué desea imprimir?");
        System.out.println("1. Boleta de Venta");
        System.out.println("2. Factura");
        System.out.print("Opción: ");
        int opcionImpresion = 0;
        try {
            opcionImpresion = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida para la selección de impresión. Imprimiendo boleta por defecto.");
            imprimirBoleta(compra);
            return;
        }

        switch (opcionImpresion) {
            case 1:
                imprimirBoleta(compra);
                break;
            case 2:
                imprimirFactura(compra);
                break;
            default:
                System.out.println("Opcion invalida. Imprimiendo boleta por defecto.");
                imprimirBoleta(compra);
        }

        // Solicitar tipo de pago
        System.out.println("\nSeleccione el tipo de pago:");
        System.out.println("1. Visa");
        System.out.println("2. MasterCard");
        System.out.println("3. Clubdinners");
        System.out.print("Opción: ");
        int opcionPago = 0;
        try {
            opcionPago = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Error: Entrada invalida para la selección de pago. Saliendo del programa.");
            return;
        }

        // Seleccionar método de pago
        String metodoPago = "";
        switch (opcionPago) {
            case 1:
                metodoPago = "Visa";
                break;
            case 2:
                metodoPago = "MasterCard";
                break;
            case 3:
                metodoPago = "Clubdinners";
                break;
            default:
                System.out.println("Opción inválida");
        }

        // Imprimir método de pago
        System.out.println("Pago realizado con: " + metodoPago);

        scanner.close();
    }

    // Método para imprimir la boleta de venta
    public static void imprimirBoleta(Compra compra) {
        System.out.println("----- Boleta de Venta -----");
        System.out.println("Empleado: " + compra.empleado.nombre);
        System.out.println("Turno: " + compra.empleado.turno);
        System.out.println("Almacen: " + compra.almacen);
        System.out.println("Producto: " + compra.juguete.nombre);
        System.out.println("Precio Unitario: S/ " + compra.juguete.precio);
        System.out.println("Cantidad: " + compra.cantidad);
        System.out.println("Total: S/ " + compra.precioTotal);
        System.out.println("+--------------------------+");
    }

    // Método para imprimir la factura
    public static void imprimirFactura(Compra compra) {
        System.out.println("----- Factura -----");
        System.out.println("Empleado: " + compra.empleado.nombre);
        System.out.println("Turno: " + compra.empleado.turno);
        System.out.println("Almacén: " + compra.almacen);
        System.out.println("Producto: " + compra.juguete.nombre);
        System.out.println("Precio Unitario: S/ " + compra.juguete.precio);
        System.out.println("Cantidad: " + compra.cantidad);
        System.out.println("Total: S/ " + compra.precioTotal);
        System.out.println("+--------------------------+");
    }
}

