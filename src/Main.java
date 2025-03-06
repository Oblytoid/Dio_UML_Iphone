public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.reproduzirMusica("Teste");
        iphone.selecionarMusica("teste2");
        iphone.pararMusica();

        iphone.Atender();
        iphone.Ligar("+55 12 32134 1423");
        iphone.Desligar();
        iphone.iniciarCorreioVoz();

        iphone.adicionarPagina();
        iphone.atualizarPagina();
        iphone.exibirPagina();
        iphone.removerPagina();
    }
}