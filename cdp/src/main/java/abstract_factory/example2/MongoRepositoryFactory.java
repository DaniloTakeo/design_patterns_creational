package abstract_factory.example2;

public class MongoRepositoryFactory implements RepositoryFactory {
    @Override
    public UsuarioRepository criarUsuarioRepository() {
        return new UsuarioMongoRepository();
    }

    @Override
    public ProdutoRepository criarProdutoRepository() {
        return new ProdutoMongoRepository();
    }
}