package iphone;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância do iPhone
        iPhone meuIPhone = new iPhone();
        
        System.out.println("=== DEMONSTRAÇÃO DO REPRODUTOR MUSICAL ===");
        meuIPhone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIPhone.pausar();
        meuIPhone.tocar();
        
        System.out.println("\n=== DEMONSTRAÇÃO DO APARELHO TELEFÔNICO ===");
        meuIPhone.ligar("(11) 98765-4321");
        meuIPhone.iniciarCorreioVoz();
        meuIPhone.encerrarChamada();
        
        System.out.println("\n=== DEMONSTRAÇÃO DO NAVEGADOR DE INTERNET ===");
        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
        meuIPhone.fecharNavegador();
        
        System.out.println("\n=== DEMONSTRAÇÃO DE MULTITAREFA ===");
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.exibirPagina("https://www.google.com");
        meuIPhone.ligar("(11) 12345-6789"); // Deve pausar a música automaticamente
        meuIPhone.encerrarChamada();
        meuIPhone.tocar(); // Retomando a música após a chamada
    }
}