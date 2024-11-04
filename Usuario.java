public class Usuario {
    private String nome;
    private String idUsuario;

    // Construtor
    public Usuario(String nome, String idUsuario) {
        this.nome = nome;
        this.idUsuario = idUsuario;
    }

    // Método para emprestar um livro
    public void emprestarLivro(Livro livro) {
        if (livro.estaDisponivel()) {
            livro.setDisponibilidade(false); // Marca o livro como emprestado
            System.out.println(nome + " emprestou o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está disponível para empréstimo.");
        }
    }

    // Método para devolver um livro
    public void devolverLivro(Livro livro) {
        livro.setDisponibilidade(true); // Marca o livro como disponível novamente
        System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getIdUsuario() {
        return idUsuario;
    }
}