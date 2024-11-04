public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criando instâncias de Livro com novos títulos
        Livro livro1 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967, "978-85-254-0012-4");
        Livro livro2 = new Livro("A Menina que Roubava Livros", "Markus Zusak", 2005, "978-85-254-0013-1");
        Livro livro3 = new Livro("O Caçador de Pipas", "Khaled Hosseini", 2003, "978-85-254-0014-8");

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Criando uma instância de Usuario
        Usuario usuario = new Usuario("Carlos Silva", "U123");

        // Listando livros disponíveis
        biblioteca.listarLivrosDisponiveis();

        // Buscando um livro pelo título
        Livro livroBuscado = biblioteca.buscarLivroPorTitulo("A Menina que Roubava Livros");
        if (livroBuscado != null) {
            // Emprestando o livro
            usuario.emprestarLivro(livroBuscado);
        }

        // Listando livros disponíveis após o empréstimo
        biblioteca.listarLivrosDisponiveis();

        // Devolvendo o livro
        usuario.devolverLivro(livroBuscado);

        // Listando livros disponíveis após a devolução
        biblioteca.listarLivrosDisponiveis();
    }
}