package operadoresaritmeticos1;
import java.math.*;

public class OperadoresAritmeticos1 {
    public static void main(String[] args) {
        int variableUno = 50;
        int variableDos = 20;
        
        //Icremento
        //variableUno = variableUno + 1;
        variableUno ++;
        System.out.println("Incremento: " + variableUno);
        
        //Decremento
        //variableDos = variableDos - 1;
        variableDos --;
        System.out.println("Decremento: " + variableDos);
        
        int Sum = variableUno + variableDos;
        int Rest = variableUno - variableDos;
        int Multi = variableUno * variableDos;
        int Divi = variableUno / variableDos;
        int Modul = variableUno % variableDos;
        double Poten = Math.pow(variableUno,variableDos);
        double Rayiz = Math.sqrt(Poten);
        
        System.out.println(Sum);
        System.out.println(Rest);
        System.out.println(Multi);
        System.out.println(Divi);
        System.out.println(Modul);
        System.out.println(Poten);
        System.out.println(Rayiz);
        
        pavel rodrigo yupanqui
    }
}
