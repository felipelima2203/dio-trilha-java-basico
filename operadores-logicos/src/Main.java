import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1 +i2) < (f2 -f1)) && true " + (((i1 +i2) < (f2 - f1)) && true));
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio " + recebeAuxilio);

        int mes=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número correspondente a um mês do ano: ");
        mes = scanner.nextInt();

        if (mes == 1){
            System.out.println("Janeiro - Férias");
        }else if (mes==2) {
            System.out.println("Fevereiro");

        }else if (mes==3) {
            System.out.println("Março");

        }else if (mes==4) {
            System.out.println("Abril");

        }else if (mes==5) {
            System.out.println("Maio");

        }else if (mes==6) {
            System.out.println("Junho");

        }else if (mes==7) {
            System.out.println("Julho - Férias");

        }else if (mes==8) {
            System.out.println("Agosto");

        }else if (mes==9) {
            System.out.println("Setembro");

        }else if (mes==10) {
            System.out.println("Outubro");

        }else if (mes==11) {
            System.out.println("Novembro");

        }else if (mes==12) {
            System.out.println("Dezembro - Férias");

        }else {
            System.out.println("O número é inválido");
        }

        String dia;
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        dia  = scanner2.next();

        switch (dia.toUpperCase()){
            case "DOMINGO":
            System.out.println("1");
            break;

            case "SEGUNDA":
            System.out.println("2");
            break;

            case "TERÇA":
            System.out.println("3");
            break;

            case "QUARTA":
            System.out.println("4");
            break;

            case "QUINTA":
            System.out.println("5");
            break;

            case "SEXTA":
            System.out.println("6");
            break;

            case "SÁBADO":
            System.out.println("7");
            break;

            case "SABADO":
            System.out.println("7");
            break;

            default:
            System.out.println("Dia inválido");
            break;
        }

        int numero=0;

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        numero = scanner3.nextInt();

        switch (numero){
            case 1:
            case 2:
            case 3:
            System.out.println("Certo");
            break;

            case 4:
            System.out.println("Errado");
            break;

            case 5:
            System.out.println("Talvez");
            break;

            default:
            System.out.println("Valor indefinido");
            break;
        }


    }
}
