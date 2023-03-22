public class Main {
    public static void main(String[] args){
        Loja loja = new Loja("Loja do Carlinhos");

        loja.AddProduto(new Produto("Nescau", 5.50, 0));
        loja.AddProduto(new Produto("Nuggets de queijo e presunto(uni)", 1.35, 20));
        loja.AddProduto(new Produto("ClearBlue", 12, 10));
        loja.AddProduto(new Produto("Baião de dois", 27, 2000));

        for (Produto produto : loja.getProdutos()){
            System.out.println("------------------------------");
            System.out.println("Nome do produto: " + produto.getNome());
            System.out.println("Preço do produto: " + produto.getPreco());
            System.out.println("Quantidade disponível: " + produto.getQuantidade());
            System.out.println("------------------------------");
        }

        try {
            loja.RemoveProduto("Baião de dois");
            System.out.println("Produto removido!");
        } catch(Exception e){
            e.printStackTrace();
        }

        try {
            loja.RemoveProduto("Nescau");
        } catch(Exception e){
            e.printStackTrace();
        }


    }
}
