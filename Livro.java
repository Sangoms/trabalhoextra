public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;
    private boolean disponivel;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.disponivel = true; // Por padrão, o livro começa disponível
    }

    // Método para exibir os detalhes do livro
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }

    // Método para verificar se o livro está disponível
    public boolean estaDisponivel() {
        return disponivel;
    }

    // Método para alterar a disponibilidade do livro
    public void setDisponibilidade(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }
}