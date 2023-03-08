import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        float numero, media=0, maior=0;
        int i=0;
        Scanner scan = new Scanner(System.in);



        do {
            System.out.println("Digite um número");
            numero = scan.nextFloat();
            if (i==0){
                maior = numero;
            }
            if (numero > maior){
                maior = numero;
            }
            media +=numero;
            i++;
        } while (i<5);

        media/=5;
        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + media);
    }
    
}
