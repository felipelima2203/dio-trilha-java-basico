import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int numero=0, i=0, fatorial=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja saber o fatorial: ");
        numero = scan.nextInt();
        if (numero==0) System.out.println("Fatorial: " + ++fatorial);
        if (numero>0){
            fatorial=numero;

            for (i=numero-1; i>0; i--){
                fatorial*=i;
            }
            System.out.println("Fatorial: " + fatorial);
        }else if (numero<0){
            System.out.println("Impossível calcular fatorial de número negativo");
        }
        
    }
    
}
