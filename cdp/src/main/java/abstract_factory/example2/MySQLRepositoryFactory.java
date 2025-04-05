package abstract_factory.example2;

public class MySQLRepositoryFactory implements RepositoryFactory {
    @Override
    public UsuarioRepository criarUsuarioRepository() {
        return new UsuarioMySQLRepository();
    }

    @Override
    public ProdutoRepository criarProdutoRepository() {
        return new ProdutoMySQLRepository();
    }
}