package operadorescomparacion1;
public class OperadoresComparacion1 {
    public static void main(String[] args) {
        int Number1 = 15;
        int Number2 = 35;
        
        //mayor que
        boolean Result1 = Number1 > Number2;
        System.out.println("El numero 15 es mayor que 35: " + Result1);
        
        //menor que
        boolean Result2 = Number1 < Number2;
        System.out.println("El numero 15 es menor que 35: " + Result2);
        
        //menor o igual que
        boolean Result3 = Number1 <= Number2;
        System.out.println("El numero 15 es menor o igual que 35: " + Result3);
        
        //mayor o igual que
        boolean Result4 = Number1 >= Number2;
        System.out.println("El numero 15 es mayor o igual que 35: " + Result4);
        
        //igual que
        boolean Result5 = Number1 == Number2;
        System.out.println("El numero 15 es igual que 35: " + Result5);
        
        //diferente que
        boolean Result6 = Number1 != Number2;
        System.out.println("El numero 15 es diferente que 35: " + Result6);
    }
}
