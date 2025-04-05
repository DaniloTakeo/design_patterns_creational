package abstract_factory.example2;

public class UsuarioMySQLRepository implements UsuarioRepository {
    @Override
    public void salvar(Usuario usuario) {
        System.out.println("Salvando usuário no MySQL: " + usuario.nome);
    }
}