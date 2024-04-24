package operacioncadenas;
public class OperacionCadenas {
    public static void main(String[] args) {
        String Nombres = "Pavel Rodrigo";
        String Apellidos = "Yupanqui Choqueneira";
        
        //Concat
        String NombreCompleto = Nombres + " " + Apellidos;
        System.out.println("Nombre Completo: " + NombreCompleto);
        
        //UpperCase
        String NombreCompleto1 = Nombres + " " + Apellidos;
        System.out.println("Nombre Completo: " + NombreCompleto1.toUpperCase());
        
        //LowerCase
        String NombreCompleto2 = Nombres + " " + Apellidos;
        System.out.println("Nombre Completo: " + NombreCompleto2.toLowerCase());
        
        //Length
        String NombreCompleto3 = Nombres + " " + Apellidos;
        System.out.println("Nombre Completo: " + NombreCompleto3.length());
        
        //Split
        String NombreCompleto4 = Nombres + " " + Apellidos;
        String[] NombreCortado = NombreCompleto4.split(" ");
//        for(int i = 0 ; i < NombreCortado.length ; i++){
//            System.out.println(NombreCortado[i]);
//        }
        for(String nombre : NombreCortado){
            System.out.println(nombre);
        }
        
        //Equals
        boolean Comparacion = Nombres.equals(Apellidos);
        System.out.println("Comparacion: " + Comparacion);
        
        //Interpolacion de variables
        String p = "Pavel";
        String y = "Yupanqui";
        int e = 18;
        
        String mensaje = String.format("Mi nombre es %s y mi apellido es %s y tengo %d años", p, y, e);
        System.out.println(mensaje);
    }
}
