package abstract_factory.example2;

public class Main {
    public static void main(String[] args) {
        RepositoryFactory factory;

        String tipoBanco = "MongoDB"; // ou "MySQL"

        if (tipoBanco.equals("MySQL")) {
            factory = new MySQLRepositoryFactory();
        } else {
            factory = new MongoRepositoryFactory();
        }

        Aplicacao app = new Aplicacao(factory);
        app.salvarDados();
    }
}