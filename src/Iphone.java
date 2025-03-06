public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    @Override
    public void reproduzirMusica(String nome) {
        System.out.println("Reproduzindo musica: " + nome);
    }

    @Override
    public void pararMusica() {
        System.out.println("Parando musica.");
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println("Selecionando uma musica: " + nome);
    }

    @Override
    public void Ligar(String numero) {
        System.out.println("Ligando: " + numero);
    }

    @Override
    public void Desligar() {
        System.out.println("Desligando");
    }

    @Override
    public void Atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando pagina");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void removerPagina() {
        System.out.println("Removendo pagina");
    }
}
