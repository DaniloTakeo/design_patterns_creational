package abstract_factory.example2;

public class ProdutoMySQLRepository implements ProdutoRepository {
    @Override
    public void salvar(Produto produto) {
        System.out.println("Salvando produto no MySQL: " + produto.nome);
    }
}