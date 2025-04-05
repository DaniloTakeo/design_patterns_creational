package abstract_factory.example2;

public interface RepositoryFactory {
    UsuarioRepository criarUsuarioRepository();
    ProdutoRepository criarProdutoRepository();
}