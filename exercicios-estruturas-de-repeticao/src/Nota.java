import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        float nota=0;
        Scanner scan = new Scanner(System.in);


        while (nota>-1 && nota < 11){

            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextFloat();
        }
        System.out.println("Valor inválido");
    }
    
}
