package singleton.example2;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Iniciando a aplicação...");

        Logger logger2 = Logger.getInstance();
        logger2.log("Processando requisição...");

        // Verificando que ambas as instâncias são a mesma
        System.out.println(logger1 == logger2); // true
    }
}