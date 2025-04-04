package singleton.example1;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.executeQuery("SELECT * FROM users");

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.executeQuery("SELECT * FROM orders");

        // Verificando que ambas as instâncias são a mesma
        System.out.println(db1 == db2); // true
    }
}