package prototype.example2;

public class Orc implements Inimigo {
    private String nome;
    private int vida;
    private int forca;

    public Orc(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void mostrarStatus() {
        System.out.println("Orc: " + nome + " | Vida: " + vida + " | Força: " + forca);
    }

    @Override
    public Inimigo clonar() {
        return new Orc(nome, vida, forca);
    }
}