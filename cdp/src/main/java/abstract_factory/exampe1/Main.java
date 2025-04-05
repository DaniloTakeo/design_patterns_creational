package abstract_factory.exampe1;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        // Simulando escolha do sistema operacional
        String os = "Windows"; // ou "Mac"

        if (os.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.renderizarUI();
    }
}