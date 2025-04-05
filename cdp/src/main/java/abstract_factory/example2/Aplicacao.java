package abstract_factory.example2;

public class Aplicacao {
    private final UsuarioRepository usuarioRepo;
    private final ProdutoRepository produtoRepo;

    public Aplicacao(RepositoryFactory factory) {
        this.usuarioRepo = factory.criarUsuarioRepository();
        this.produtoRepo = factory.criarProdutoRepository();
    }

    public void salvarDados() {
        usuarioRepo.salvar(new Usuario("Alice"));
        produtoRepo.salvar(new Produto("Notebook"));
    }
}