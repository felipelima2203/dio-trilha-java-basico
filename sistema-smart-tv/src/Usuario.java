public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? "  + smartTv.ligada);
        System.out.println("Canal atual:" + smartTv.canal);
        System.out.println("Volume atual:" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada? "  + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv ligada? "  + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("O volume atual é: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("O volume atual é: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
    }
}
