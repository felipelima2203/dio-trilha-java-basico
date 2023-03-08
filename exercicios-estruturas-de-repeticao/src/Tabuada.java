import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        int numero = 0, i=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja ver a tabuada (entre 1 e 10): ");
        numero = scan.nextInt();

        if (numero>0 && numero<=10){
            for (i=1; i<11; i++){
                System.out.println(numero + " X " + i + " = " + (numero*i));
            }
        }else System.out.println("Número fora do intervalo solicitado");
        
    }
    
}
