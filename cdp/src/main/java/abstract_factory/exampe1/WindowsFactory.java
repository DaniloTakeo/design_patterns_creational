package abstract_factory.exampe1;

public class WindowsFactory implements GUIFactory {
    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }

    @Override
    public Checkbox criarCheckbox() {
        return new CheckboxWindows();
    }
}