package abstract_factory.exampe1;

public class CheckboxWindows implements Checkbox {
    @Override
    public void marcar() {
        System.out.println("Marcando checkbox estilo Windows.");
    }
}