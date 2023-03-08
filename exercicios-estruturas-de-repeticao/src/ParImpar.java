import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int numero=0, contadorPar=0, contadorImpar=0, quantidade=0, i=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números deseja informar? ");
        quantidade = scan.nextInt();

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if (numero%2==0){
                contadorPar++;
            }else {
                contadorImpar++;
            }
            i++;

        } while (i < quantidade);

        System.out.println("Quantidade de número pares: " + contadorPar);
        System.out.println("Quantidade de números ímpares: " + contadorImpar);

    }
    
}
