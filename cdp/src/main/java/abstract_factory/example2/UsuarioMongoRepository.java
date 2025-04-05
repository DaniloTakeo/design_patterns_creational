package abstract_factory.example2;

public class UsuarioMongoRepository implements UsuarioRepository {
    @Override
    public void salvar(Usuario usuario) {
        System.out.println("Salvando usuário no MongoDB: " + usuario.nome);
    }
}