import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> listaLivros;

    public Biblioteca() {
        listaLivros = new ArrayList<Livro>();
    }

    // Método para adicionar um novo livro à lista
    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    // Método para listar todos os livros disponíveis para empréstimo
    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis para empréstimo:");
        for (Livro livro : listaLivros) {
            if (livro.estaDisponivel()) {
                livro.exibirDetalhes();
            }
        }
    }

    // Método para buscar um livro pelo título
    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        System.out.println("Livro não encontrado: " + titulo);
        return null;
    }
}