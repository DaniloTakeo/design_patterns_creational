package abstract_factory.exampe1;

public class Application {
    private Botao botao;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        botao = factory.criarBotao();
        checkbox = factory.criarCheckbox();
    }

    public void renderizarUI() {
        botao.renderizar();
        checkbox.marcar();
    }
}