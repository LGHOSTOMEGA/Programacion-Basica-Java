package operadoreslogicos1;
public class OperadoresLogicos1 {
    public static void main(String[] args) {
        boolean esVerdadero = true;
        boolean esFalso = false;
        
        //operador AND (&&)
        boolean resultadoAnd = esVerdadero && esFalso;
        System.out.println("AND: " + resultadoAnd);
        
        //operador (||)
        
        boolean resultadoOr = esVerdadero || esFalso;
        System.out.println("OR: " + resultadoOr);
        
        //Operador NOT (!)
        boolean resultadoNot = !esVerdadero;
        System.out.println("NOT: " + resultadoNot);
    }   
}
