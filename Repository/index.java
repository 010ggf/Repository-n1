package Repository;
import java.util.Scanner;

public class index {
    public static void main(String[] args){
        Scanner leer =new Scanner(System.in);
        int n1=0, n2=0, resultado=0;
        String nombre;
        System.out.println("¿cual es tu nombre? ");
        nombre=leer.nextLine();
        System.out.print("dame el primer valor de la suma ");
        n1=leer.nextInt();
        System.out.print("dame el segundo valor de la suma ");
        n2=leer.nextInt();
        resultado=n1+n2;
        System.out.println("hola,"+nombre+" el resultado de tu suma es "+resultado);
        System.out.println("this is a commit");
        System.out.println("bye");
    }
    

    
}
