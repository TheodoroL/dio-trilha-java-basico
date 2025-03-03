package desafio;
import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> estoqueLivro;

    public  LivrariaOnline(){
        this.estoqueLivro =new HashMap<>();
    }
    public void  adicionarLivro(String link, Livro livro){
        this.estoqueLivro.put(link,livro);
    }
    public void removerLivro(String autor){
        String removerAutor = null;
        if(this.estoqueLivro.isEmpty()){
            System.out.println("O estoque está vazio");
            return;
        }
        for(var l : this.estoqueLivro.entrySet()){
            if(l.getValue().getAutor().equalsIgnoreCase(autor)){
                removerAutor = l.getKey();
                break;
            }
        }
        this.estoqueLivro.remove(removerAutor);
    }
    public Set<Livro> exibirLivrosOrdenadosPorPreco(){
        Set<Livro> livroOrdenadoPreco = new TreeSet<>(new ComparatorPreco());
        livroOrdenadoPreco.addAll(this.estoqueLivro.values());
        return livroOrdenadoPreco;
    }

    public Set<Livro> pesquisarLivrosPorAutor(String autor){
        Set<Livro> livroAutor = new HashSet<>();
        if(this.estoqueLivro.isEmpty()){
            throw new RuntimeException("Estoque está vazio");
        }
        for(var l : this.estoqueLivro.values()){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livroAutor.add(l);
            }
        }
        return  livroAutor;
    }


    public Livro obterLivroMaisCaro(){
       Livro livro = null;
       double preco  = Double.MIN_VALUE;
       if(this.estoqueLivro.isEmpty()){
           throw new RuntimeException("Estoque está vazio");
       }

       for(var l: this.estoqueLivro.values()){
           if(l.getPreco() > preco){
               preco = l.getPreco();
               livro = l;
           }
       }
       return livro;

    }  public Livro obterLivroMaisBarato(){
       Livro livro = null;
       double preco  = Double.MAX_VALUE;
       if(this.estoqueLivro.isEmpty()){
           throw new RuntimeException("Estoque está vazio");
       }

       for(var l: this.estoqueLivro.values()){
           if(l.getPreco() < preco){
               preco = l.getPreco();
               livro = l;
           }
       }
       return livro;

    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        System.out.println(livrariaOnline.estoqueLivro);

        livrariaOnline.removerLivro("Josh Malerman");

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println(livrariaOnline.obterLivroMaisBarato());
        System.out.println(livrariaOnline.obterLivroMaisCaro());
        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("George Orwell"));

    }
}

class ComparatorPreco implements Comparator<Livro>{

    @Override
    public int compare(Livro l1, Livro l2) {
        return Double.compare(l1.getPreco(), l2.getPreco()) ;
    }
}