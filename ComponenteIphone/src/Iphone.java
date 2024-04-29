import componentes.AparelhoTelefonico;
import componentes.NavegadorInternet;
import componentes.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {

        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet browser = new NavegadorInternet();
        ReprodutorMusical ipod = new ReprodutorMusical();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        System.out.println("-------------------------------------------------");


    }
}