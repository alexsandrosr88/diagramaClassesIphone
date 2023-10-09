public class IPhone implements AparelhoTelefonico,NavegadorDaInternet, ReprodutorMusical {
    private String imei;
    private Boolean emligacao;
    private Boolean ligado;
    private Boolean bloqueado;
    private Integer volume;
    private Boolean wireless;
    private Boolean bluetooh;
    private Boolean botaoHome;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void ligarTelefone(){
        ligado = true;
        System.out.println("Bem vindo ao Iphone");
    }

    public void desbloquearIphone(){
        bloqueado = false;
        System.out.println("Celular desbloqueado!");
    }

    public void bloquearIphone(){
        bloqueado = true;
        System.out.println("Celular bloqueado!");
    }

    public void botaoAumentarVolume(){
        volume++;
        System.out.println("Volume aumentado!");
    }
    public void botaoDiminuirVolume(){
        volume++;
        System.out.println("Volume aumentado!");
    }

    public void ativarWireless(){
        wireless = true;
        System.out.println("Wireless ativo!");
    }

    public void desativarWireless(){
        wireless = false;
        System.out.println("Wireless desativado!");
    }

    public void ativarBluetooth(){
        wireless = true;
        System.out.println("Bluetooth ativo!");
    }

    public void desativarBluetooth(){
        wireless = false;
        System.out.println("Bluetooth desativado!");
    }

    public void botaoHome(){
        System.out.println("Você retornou para a tela inicial!");
        botaoHome = false;
    }


    public void movimentoDeslizarParaCima() {
        System.out.println("Objetos deslizando para cima.");
    }


    public void movimentoDeslizarParaBaixo() {
        System.out.println("Objetos deslizando para baixo.");
    }


    public void movimentoPinçaAberto() {
        System.out.println("Zoom aumentado.");
    }


    public void movimentoPinçafechado() {
        System.out.println("Zoom diminuído.");
    }


    @Override
    public void ligar() {
        System.out.println("Tuuu...Tuuuu");
    }

    @Override
    public void atender() {
        emligacao = true;
        System.out.println("Ligação atendida. Alô!?");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz aberto.");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Página sendo exibida.");

    }

    @Override
    public void adcionarNovaAba() {
        System.out.println("Nova aba acionada.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");

    }
}
