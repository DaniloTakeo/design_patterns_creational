package abstract_factory.exampe1;

public class MacFactory implements GUIFactory {
    @Override
    public Botao criarBotao() {
        return new BotaoMac();
    }

    @Override
    public Checkbox criarCheckbox() {
        return new CheckboxMac();
    }
}