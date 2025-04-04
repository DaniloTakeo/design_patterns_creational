package singleton.example1;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Simula a conexão com o banco
        System.out.println("Conectando ao banco de dados...");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void executeQuery(String sql) {
        System.out.println("Executando query: " + sql);
    }
}