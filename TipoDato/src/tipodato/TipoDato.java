package tipodato;
public class TipoDato {
    public static void main(String[] args) {
        String Nombre;
        int Edad;
        boolean Estado;
        double Saldo;
        String nombre;
        Object TodoTipoDato;
        //asignacion
        Nombre = "Pavel Rodrigo Yupanqui Choqueneira";
        Edad = 20;
        Saldo = 1000.34;
        TodoTipoDato = "Cadena";
        TodoTipoDato = 2;
        TodoTipoDato = 23.23;
        //imprimiendo
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Saldo: " + Saldo);
        System.out.println("Dinamico: " + TodoTipoDato);
    }
}
