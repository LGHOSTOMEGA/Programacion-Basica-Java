package estructuradatos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class EstructuraDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while(!salir){
            System.out.println("Estructura de datos");
            System.out.println("1.- Array");
            System.out.println("2.- ArrayList");
            System.out.println("3.- HasMap");
            System.out.println("4.- Salir");
            
            System.out.print("Ingrese una opcion: ");
            int opcion = scanner.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("Bienvenido a la ED Array");
                    int[] edades = {12,40,30,50,7,5,60,70,100};
                    String[] nombres = {"Daniel", "Marcos", "Diego", "Abigail"};
                    
                    //logitud del array
                    System.out.println("Longitud edades: " + edades.length);
                    System.out.println("Longitud Nombre: " + nombres.length);
                    
                    //cambiar un valor
                    edades[1] = 38;
                    nombres[3] = "Luna";
                    System.out.println("Nuevo dato edad: " + edades[1]);
                    System.out.println("Nuevo dato nombre: " + nombres[3]);
                    
                    //Convertir un array a string
                    System.out.println(Arrays.toString(edades));
                    System.out.println(Arrays.toString(nombres));
                    
                    //clonar
                    int[] edadesClone = edades.clone();
                    System.out.println("Array clonado: " + Arrays.toString(edadesClone));
                    String[] nombresClone = nombres.clone();
                    System.out.println("Array clonado: " + Arrays.toString(nombresClone));
                    break;
                    
                case 2:
                    System.out.println("Bienvenido a ArrayList");
                    ArrayList<String> ListaNombres = new ArrayList<>();
                    
                    //Agregar datos a la lista
                    ListaNombres.add("Abigail");
                    ListaNombres.add("Moon");
                    ListaNombres.add("Pavel");
                    
                    //Longitud de lista
                    System.out.println("Tamano de la lista: " + ListaNombres.size());
                    //remover un elemento de la lista
                    ListaNombres.remove(2);
                    
                    //Obtener un elemento de la lista
                    System.out.println("Elemento obtenido: " + ListaNombres.get(0));
                    
                    //Comprobar si la lista esta vacia
                    System.out.println("Lista vacia: " + ListaNombres.isEmpty());
                    
                    //Comprobar si un elemento existe
                    System.out.println("Existe: " + ListaNombres.contains("Moon"));
                    break;
                    
                default:
                    throw new AssertionError();
            }
        }
    }
}
