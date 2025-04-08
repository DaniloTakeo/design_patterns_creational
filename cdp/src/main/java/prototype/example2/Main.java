package prototype.example2;

public class Main {
    public static void main(String[] args) {
        Orc orcBase = new Orc("Orc Base", 100, 20);

        Orc orc1 = (Orc) orcBase.clonar();
        orc1.setNome("Orc Guerreiro");
        orc1.setVida(120);

        Orc orc2 = (Orc) orcBase.clonar();
        orc2.setNome("Orc Arqueiro");
        orc2.setVida(90);

        System.out.println("Inimigos Clonados:");
        orcBase.mostrarStatus();
        orc1.mostrarStatus();
        orc2.mostrarStatus();
    }
}