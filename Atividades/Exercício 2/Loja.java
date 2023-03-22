import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos = new ArrayList<>();
    public String nome;
    public Loja(String nome){
        this.nome = nome;
    }
    public void AddProduto(Produto produto){
        produtos.add(produto);
    }
    public void RemoveProduto(String nome) throws Exception{
        for (Produto produto : produtos){
           if (nome == produto.getNome()){
               if (produto.getQuantidade() > 0){
                   produto.setQuantidade(produto.getQuantidade() - 1);
                   return;
               } else {
                   throw new Exception("Produto indisponível no estoque.");
               }
           }
        }
        throw new Exception("Produto não encontrado.");
    }
    public List<Produto> getProdutos(){
        return produtos;
    }
}


