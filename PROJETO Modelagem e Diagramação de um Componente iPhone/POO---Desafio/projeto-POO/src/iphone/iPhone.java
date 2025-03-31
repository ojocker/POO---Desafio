package iphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    // Atributos
    private boolean reprodutorLigado;
    private boolean chamadaEmAndamento;
    private boolean navegadorAberto;
    private String musicaAtual;
    private String paginaAtual;
    
    public iPhone() {
        this.reprodutorLigado = false;
        this.chamadaEmAndamento = false;
        this.navegadorAberto = false;
        this.musicaAtual = "";
        this.paginaAtual = "";
    }
    
    // Implementação ReprodutorMusical
    @Override
    public void tocar() {
        if (!reprodutorLigado) {
            reprodutorLigado = true;
            System.out.println("Reproduzindo: " + musicaAtual);
        } else {
            System.out.println("Reprodutor já está tocando.");
        }
    }
    
    @Override
    public void pausar() {
        if (reprodutorLigado) {
            reprodutorLigado = false;
            System.out.println("Música pausada.");
        } else {
            System.out.println("Reprodutor já está pausado.");
        }
    }
    
    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
        // Começa a tocar automaticamente ao selecionar
        reprodutorLigado = true;
        System.out.println("Reproduzindo: " + musicaAtual);
    }
    
    // Implementação AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        if (!chamadaEmAndamento) {
            chamadaEmAndamento = true;
            System.out.println("Ligando para: " + numero);
            
            // Pausar música se estiver tocando
            if (reprodutorLigado) {
                pausar();
            }
        } else {
            System.out.println("Já existe uma chamada em andamento.");
        }
    }
    
    @Override
    public void atender() {
        if (!chamadaEmAndamento) {
            chamadaEmAndamento = true;
            System.out.println("Chamada atendida.");
            
            // Pausar música se estiver tocando
            if (reprodutorLigado) {
                pausar();
            }
        } else {
            System.out.println("Já existe uma chamada em andamento.");
        }
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
    // Implementação NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        this.navegadorAberto = true;
        System.out.println("Exibindo página: " + url);
    }
    
    @Override
    public void adicionarNovaAba() {
        if (navegadorAberto) {
            System.out.println("Nova aba adicionada.");
        } else {
            System.out.println("O navegador não está aberto.");
        }
    }
    
    @Override
    public void atualizarPagina() {
        if (navegadorAberto && !paginaAtual.isEmpty()) {
            System.out.println("Atualizando página: " + paginaAtual);
        } else {
            System.out.println("Nenhuma página aberta para atualizar.");
        }
    }
    
    // Métodos adicionais
    public void encerrarChamada() {
        if (chamadaEmAndamento) {
            chamadaEmAndamento = false;
            System.out.println("Chamada encerrada.");
        } else {
            System.out.println("Não há chamada em andamento.");
        }
    }
    
    public void fecharNavegador() {
        if (navegadorAberto) {
            navegadorAberto = false;
            System.out.println("Navegador fechado.");
        } else {
            System.out.println("O navegador já está fechado.");
        }
    }
}