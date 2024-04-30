package estructuradatos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class EstructuraDatos {
    public static void main(String[] args) {
        try {
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

                    case 3:
                        System.out.println("Bienvenido a HasMap");

                        Map<String,Integer> edades1 = new HashMap<>();

                        //Insertando Data
                        edades1.put("Pavel", 18);
                        edades1.put("Luna", 15);
                        edades1.put("Abigail", 17);
                        edades1.put("Jeaneth", 35);

                        //eliminar un Dato
                        edades1.remove("Jeaneth");

                        //recuperar un valor
                        System.out.println("Edad Pavel: " + edades1.get("Pavel"));

                        //longitud del mapa
                        edades1.size();

                        //Imprimir las llaves (key)
                        for(String key : edades1.keySet()){
                            System.out.println("Llave: " + key);
                        }

                        //Imprimir valores (value)
                        for(Integer value : edades1.values()){
                            System.out.println("Valores" + value);
                        }

                        //Imprimir todo
                        for(Map.Entry<String,Integer> lv : edades1.entrySet()){
                            System.out.println("Llave: " + lv.getKey() + " Valor: " + lv.getValue());
                        }
                        break;

                    default:
                        System.out.println("Elija una opcion correcta");
                        break;
                }
        }
        } catch (Exception e) {
            System.out.println("Ocurrio un error " + e.getMessage());
        } finally {
        }
    }
}
