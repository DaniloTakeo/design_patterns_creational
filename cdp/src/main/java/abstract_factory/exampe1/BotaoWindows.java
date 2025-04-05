package abstract_factory.exampe1;

public class BotaoWindows implements Botao {
    @Override
    public void renderizar() {
        System.out.println("Renderizando botão estilo Windows.");
    }
}