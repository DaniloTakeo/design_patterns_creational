package singleton.example2;

public class Logger {
    private static Logger instance;

    private Logger() {
        // Simula a inicialização do sistema de logs
        System.out.println("Inicializando sistema de logs...");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}