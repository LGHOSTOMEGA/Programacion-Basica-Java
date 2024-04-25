package ciclowhile;
import java.util.Scanner;
public class CicloWhile {
    public static void main(String[] args) {
        boolean salir = false;
        Scanner scanner = new Scanner (System.in);
        while(!salir){
            System.out.println("+--------------------+");
            System.out.println("Bienvenidos a Killa");
            System.out.println("1.-Saludar");
            System.out.println("2.-Despedir");
            System.out.println("3.-Cobrar");
            System.out.println("4.-Escapar");
            System.out.println("5.-Salir");
            System.out.println("+--------------------+");
        
            int Opcion = scanner.nextInt();
        
            switch (Opcion) {
                case 1:
                    System.out.println("Buenos Dias");
                    break;
                case 2:
                    int[] numeros = {1,2,3,4,5};
                    Object[] numerosLetras= {12, "Luna", 123.21, true, "Pavel"};
                    for(Object nl : numerosLetras){
                        System.out.println(nl);
                    }
                    for (int i = 0; i < numeros.length ; i++){
                        System.out.println(numeros[i]);
                        if (i == 1) {
                            System.out.println("Se ha encontrado el numero 2");
                        }else{
                            System.out.println("Aun no se encuentra el numero 2");
                        }
                    }
                    System.out.println("Vuelva pronto");
                    break;
                case 3:
                    System.out.println("Quiero que me pagues");
                    break;
                case 4:
                    System.out.println("Se escapa, guardias a por el");
                    break;
                case 5:
                    System.out.println("Gracias por usar el servicio");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida ^^");
            }
        }
    }    
}
