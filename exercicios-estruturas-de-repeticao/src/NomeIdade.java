import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) throws Exception {
        String nome="nome";
        int idade;
        Scanner scan = new Scanner(System.in);


        while (true){

            System.out.println("Digite um nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Digite uma idade: ");
            idade = scan.nextInt();

        }
    }
}
