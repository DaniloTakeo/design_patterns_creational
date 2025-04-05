package abstract_factory.example2;

public class ProdutoMongoRepository implements ProdutoRepository {
    @Override
    public void salvar(Produto produto) {
        System.out.println("Salvando produto no MongoDB: " + produto.nome);
    }
}